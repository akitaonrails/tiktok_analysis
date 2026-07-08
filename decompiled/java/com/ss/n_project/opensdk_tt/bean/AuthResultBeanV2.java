package com.ss.n_project.opensdk_tt.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthResultBeanV2 {

    @C09CT("auth_code")
    public final String authCode;

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("error_type")
    public final String errorType;

    @C09CT("success")
    public final boolean success;

    @C09CT("toast_msg")
    public final String toastMsg;

    public AuthResultBeanV2() {
        this(false, null, null, 0, null, null);
    }

    public AuthResultBeanV2(boolean z, String str, String str2, int i, String str3, String str4) {
        this.success = z;
        this.authCode = str;
        this.errorType = str2;
        this.errorCode = i;
        this.errorMsg = str3;
        this.toastMsg = str4;
    }
}
