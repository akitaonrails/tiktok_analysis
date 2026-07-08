package com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class ProductWrapper implements Serializable {

    @C09CT("product")
    public final ShopifySkuCheckoutProductDetailData product;

    public ProductWrapper() {
        this(null);
    }

    public ProductWrapper(ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData) {
        this.product = shopifySkuCheckoutProductDetailData;
    }
}
