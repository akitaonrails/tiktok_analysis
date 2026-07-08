package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_client_model_change_count_threshold")
public final class GameClientModelChangeCountThresholdSetting {
    public static final int DEFAULT = 0;
    public static final GameClientModelChangeCountThresholdSetting INSTANCE = new GameClientModelChangeCountThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_client_model_change_count_threshold", DEFAULT);
    }
}
