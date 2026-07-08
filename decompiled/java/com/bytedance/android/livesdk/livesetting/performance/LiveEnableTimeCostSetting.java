package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_enable_time_cost")
public final class LiveEnableTimeCostSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEnableTimeCostSetting INSTANCE = new LiveEnableTimeCostSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_time_cost", DEFAULT);
    }
}
