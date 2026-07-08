package com.bytedance.pumbaa.common.interfaces;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface IEventMonitor {
    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusAndEvent(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);
}
