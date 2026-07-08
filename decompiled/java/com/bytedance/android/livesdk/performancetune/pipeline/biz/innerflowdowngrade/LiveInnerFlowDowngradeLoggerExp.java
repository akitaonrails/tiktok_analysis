package com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_flow_downgrade_logger_sample_rate")
public final class LiveInnerFlowDowngradeLoggerExp {
    public static final LiveInnerFlowDowngradeLoggerExp INSTANCE = new LiveInnerFlowDowngradeLoggerExp();
    public static final float DEFAULT = 0.001f;

    public final float getSampleRate() {
        return SettingsManager.INSTANCE.getFloatValue("live_inner_flow_downgrade_logger_sample_rate", DEFAULT);
    }
}
