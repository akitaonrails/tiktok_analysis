package com.ss.ugc.android.editor.base.network;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BaseResponse<T> implements Serializable {
    public Integer code = 0;
    public T data;
    public String message;

    public final boolean isSuccess() {
        Integer num = this.code;
        return (num == null || num.intValue() != 0 || this.data == null) ? false : true;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCode(Integer num) {
        this.code = num;
    }

    public final void setData(T t) {
        this.data = t;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}
