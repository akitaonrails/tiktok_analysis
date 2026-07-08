package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SubmitPaymentRequest {

    @C09CT("biz_content")
    public final String bizContent;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("pipo_error_code_params")
    public final String pipoErrorCodeParams;

    public SubmitPaymentRequest(String str, String str2, String str3) {
        this.bizContent = str;
        this.merchantId = str2;
        this.pipoErrorCodeParams = str3;
    }
}
