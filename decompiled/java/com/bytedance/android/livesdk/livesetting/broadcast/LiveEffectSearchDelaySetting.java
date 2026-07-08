package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_effect_search_delay_ms")
public final class LiveEffectSearchDelaySetting {
    public static final long DEFAULT = 300;
    public static final LiveEffectSearchDelaySetting INSTANCE = new LiveEffectSearchDelaySetting();

    public final long delayTime() {
        return SettingsManager.INSTANCE.getLongValue("live_effect_search_delay_ms", DEFAULT);
    }
}
