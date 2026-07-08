package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SinglePriceItem implements Serializable {

    @C09CT("currency_name")
    public final String currencyName;

    @C09CT("currency_show_mode")
    public final Integer currencyShowMode;

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("discount_decimal")
    public final String discountDecimal;

    @C09CT("discount_format")
    public final String discountFormat;

    @C09CT("origin_price_decimal")
    public final String originPriceDecimal;

    @C09CT("origin_price_format")
    public final String originPriceFormat;

    @C09CT("price_prefix")
    public final String pricePrefix;

    @C09CT("reduce_price_format")
    public final String reducePriceFormat;

    @C09CT("sale_price_decimal")
    public final String salePriceDecimal;

    @C09CT("sale_price_format")
    public final String salePriceFormat;

    @C09CT("show_currency_space")
    public final Boolean showCurrencySpace;

    @C09CT("single_product_price_format")
    public final String singleProductPriceFormat;

    @C09CT("symbol_position")
    public final int symbolPosition;

    public SinglePriceItem(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, Integer num) {
        this.currencyName = str;
        this.currencySymbol = str2;
        this.symbolPosition = i;
        this.salePriceDecimal = str3;
        this.originPriceDecimal = str4;
        this.salePriceFormat = str5;
        this.originPriceFormat = str6;
        this.discountFormat = str7;
        this.discountDecimal = str8;
        this.pricePrefix = str9;
        this.reducePriceFormat = str10;
        this.singleProductPriceFormat = str11;
        this.showCurrencySpace = bool;
        this.currencyShowMode = num;
    }
}
