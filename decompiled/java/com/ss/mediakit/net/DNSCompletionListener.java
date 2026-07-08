package com.ss.mediakit.net;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface DNSCompletionListener {
    void onCancelled();

    void onCompletion(JSONObject jSONObject, Error error);

    void onRetry(Error error);
}
