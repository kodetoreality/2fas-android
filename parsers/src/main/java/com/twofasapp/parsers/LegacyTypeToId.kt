package com.twofasapp.parsers

object LegacyTypeToId {
    val serviceIds: Map<String, String> = mapOf(
        "Activision" to "1b35b8ee-de08-4623-8be9-9a52d3606a08",
        "AdGuard" to "0755b13f-d3d1-43b0-b6a8-4348519cbdc7",
        "Adobe" to "ae853d4d-cf42-43b3-a2a8-4bd61536a9e7",
        "Allegro" to "9a6e29d3-54be-4793-af01-7d9f1ca4f941",
        "Amazon" to "d50d085c-87a1-4c03-80aa-d2384971c6f3",
        "AngelList" to "5d4c1ad0-35e7-4205-811b-52d596651ca2",
        "AnyDesk" to "c679176d-d306-4a06-876a-3334b47d3975",
        "Arbeitsagentur" to "1d3774aa-bd1a-4d57-b453-5ef78943233b",
        "ArenaNet" to "fa63a7f1-557e-4eda-813a-274e405f0559",
        "AscendEx" to "513a463d-0a51-4cbc-b531-6e2c69aa7a76",
        "Atlantiss" to "923c55fc-7eca-4027-b853-c97955b356cc",
        "Atlassian" to "5ba2c9cd-cca9-4330-a09d-7adf5afd0184",
        "Autodesk" to "9703b1b3-9942-4789-80e3-a8ef8c52daad",
        "Avast" to "cb6e08b9-dd63-45fe-a3c9-ee5a95ef4355",
        "Aws" to "9a24d1ca-da74-4f81-88ae-d3d174300e30",
        "Backblaze" to "54f6272f-e6c1-4a88-8e2c-a1b0a490c55d",
        "BeamPro" to "e709dc4b-2a72-4f6f-9c8a-6b3dbebc42e5",
        "Binance" to "9746650c-0dc6-438b-982f-5c38dc72cce1",
        "BitBay" to "d25508f8-c64b-41d3-905a-e95d484b034a",
        "Bitbucket" to "9df3f288-9201-477c-9b6f-6a8163f5b980",
        "Bitcoinmeester" to "c6a0e139-d7b3-4351-8741-cfdd296b5802",
        "Bitfinex" to "51ced224-0dc2-4a46-be4f-3f6fefc7c48f",
        "Bitkub" to "6ab5f6f1-40f4-41e4-82ff-0dd11f9b676c",
        "BitMax" to "d519742d-db19-440a-b9af-cd4c31a58603",
        "Bitpanda" to "4e7a1659-0a8a-42d5-a699-30837aac73c4",
        "Bitpay" to "137459fd-0f05-489a-95af-fd0245c3fa0e",
        "BitriseIo" to "699c584e-79cf-414b-94d5-64784459f7ed",
        "BitSkins" to "690233b0-1e1d-4e7a-a89b-375862cc4666",
        "Bittrex" to "8cd97a5c-e890-47ee-8597-8095bba4d400",
        "Bitvavo" to "6be22afd-1d40-4375-b5da-5581b886edb8",
        "Bitwarden" to "d0edd58d-e40a-444d-a440-e4907b0a22d6",
        "Blockchain" to "e0d3d638-1fa2-4aa4-8242-4920bd151226",
        "BlockchainsLlc" to "fb35f352-aefb-4ff9-b618-2e7c2fd5c18e",
        "Box" to "4f2a249a-eb12-48e7-bffc-a78bf7888d73",
        "Braintree" to "261606e8-1535-454d-b762-dbe5f20f3a17",
        "BraveRewards" to "7d012425-7019-4320-90a5-38963e4a022e",
        "BtcMarkets" to "f6de2caf-aa67-4e98-a6aa-3682b826a21c",
        "Buffer" to "85ad45be-da07-4b6d-b373-8acbe7148c37",
        "Bybit" to "d6570704-868f-4cca-990f-3f0fdceae277",
        "CashApp" to "454f77f3-c3b6-421b-8bb2-f2f0d627139f",
        "Chargebee" to "5318083f-0330-4384-869f-8c76ad862337",
        "Choice" to "f028ce41-346f-48a4-b83c-50a51f2d701e",
        "Cisco" to "b4017db1-4377-42e0-849c-c70ee3d4f699",
        "Cloudflare" to "c8ebf624-c4d2-4e6a-aeac-fc235494ab92",
        "Coinbase" to "5fac27e0-e0e4-4e5c-ba7c-54ca0c5f1482",
        "CoinDcx" to "23eea0ca-0ac4-459e-8782-f2a8dfa632de",
        "Coindeal" to "c4c182d1-88d7-4c0a-bc67-1aeb28fa21db",
        "CoinList" to "e899321b-2aa9-44c6-b619-5aacb7955954",
        "CoinSpot" to "eb82164f-aa83-44af-a943-387a0bb19c08",
        "Coinsquare" to "b872cbd5-dcaa-4a36-83dc-29b273009726",
        "CosmicPvp" to "6481dfa9-0bb0-4a14-a431-0e1a3ac8ceab",
        "Coursera" to "b18932d2-4dde-49e7-8f28-6568958e376a",
        "CryptoCom" to "fa0801c4-e26b-47b2-85b3-8e1f3dcd21c5",
        "CryptoMkt" to "964358ca-60e7-4613-8a33-9b31c53b79a6",
        "Devex" to "a85b7921-5da3-43af-ba05-9aac1fc9a6d4",
        "DigitalOcean" to "7f1b59e5-fd1d-4e2f-a6c3-c38c44c53c6e",
        "Discord" to "5c9efdde-cb62-4304-9f04-d120084a53dd",
        "Discourse" to "8d8cd023-32c3-41d7-afa2-1434b7b81a68",
        "DnsMadeEasy" to "a544dede-602a-4b3b-b8dd-4ff63f49d1ee",
        "Docker" to "1c6ef27d-7d4b-4827-9d8f-8aecce460008",
        "Dropbox" to "5d2778b3-e293-49e7-a39e-66d86c21dd96",
        "Drupal" to "15fc4637-25c0-416e-9fcc-afe99dab8abe",
        "ElectronicArts" to "4cb1849d-650c-48ff-bd99-420859f3d1c8",
        "EnZona" to "79549405-ba55-4c7b-9d48-3b15002b5b30",
        "EpicGames" to "21701630-a5d2-457c-a983-bfbf4efa801c",
        "Etsy" to "ee990e63-4e8d-4aa5-be25-fd945108aaac",
        "Evernote" to "8bf52f46-80c9-45b2-b29d-c6ca8c08eea8",
        "Facebook" to "744e788d-3975-43ac-8166-0029c9a0871c",
        "Faceit" to "1cfba37c-40bc-4adf-a38a-7eb89848a1f0",
        "Figma" to "8e6b9eea-ce00-4371-884a-b540b3467950",
        "Fintegri" to "eb93e63c-bab4-4e1e-8cff-916a33ba760a",
        "Firefox" to "8545bf3b-1bbe-4ecb-a623-cfdfe5f3fc38",
        "FreshDesk" to "4e82c347-7ad9-4b73-bb4d-c6301eed0004",
        "Fritzbox" to "33368632-d426-425b-9c0e-ff8cabaa0c07",
        "FSecure" to "f27af1a5-53fc-44ce-80ea-8fa8c9ca04bc",
        "FTXUS" to "f4308a8d-6983-466b-a51e-345f1c2d4273",
        "Gamdom" to "9e13f24a-774d-4d11-b3ea-b688cf3ff82c",
        "GateIo" to "d54e6374-570e-445f-abf8-608e8bca5162",
        "Gitea" to "eed0167a-c72d-4a0f-80c1-5ff560b513cf",
        "Github" to "3ec08d85-d803-4b6a-a2f4-f5d24c9bba67",
        "Gitlab" to "3d516ea8-a8b7-4687-82f7-a3b8e9df68d1",
        "Gmx" to "b235239b-0ff5-4d74-babb-3a76e8dce4eb",
        "GoDaddy" to "ee369040-4ac2-4ceb-9569-1b1c65288a8b",
        "Gogs" to "fb2c6356-a37d-4515-a54a-8403471d5885",
        "Google" to "fdb95870-569c-471f-84ce-0356d13da20e",
        "Hmrc" to "0e479fcd-6a38-4431-9605-8a3d8b260e29",
        "Grammarly" to "3bf3c372-753b-4a6a-b6ec-b92637fcf1dd",
        "HackTheBox" to "f3379d7d-69ed-4970-9b18-f293b993b829",
        "Heroku" to "d4eaba7a-4fb0-4447-96b1-005fbf8cdf38",
        "Hetzner" to "f762bea4-d385-4a35-be4a-ffcda80931e9",
        "HomeAssistant" to "0680591a-0464-44cc-8546-d61666088dbc",
        "Hootsuite" to "1f732634-e6cc-4219-83d4-9e78d41372f8",
        "HubSpot" to "c99dfe6d-6d75-42ce-a1fb-0c8fbbf70d72",
        "HumbleBundle" to "1aedafd0-b21e-4220-a276-d3001bfa9702",
        "HurricaneElectric" to "f506d1b4-099d-495e-a1a4-c7ecec4d007d",
        "Idme" to "1a8546ad-903d-4f3d-9589-f7282d426007",
        "Ifttt" to "7ec6284a-152f-4ac6-a702-95a21bfb7e02",
        "Instagram" to "588921bf-6df7-4d92-a881-9af92e15642b",
        "Intuit" to "316212f6-5086-4bb2-8ca1-fdd411280a23",
        "Ionos" to "002fd04d-4046-4629-952b-ee92f17e2e09",
        "Jagex" to "7c839f74-7df8-4ea8-9e45-e9ad8ac37197",
        "JamfNow" to "096b26f8-e5c9-467b-aca7-e2fdb63c7e36",
        "JetBrains" to "80f023af-b7e2-4395-a700-769bf968dcf6",
        "Joomla" to "f5a9a8e5-3167-4b11-a680-03d8aad50784",
        "JuraElektroapparateAg" to "f478c5ea-d8e6-4325-b418-a84013520d7c",
        "Karatbit" to "24c038c9-41b6-46b2-bafd-046fc074ef54",
        "Kaspersky" to "bc1329ad-925b-4f51-8ff2-0079975d9bc0",
        "Kayako" to "170388d7-479c-40d6-b624-b72d22ecf552",
        "Kickstarter" to "d353dc43-cacd-4618-9169-6bda93d940f1",
        "Kraken" to "450cab07-490e-4645-a336-126a798314ae",
        "KuCoin" to "ca2a983d-42be-496f-9dc9-520c78fb6978",
        "LastPass" to "ec0d13e2-3479-49fb-aeaa-67dab162cadd",
        "LinkedIn" to "924f8361-2435-41fe-8070-b2f6b105b042",
        "LinusTechTip" to "97dcded8-02b9-42a4-af3b-f5d414b45d05",
        "Litebit" to "63cbf7e9-87b0-41d1-b242-c90ad2783a63",
        "Logingov" to "94712ff8-bbe1-41bc-8b81-0f0395463e88",
        "MailChimp" to "0658227c-ef86-4948-b737-ec1bfc11cbbb",
        "Mega" to "edf4885f-6c13-4c3d-8aa8-378f9177879d",
        "MercadoLibre" to "56cc9fc0-0f57-4777-a3e0-ccaad03234a8",
        "Microsoft" to "be900c77-fe67-4f9b-805b-10c899125fa5",
        "Minergate" to "dd1fc65b-34a9-4c97-b3a1-f7da1385ce61",
        "MongoDb" to "5e62a68a-88f4-4f3f-ad60-df8ea34bdc57",
        "Myob" to "cd2ccd13-eed6-4b66-8a89-8c3f0799b9b6",
        "Namecheap" to "f2425ecc-f42a-4f0f-8d39-254fc7ae35ba",
        "Netsuite" to "df8f7dea-9b3d-4058-bd1e-4a2e8d93f45e",
        "Nexo" to "d5e2786c-9601-4b11-a33c-9f818baff264",
        "Nextcloud" to "dcbc5cc0-60d3-4235-9430-4a8c06286283",
        "NextDns" to "be114956-58bb-4909-8668-44e728554556",
        "NiceHashBuying" to "7c373102-9d13-489e-9baa-325903b550e5",
        "NiceHashLogin" to "19cac7cf-5548-4869-a33f-6a13a4ae5e6f",
        "NiceHashWithdraw" to "473b0856-b105-4f77-b7ef-f5bf4529837c",
        "NintendoAccount" to "7432959f-6958-4529-8149-f6f071b3d21d",
        "NoIp" to "a45a6c25-fc03-48c6-a2d5-c160c3d51f45",
        "NordAccount" to "2ee903ff-a9fd-44ce-970e-47fea122a860",
        "Norton" to "3842fba8-47c3-45bb-9700-932e86721063",
        "Nvidia" to "82dffa18-98ab-469b-a585-0f5ed9990b9b",
        "Okx" to "a9f9deeb-c0db-447c-9316-0bcc5c17d81d",
        "Onelogin" to "3fd6917b-0eb2-4306-b4b1-000256f61977",
        "OnePassword" to "29a9bb30-c40f-4b43-8877-2460915178c5",
        "Onet" to "19a5f44c-bc4a-4f80-9903-2c61668c5a0a",
        "OpenVpn" to "97b7c609-edce-400d-b0ce-a1894ac4305b",
        "Opera" to "9da37985-6d4e-4e30-a2cc-449ba401d8cf",
        "OpSkins" to "8e344ee0-9350-45e4-b6ef-4f7c06ba3798",
        "Oracle" to "b6b72488-1f7b-431d-afe0-4889496deb70",
        "Ovh" to "4ad7ce16-c64d-4f18-b009-30a270dc782a",
        "Parsec" to "ab5170d5-098b-4d87-a248-64badb66cfb3",
        "Patreon" to "a6625835-3c28-42cd-820d-2ebcc08320d0",
        "Paxful" to "b78bba1b-4733-42bc-a1d5-ca18d53e291f",
        "PayPal" to "5cf8be69-25f5-4d43-aa51-2d54930d247a",
        "Pcloud" to "b08a2f47-2883-4190-861d-6042ee86d334",
        "PhpMyAdmin" to "2eb3a952-7e2d-4088-88f0-0b0c2bdde135",
        "Plex" to "ed64d5af-2641-465f-9936-4c5bc6075695",
        "Poloniex" to "6dc6c359-75a2-48ca-82e7-cf6ac8d98a68",
        "Preceda" to "d85a3247-bf4e-4c8d-aae8-a17f896013de",
        "Proton" to "1174fb7d-cb22-4855-b454-d1d25acb3753",
        "ProtonMail" to "1174fb7d-cb22-4855-b454-d1d25acb3753",
        "Proxmox" to "3b0c488c-bd30-4edf-9441-8a6f97791124",
        "Pulseway" to "1eafb2b3-17d9-417f-8d1d-afb6d9aca878",
        "PyPI" to "48223642-089d-4e35-97da-4fbc4ba81c35",
        "Qnap" to "0d096e23-0594-47af-abac-51aaae14f19c",
        "Questrade" to "f76dc205-7c4a-4413-b80b-75bf8898502e",
        "Razer" to "fd842cd6-1ce0-4b09-a7d7-ee10f30845b2",
        "Reddit" to "15abc44c-e519-488b-98f2-3a75aaf270af",
        "Ring" to "044d1095-ede6-4033-938c-4a409ab3a2c6",
        "Robinhood" to "e085ea95-678d-4b5d-97b4-2b7107567069",
        "Roblox" to "d33dd19c-ce43-45a2-b204-fc636f69e75e",
        "RoboForm" to "882c9046-b11f-4f4f-9f66-7095202a03a7",
        "RockstarGames" to "deead8dd-c9e3-463a-8c73-1e75c5ec13cf",
        "SalesForce" to "29661992-71dd-42ba-9d45-2af7bdba4276",
        "Samsung" to "f3dae646-0cfa-467d-9ecc-06790e1aa6d2",
        "Sentry" to "af78a598-da12-473d-8e83-b95cfe0d3384",
        "Shopify" to "b3ad7c69-d5dc-47e8-82b0-ac607e151329",
        "Skrill" to "8d2b7cfd-2d6e-4a82-af14-4d60924abf84",
        "Slack" to "14b0712a-b660-4550-ac94-bc0ea75e3228",
        "Snapchat" to "cdec1fec-5e6f-4470-9a15-60631f6c4383",
        "Sofi" to "0f80c3fb-86d2-42cd-8c59-059a35b5083d",
        "Sony" to "b8ccc448-1c97-4d5c-a781-25c48996b00f",
        "SophosSFOS" to "2ed97493-8e5a-4b96-8e85-36d67c92c40a",
        "Sourceforge" to "b16f2bad-b094-43e9-8347-e4a02c04a561",
        "SquareEnix" to "e5dee7b9-c921-41ed-8b24-e74c6b72daa8",
        "Steam" to "d241edff-480f-4201-840a-5a1c1d1323c2",
        "Stripe" to "dfc48abc-3fd9-4456-833f-fcaa52691ccc",
        "Surfshark" to "3d2e931b-a5c1-4bf6-bec8-64d823a85680",
        "Synology" to "49b75004-2ee0-46de-934e-f62e9271bd02",
        "SynologyAccount" to "49b75004-2ee0-46de-934e-f62e9271bd02",
        "SynologyDsm" to "49b75004-2ee0-46de-934e-f62e9271bd02",
        "Tastyworks" to "aedeca67-57d4-450d-9737-f7db26fa4e46",
        "TeamViewer" to "bbf98616-dab0-48d4-859a-0877ad00766a",
        "Tebex" to "e32cb9ed-f0a0-46e5-8011-0c8d33617adf",
        "Telderi" to "26ac0a8e-28ab-43e0-b93a-c728df165800",
        "Tesla" to "89d4da87-f110-4a4f-862a-051032180536",
        "Tibia" to "0642640d-52f8-4d2a-ba7f-b2e98dcc4760",
        "Tiktok" to "0f92d0c5-2b96-4f8e-91ef-9a026e048b80",
        "Tmobile" to "0777bbc7-ac7f-4ef0-ab3a-a5a3d8d29168",
        "TradingView" to "f0dd74a7-28fb-4c77-9541-3d2a2df53268",
        "Trello" to "62e56d6c-c438-4949-a033-c7588b92e403",
        "TrendMicro" to "ea543918-c254-443b-9cca-33db8aa1a21d",
        "Trimble" to "b4ed9356-1b2d-4a21-ba2b-c96eeb4edcf3",
        "TrueNas" to "280053ba-084f-4f1f-a672-524dc7ba09d9",
        "Tumblr" to "e325587d-695f-49b2-82a3-130e10640db1",
        "TwentyI" to "b545e75e-34cf-4186-b246-dc02af28de70",
        "Twitch" to "cdadf221-4f82-448a-a738-c12ccff5898a",
        "Twitter" to "a2987ab4-ac5c-48ce-863c-d3d3d1220fdb",
        "TwoFas" to "89efcc2d-52f4-4ac3-988d-5d7f3b3cd0a7",
        "Uber" to "63f0bdaf-94fe-4b4c-983f-90442877f0ec",
        "Ubiquiti" to "80ffdc39-f0ba-40a1-826a-0afb5084f8a0",
        "Ubisoft" to "3c9fb79f-a473-47eb-aa75-f5ef5b35829b",
        "Unity" to "743215a7-3115-4e48-a8f9-e87b103428ae",
        "Uphold" to "a5ed7742-3798-40f6-affc-8bb459af80ea",
        "UptimeRobot" to "121acf58-0e10-4e0d-a967-2dad5f8e5929",
        "Upwork" to "0847b922-d5ee-478d-8705-fc661dc2e83a",
        "Uscis" to "323a5859-1da6-4fa8-8ec9-e90e44575f6d",
        "Vimeo" to "c97ebaa8-7380-4e5d-9059-397f2a1fc982",
        "Vk" to "3ee94c0d-4c2c-4b59-a35e-9251bed8d7ce",
        "Wargaming" to "2c406558-a7fb-4c0a-bfe1-9287cfd6eee4",
        "WazirX" to "4ae6bfef-0003-446c-9fc8-e0a03dd84163",
        "WebDe" to "3a26c02c-1c6e-49ba-b282-c640f6c05804",
        "WhiteBit" to "35498c4e-19ae-4e2b-92de-b110baace547",
        "Wikijs" to "c755e985-7434-4272-971b-a0af16d4bf11",
        "Windscribe" to "b8869267-e0a5-407c-9b77-8c664896b252",
        "Wordfence" to "caf4b0df-d8bd-442c-a57e-9c8187239899",
        "Wordpress" to "8a6e8dde-9546-4e62-a30a-143dee285d79",
        "Wyze" to "8f4c7951-526e-49b9-8996-28d65d15ed47",
        "Xda" to "c6a5b0b8-7c7f-4469-a5b2-4e97f4b93eb1",
        "Xero" to "b0a1e86b-baa4-43f5-b2c7-16dcac2120b5",
        "Xing" to "376e354b-4daa-4d4e-a285-0d6bd3372ab0",
        "Yahoo" to "2820a93a-f4d4-484a-adaa-f46b186709c4",
        "Zendesk" to "4c1faa51-fefb-4ab5-9201-c54b794d32ba",
        "Zoho" to "21d5dcc4-4c1b-4d90-99d0-5cd35c815526",
        "Zoom" to "45741eb0-3388-4d54-8816-20a4bba036eb",
    ).mapKeys { it.key.lowercase() }

    val manualNames: Map<String, String> = mapOf(
        // Supported Manual Names
        "Bitfinex" to "51ced224-0dc2-4a46-be4f-3f6fefc7c48f",
        "Bit finex" to "51ced224-0dc2-4a46-be4f-3f6fefc7c48f",
        "Bitvavo" to "6be22afd-1d40-4375-b5da-5581b886edb8",
        "Blockchains" to "fb35f352-aefb-4ff9-b618-2e7c2fd5c18e",
        "Brave" to "7d012425-7019-4320-90a5-38963e4a022e",
        "CashApp" to "454f77f3-c3b6-421b-8bb2-f2f0d627139f",
        "Coindeal" to "c4c182d1-88d7-4c0a-bc67-1aeb28fa21db",
        "Coin deal" to "c4c182d1-88d7-4c0a-bc67-1aeb28fa21db",
        "Coinsquare" to "b872cbd5-dcaa-4a36-83dc-29b273009726",
        "Coin square" to "b872cbd5-dcaa-4a36-83dc-29b273009726",
        "CosmicPvp" to "6481dfa9-0bb0-4a14-a431-0e1a3ac8ceab",
        "Cosmic Pvp" to "6481dfa9-0bb0-4a14-a431-0e1a3ac8ceab",
        "Drupal" to "15fc4637-25c0-416e-9fcc-afe99dab8abe",
        "Hmrc" to "0e479fcd-6a38-4431-9605-8a3d8b260e29",
        "Instagram" to "588921bf-6df7-4d92-a881-9af92e15642b",
        "Jura" to "f478c5ea-d8e6-4325-b418-a84013520d7c",
        "Onelogin" to "3fd6917b-0eb2-4306-b4b1-000256f61977",
        "One login" to "3fd6917b-0eb2-4306-b4b1-000256f61977",
        "PlayStation" to "b8ccc448-1c97-4d5c-a781-25c48996b00f",
        "Preceda" to "d85a3247-bf4e-4c8d-aae8-a17f896013de",
        "Wyze" to "8f4c7951-526e-49b9-8996-28d65d15ed47",

        // Fix for missing label - matching based on displayedName
        "AscendEx" to "513a463d-0a51-4cbc-b531-6e2c69aa7a76",
        "Autodesk" to "9703b1b3-9942-4789-80e3-a8ef8c52daad",
        "Bitkub" to "6ab5f6f1-40f4-41e4-82ff-0dd11f9b676c",
        "BitMax" to "d519742d-db19-440a-b9af-cd4c31a58603",
        "Bitpanda" to "4e7a1659-0a8a-42d5-a699-30837aac73c4",
        "Bitpay" to "137459fd-0f05-489a-95af-fd0245c3fa0e",
        "Bittrex" to "8cd97a5c-e890-47ee-8597-8095bba4d400",
        "CoinSpot" to "eb82164f-aa83-44af-a943-387a0bb19c08",
        "DnsMadeEasy" to "a544dede-602a-4b3b-b8dd-4ff63f49d1ee",
        "Faceit" to "1cfba37c-40bc-4adf-a38a-7eb89848a1f0",
        "Fritzbox" to "33368632-d426-425b-9c0e-ff8cabaa0c07",
        "gate.io" to "d54e6374-570e-445f-abf8-608e8bca5162",
        "GoDaddy" to "ee369040-4ac2-4ceb-9569-1b1c65288a8b",
        "Kayako" to "170388d7-479c-40d6-b624-b72d22ecf552",
        "MailChimp" to "0658227c-ef86-4948-b737-ec1bfc11cbbb",
        "Okx" to "a9f9deeb-c0db-447c-9316-0bcc5c17d81d",
        "Poloniex" to "6dc6c359-75a2-48ca-82e7-cf6ac8d98a68",
        "Surfshark" to "3d2e931b-a5c1-4bf6-bec8-64d823a85680",
        "Trimble" to "b4ed9356-1b2d-4a21-ba2b-c96eeb4edcf3",
        "Ubiquiti" to "80ffdc39-f0ba-40a1-826a-0afb5084f8a0",
        "Wiki.js" to "c755e985-7434-4272-971b-a0af16d4bf11",
    ).mapKeys { it.key.lowercase() }
}

// Match based on label:
//AscendEX
//Autodesk
//Bitfinex
//Bitkub
//BitMax
//Bitpanda
//Bitpay
//Bittrex
//CoinSpot
//CosmicPvP
//DNSMadeEasy
//FACEIT
//Fritzbox
//gate.io
//GoDaddy
//Kayako
//MailChimp
//OKX
//Poloniex
//Preceda
//Surfshark
//Trimble
//Ubiquiti
//Wiki.js