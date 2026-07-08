package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C09CT;
import com.ss.android.ugc.aweme.foundation.model.CurrencyFormat;

/* JADX INFO: loaded from: classes27.dex */
public final class CheckoutPageFooter {

    @C09CT("amount")
    public final String amount;

    @C09CT("currency")
    public final String currency;

    @C09CT("currency_format")
    public final CurrencyFormat currencyFormat;

    @C09CT("pay_button_text")
    public final String payButtonText;

    @C09CT("show_amount_str")
    public final String showAmountStr;

    @C09CT("total_str")
    public final String totalStr;

    public CheckoutPageFooter() {
        this(null, null, null, null, null, null);
    }

    public CheckoutPageFooter(String str, String str2, String str3, String str4, CurrencyFormat currencyFormat, String str5) {
        this.totalStr = str;
        this.amount = str2;
        this.currency = str3;
        this.showAmountStr = str4;
        this.currencyFormat = currencyFormat;
        this.payButtonText = str5;
    }
}
