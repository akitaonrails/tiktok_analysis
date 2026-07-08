package com.ss.android.ugc.effectmanager.common.listener;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface IMonitorService {
    void monitorCommonLog(String str, String str2, JSONObject jSONObject);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorDirectOnTimer(String str, String str2, float f);

    void monitorOnTimer(String str, String str2, float f);

    void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);
}
