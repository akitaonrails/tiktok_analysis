package com.ss.android.ugc.aweme.pipo.cashier.cashier.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierPaymentInfo {

    @C09CT("agreement_id")
    public final String agreementId;

    @C09CT("payment_amount")
    public final String paymentAmount;

    @C09CT("payment_currency")
    public final String paymentCurrency;

    @C09CT("payment_reference")
    public final String paymentReference;

    public CashierPaymentInfo() {
        this(null, null, null, null);
    }

    public CashierPaymentInfo(String str, String str2, String str3, String str4) {
        this.paymentReference = str;
        this.paymentCurrency = str2;
        this.paymentAmount = str3;
        this.agreementId = str4;
    }
}
