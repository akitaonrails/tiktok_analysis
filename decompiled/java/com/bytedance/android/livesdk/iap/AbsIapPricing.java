package com.bytedance.android.livesdk.iap;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public class AbsIapPricing {

    @C09CT("price")
    public String price;

    @C09CT("priceAmountMicros")
    public long priceAmountMicros;

    @C09CT("priceCurrencyCode")
    public String priceCurrencyCode;

    public AbsIapPricing(String str, long j, String str2) {
        this.price = str;
        this.priceAmountMicros = j;
        this.priceCurrencyCode = str2;
    }
}
