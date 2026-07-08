package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "dm_guidance_prediction_strategy_enable")
public final class DmGuidancePredictionStrategyEnableSetting {
    public static final boolean DEFAULT = false;
    public static final DmGuidancePredictionStrategyEnableSetting INSTANCE = new DmGuidancePredictionStrategyEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("dm_guidance_prediction_strategy_enable", DEFAULT);
    }
}
