package com.bytedance.pipo.verify.base.model.request;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class FallbackGetVerifyRequest {

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("user_id")
    public final String userId;

    @C09CT("verify_id")
    public final String verifyId;

    @C09CT("verify_type")
    public final String verifyType;

    public FallbackGetVerifyRequest() {
        this(null, null, null, null, null);
    }

    public FallbackGetVerifyRequest(String str, String str2, String str3, String str4, String str5) {
        this.verifyType = str;
        this.verifyId = str2;
        this.userId = str3;
        this.merchantUserId = str4;
        this.merchantId = str5;
    }
}
