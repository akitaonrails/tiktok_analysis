package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentResult {

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("payment_status")
    public final String paymentStatus;

    public PaymentResult(String str, String str2) {
        this.paymentStatus = str;
        this.errorCode = str2;
    }
}
