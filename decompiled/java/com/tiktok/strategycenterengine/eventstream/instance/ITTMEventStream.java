package com.tiktok.strategycenterengine.eventstream.instance;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface ITTMEventStream {
    void emitEventToCaiEventStream(String str, JSONObject jSONObject);

    int getPendingTasksSize();
}
