package com.ss.android.ugc.aweme.ecommercebase.promotion.data.style;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class PriceConfig {

    @C09CT("after_coupon_price")
    public final PriceTextConfig afterCouponPrice;

    @C09CT("currency")
    public final PriceTextConfig currency;

    @C09CT("discount_tag")
    public final DiscountTag discount;

    @C09CT("price_discount_display_order")
    public final List<String> discountDisplayOrder;

    @C09CT("display_price_exceed_length")
    public final Integer displayPriceExceedLength;

    @C09CT("exceed_discount")
    public final PriceTextConfig exceedDiscount;

    @C09CT("exceed_display_available_price")
    public final PriceTextConfig exceedDisplayAvailablePrice;

    @C09CT("exceed_display_currency")
    public final PriceTextConfig exceedDisplayCurrency;

    @C09CT("exceed_format_origin_price")
    public final PriceTextConfig exceedFormatOriginPrice;

    @C09CT("live_flash_sale_discount_tag")
    public final DiscountTag flashSaleDiscount;

    @C09CT("format_available_price")
    public final PriceTextConfig formatAvailablePrice;

    @C09CT("format_available_price_decimal")
    public final PriceTextConfig formatAvailablePriceDecimal;

    @C09CT("format_available_price_integer")
    public final PriceTextConfig formatAvailablePriceInteger;

    @C09CT("format_available_price_point")
    public final PriceTextConfig formatAvailablePricePoint;

    @C09CT("format_origin_price")
    public final PriceTextConfig formatOriginPrice;

    @C09CT("origin_price_exceed_length")
    public final Integer originPriceExceedLength;

    @C09CT("prefix")
    public final PriceTextConfig prefix;

    public PriceConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public PriceConfig(PriceTextConfig priceTextConfig, PriceTextConfig priceTextConfig2, PriceTextConfig priceTextConfig3, PriceTextConfig priceTextConfig4, PriceTextConfig priceTextConfig5, PriceTextConfig priceTextConfig6, PriceTextConfig priceTextConfig7, PriceTextConfig priceTextConfig8, PriceTextConfig priceTextConfig9, PriceTextConfig priceTextConfig10, PriceTextConfig priceTextConfig11, PriceTextConfig priceTextConfig12, Integer num, Integer num2, DiscountTag discountTag, DiscountTag discountTag2, List<String> list) {
        this.prefix = priceTextConfig;
        this.currency = priceTextConfig2;
        this.formatAvailablePrice = priceTextConfig3;
        this.formatAvailablePriceInteger = priceTextConfig4;
        this.formatAvailablePriceDecimal = priceTextConfig5;
        this.formatAvailablePricePoint = priceTextConfig6;
        this.formatOriginPrice = priceTextConfig7;
        this.afterCouponPrice = priceTextConfig8;
        this.exceedDisplayCurrency = priceTextConfig9;
        this.exceedDisplayAvailablePrice = priceTextConfig10;
        this.exceedFormatOriginPrice = priceTextConfig11;
        this.exceedDiscount = priceTextConfig12;
        this.originPriceExceedLength = num;
        this.displayPriceExceedLength = num2;
        this.discount = discountTag;
        this.flashSaleDiscount = discountTag2;
        this.discountDisplayOrder = list;
    }
}
