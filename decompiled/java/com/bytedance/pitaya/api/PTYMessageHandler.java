package com.bytedance.pitaya.api;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface PTYMessageHandler extends ReflectionCall {
    JSONObject onMessage(JSONObject jSONObject);
}
