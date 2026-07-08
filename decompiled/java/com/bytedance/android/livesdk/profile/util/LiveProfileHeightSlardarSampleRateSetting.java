package com.bytedance.android.livesdk.profile.util;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_profile_height_slardar_sample_rate")
public final class LiveProfileHeightSlardarSampleRateSetting {
    public static final double DEFAULT = 0.05d;
    public static final LiveProfileHeightSlardarSampleRateSetting INSTANCE = new LiveProfileHeightSlardarSampleRateSetting();

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_profile_height_slardar_sample_rate", DEFAULT);
    }
}
