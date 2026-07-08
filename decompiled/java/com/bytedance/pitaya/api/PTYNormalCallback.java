package com.bytedance.pitaya.api;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes28.dex */
public interface PTYNormalCallback extends ReflectionCall {
    void onResult(boolean z, PTYError pTYError);
}
