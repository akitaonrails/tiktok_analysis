package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchCountDownOptConfig {
    public static final TypeAdapter ADAPTER = new LiveMatchCountDownOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_optimize")
    public boolean enable;

    @C09CT("refresh_interval_ms")
    public long refreshIntervalMs;

    public LiveMatchCountDownOptConfig() {
        this(false, 1000L);
    }

    public LiveMatchCountDownOptConfig(boolean z, long j) {
        this.enable = z;
        this.refreshIntervalMs = j;
    }
}
