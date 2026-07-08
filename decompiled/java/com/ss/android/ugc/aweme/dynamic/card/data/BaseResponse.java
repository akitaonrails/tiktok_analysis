package com.ss.android.ugc.aweme.dynamic.card.data;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public class BaseResponse {

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("message")
    public final String message;

    @C09CT("prompts")
    public final String prompts;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BaseResponse() {
        this(0, 0, "", "", "");
    }

    public BaseResponse(int i, int i2, String str, String str2, String str3) {
        this.statusCode = i;
        this.errorCode = i2;
        this.message = str;
        this.statusMsg = str2;
        this.prompts = str3;
    }
}
