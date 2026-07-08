package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchFallbackConfigData {
    public static final TypeAdapter ADAPTER;

    @C09CT("fallback_interval")
    public long interval;

    @C09CT("fallback_max_duration")
    public long maxDuration;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveMatchFallbackConfigData_OptTypeAdapter();
    }

    public LiveMatchFallbackConfigData() {
        this(60L, 2L);
    }

    public LiveMatchFallbackConfigData(long j, long j2) {
        this.maxDuration = j;
        this.interval = j2;
    }
}
