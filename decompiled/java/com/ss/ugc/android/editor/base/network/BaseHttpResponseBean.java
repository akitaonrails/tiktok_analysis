package com.ss.ugc.android.editor.base.network;

import X.InterfaceC1631620sYq;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseHttpResponseBean<T> {
    public String code;
    public Function2<? super String, ? super String, Unit> fail;
    public String message;
    public InterfaceC1631620sYq<? super String, ? super String, ? super T, Unit> success;

    public abstract T getData();

    public abstract String getHttpCode();

    public abstract String getHttpMessage();

    public final String getCode() {
        return this.code;
    }

    public final Function2<String, String, Unit> getFail() {
        return this.fail;
    }

    public final String getMessage() {
        return this.message;
    }

    public final InterfaceC1631620sYq<String, String, T, Unit> getSuccess() {
        return this.success;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setFail(Function2<? super String, ? super String, Unit> function2) {
        this.fail = function2;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSuccess(InterfaceC1631620sYq<? super String, ? super String, ? super T, Unit> interfaceC1631620sYq) {
        this.success = interfaceC1631620sYq;
    }
}
