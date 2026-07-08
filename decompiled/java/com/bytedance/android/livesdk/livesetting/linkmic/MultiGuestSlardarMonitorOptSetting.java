package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_slardar_monitor_opt")
public final class MultiGuestSlardarMonitorOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestSlardarMonitorOptSetting INSTANCE = new MultiGuestSlardarMonitorOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_slardar_monitor_opt", DEFAULT);
    }
}
