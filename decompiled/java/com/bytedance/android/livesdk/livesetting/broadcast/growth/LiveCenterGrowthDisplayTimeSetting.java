package com.bytedance.android.livesdk.livesetting.broadcast.growth;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_center_entrance_marquee_delay_time")
public final class LiveCenterGrowthDisplayTimeSetting {
    public static final long DEFAULT = 10000;
    public static final LiveCenterGrowthDisplayTimeSetting INSTANCE = new LiveCenterGrowthDisplayTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_center_entrance_marquee_delay_time", DEFAULT);
    }
}
