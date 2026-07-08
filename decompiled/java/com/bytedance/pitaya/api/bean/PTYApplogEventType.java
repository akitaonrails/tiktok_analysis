package com.bytedance.pitaya.api.bean;

import X.C08FF;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes4.dex */
public enum PTYApplogEventType implements ReflectionCall {
    NORMAL(0),
    COLD_START(1);

    public final int code;

    public static PTYApplogEventType valueOf(String str) {
        return (PTYApplogEventType) C08FF.LIZ(PTYApplogEventType.class, str);
    }

    public final int getCode() {
        return this.code;
    }

    PTYApplogEventType(int i) {
        this.code = i;
    }
}
