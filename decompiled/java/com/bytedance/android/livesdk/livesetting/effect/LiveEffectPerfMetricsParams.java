package com.bytedance.android.livesdk.livesetting.effect;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveEffectPerfMetricsParams {
    public static final TypeAdapter ADAPTER = new LiveEffectPerfMetricsParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("fps_collect_interval")
    public long collectInterval;

    @C09CT("enabled")
    public boolean enabled;

    public LiveEffectPerfMetricsParams() {
        this(false, 1L);
    }

    public LiveEffectPerfMetricsParams(boolean z, long j) {
        this.enabled = z;
        this.collectInterval = j;
    }
}
