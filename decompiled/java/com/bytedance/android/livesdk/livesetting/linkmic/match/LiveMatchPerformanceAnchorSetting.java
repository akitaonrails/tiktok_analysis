package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("tt_live_match_performance_monitor_anchor_rate")
public final class LiveMatchPerformanceAnchorSetting {
    public static final int DEFAULT = 1;
    public static final LiveMatchPerformanceAnchorSetting INSTANCE = new LiveMatchPerformanceAnchorSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("tt_live_match_performance_monitor_anchor_rate", DEFAULT);
    }
}
