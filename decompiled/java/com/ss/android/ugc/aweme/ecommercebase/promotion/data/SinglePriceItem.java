package com.ss.android.ugc.aweme.ecommercebase.promotion.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceUiConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SinglePriceItem implements Serializable {

    @C09CT("currency_name")
    public final String currencyName;

    @C09CT("currency_show_mode")
    public final Integer currencyShowMode;

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

    @C09CT("price_display_mode")
    public Integer priceDisplayMode;

    @C09CT("price_hide_info")
    public final SinglePriceHideInfo priceHideInfo;

    @C09CT("price_prefix")
    public final String pricePrefix;
    public transient PriceUiConfig priceUiConfig;

    @C09CT("reduce_price_format")
    public final String reducePriceFormat;

    @C09CT("sale_price_decimal")
    public String salePriceDecimal;

    @C09CT("sale_price_decimal_part_format")
    public final String salePriceDecimalPartFormat;

    @C09CT("sale_price_format")
    public String salePriceFormat;

    @C09CT("sale_price_integer_part_format")
    public final String salePriceIntegerPartFormat;

    @C09CT("show_currency_space")
    public final Boolean showCurrencySpace;

    @C09CT("single_product_price_format")
    public final String singleProductPriceFormat;

    @C09CT("sku_id")
    public final long skuId;

    @C09CT("symbol_position")
    public final int symbolPosition;

    public String toString() {
        return "SinglePriceItem(skuId=" + this.skuId + ", currencyName=" + this.currencyName + ", currencySymbol=" + this.currencySymbol + ", symbolPosition=" + this.symbolPosition + ", salePriceDecimal=" + this.salePriceDecimal + ", originPriceDecimal=" + this.originPriceDecimal + ", salePriceFormat=" + this.salePriceFormat + ", originPriceFormat=" + this.originPriceFormat + ", discountFormat=" + this.discountFormat + ", discountDecimal=" + this.discountDecimal + ", pricePrefix=" + this.pricePrefix + ", priceDisplayMode=" + this.priceDisplayMode + ", priceHideInfo=" + this.priceHideInfo + ", reducePriceFormat=" + this.reducePriceFormat + ", singleProductPriceFormat=" + this.singleProductPriceFormat + ", showCurrencySpace=" + this.showCurrencySpace + ", currencyShowMode=" + this.currencyShowMode + ", salePriceIntegerPartFormat=" + this.salePriceIntegerPartFormat + ", salePriceDecimalPartFormat=" + this.salePriceDecimalPartFormat + ", decimalPointSymbol=" + this.decimalPointSymbol + ')';
    }

    public final String currency() {
        Integer num = this.currencyShowMode;
        return (num == null || num.intValue() != 2) ? this.currencySymbol : this.currencyName;
    }

    public final void setPriceDisplayMode(Integer num) {
        this.priceDisplayMode = num;
    }

    public final void setPriceUiConfig(PriceUiConfig priceUiConfig) {
        this.priceUiConfig = priceUiConfig;
    }

    public final void setSalePriceDecimal(String str) {
        this.salePriceDecimal = str;
    }

    public final void setSalePriceFormat(String str) {
        this.salePriceFormat = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String discount(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r3 = r4.discountFormat
            if (r3 == 0) goto L46
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceUiConfig r0 = r4.priceUiConfig
            r2 = 45
            if (r0 == 0) goto L36
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceConfig> r0 = r0.configs
            if (r0 == 0) goto L36
            java.lang.Object r0 = r0.get(r5)
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceConfig r0 = (com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceConfig) r0
            if (r0 == 0) goto L36
            if (r6 == 0) goto L49
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag r0 = r0.flashSaleDiscount
            if (r0 == 0) goto L56
            java.lang.Boolean r1 = r0.useMinusPrefix
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L24:
            if (r0 == 0) goto L56
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            if (r0 != 0) goto L48
        L36:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            if (r0 != 0) goto L48
        L46:
            java.lang.String r0 = ""
        L48:
            return r0
        L49:
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag r0 = r0.discount
            if (r0 == 0) goto L56
            java.lang.Boolean r1 = r0.useMinusPrefix
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            goto L24
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem.discount(java.lang.String, boolean):java.lang.String");
    }

    public SinglePriceItem(long j, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, SinglePriceHideInfo singlePriceHideInfo, String str10, String str11, Boolean bool, Integer num2, String str12, String str13, String str14) {
        this.skuId = j;
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
        this.priceDisplayMode = num;
        this.priceHideInfo = singlePriceHideInfo;
        this.reducePriceFormat = str10;
        this.singleProductPriceFormat = str11;
        this.showCurrencySpace = bool;
        this.currencyShowMode = num2;
        this.salePriceIntegerPartFormat = str12;
        this.salePriceDecimalPartFormat = str13;
        this.decimalPointSymbol = str14;
    }
}
