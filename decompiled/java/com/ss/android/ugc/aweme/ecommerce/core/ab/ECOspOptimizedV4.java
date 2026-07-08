package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class ECOspOptimizedV4 {
    public static final ECOspQueryTimingConfig LIZ;

    public static final class ECOspQueryTimingConfig {

        @C09CT("ecom_osp_optimize_timing")
        public final Boolean isOptimize;

        public ECOspQueryTimingConfig() {
            this(Boolean.FALSE);
        }

        public ECOspQueryTimingConfig(Boolean bool) {
            this.isOptimize = bool;
        }
    }

    static {
        new ECOspOptimizedV4();
        LIZ = new ECOspQueryTimingConfig(Boolean.FALSE);
    }

    public static final boolean LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ECOspQueryTimingConfig eCOspQueryTimingConfig = LIZ;
        ECOspQueryTimingConfig eCOspQueryTimingConfig2 = (ECOspQueryTimingConfig) c0c64LJIILLIIL.LJJII(ECOspQueryTimingConfig.class, eCOspQueryTimingConfig, "ecom_osp_second_on_v4", true);
        if (eCOspQueryTimingConfig2 != null) {
            eCOspQueryTimingConfig = eCOspQueryTimingConfig2;
        }
        Boolean bool = eCOspQueryTimingConfig.isOptimize;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
