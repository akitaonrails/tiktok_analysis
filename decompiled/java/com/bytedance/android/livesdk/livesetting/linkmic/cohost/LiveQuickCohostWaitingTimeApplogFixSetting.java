package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_quick_cohost_waiting_time_applog_fix")
public final class LiveQuickCohostWaitingTimeApplogFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveQuickCohostWaitingTimeApplogFixSetting INSTANCE = new LiveQuickCohostWaitingTimeApplogFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_quick_cohost_waiting_time_applog_fix", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
