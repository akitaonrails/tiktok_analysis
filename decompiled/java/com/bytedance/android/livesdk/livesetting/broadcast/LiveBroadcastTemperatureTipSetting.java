package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_overheating_tips")
public final class LiveBroadcastTemperatureTipSetting {
    public static final LiveBroadcastTemperatureTipConfig DEFAULT;
    public static final LiveBroadcastTemperatureTipSetting INSTANCE = new LiveBroadcastTemperatureTipSetting();
    public static final LiveBroadcastTemperatureTipConfig config;

    static {
        LiveBroadcastTemperatureTipConfig liveBroadcastTemperatureTipConfig = new LiveBroadcastTemperatureTipConfig(false, 0.5f, 42.0f, 1440, 60, "", false);
        DEFAULT = liveBroadcastTemperatureTipConfig;
        config = (LiveBroadcastTemperatureTipConfig) SettingsManager.INSTANCE.getValueSafely("live_host_overheating_tips", liveBroadcastTemperatureTipConfig);
    }

    public final float batteryThreshold() {
        return config.getBatteryThreshold();
    }

    public final int frequencyInterval() {
        return config.getFrequencyInterval();
    }

    public final boolean isEnable() {
        return config.getEnable();
    }

    public final boolean localTestQuickShow() {
        return config.getLocalTestQuickShow();
    }

    public final int monitorDelay() {
        return config.getMonitorDelay();
    }

    public final String prefixEmoji() {
        return config.getPrefixEmoji();
    }

    public final float thermalThreshold() {
        return config.getThermalThreshold();
    }
}
