package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoProductCartSignal {

    @C09CT("count")
    public final int count;

    @C09CT("currency")
    public final String currency;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_name")
    public final String productName;

    @C09CT("sale_price_value")
    public final float salePrice;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("timestamp")
    public final long time;

    public TakoProductCartSignal() {
        this("", "", "", "", 0.0f, 1, 0L);
    }

    public TakoProductCartSignal(String str, String str2, String str3, String str4, float f, int i, long j) {
        this.productId = str;
        this.productName = str2;
        this.skuId = str3;
        this.currency = str4;
        this.salePrice = f;
        this.count = i;
        this.time = j;
    }
}
