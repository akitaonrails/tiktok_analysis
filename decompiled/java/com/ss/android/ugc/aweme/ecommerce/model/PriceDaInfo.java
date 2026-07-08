package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PriceDaInfo implements Serializable {

    @C09CT("available_price")
    public final String availablePriceValue;

    @C09CT("currency")
    public final String currency;

    @C09CT("origin_price")
    public final String originPriceValue;

    public PriceDaInfo() {
        this(null, null, null);
    }

    public PriceDaInfo(String str, String str2, String str3) {
        this.originPriceValue = str;
        this.availablePriceValue = str2;
        this.currency = str3;
    }
}
