package com.bytedance.android.livesdk.workaround;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_watch_efficiency_log")
public final class LiveInnerWatchEfficiencyLogSetting {
    public static final boolean DEFAULT = true;
    public static final LiveInnerWatchEfficiencyLogSetting INSTANCE = new LiveInnerWatchEfficiencyLogSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_inner_watch_efficiency_log", DEFAULT);
    }
}
