package com.bytedance.pitaya.api;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes28.dex */
public interface PTYCepCallback extends ReflectionCall {
    void onFinish(boolean z, PTYError pTYError, PTYCepResult pTYCepResult);
}
