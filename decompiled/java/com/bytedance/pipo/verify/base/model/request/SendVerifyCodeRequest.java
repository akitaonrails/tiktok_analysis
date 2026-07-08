package com.bytedance.pipo.verify.base.model.request;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SendVerifyCodeRequest {

    @C09CT("pipo_error_code_params")
    public final String errorCodeParams;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("verify_code_detail")
    public final String verifyCodeDetail;

    @C09CT("verify_code_type")
    public final String verifyCodeType;

    @C09CT("verify_id")
    public final String verifyId;

    @C09CT("verify_type")
    public final String verifyType;

    public SendVerifyCodeRequest() {
        this(null, null, null, null, null, null, null);
    }

    public SendVerifyCodeRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.merchantUserId = str;
        this.merchantId = str2;
        this.verifyId = str3;
        this.verifyType = str4;
        this.verifyCodeType = str5;
        this.verifyCodeDetail = str6;
        this.errorCodeParams = str7;
    }
}
