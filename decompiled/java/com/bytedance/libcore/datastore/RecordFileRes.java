package com.bytedance.libcore.datastore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RecordFileRes {

    @C09CT("status_code")
    public int code;

    @C09CT("message")
    public String message = "";

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}
