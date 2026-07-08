package com.ss.android.ugc.aweme.bytebench;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class SlideSlipPreloadExperiment {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(94));
        LIZ = c01gwLIZIZ;
        LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(957));
        LIZJ = ((ShootEditHCPreloadConfig) c01gwLIZIZ.getValue()).leftCount;
        LIZLLL = ((ShootEditHCPreloadConfig) c01gwLIZIZ.getValue()).rightCount;
    }

    public static final class ShootEditHCPreloadConfig {

        @C09CT("enable_preload")
        public final boolean enablePreload;

        @C09CT("left_preload_count")
        public final int leftCount;

        @C09CT("right_preload_count")
        public final int rightCount;

        public ShootEditHCPreloadConfig() {
            this(false, 2, 2);
        }

        public ShootEditHCPreloadConfig(boolean z, int i, int i2) {
            this.enablePreload = z;
            this.leftCount = i;
            this.rightCount = i2;
        }
    }
}
