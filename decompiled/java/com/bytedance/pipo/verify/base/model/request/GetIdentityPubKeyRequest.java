package com.bytedance.pipo.verify.base.model.request;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class GetIdentityPubKeyRequest {

    @C09CT("biz_content")
    public final String bizContent;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("request_time")
    public final String requestTime;

    @C09CT("verify_id")
    public final String verifyId;

    @C09CT("verify_type")
    public final String verifyType;

    public GetIdentityPubKeyRequest() {
        this(null, null, null, null, null);
    }

    public GetIdentityPubKeyRequest(String str, String str2, String str3, String str4, String str5) {
        this.requestTime = str;
        this.merchantId = str2;
        this.verifyId = str3;
        this.verifyType = str4;
        this.bizContent = str5;
    }
}
