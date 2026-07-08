package com.bytedance.globalpayment.iap.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public class AbsIapPricingPhase {

    @C09CT("price")
    public String mPrice;

    @C09CT("priceAmountMicros")
    public long mPriceAmountMicros;

    @C09CT("priceCurrencyCode")
    public String mPriceCurrencyCode;

    public AbsIapPricingPhase(String str, long j, String str2) {
        this.mPrice = str;
        this.mPriceAmountMicros = j;
        this.mPriceCurrencyCode = str2;
    }
}
