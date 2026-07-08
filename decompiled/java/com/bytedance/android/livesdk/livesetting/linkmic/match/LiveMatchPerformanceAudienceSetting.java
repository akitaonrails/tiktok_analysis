package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("tt_live_match_performance_monitor_audience_rate")
public final class LiveMatchPerformanceAudienceSetting {
    public static final int DEFAULT = 1;
    public static final LiveMatchPerformanceAudienceSetting INSTANCE = new LiveMatchPerformanceAudienceSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("tt_live_match_performance_monitor_audience_rate", DEFAULT);
    }
}
