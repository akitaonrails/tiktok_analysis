package webcast.data.oec_msg;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class PriceItem {

    @C09CT("currency_show_mode")
    public int currencyShowMode;

    @C09CT("price_display_mode")
    public int priceDisplayMode;

    @C09CT("price_hide_info")
    public PriceHideInfo priceHideInfo;

    @C09CT("show_currency_space")
    public boolean showCurrencySpace;

    @C09CT("symbol_position")
    public int symbolPosition;

    @C09CT("currency_name")
    public String currencyName = "";

    @C09CT("currency_symbol")
    public String currencySymbol = "";

    @C09CT("sale_price_format")
    public String salePriceFormat = "";

    @C09CT("origin_price_format")
    public String originPriceFormat = "";

    @C09CT("discount_format")
    public String discountFormat = "";

    @C09CT("price_prefix")
    public String pricePrefix = "";

    @C09CT("reduce_price_format")
    public String reducePriceFormat = "";

    @C09CT("single_product_price_format")
    public String singleProductPriceFormat = "";

    @C09CT("sale_price_decimal")
    public String salePriceDecimal = "";

    @C09CT("origin_price_decimal")
    public String originPriceDecimal = "";

    @C09CT("discount_decimal")
    public String discountDecimal = "";
}
