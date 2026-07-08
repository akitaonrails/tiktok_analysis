package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes2.dex */
public final class ECOspPreviewExpand {
    public static final ECOspPreviewExpandConfig LIZ;

    public static final class ECOspPreviewExpandConfig {

        @C09CT("expand_preview")
        public final Boolean expandPreview;

        public ECOspPreviewExpandConfig() {
            this(Boolean.FALSE);
        }

        public ECOspPreviewExpandConfig(Boolean bool) {
            this.expandPreview = bool;
        }
    }

    static {
        new ECOspPreviewExpand();
        LIZ = new ECOspPreviewExpandConfig(Boolean.FALSE);
    }

    public static final boolean LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ECOspPreviewExpandConfig eCOspPreviewExpandConfig = LIZ;
        ECOspPreviewExpandConfig eCOspPreviewExpandConfig2 = (ECOspPreviewExpandConfig) c0c64LJIILLIIL.LJJII(ECOspPreviewExpandConfig.class, eCOspPreviewExpandConfig, "ecom_osp_preview_expand", true);
        if (eCOspPreviewExpandConfig2 != null) {
            eCOspPreviewExpandConfig = eCOspPreviewExpandConfig2;
        }
        Boolean bool = eCOspPreviewExpandConfig.expandPreview;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
