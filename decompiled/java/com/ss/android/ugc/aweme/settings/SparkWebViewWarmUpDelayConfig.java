package com.ss.android.ugc.aweme.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class SparkWebViewWarmUpDelayConfig {
    public static final SparkWebViewWarmUpDelayConfigModel LIZ = new SparkWebViewWarmUpDelayConfigModel(0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(364));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(365));

    public static final class SparkWebViewWarmUpDelayConfigModel {

        @C09CT("start_chromium_delay")
        public final int startChromiumDelay;

        @C09CT("warm_up_delay")
        public final int warmUpDelay;

        public SparkWebViewWarmUpDelayConfigModel() {
            this(0, 0);
        }

        public SparkWebViewWarmUpDelayConfigModel(int i, int i2) {
            this.startChromiumDelay = i;
            this.warmUpDelay = i2;
        }
    }
}
