package com.ss.n_project.opensdk_tt.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthResultBean {

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("error_type")
    public final String errorType;

    @C09CT("is_new_user")
    public final int isNewUser;

    @C09CT("scope")
    public final String scope;

    @C09CT("success")
    public final boolean success;

    @C09CT("toast_msg")
    public final String toastMsg;

    @C09CT("uid")
    public final String uid;

    public AuthResultBean() {
        this(false, null, 0, null, null, 0, null, null);
    }

    public AuthResultBean(boolean z, String str, int i, String str2, String str3, int i2, String str4, String str5) {
        this.success = z;
        this.uid = str;
        this.isNewUser = i;
        this.scope = str2;
        this.errorType = str3;
        this.errorCode = i2;
        this.errorMsg = str4;
        this.toastMsg = str5;
    }
}
