package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes2.dex */
public final class ECOspSecondaryRefreshByChunkOpt {
    public static final EComOSPSecondaryRefreshConfig LIZ;

    public static final class EComOSPSecondaryRefreshConfig {

        @C09CT("ecom_osp_secondary_chunk")
        public final Boolean enableChunk;

        @C09CT("ecom_osp_optimize_loading")
        public final Boolean optimizeLoading;

        public EComOSPSecondaryRefreshConfig() {
            this(Boolean.FALSE, Boolean.FALSE);
        }

        public EComOSPSecondaryRefreshConfig(Boolean bool, Boolean bool2) {
            this.optimizeLoading = bool;
            this.enableChunk = bool2;
        }
    }

    static {
        new ECOspSecondaryRefreshByChunkOpt();
        LIZ = new EComOSPSecondaryRefreshConfig(Boolean.FALSE, Boolean.FALSE);
    }

    public static final boolean LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EComOSPSecondaryRefreshConfig eComOSPSecondaryRefreshConfig = LIZ;
        EComOSPSecondaryRefreshConfig eComOSPSecondaryRefreshConfig2 = (EComOSPSecondaryRefreshConfig) c0c64LJIILLIIL.LJJII(EComOSPSecondaryRefreshConfig.class, eComOSPSecondaryRefreshConfig, "ec_osp_secondary_refresh_by_chunk_opt", true);
        if (eComOSPSecondaryRefreshConfig2 != null) {
            eComOSPSecondaryRefreshConfig = eComOSPSecondaryRefreshConfig2;
        }
        Boolean bool = eComOSPSecondaryRefreshConfig.enableChunk;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
