package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class AuthCodeResponse {

    @C09CT("code")
    public final String code;

    @C09CT("error")
    public final String error;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("error_description")
    public final String errorDescription;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("redirect_url")
    public final String redirectUrl;

    @C09CT("status_code")
    public final Integer statusCode;

    public AuthCodeResponse() {
        this(null, null, null, null, null, null, null);
    }

    public AuthCodeResponse(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5) {
        this.code = str;
        this.error = str2;
        this.statusCode = num;
        this.errorDescription = str3;
        this.errorCode = num2;
        this.errorMessage = str4;
        this.redirectUrl = str5;
    }
}
