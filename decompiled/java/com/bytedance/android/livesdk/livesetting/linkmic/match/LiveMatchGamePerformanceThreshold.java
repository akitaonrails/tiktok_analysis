package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_game_performance_threshold_android")
public final class LiveMatchGamePerformanceThreshold {
    public static final float DEFAULT = 6.0f;
    public static final LiveMatchGamePerformanceThreshold INSTANCE = new LiveMatchGamePerformanceThreshold();

    public final float getMatchGamePerformanceThreshold() {
        return SettingsManager.INSTANCE.getFloatValue("live_match_game_performance_threshold_android", DEFAULT);
    }
}
