package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_monitor_remote_config")
public final class LiveCoHostMonitorRemoteConfigSetting {
    public static final LiveCoHostMonitorRemoteConfigSetting INSTANCE = new LiveCoHostMonitorRemoteConfigSetting();
    public static final LiveCoHostMonitorConfig DEFAULT = new LiveCoHostMonitorConfig(false, null, null, null, 15, null);

    public final LiveCoHostMonitorConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveCoHostMonitorConfig liveCoHostMonitorConfig = DEFAULT;
        LiveCoHostMonitorConfig liveCoHostMonitorConfig2 = (LiveCoHostMonitorConfig) settingsManager.getValueSafely("live_cohost_monitor_remote_config", liveCoHostMonitorConfig);
        return liveCoHostMonitorConfig2 != null ? liveCoHostMonitorConfig2 : liveCoHostMonitorConfig;
    }
}
