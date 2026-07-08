package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_auto_match_join_group_direct_monitor_timeout")
public final class CoHostAutoMatchJoinGroupDirectMonitorTimeout {
    public static final int DEFAULT = 30000;
    public static final CoHostAutoMatchJoinGroupDirectMonitorTimeout INSTANCE = new CoHostAutoMatchJoinGroupDirectMonitorTimeout();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_auto_match_join_group_direct_monitor_timeout", DEFAULT);
    }

    public final int monitorTimeoutDuration() {
        int value = getValue();
        if (value <= 0) {
            return 30000;
        }
        return value;
    }
}
