package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_goal_indicator_destroy_optimize")
public final class LiveGoalIndicatorDestroyOptimizeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGoalIndicatorDestroyOptimizeSetting INSTANCE = new LiveGoalIndicatorDestroyOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_goal_indicator_destroy_optimize", DEFAULT);
    }
}
