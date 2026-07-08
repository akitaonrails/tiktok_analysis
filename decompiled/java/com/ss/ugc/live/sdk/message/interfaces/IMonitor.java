package com.ss.ugc.live.sdk.message.interfaces;

import X.InterfaceC2222261ByK;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public interface IMonitor {
    InterfaceC2222261ByK capacityTracker();

    void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorLatency(String str, long j, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorStatus(String str, int i, JSONObject jSONObject);
}
