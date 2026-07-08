package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_liveboards_audience_report")
public final class LiveBoardsAudienceReportSettings {
    public static final boolean DEFAULT = true;
    public static final LiveBoardsAudienceReportSettings INSTANCE = new LiveBoardsAudienceReportSettings();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_liveboards_audience_report", DEFAULT);
    }
}
