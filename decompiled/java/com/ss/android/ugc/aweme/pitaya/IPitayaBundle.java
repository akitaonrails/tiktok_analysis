package com.ss.android.ugc.aweme.pitaya;

import X.AnonymousClass1456;
import com.bytedance.pitaya.api.PTYSocketStateCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public interface IPitayaBundle {
    boolean initPitaya(AnonymousClass1456 anonymousClass1456);

    void onAppLogEvent(String str, String str2);

    void onAppLogEvent(String str, JSONObject jSONObject);

    void onCepEvent(String str, JSONObject jSONObject);

    void onCustomAppLog(String str, JSONObject jSONObject);

    int setDebugWebSocketUrl(String str, PTYSocketStateCallback pTYSocketStateCallback);
}
