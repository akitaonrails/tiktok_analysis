package com.ss.android.ugc.aweme.checkout.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ShopifyDiscountBannerLogModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("amount")
    public final Float amount;

    @C09CT("currencyCode")
    public final String currencyCode;

    @C09CT("display")
    public final String display;

    public ShopifyDiscountBannerLogModel() {
        this(null, null, null);
    }

    public ShopifyDiscountBannerLogModel(String str, Float f, String str2) {
        this.currencyCode = str;
        this.amount = f;
        this.display = str2;
    }
}
