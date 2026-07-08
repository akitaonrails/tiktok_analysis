package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_sei_monitor_delay_interval")
public final class LiveSdkSeiMonitorDelayIntervalSetting {
    public static final long DEFAULT = 15;
    public static final LiveSdkSeiMonitorDelayIntervalSetting INSTANCE = new LiveSdkSeiMonitorDelayIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_sdk_sei_monitor_delay_interval", DEFAULT);
    }
}
