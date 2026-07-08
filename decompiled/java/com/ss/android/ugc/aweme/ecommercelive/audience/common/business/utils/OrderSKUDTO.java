package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderSKUDTO {

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("entrance_info")
    public final String entranceInfo;

    @C09CT("kol_id")
    public final String kolId;

    @C09CT("product_id")
    public final String productId;

    @C09CT("quantity")
    public final Integer quantity;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("source")
    public final Integer source;

    public OrderSKUDTO(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5) {
        this.productId = str;
        this.skuId = str2;
        this.quantity = num;
        this.source = num2;
        this.entranceInfo = str3;
        this.chainKey = str4;
        this.kolId = str5;
    }
}
