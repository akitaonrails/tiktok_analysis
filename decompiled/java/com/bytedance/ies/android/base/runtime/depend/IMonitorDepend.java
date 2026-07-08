package com.bytedance.ies.android.base.runtime.depend;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface IMonitorDepend {
    void ensureNotReachHere(Throwable th, String str, Map<String, String> map);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);
}
