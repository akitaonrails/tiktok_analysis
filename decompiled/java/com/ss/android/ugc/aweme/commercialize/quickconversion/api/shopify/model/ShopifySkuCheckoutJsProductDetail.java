package com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class ShopifySkuCheckoutJsProductDetail {

    @C09CT("available")
    public final boolean available;

    @C09CT("instructions")
    public boolean isMultiOption;

    @C09CT("productId")
    public String productId;

    @C09CT("variantId")
    public final String variantId;

    public ShopifySkuCheckoutJsProductDetail() {
        this("", false, "", false);
    }

    public ShopifySkuCheckoutJsProductDetail(String str, boolean z, String str2, boolean z2) {
        this.productId = str;
        this.isMultiOption = z;
        this.variantId = str2;
        this.available = z2;
    }
}
