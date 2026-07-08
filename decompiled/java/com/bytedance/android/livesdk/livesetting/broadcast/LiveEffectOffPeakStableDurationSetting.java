package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_offpeak_stable_duration_ms")
public final class LiveEffectOffPeakStableDurationSetting {
    public static final LiveEffectOffPeakStableDurationSetting INSTANCE = new LiveEffectOffPeakStableDurationSetting();
    public static final long DEFAULT = 300000;

    public final long getStableDurationMs() {
        return SettingsManager.INSTANCE.getLongValue("live_effect_offpeak_stable_duration_ms", DEFAULT);
    }
}
