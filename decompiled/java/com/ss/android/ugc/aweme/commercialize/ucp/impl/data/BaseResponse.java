package com.ss.android.ugc.aweme.commercialize.ucp.impl.data;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public class BaseResponse {

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final Integer statusCode;

    public BaseResponse() {
        this(null, null);
    }

    public boolean isSuccess() {
        Integer statusCode = getStatusCode();
        return statusCode != null && statusCode.intValue() == 0;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BaseResponse(Integer num, String str) {
        this.statusCode = num;
        this.message = str;
    }
}
