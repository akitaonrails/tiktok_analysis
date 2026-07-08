package com.bytedance.pitaya.api;

import com.bytedance.pitaya.api.bean.PTYLLMResult;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface PTYLLMInferenceHandler extends ReflectionCall {
    PTYLLMResult inference(String str, String str2, String str3, JSONObject jSONObject);
}
