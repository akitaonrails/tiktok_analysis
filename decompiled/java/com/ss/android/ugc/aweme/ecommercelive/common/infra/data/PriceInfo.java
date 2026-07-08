package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class PriceInfo {

    @C09CT("after_coupon_price")
    public final String afterCouponPrice;

    @C09CT("after_coupon_price_show_content")
    public final String afterCouponPriceContent;

    @C09CT("available_price")
    public String availablePrice;

    @C09CT("currency")
    public String currency;

    @C09CT("deposit_price")
    public final DepositPrice depositPrice;

    @C09CT("display_style")
    public int displayStyle;

    @C09CT("origin_price")
    public String originPrice;

    @C09CT("price_display_mode")
    public final Integer priceDisplayMode;

    @C09CT("price_hide_info")
    public final PriceHideInfo priceHideInfo;

    @C09CT("price_prefix")
    public String pricePrefix;

    public PriceInfo(String str, String str2, String str3, int i, String str4, Integer num, PriceHideInfo priceHideInfo, DepositPrice depositPrice, String str5, String str6) {
        this.originPrice = str;
        this.availablePrice = str2;
        this.currency = str3;
        this.displayStyle = i;
        this.pricePrefix = str4;
        this.priceDisplayMode = num;
        this.priceHideInfo = priceHideInfo;
        this.depositPrice = depositPrice;
        this.afterCouponPriceContent = str5;
        this.afterCouponPrice = str6;
    }
}
