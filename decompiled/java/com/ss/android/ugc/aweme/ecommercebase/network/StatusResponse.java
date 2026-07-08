package com.ss.android.ugc.aweme.ecommercebase.network;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class StatusResponse<T> {

    @C09CT("data")
    public T data;

    @C09CT("status_code")
    public int code = -1;

    @C09CT("status_message")
    public final String message = "";

    public final boolean isSuccess() {
        return this.code == 0;
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(T t) {
        this.data = t;
    }
}
