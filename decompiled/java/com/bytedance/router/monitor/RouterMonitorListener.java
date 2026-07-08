package com.bytedance.router.monitor;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public interface RouterMonitorListener {
    void onReport(int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void onReportPageJump(boolean z, String str, String str2);
}
