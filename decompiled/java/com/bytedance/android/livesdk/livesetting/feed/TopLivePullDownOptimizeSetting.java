package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "top_live_pull_down_optimize")
public final class TopLivePullDownOptimizeSetting {
    public static final int DEFAULT = 0;
    public static final TopLivePullDownOptimizeSetting INSTANCE = new TopLivePullDownOptimizeSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("top_live_pull_down_optimize", DEFAULT);
    }

    public final boolean enableExpandMoreThanThreshold() {
        return getValue() == 2;
    }

    public final boolean enablePullDownVisible() {
        return getValue() == 1 || getValue() == 2;
    }
}
