package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "toplive_hangout_fluency_monitor_enable")
public final class TopLiveHangoutFluencyMonitorEnableSetting {
    public static final boolean DEFAULT = true;
    public static final TopLiveHangoutFluencyMonitorEnableSetting INSTANCE = new TopLiveHangoutFluencyMonitorEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("toplive_hangout_fluency_monitor_enable", DEFAULT);
    }
}
