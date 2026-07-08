package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PriceInfo {

    @C09CT("currency_name")
    public final String currencyName;

    @C09CT("currency_show_mode")
    public final String currencyShowMode;

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("decimal_point_symbol")
    public final String decimalPointSymbol;

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

    @C09CT("sale_price_decimal")
    public final String salePriceDecimal;

    @C09CT("sale_price_decimal_part_format")
    public final String salePriceDecimalPartFormat;

    @C09CT("sale_price_format")
    public final String salePriceFormat;

    @C09CT("sale_price_integer_part_format")
    public final String salePriceIntegerPartFormat;

    @C09CT("show_currency_space")
    public final String showCurrencySpace;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("symbol_position")
    public final Integer symbolPosition;

    public PriceInfo(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.skuId = str;
        this.currencyName = str2;
        this.currencySymbol = str3;
        this.symbolPosition = num;
        this.salePriceDecimal = str4;
        this.pricePrefix = str5;
        this.originPriceDecimal = str6;
        this.salePriceFormat = str7;
        this.originPriceFormat = str8;
        this.discountFormat = str9;
        this.discountDecimal = str10;
        this.showCurrencySpace = str11;
        this.currencyShowMode = str12;
        this.salePriceIntegerPartFormat = str13;
        this.salePriceDecimalPartFormat = str14;
        this.decimalPointSymbol = str15;
    }
}
