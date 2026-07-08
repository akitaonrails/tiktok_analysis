package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_ai_feature_center_switch")
public final class LiveGameAiFeatureCenterSwitchSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGameAiFeatureCenterSwitchSetting INSTANCE = new LiveGameAiFeatureCenterSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_game_ai_feature_center_switch", DEFAULT);
    }
}
