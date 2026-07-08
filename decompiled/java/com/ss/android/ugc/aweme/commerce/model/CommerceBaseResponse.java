package com.ss.android.ugc.aweme.commerce.model;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public class CommerceBaseResponse {

    @C09CT("status_code")
    public int statusCode;

    @C09CT("message")
    public String message = "";

    @C09CT("status_msg")
    public String statusMsg = "";

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
