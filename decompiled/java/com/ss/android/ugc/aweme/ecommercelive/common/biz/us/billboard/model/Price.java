package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class Price {

    @C09CT("original_price_with_currency")
    public final String originalPriceStr;

    @C09CT("promotion_price_with_currency")
    public final String promotionPriceStr;

    public Price() {
        this(null, null);
    }

    public final int hashCode() {
        String str = this.originalPriceStr;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promotionPriceStr;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public Price(String str, String str2) {
        this.originalPriceStr = str;
        this.promotionPriceStr = str2;
    }
}
