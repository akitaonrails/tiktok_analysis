package com.bytedance.pitaya.api.bean;

import X.C08FF;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes4.dex */
public enum PTYSetupMode implements ReflectionCall {
    None(0),
    Pre(1),
    Lite(2),
    Normal(3);

    public final int code;

    public static PTYSetupMode valueOf(String str) {
        return (PTYSetupMode) C08FF.LIZ(PTYSetupMode.class, str);
    }

    public final int getCode() {
        return this.code;
    }

    PTYSetupMode(int i) {
        this.code = i;
    }
}
