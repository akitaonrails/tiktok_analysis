package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class ProductInfo {

    @C09CT("currency")
    public final String currency;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("price")
    public final Float price;

    @C09CT("price_point_id")
    public final String pricePointId;

    @C09CT("product_id")
    public final String productId;

    @C09CT("sku_id")
    public final String skuId;

    public ProductInfo() {
        this(null, null, null, null, null, null);
    }

    public ProductInfo(String str, String str2, String str3, String str4, Float f, String str5) {
        this.currency = str;
        this.skuId = str2;
        this.productId = str3;
        this.merchantId = str4;
        this.price = f;
        this.pricePointId = str5;
    }
}
