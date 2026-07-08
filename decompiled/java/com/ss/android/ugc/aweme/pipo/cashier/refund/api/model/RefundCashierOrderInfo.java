package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundCashierOrderInfo {

    @C09CT("merchant_refund_id")
    public final String merchantRefundId;

    @C09CT("merchant_transaction_id")
    public final String merchantTransactionId;

    @C09CT("payment_reference")
    public final String paymentReference;

    @C09CT("refund_amount")
    public final String refundAmount;

    @C09CT("refund_currency")
    public final String refundCurrency;

    public RefundCashierOrderInfo() {
        this(null, null, null, null, null);
    }

    public RefundCashierOrderInfo(String str, String str2, String str3, String str4, String str5) {
        this.paymentReference = str;
        this.refundAmount = str2;
        this.refundCurrency = str3;
        this.merchantRefundId = str4;
        this.merchantTransactionId = str5;
    }
}
