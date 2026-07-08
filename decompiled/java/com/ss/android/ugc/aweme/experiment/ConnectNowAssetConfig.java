package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class ConnectNowAssetConfig {
    public static final ConnectNowLottieAssetCDNConfig LIZ = new ConnectNowLottieAssetCDNConfig(new ConnectNowLottieAssetConfig("https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/findFriends_lottie.json", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/followSparkles.json", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/loadBalls.json"), new ConnectNowUuid("54e8f9ab-92b3-425e-b904-efd925328ed0", "bc36a294-33c1-4231-b96e-7f452d516d00"));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(56));

    public static final class ConnectNowLottieAssetCDNConfig {

        @C09CT("connect_now_lottie")
        public final ConnectNowLottieAssetConfig cdnConfig;

        @C09CT("connect_now_uuid")
        public final ConnectNowUuid connectNowUuid;

        public ConnectNowLottieAssetCDNConfig() {
            this(new ConnectNowLottieAssetConfig("https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/findFriends_lottie.json", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/followSparkles.json", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/loadBalls.json"), new ConnectNowUuid("54e8f9ab-92b3-425e-b904-efd925328ed0", "bc36a294-33c1-4231-b96e-7f452d516d00"));
        }

        public ConnectNowLottieAssetCDNConfig(ConnectNowLottieAssetConfig connectNowLottieAssetConfig, ConnectNowUuid connectNowUuid) {
            this.cdnConfig = connectNowLottieAssetConfig;
            this.connectNowUuid = connectNowUuid;
        }
    }

    /* JADX INFO: loaded from: classes26.dex */
    public static final class ConnectNowLottieAssetConfig {

        @C09CT("find_friends")
        public final String findingFriendsLottie;

        @C09CT("follow_sparkle")
        public final String followSparkLottie;

        @C09CT("load_balls")
        public final String loadBallsLottie;

        public ConnectNowLottieAssetConfig() {
            this("https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/findFriends_lottie.json", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/followSparkles.json", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/loadBalls.json");
        }

        public ConnectNowLottieAssetConfig(String str, String str2, String str3) {
            this.findingFriendsLottie = str;
            this.followSparkLottie = str2;
            this.loadBallsLottie = str3;
        }
    }

    public static final class ConnectNowUuid {

        @C09CT("characteristic")
        public final String characteristic;

        @C09CT("service")
        public final String service;

        public ConnectNowUuid() {
            this("54e8f9ab-92b3-425e-b904-efd925328ed0", "bc36a294-33c1-4231-b96e-7f452d516d00");
        }

        public ConnectNowUuid(String str, String str2) {
            this.characteristic = str;
            this.service = str2;
        }
    }

    public static final ConnectNowLottieAssetCDNConfig LIZ() {
        return (ConnectNowLottieAssetCDNConfig) LIZIZ.getValue();
    }
}
