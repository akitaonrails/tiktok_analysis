package com.ss.android.ugc.feed.platform.cell.gradual;

import X.C01GW;
import X.C09CT;
import X.C1EBH;
import X.C452501pT;

/* JADX INFO: loaded from: classes36.dex */
public final class FeedCellGradualFixExp {
    public static final FeedCellGradualFixConfig LIZ = new FeedCellGradualFixConfig(false, 600);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final int LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1EBH());
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((FeedCellGradualFixConfig) c01gwLIZIZ.getValue()).enableFix;
        LIZLLL = ((FeedCellGradualFixConfig) c01gwLIZIZ.getValue()).delayTime;
    }

    public static final class FeedCellGradualFixConfig {

        @C09CT("delay_time")
        public final int delayTime;

        @C09CT("enable_fix")
        public final boolean enableFix;

        public FeedCellGradualFixConfig() {
            this(false, 600);
        }

        public FeedCellGradualFixConfig(boolean z, int i) {
            this.enableFix = z;
            this.delayTime = i;
        }
    }
}
