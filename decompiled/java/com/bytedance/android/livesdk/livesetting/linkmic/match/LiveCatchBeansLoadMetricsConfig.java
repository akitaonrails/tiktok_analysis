package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveCatchBeansLoadMetricsConfig {
    public static final TypeAdapter ADAPTER = new LiveCatchBeansLoadMetricsConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("timeout_trigger_threshold")
    public float timeoutTriggerThreshold;

    public LiveCatchBeansLoadMetricsConfig() {
        this(false, 0.8f);
    }

    public LiveCatchBeansLoadMetricsConfig(boolean z, float f) {
        this.enabled = z;
        this.timeoutTriggerThreshold = f;
    }
}
