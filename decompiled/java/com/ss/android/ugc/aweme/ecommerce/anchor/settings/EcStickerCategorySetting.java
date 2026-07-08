package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcStickerCategorySetting {
    public static final EcStickerCategoryConfig LIZ = new EcStickerCategoryConfig(false, false);

    public static final class EcStickerCategoryConfig {

        @C09CT("enable_category")
        public final boolean enableCategory;

        @C09CT("enable_guide")
        public final boolean enableGuide;

        public EcStickerCategoryConfig(boolean z, boolean z2) {
            this.enableGuide = z;
            this.enableCategory = z2;
        }
    }
}
