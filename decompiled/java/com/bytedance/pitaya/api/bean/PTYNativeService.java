package com.bytedance.pitaya.api.bean;

import X.C08FF;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes4.dex */
public enum PTYNativeService implements ReflectionCall {
    Normal,
    Porn;

    public static PTYNativeService valueOf(String str) {
        return (PTYNativeService) C08FF.LIZ(PTYNativeService.class, str);
    }
}
