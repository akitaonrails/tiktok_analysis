package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("broadcast_noise_suppression_setting")
public final class BroadcastNoiseSuppressionSetting {
    public static final BroadcastNoiseSuppressionSetting INSTANCE = new BroadcastNoiseSuppressionSetting();
    public static final NoiseSuppressionConfig DEFAULT = new NoiseSuppressionConfig();

    public final NoiseSuppressionConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        NoiseSuppressionConfig noiseSuppressionConfig = DEFAULT;
        NoiseSuppressionConfig noiseSuppressionConfig2 = (NoiseSuppressionConfig) settingsManager.getValueSafely("broadcast_noise_suppression_setting", noiseSuppressionConfig);
        return noiseSuppressionConfig2 != null ? noiseSuppressionConfig2 : noiseSuppressionConfig;
    }

    public final boolean enable() {
        return getConfig().enable;
    }
}
