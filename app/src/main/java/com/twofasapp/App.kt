package com.twofasapp

import android.content.Context
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.twofasapp.backup.BackupModule
import com.twofasapp.backup.domain.SyncBackupTrigger
import com.twofasapp.backup.domain.SyncBackupWorkDispatcher
import com.twofasapp.base.ActivityProvider
import com.twofasapp.base.AuthTracker
import com.twofasapp.browserextension.BrowserExtensionModule
import com.twofasapp.core.log.FileLogger
import com.twofasapp.developer.DeveloperModule
import com.twofasapp.di.Modules
import com.twofasapp.featuretoggle.FeatureToggleModule
import com.twofasapp.featuretoggle.domain.FetchRemoteConfigCase
import com.twofasapp.parsers.ParsersModule
import com.twofasapp.permissions.PermissionsModule
import com.twofasapp.persistence.PersistenceModule
import com.twofasapp.prefs.PreferencesEncryptedModule
import com.twofasapp.prefs.PreferencesPlainModule
import com.twofasapp.push.PushModule
import com.twofasapp.qrscanner.QrScannerModule
import com.twofasapp.security.SecurityModule
import com.twofasapp.serialization.SerializationModule
import com.twofasapp.services.ServicesModule
import com.twofasapp.services.backup.remoteBackupModule
import com.twofasapp.services.backupcipher.backupCipherModule
import com.twofasapp.services.googleauth.googleAuthModule
import com.twofasapp.start.StartModule
import com.twofasapp.time.TimeModule
import com.twofasapp.usecases.services.PinOptionsUseCase
import io.reactivex.plugins.RxJavaPlugins
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber
import java.util.Locale

class App : MultiDexApplication() {

    private val authTracker: AuthTracker by inject()
    private val analyticsService: com.twofasapp.core.analytics.AnalyticsService by inject()
    private val syncBackupDispatcher: SyncBackupWorkDispatcher by inject()
    private val pinOptionsUseCase: PinOptionsUseCase by inject()
    private val activityProvider: ActivityProvider by inject()
    private val fetchRemoteConfigCase: FetchRemoteConfigCase by inject()

    override fun onCreate() {
        super.onCreate()
        startKoin {
            // androidLogger(level = Level.DEBUG)
            androidContext(this@App)
            modules(
                listOf(
                    applicationModule,
                    activityScopeModule,
                    fragmentScopeModule,
                    useCaseModule,

                    remoteBackupModule,
                    backupCipherModule,
                    googleAuthModule,
                ).plus(
                    listOf(
                        StartModule(),
                        SerializationModule(),
                        TimeModule(),
                        ParsersModule(),
                        PermissionsModule(),
                        PreferencesPlainModule(),
                        PreferencesEncryptedModule(),
                        BrowserExtensionModule(),
                        PushModule(),
                        PersistenceModule(),
                        QrScannerModule(),
                        ServicesModule(),
                        BackupModule(),
                        FeatureToggleModule(),
                        DeveloperModule(),
                        SecurityModule(),
                    )
                        .map { it.provide() }
                        .plus(Modules.provide())
                )
            )
        }

        RxJavaPlugins.setErrorHandler {
            Timber.e("RxJavaPlugins.setErrorHandler")
            it.printStackTrace()
        }

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            System.setProperty("kotlinx.coroutines.debug", "on")
        }

        analyticsService.setUserCountry(Locale.getDefault().country)

        authTracker.onAppCreate()

        ProcessLifecycleOwner.get().lifecycle.addObserver(object : LifecycleObserver {
            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            fun onMoveToForeground() = authTracker.onMovingToForeground()

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            fun onMoveToBackground() {
                authTracker.onMovingToBackground()
                syncBackupDispatcher.dispatch(SyncBackupTrigger.APP_BACKGROUND)
                pinOptionsUseCase.tmpDigits = null
            }
        })

        fetchRemoteConfigCase.execute()
        registerActivityLifecycleCallbacks(activityProvider)

        syncBackupDispatcher.dispatch(SyncBackupTrigger.APP_START)

        FileLogger.log("App start")
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
