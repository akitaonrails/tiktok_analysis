package com.bytedance.ies.cutsame.source.api;

import com.google.gson.n;

/* JADX INFO: loaded from: classes4.dex */
public class BaseResponse {
    public n extra;
    public String message;
    public int status_code;
    public Throwable throwable;

    public BaseResponse() {
    }

    public final n getExtra() {
        return this.extra;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final void setExtra(n nVar) {
        this.extra = nVar;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setThrowable(Throwable th) {
        this.throwable = th;
    }

    public BaseResponse(int i, String str, Throwable th) {
        this();
        this.status_code = i;
        this.message = str;
        this.throwable = th;
    }
}
