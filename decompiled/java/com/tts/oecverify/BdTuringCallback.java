package com.tts.oecverify;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public interface BdTuringCallback {
    void onFail(int i, JSONObject jSONObject);

    void onSuccess(int i, JSONObject jSONObject);
}
