package com.bytedance.pitaya.api;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes33.dex */
public interface PitayaFE extends ReflectionCall {
    void registerApplogRunEventCallback(String str, PTYTaskResultCallback pTYTaskResultCallback);

    void registerMessageHandler(String str, PTYMessageHandler pTYMessageHandler);

    void removeApplogRunEventCallback(String str);

    void removeMessageHandler(String str);
}
