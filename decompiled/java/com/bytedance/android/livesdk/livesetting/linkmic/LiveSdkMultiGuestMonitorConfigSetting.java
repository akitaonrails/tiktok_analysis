package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_sdk_multiguest_monitor_config")
public final class LiveSdkMultiGuestMonitorConfigSetting {
    public static final LiveSdkMultiGuestMonitorConfigSetting INSTANCE = new LiveSdkMultiGuestMonitorConfigSetting();
    public static final LiveSdkMultiGuestMonitorConfig DEFAULT = new LiveSdkMultiGuestMonitorConfig(true, 60, 2650, 3);

    public final LiveSdkMultiGuestMonitorConfig getValue() {
        LiveSdkMultiGuestMonitorConfig liveSdkMultiGuestMonitorConfig = (LiveSdkMultiGuestMonitorConfig) SettingsManager.INSTANCE.getValueSafely(LiveSdkMultiGuestMonitorConfigSetting.class);
        return liveSdkMultiGuestMonitorConfig == null ? DEFAULT : liveSdkMultiGuestMonitorConfig;
    }
}
