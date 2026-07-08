package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class WebAuthV2Response {

    @C09CT("code")
    public final String code;

    @C09CT("error")
    public final String error;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("error_description")
    public final String errorDescription;

    @C09CT("message")
    public final String message;

    @C09CT("net_error_code")
    public Integer netErrorCode;

    @C09CT("net_error_message")
    public String netErrorMessage;

    @C09CT("net_error_status_code")
    public Integer netErrorStatusCode;

    @C09CT("redirect_url")
    public final String redirectUrl;

    @C09CT("status_code")
    public final Integer statusCode;

    public WebAuthV2Response() {
        this("", null, null, null, null, null, null, null, null, null);
    }

    public WebAuthV2Response(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Integer num3, Integer num4) {
        this.message = str;
        this.code = str2;
        this.redirectUrl = str3;
        this.error = str4;
        this.errorDescription = str5;
        this.errorCode = num;
        this.statusCode = num2;
        this.netErrorMessage = str6;
        this.netErrorCode = num3;
        this.netErrorStatusCode = num4;
    }
}
