package com.bytedance.pipo.googlepay.pushprovisioning.api;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CreateEphemeralKeyRequest {

    @C09CT("biz_content")
    public final String bizContent;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("request_time")
    public final String requestTime;

    public CreateEphemeralKeyRequest() {
        this("", "", "");
    }

    public CreateEphemeralKeyRequest(String str, String str2, String str3) {
        this.bizContent = str;
        this.merchantId = str2;
        this.requestTime = str3;
    }
}
