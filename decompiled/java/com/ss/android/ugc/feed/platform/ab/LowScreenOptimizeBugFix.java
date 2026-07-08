package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import X.C0C64;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class LowScreenOptimizeBugFix {
    public static final LowScreenOptFixConfig LIZ;

    static {
        LowScreenOptFixConfig lowScreenOptFixConfig = new LowScreenOptFixConfig(false, false);
        LowScreenOptFixConfig lowScreenOptFixConfig2 = (LowScreenOptFixConfig) C0C64.LJIILLIIL().LJJIIJ(true, "low_screen_optimize_bugfix", 31744, LowScreenOptFixConfig.class, lowScreenOptFixConfig, 2);
        if (lowScreenOptFixConfig2 != null) {
            lowScreenOptFixConfig = lowScreenOptFixConfig2;
        }
        LIZ = lowScreenOptFixConfig;
    }

    public static final class LowScreenOptFixConfig implements Serializable {
        public static final int $stable = 0;

        @C09CT("base_container_attached_fix")
        public final boolean baseContainerFix;

        @C09CT("state_control_media_fix")
        public final boolean stateControlMediaFix;

        public LowScreenOptFixConfig() {
            this(false, false);
        }

        public LowScreenOptFixConfig(boolean z, boolean z2) {
            this.baseContainerFix = z;
            this.stateControlMediaFix = z2;
        }
    }
}
