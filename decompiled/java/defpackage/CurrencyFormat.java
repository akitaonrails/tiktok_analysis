package defpackage;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class CurrencyFormat implements Serializable {

    @C09CT("currency_code")
    public final String currencyCode;

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("currency_symbol_position")
    public final String currencySymbolPosition;

    @C09CT("decimal_separator")
    public final String decimalSeparator;

    @C09CT("grouping_separator")
    public final String groupingSeparator;

    @C09CT("max_fraction")
    public final Integer maxFraction;

    @C09CT("need_decimal")
    public final Integer needDecimal;

    public CurrencyFormat() {
        this(null, null, "suffix", null, null, null, null);
    }

    public CurrencyFormat(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
        this.currencyCode = str;
        this.currencySymbol = str2;
        this.currencySymbolPosition = str3;
        this.decimalSeparator = str4;
        this.groupingSeparator = str5;
        this.needDecimal = num;
        this.maxFraction = num2;
    }
}
