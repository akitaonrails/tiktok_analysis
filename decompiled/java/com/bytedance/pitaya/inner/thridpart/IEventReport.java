package com.bytedance.pitaya.inner.thridpart;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface IEventReport extends ReflectionCall {
    void reportEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);
}
