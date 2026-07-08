package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_slardar_monitor_sample_rate_default")
public final class MultiGuestSlardarMonitorSampleRateDefaultSetting {
    public static final double DEFAULT = 0.1d;
    public static final MultiGuestSlardarMonitorSampleRateDefaultSetting INSTANCE = new MultiGuestSlardarMonitorSampleRateDefaultSetting();

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("multi_guest_slardar_monitor_sample_rate_default", DEFAULT);
    }
}
