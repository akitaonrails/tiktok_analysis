package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundRequest {

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_refund_id")
    public final String merchantRefundId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("payment_reference")
    public final String paymentReference;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("refund_data")
    public final RefundMethodData refundMethodData;

    public RefundRequest() {
        this(null, null, null, null, null, null);
    }

    public RefundRequest(String str, String str2, String str3, String str4, RefundMethodData refundMethodData, String str5) {
        this.merchantRefundId = str;
        this.merchantId = str2;
        this.merchantUserId = str3;
        this.paymentReference = str4;
        this.refundMethodData = refundMethodData;
        this.pipoErrorCodeParams = str5;
    }
}
