package com.ss.android.ugc.aweme.home.repo.network.data;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class BaseResponse<T> {

    @C09CT("data")
    public final T data;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_content")
    public final String errorContent;

    @C09CT("error_message")
    public final String errorMsg;

    @C09CT("result_code")
    public final String resultCode;

    public BaseResponse() {
        this(null, null, null, null, null);
    }

    public BaseResponse(String str, String str2, String str3, String str4, T t) {
        this.errorCode = str;
        this.errorMsg = str2;
        this.resultCode = str3;
        this.errorContent = str4;
        this.data = t;
    }
}
