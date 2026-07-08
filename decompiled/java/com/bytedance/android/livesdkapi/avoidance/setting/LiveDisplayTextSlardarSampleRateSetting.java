package com.bytedance.android.livesdkapi.avoidance.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_display_text_slardar_sample_rate")
public final class LiveDisplayTextSlardarSampleRateSetting {
    public static final LiveDisplayTextSlardarSampleRateSetting INSTANCE = new LiveDisplayTextSlardarSampleRateSetting();
    public static final double DEFAULT = 1.0E-4d;

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_display_text_slardar_sample_rate", DEFAULT);
    }
}
