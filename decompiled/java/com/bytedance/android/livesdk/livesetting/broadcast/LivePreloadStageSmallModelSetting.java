package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_stage_algorithm_model_predownload")
public final class LivePreloadStageSmallModelSetting {
    public static final boolean DEFAULT = false;
    public static final LivePreloadStageSmallModelSetting INSTANCE = new LivePreloadStageSmallModelSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_stage_algorithm_model_predownload", DEFAULT);
    }
}
