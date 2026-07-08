package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierPaymentInfo implements Serializable {

    @C09CT("agreement_id")
    public final String agreementId;

    @C09CT("currency")
    public final String currency;

    @C09CT("payment_amount")
    public final String paymentAmount;

    @C09CT("payment_currency")
    public final String paymentCurrency;

    @C09CT("payment_reference")
    public final String paymentReference;

    @C09CT("quote_currency")
    public final String quoteCurrency;

    public CashierPaymentInfo() {
        this(null, null, null, null, null, null);
    }

    public CashierPaymentInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.paymentReference = str;
        this.paymentCurrency = str2;
        this.paymentAmount = str3;
        this.agreementId = str4;
        this.currency = str5;
        this.quoteCurrency = str6;
    }
}
