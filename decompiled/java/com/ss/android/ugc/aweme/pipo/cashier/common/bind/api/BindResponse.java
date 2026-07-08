package com.ss.android.ugc.aweme.pipo.cashier.common.bind.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class BindResponse {

    @C09CT("data")
    public final BindResponseInfo data;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_content")
    public final String errorContent;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("pipo_error_action")
    public final String pipoErrorAction;

    @C09CT("result_code")
    public final String resultCode;

    public BindResponse(String str, String str2, String str3, String str4, BindResponseInfo bindResponseInfo, String str5) {
        this.errorCode = str;
        this.errorMessage = str2;
        this.resultCode = str3;
        this.errorContent = str4;
        this.data = bindResponseInfo;
        this.pipoErrorAction = str5;
    }
}
