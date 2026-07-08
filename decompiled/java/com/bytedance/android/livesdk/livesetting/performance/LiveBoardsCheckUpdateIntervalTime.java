package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_liveboards_checkupdate_interval_time")
public final class LiveBoardsCheckUpdateIntervalTime {
    public static final int DEFAULT = 3;
    public static final LiveBoardsCheckUpdateIntervalTime INSTANCE = new LiveBoardsCheckUpdateIntervalTime();

    public static final long value() {
        return ((long) SettingsManager.INSTANCE.getIntValue("live_host_liveboards_checkupdate_interval_time", DEFAULT)) * 86400000;
    }
}
