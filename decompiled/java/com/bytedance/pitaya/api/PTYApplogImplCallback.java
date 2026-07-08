package com.bytedance.pitaya.api;

import com.bytedance.pitaya.api.bean.PTYApplogEvent;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes4.dex */
public interface PTYApplogImplCallback extends ReflectionCall {
    void onEvent(PTYApplogEvent pTYApplogEvent);
}
