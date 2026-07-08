package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class UnbindPaymentMethodRequest {

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    public UnbindPaymentMethodRequest(String str, String str2) {
        this.paymentMethodToken = str;
        this.pipoErrorCodeParams = str2;
    }
}
