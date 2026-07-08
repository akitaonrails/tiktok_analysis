package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_liveboards_host_report_time")
public final class LiveBoardsHostReportIntervalTime {
    public static final long DEFAULT = 10;
    public static final LiveBoardsHostReportIntervalTime INSTANCE = new LiveBoardsHostReportIntervalTime();

    public static final long value() {
        return SettingsManager.INSTANCE.getLongValue("live_host_liveboards_host_report_time", DEFAULT) * 1000;
    }
}
