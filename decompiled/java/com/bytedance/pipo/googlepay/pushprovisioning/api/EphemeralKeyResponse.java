package com.bytedance.pipo.googlepay.pushprovisioning.api;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class EphemeralKeyResponse {

    @C09CT("response")
    public final String response;

    @C09CT("sign")
    public final String sign;

    public EphemeralKeyResponse() {
        this("", "");
    }

    public EphemeralKeyResponse(String str, String str2) {
        this.response = str;
        this.sign = str2;
    }
}
