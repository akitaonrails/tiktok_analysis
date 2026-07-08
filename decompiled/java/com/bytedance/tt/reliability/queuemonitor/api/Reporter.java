package com.bytedance.tt.reliability.queuemonitor.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface Reporter {
    void reportEvent(String str, JSONObject jSONObject);
}
