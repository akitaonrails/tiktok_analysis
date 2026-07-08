package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMessageTimeoutConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("http_fetch_monitor_timeout")
    public long httpFetchMonitorTimeout;

    @C09CT("http_fetch_request_timeout")
    public long httpFetchRequestTimeout;

    @C09CT("ws_connect_timeout")
    public long wsConnectTimeout = 3000;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveMessageTimeoutConfig_OptTypeAdapter();
    }
}
