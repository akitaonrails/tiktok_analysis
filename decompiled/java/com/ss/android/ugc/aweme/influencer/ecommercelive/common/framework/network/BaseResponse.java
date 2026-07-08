package com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BaseResponse<T> {
    public static final int $stable = 8;

    @C09CT("data")
    public T data;

    @C09CT("code")
    public int code = -1;

    @C09CT("msg")
    public String message = "";

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

    public final void setMessage(String str) {
        this.message = str;
    }
}
