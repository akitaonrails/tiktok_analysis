package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_incentive_task_monitor_enable")
public final class LiveCoinIncentiveTaskMonitorSettings {
    public static final boolean DEFAULT = false;
    public static final LiveCoinIncentiveTaskMonitorSettings INSTANCE = new LiveCoinIncentiveTaskMonitorSettings();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_incentive_task_monitor_enable", DEFAULT);
    }
}
