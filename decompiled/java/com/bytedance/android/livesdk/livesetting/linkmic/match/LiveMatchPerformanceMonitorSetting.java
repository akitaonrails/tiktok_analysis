package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("tt_live_match_performance_monitor_enable")
public final class LiveMatchPerformanceMonitorSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchPerformanceMonitorSetting INSTANCE = new LiveMatchPerformanceMonitorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("tt_live_match_performance_monitor_enable", DEFAULT);
    }
}
