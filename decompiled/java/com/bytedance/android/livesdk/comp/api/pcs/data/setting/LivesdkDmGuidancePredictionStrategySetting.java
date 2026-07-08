package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_dm_guidance_prediction_strategy")
public final class LivesdkDmGuidancePredictionStrategySetting {
    public static final float DEFAULT = 0.5f;
    public static final LivesdkDmGuidancePredictionStrategySetting INSTANCE = new LivesdkDmGuidancePredictionStrategySetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("livesdk_dm_guidance_prediction_strategy", DEFAULT);
    }
}
