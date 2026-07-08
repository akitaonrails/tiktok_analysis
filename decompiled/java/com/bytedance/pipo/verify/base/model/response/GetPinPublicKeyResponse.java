package com.bytedance.pipo.verify.base.model.response;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class GetPinPublicKeyResponse {

    @C09CT("pin_pubkey")
    public final String publicKey;

    @C09CT("timestamp")
    public final Long timestamp;

    public GetPinPublicKeyResponse() {
        this(null, null);
    }

    public GetPinPublicKeyResponse(String str, Long l) {
        this.publicKey = str;
        this.timestamp = l;
    }
}
