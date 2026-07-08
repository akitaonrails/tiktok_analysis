package com.bytedance.pitaya.api;

import X.C145G;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes31.dex */
public interface PTYSocketStateCallback extends ReflectionCall {
    public static final C145G Companion = new Object() { // from class: X.145G
    };

    void onSocketStateChange(String str, String str2);
}
