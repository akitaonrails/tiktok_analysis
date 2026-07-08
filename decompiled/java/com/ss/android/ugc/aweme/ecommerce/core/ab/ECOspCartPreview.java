package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes2.dex */
public final class ECOspCartPreview {
    public static final ECOspCartPreviewConfig LIZ;

    public static final class ECOspCartPreviewConfig {

        @C09CT("is_preview")
        public final Boolean isPreview;

        public ECOspCartPreviewConfig() {
            this(Boolean.FALSE);
        }

        public ECOspCartPreviewConfig(Boolean bool) {
            this.isPreview = bool;
        }
    }

    static {
        new ECOspCartPreview();
        LIZ = new ECOspCartPreviewConfig(Boolean.FALSE);
    }

    public static final boolean LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ECOspCartPreviewConfig eCOspCartPreviewConfig = LIZ;
        ECOspCartPreviewConfig eCOspCartPreviewConfig2 = (ECOspCartPreviewConfig) c0c64LJIILLIIL.LJJII(ECOspCartPreviewConfig.class, eCOspCartPreviewConfig, "ecom_osp_cart_preview", true);
        if (eCOspCartPreviewConfig2 != null) {
            eCOspCartPreviewConfig = eCOspCartPreviewConfig2;
        }
        Boolean bool = eCOspCartPreviewConfig.isPreview;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
