package com.ss.android.ugc.aweme.pipo.errorsdk.api;

import X.C09CT;
import com.ss.android.ugc.aweme.pipo.errorsdk.ErrorSdkClientVeData;

/* JADX INFO: loaded from: classes27.dex */
public final class ClientVisualExpressionResponse {

    @C09CT("data")
    public final ErrorSdkClientVeData data;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("message")
    public final String message;

    public ClientVisualExpressionResponse() {
        this(null, null, null);
    }

    public ClientVisualExpressionResponse(Integer num, String str, ErrorSdkClientVeData errorSdkClientVeData) {
        this.errorCode = num;
        this.message = str;
        this.data = errorSdkClientVeData;
    }
}
