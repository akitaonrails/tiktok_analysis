package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "try_mode_guidance_config")
public final class TryModeGuidanceConfigSetting {
    public static final TryModeGuidanceConfigSetting INSTANCE = new TryModeGuidanceConfigSetting();
    public static final TryModeGuidanceConfig DEFAULT = new TryModeGuidanceConfig(100, 6, 500, 33, 3, 3, 3000, Mp4ScreenVideoLoadTimeout.CONTROL, 15000, Mp4ScreenVideoLoadTimeout.CONTROL, 3000);

    private final TryModeGuidanceConfig config() {
        return (TryModeGuidanceConfig) SettingsManager.INSTANCE.getValueSafely("try_mode_detect_config", DEFAULT);
    }

    public final long brightnessDetectInterval() {
        return config().getBrightnessDetectInterval();
    }

    public final int brightnessDetectNumber() {
        return config().getBrightnessDetectNumber();
    }

    public final long brightnessDetectThreshold() {
        return config().getBrightnessDetectThreshold();
    }

    public final long enhancedBubbleDelay() {
        return config().getEnhancedBubbleDelay();
    }

    public final int faceDetectDelayDuration() {
        return config().getFaceDetectDelayDuration();
    }

    public final long faceGuidanceDelay() {
        return config().getFaceGuidanceDelay();
    }

    public final long guidanceInterval() {
        return config().getGuidanceInterval();
    }

    public final long guidanceShowDuration() {
        return config().getGuidanceShowDuration();
    }

    public final long volumeDetectInterval() {
        return config().getVolumeDetectInterval();
    }

    public final int volumeDetectNumber() {
        return config().getVolumeDetectNumber();
    }

    public final int volumeThreshold() {
        return config().getVolumeThreshold();
    }
}
