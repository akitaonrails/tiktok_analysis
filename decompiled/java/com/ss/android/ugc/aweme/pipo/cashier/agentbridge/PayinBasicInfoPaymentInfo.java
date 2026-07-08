package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PayinBasicInfoPaymentInfo {

    @C09CT("payment_amount")
    public final String paymentAmount;

    @C09CT("payment_currency")
    public final String paymentCurrency;

    public PayinBasicInfoPaymentInfo() {
        this(null, null);
    }

    public PayinBasicInfoPaymentInfo(String str, String str2) {
        this.paymentAmount = str;
        this.paymentCurrency = str2;
    }
}
