package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuCardStyleInfoV2 {

    @C09CT("edit_bundle_quantity_toast")
    public final String editBundleQuantityToast;

    @C09CT("sku_card_style_type")
    public final Integer skuCardStyleType;

    @C09CT("title_light_text")
    public final String titleLightText;

    public SkuCardStyleInfoV2() {
        this(null, null, null);
    }

    public SkuCardStyleInfoV2(Integer num, String str, String str2) {
        this.skuCardStyleType = num;
        this.titleLightText = str;
        this.editBundleQuantityToast = str2;
    }
}
