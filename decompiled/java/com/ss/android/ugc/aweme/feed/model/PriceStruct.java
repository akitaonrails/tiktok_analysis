package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class PriceStruct implements Serializable {

    @C09CT("format_price_color_style")
    public final int colorStyle;

    @C09CT("currency")
    public String currency;

    @C09CT("currency_symbol")
    public String currencySymbol;

    @C09CT("market_price_number")
    public String marketPriceNumber;

    @C09CT("show_currency_space")
    public boolean showCurrencySpace;

    @C09CT("format_price_number")
    public final String number = "";

    @C09CT("format_origin_price_number")
    public final String originNumber = "";

    @C09CT("symbol_position")
    public int symbolPosition = 1;

    public final int getColorStyle() {
        return this.colorStyle;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getMarketPriceNumber() {
        return this.marketPriceNumber;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getOriginNumber() {
        return this.originNumber;
    }

    public final boolean getShowCurrencySpace() {
        return this.showCurrencySpace;
    }

    public final int getSymbolPosition() {
        return this.symbolPosition;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setCurrencySymbol(String str) {
        this.currencySymbol = str;
    }

    public final void setMarketPriceNumber(String str) {
        this.marketPriceNumber = str;
    }

    public final void setShowCurrencySpace(boolean z) {
        this.showCurrencySpace = z;
    }

    public final void setSymbolPosition(int i) {
        this.symbolPosition = i;
    }
}
