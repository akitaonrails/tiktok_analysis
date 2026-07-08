package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "virtual_sexual_model_score_threshold")
public final class VirtualSexualModelScoreThresholdSetting {
    public static final float DEFAULT = 0.97f;
    public static final VirtualSexualModelScoreThresholdSetting INSTANCE = new VirtualSexualModelScoreThresholdSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("virtual_sexual_model_score_threshold", DEFAULT);
    }
}
