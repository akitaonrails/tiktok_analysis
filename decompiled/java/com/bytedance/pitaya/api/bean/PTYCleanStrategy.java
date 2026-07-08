package com.bytedance.pitaya.api.bean;

import X.C08FF;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes31.dex */
public enum PTYCleanStrategy implements ReflectionCall {
    Normal(0),
    Moderate(1),
    Low(2),
    Critical(3);

    public final int code;

    public static PTYCleanStrategy valueOf(String str) {
        return (PTYCleanStrategy) C08FF.LIZ(PTYCleanStrategy.class, str);
    }

    public final int getCode() {
        return this.code;
    }

    PTYCleanStrategy(int i) {
        this.code = i;
    }
}
