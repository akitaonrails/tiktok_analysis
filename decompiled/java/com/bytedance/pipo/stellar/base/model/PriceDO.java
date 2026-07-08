package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PriceDO extends BaseWidgetDO {

    @C09CT("amount")
    public final String amount;

    @C09CT("amount_color")
    public final ColorDO amountColor;

    @C09CT("amount_font")
    public final String amountFont;

    @C09CT("amount_font_token")
    public final String amountFontToken;

    @C09CT("currency")
    public final String currency;

    @C09CT("currency_color")
    public final ColorDO currencyColor;

    @C09CT("currency_font")
    public final String currencyFont;

    @C09CT("currency_font_token")
    public final String currencyFontToken;

    @C09CT("spacing")
    public final Integer spacing;

    @C09CT("symbol_align")
    public final String symbolAlign;

    @C09CT("symbol_position")
    public final String symbolPosition;

    public PriceDO() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final PriceDO copy(String str, String str2, String str3, ColorDO colorDO, String str4, String str5, String str6, ColorDO colorDO2, Integer num, String str7, String str8) {
        return new PriceDO(str, str2, str3, colorDO, str4, str5, str6, colorDO2, num, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceDO)) {
            return false;
        }
        PriceDO priceDO = (PriceDO) obj;
        return Intrinsics.LJFF(this.amount, priceDO.amount) && Intrinsics.LJFF(this.amountFont, priceDO.amountFont) && Intrinsics.LJFF(this.amountFontToken, priceDO.amountFontToken) && Intrinsics.LJFF(this.amountColor, priceDO.amountColor) && Intrinsics.LJFF(this.currency, priceDO.currency) && Intrinsics.LJFF(this.currencyFont, priceDO.currencyFont) && Intrinsics.LJFF(this.currencyFontToken, priceDO.currencyFontToken) && Intrinsics.LJFF(this.currencyColor, priceDO.currencyColor) && Intrinsics.LJFF(this.spacing, priceDO.spacing) && Intrinsics.LJFF(this.symbolPosition, priceDO.symbolPosition) && Intrinsics.LJFF(this.symbolAlign, priceDO.symbolAlign);
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amountFont;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amountFontToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ColorDO colorDO = this.amountColor;
        int iHashCode4 = (iHashCode3 + (colorDO == null ? 0 : colorDO.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currencyFont;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.currencyFontToken;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ColorDO colorDO2 = this.currencyColor;
        int iHashCode8 = (iHashCode7 + (colorDO2 == null ? 0 : colorDO2.hashCode())) * 31;
        Integer num = this.spacing;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.symbolPosition;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.symbolAlign;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "PriceDO(amount=" + this.amount + ", amountFont=" + this.amountFont + ", amountFontToken=" + this.amountFontToken + ", amountColor=" + this.amountColor + ", currency=" + this.currency + ", currencyFont=" + this.currencyFont + ", currencyFontToken=" + this.currencyFontToken + ", currencyColor=" + this.currencyColor + ", spacing=" + this.spacing + ", symbolPosition=" + this.symbolPosition + ", symbolAlign=" + this.symbolAlign + ')';
    }

    public final String getAmount() {
        return this.amount;
    }

    public final ColorDO getAmountColor() {
        return this.amountColor;
    }

    public final String getAmountFont() {
        return this.amountFont;
    }

    public final String getAmountFontToken() {
        return this.amountFontToken;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final ColorDO getCurrencyColor() {
        return this.currencyColor;
    }

    public final String getCurrencyFont() {
        return this.currencyFont;
    }

    public final String getCurrencyFontToken() {
        return this.currencyFontToken;
    }

    public final Integer getSpacing() {
        return this.spacing;
    }

    public final String getSymbolAlign() {
        return this.symbolAlign;
    }

    public final String getSymbolPosition() {
        return this.symbolPosition;
    }

    public PriceDO(String str, String str2, String str3, ColorDO colorDO, String str4, String str5, String str6, ColorDO colorDO2, Integer num, String str7, String str8) {
        super(null, null, 1, null, null);
        this.amount = str;
        this.amountFont = str2;
        this.amountFontToken = str3;
        this.amountColor = colorDO;
        this.currency = str4;
        this.currencyFont = str5;
        this.currencyFontToken = str6;
        this.currencyColor = colorDO2;
        this.spacing = num;
        this.symbolPosition = str7;
        this.symbolAlign = str8;
    }
}
