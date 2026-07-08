package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_brightness_detect")
public final class LiveBrightnessDetectSetting {
    public static final LiveBrightnessDetectSetting INSTANCE = new LiveBrightnessDetectSetting();
    public static final LiveBrightnessDetectConfig DEFAULT = new LiveBrightnessDetectConfig(0, 500, 6, 33);

    private final LiveBrightnessDetectConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveBrightnessDetectConfig liveBrightnessDetectConfig = DEFAULT;
        LiveBrightnessDetectConfig liveBrightnessDetectConfig2 = (LiveBrightnessDetectConfig) settingsManager.getValueSafely("live_brightness_detect", liveBrightnessDetectConfig);
        return liveBrightnessDetectConfig2 != null ? liveBrightnessDetectConfig2 : liveBrightnessDetectConfig;
    }

    public final long getDetectDuration() {
        return getValue().detectDuration;
    }

    public final long getDetectThreshold() {
        return getValue().detectThreshold;
    }

    public final int getDetectTime() {
        return getValue().detectTime;
    }

    public final int getToastFluency() {
        return getValue().darkSceneToastFluency;
    }

    public final boolean hasDetectToast() {
        return getValue().darkSceneToastFluency != 0;
    }
}
