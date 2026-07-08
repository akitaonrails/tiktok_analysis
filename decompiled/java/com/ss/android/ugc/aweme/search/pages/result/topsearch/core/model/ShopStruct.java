package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ShopStruct {

    @C09CT("currency_show_mode")
    public final Integer currencyShowMode;

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("format_price")
    public final String formatPrice;

    @C09CT("format_price_number")
    public final String formatPriceNumber;

    @C09CT("img")
    public final List<String> img;

    @C09CT("product_id_str")
    public final String productIdStr;

    @C09CT("schema")
    public final String schema;

    @C09CT("sell_info")
    public final String sellInfo;

    @C09CT("show_currency_space")
    public final Boolean showCurrencySpace;

    @C09CT("symbol_position")
    public final Integer symbolPosition;

    @C09CT("title")
    public final String title;

    public ShopStruct() {
        this("", "", null, null, null, null, null, null, null, null, null);
    }

    public ShopStruct(String str, String str2, List<String> list, String str3, String str4, String str5, String str6, String str7, Integer num, Boolean bool, Integer num2) {
        this.productIdStr = str;
        this.title = str2;
        this.img = list;
        this.formatPrice = str3;
        this.schema = str4;
        this.currencySymbol = str5;
        this.sellInfo = str6;
        this.formatPriceNumber = str7;
        this.symbolPosition = num;
        this.showCurrencySpace = bool;
        this.currencyShowMode = num2;
    }
}
