package com.bytedance.pitaya.api.bean;

import X.C08FF;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes28.dex */
public enum PTYCepCallbackMode implements ReflectionCall {
    SUCCESS_AND_ERROR(1),
    ALWAYS(2);

    public final int code;

    public static PTYCepCallbackMode valueOf(String str) {
        return (PTYCepCallbackMode) C08FF.LIZ(PTYCepCallbackMode.class, str);
    }

    public final int getCode() {
        return this.code;
    }

    PTYCepCallbackMode(int i) {
        this.code = i;
    }
}
