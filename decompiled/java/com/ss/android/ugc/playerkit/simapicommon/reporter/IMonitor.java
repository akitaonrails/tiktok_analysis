package com.ss.android.ugc.playerkit.simapicommon.reporter;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface IMonitor {
    void ensureNotReachHere(Throwable th);

    void ensureNotReachHere(Throwable th, String str);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);

    void onReportBizException(String str, Throwable th, String str2, Map<String, String> map, boolean z);
}
