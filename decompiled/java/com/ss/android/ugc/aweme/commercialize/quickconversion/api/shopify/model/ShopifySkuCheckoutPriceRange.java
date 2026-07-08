package com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class ShopifySkuCheckoutPriceRange implements Serializable {

    @C09CT("currency")
    public final String currency;

    @C09CT("max")
    public final String max;

    @C09CT("min")
    public final String min;

    public ShopifySkuCheckoutPriceRange(String str, String str2, String str3) {
        this.min = str;
        this.max = str2;
        this.currency = str3;
    }
}
