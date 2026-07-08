package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentPreBindResponse {

    @C09CT("decision")
    public final String decision;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("order_id")
    public final String orderId;

    @C09CT("risk_verify_info")
    public final String riskVerifyInfo;

    public PaymentPreBindResponse() {
        this(null, null, null, null, null);
    }

    public PaymentPreBindResponse(String str, String str2, String str3, String str4, String str5) {
        this.orderId = str;
        this.decision = str2;
        this.riskVerifyInfo = str3;
        this.errorCode = str4;
        this.errorMsg = str5;
    }
}
