package com.bytedance.pumbaa.base2.interfaces;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface IEventReporter {
    void LIZ(String str, Throwable th, Map map);

    void LIZIZ(String str, JSONObject jSONObject);

    void reportEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);
}
