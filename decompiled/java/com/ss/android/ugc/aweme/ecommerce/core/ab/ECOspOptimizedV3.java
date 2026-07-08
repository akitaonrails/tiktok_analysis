package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class ECOspOptimizedV3 {
    public static final EComOSPPreviewConfig LIZ;

    public static final class EComOSPPreviewConfig {

        @C09CT("ecom_osp_preview")
        public final Boolean isPreview;

        public EComOSPPreviewConfig() {
            this(Boolean.FALSE);
        }

        public EComOSPPreviewConfig(Boolean bool) {
            this.isPreview = bool;
        }
    }

    static {
        new ECOspOptimizedV3();
        LIZ = new EComOSPPreviewConfig(Boolean.FALSE);
    }

    public static final boolean LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EComOSPPreviewConfig eComOSPPreviewConfig = LIZ;
        EComOSPPreviewConfig eComOSPPreviewConfig2 = (EComOSPPreviewConfig) c0c64LJIILLIIL.LJJII(EComOSPPreviewConfig.class, eComOSPPreviewConfig, "ecom_osp_second_on_v3", true);
        if (eComOSPPreviewConfig2 != null) {
            eComOSPPreviewConfig = eComOSPPreviewConfig2;
        }
        Boolean bool = eComOSPPreviewConfig.isPreview;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
