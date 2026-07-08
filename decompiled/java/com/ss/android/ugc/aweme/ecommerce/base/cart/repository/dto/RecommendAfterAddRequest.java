package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendAfterAddRequest {

    @C09CT("logistics_service_id")
    public final String logisticsServiceID;

    @C09CT("product_id")
    public final String productId;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("sku_price")
    public final String skuPrice;

    @C09CT("source")
    public final Integer source;

    public RecommendAfterAddRequest(String str, String str2, Integer num, String str3, String str4) {
        this.productId = str;
        this.skuId = str2;
        this.source = num;
        this.skuPrice = str3;
        this.logisticsServiceID = str4;
    }
}
