package com.bytedance.iap.core.model;

import X.C09CT;
import X.EnumC1780660wRE;

/* JADX INFO: loaded from: classes28.dex */
public final class IAPProductPrice {
    public final transient long LIZ;

    @C09CT("price")
    public final String price;

    @C09CT("price_currency_code")
    public final String priceCurrencyCode;

    @C09CT("recurrence_mode")
    public final EnumC1780660wRE recurrenceMode;

    public IAPProductPrice(String str, long j, String str2, EnumC1780660wRE enumC1780660wRE) {
        this.price = str;
        this.LIZ = j;
        this.priceCurrencyCode = str2;
        this.recurrenceMode = enumC1780660wRE;
    }
}
