package com.bytedance.pitaya.api.bean;

import X.C08FF;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes4.dex */
public enum PTYCepMode implements ReflectionCall {
    Independent(0),
    Dependent(1);

    public final int code;

    public static PTYCepMode valueOf(String str) {
        return (PTYCepMode) C08FF.LIZ(PTYCepMode.class, str);
    }

    public final int getCode() {
        return this.code;
    }

    PTYCepMode(int i) {
        this.code = i;
    }
}
