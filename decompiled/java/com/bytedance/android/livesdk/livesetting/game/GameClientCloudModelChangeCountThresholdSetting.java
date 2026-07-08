package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_client_cloud_model_change_count_threshold")
public final class GameClientCloudModelChangeCountThresholdSetting {
    public static final int DEFAULT = 3;
    public static final GameClientCloudModelChangeCountThresholdSetting INSTANCE = new GameClientCloudModelChangeCountThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_client_cloud_model_change_count_threshold", DEFAULT);
    }
}
