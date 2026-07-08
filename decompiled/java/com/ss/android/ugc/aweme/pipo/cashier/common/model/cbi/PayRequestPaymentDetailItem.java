package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PayRequestPaymentDetailItem {

    @C09CT("amount")
    public final String amount;

    @C09CT("payment_method")
    public final PayRequestPaymentMethod pm;

    public PayRequestPaymentDetailItem() {
        this(null, null);
    }

    public PayRequestPaymentDetailItem(String str, PayRequestPaymentMethod payRequestPaymentMethod) {
        this.amount = str;
        this.pm = payRequestPaymentMethod;
    }
}
