package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcUploadPayInfoRequest {

    @C09CT("action_info")
    public String actionInfo;

    @C09CT("combine_pay_order_id")
    public String combinePayOrderId;

    @C09CT("payment_action_id")
    public String paymentActionId;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    public EcUploadPayInfoRequest() {
        this(null, null, null, null);
    }

    public EcUploadPayInfoRequest(String str, String str2, String str3, String str4) {
        this.combinePayOrderId = str;
        this.paymentActionId = str2;
        this.pipoErrorCodeParams = str3;
        this.actionInfo = str4;
    }
}
