package com.ss.android.ugc.aweme.poi.uiwidget.gallery;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class SkuPrice {

    @C09CT("currency")
    public final String currency;

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("discount_tag")
    public final String discountTag;

    @C09CT("discount_type")
    public final String discountType;

    @C09CT("is_use_promotion")
    public final Boolean isUsePromotion;

    @C09CT("offer_price")
    public final String offerPrice;

    @C09CT("original_price")
    public final String originalPrice;

    public final Boolean isUsePromotion() {
        return this.isUsePromotion;
    }

    public SkuPrice(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        this.currencySymbol = str;
        this.offerPrice = str2;
        this.originalPrice = str3;
        this.currency = str4;
        this.discountTag = str5;
        this.discountType = str6;
        this.isUsePromotion = bool;
    }
}
