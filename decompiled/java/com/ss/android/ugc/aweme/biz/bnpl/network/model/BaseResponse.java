package com.ss.android.ugc.aweme.biz.bnpl.network.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BaseResponse<T> {

    @C09CT("data")
    public final T data;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_content")
    public final String errorContent;

    @C09CT("error_message")
    public final String errorMsg;

    @C09CT("pipo_error_action")
    public final String pipoErrorAction;

    @C09CT("result_code")
    public final String resultCode;

    public final boolean LIZ() {
        return Intrinsics.LJFF(this.resultCode, "success");
    }

    public BaseResponse(String str, String str2, String str3, String str4, String str5, T t) {
        this.errorCode = str;
        this.errorMsg = str2;
        this.resultCode = str3;
        this.errorContent = str4;
        this.pipoErrorAction = str5;
        this.data = t;
    }
}
