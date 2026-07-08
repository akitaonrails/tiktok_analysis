package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class GetTokenResponse {

    @C09CT("code")
    public final int code;

    @C09CT("data")
    public final GetTokenResponseData data;

    @C09CT("message")
    public final String message;

    public GetTokenResponse() {
        this(-1, "", null);
    }

    public GetTokenResponse(int i, String str, GetTokenResponseData getTokenResponseData) {
        this.code = i;
        this.message = str;
        this.data = getTokenResponseData;
    }
}
