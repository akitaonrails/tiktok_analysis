package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_anchor_spark_thread_strategy")
public final class LiveAnchorSparkThreadStrategyABSetting {
    public static final LiveAnchorSparkThreadStrategyABSetting INSTANCE = new LiveAnchorSparkThreadStrategyABSetting();
    public static final SparkDynamicParam[] DEFAULT = new SparkDynamicParam[0];

    public final SparkDynamicParam[] getValue() {
        return (SparkDynamicParam[]) SettingsManager.INSTANCE.getValueSafely("live_anchor_spark_thread_strategy", DEFAULT);
    }
}
