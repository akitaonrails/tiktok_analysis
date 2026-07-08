package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_top_over_scroll_slardar_sample_rate")
public final class LiveTopOverScrollSlardarSampleRateSetting {
    public static final double DEFAULT = 0.05d;
    public static final LiveTopOverScrollSlardarSampleRateSetting INSTANCE = new LiveTopOverScrollSlardarSampleRateSetting();

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_top_over_scroll_slardar_sample_rate", DEFAULT);
    }
}
