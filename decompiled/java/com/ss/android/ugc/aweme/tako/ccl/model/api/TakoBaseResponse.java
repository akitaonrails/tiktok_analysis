package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public class TakoBaseResponse {

    @C09CT("extra")
    public Extra extra;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("message")
    public String statusMessage;

    public TakoBaseResponse() {
        this(null, 0, "");
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public TakoBaseResponse(Extra extra, int i, String str) {
        this.extra = extra;
        this.statusCode = i;
        this.statusMessage = str;
    }
}
