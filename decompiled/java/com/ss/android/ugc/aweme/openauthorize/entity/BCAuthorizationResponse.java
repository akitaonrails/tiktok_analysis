package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class BCAuthorizationResponse {

    @C09CT("data")
    public final BCAuthorizationResponseData data;

    @C09CT("message")
    public final String message;

    public BCAuthorizationResponse() {
        this("", null);
    }

    public BCAuthorizationResponse(String str, BCAuthorizationResponseData bCAuthorizationResponseData) {
        this.message = str;
        this.data = bCAuthorizationResponseData;
    }
}
