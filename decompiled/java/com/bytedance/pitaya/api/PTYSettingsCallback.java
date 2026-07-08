package com.bytedance.pitaya.api;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public interface PTYSettingsCallback extends ReflectionCall {
    JSONObject getSettings(String str);
}
