package com.ss.android.ugc.aweme.amazon.model;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class AmazonTokenGenerateRequest {

    @C09CT("authorization_code")
    public final String authorizationCode;

    @C09CT("pkce")
    public final String pkce;

    @C09CT("redirect_uri")
    public final String redirectUri;

    public AmazonTokenGenerateRequest(String str, String str2, String str3) {
        this.authorizationCode = str;
        this.pkce = str2;
        this.redirectUri = str3;
    }
}
