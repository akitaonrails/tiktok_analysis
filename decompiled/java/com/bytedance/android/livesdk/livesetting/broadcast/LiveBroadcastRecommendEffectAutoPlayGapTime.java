package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_spotlight_effect_auto_play_gap")
public final class LiveBroadcastRecommendEffectAutoPlayGapTime {
    public static final LiveBroadcastRecommendEffectAutoPlayGapTime INSTANCE = new LiveBroadcastRecommendEffectAutoPlayGapTime();
    public static final double DEFAULT = 3.0d;

    public static final double value() {
        return SettingsManager.INSTANCE.getDoubleValue("live_spotlight_effect_auto_play_gap", DEFAULT) * 1000;
    }
}
