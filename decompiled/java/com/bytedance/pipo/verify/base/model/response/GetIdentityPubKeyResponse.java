package com.bytedance.pipo.verify.base.model.response;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class GetIdentityPubKeyResponse {

    @C09CT("public_key")
    public final String publicKey;

    public GetIdentityPubKeyResponse() {
        this(null);
    }

    public GetIdentityPubKeyResponse(String str) {
        this.publicKey = str;
    }
}
