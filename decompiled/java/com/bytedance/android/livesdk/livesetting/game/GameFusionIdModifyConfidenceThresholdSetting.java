package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_fusion_id_modify_confidence_threshold")
public final class GameFusionIdModifyConfidenceThresholdSetting {
    public static final int DEFAULT = 3;
    public static final GameFusionIdModifyConfidenceThresholdSetting INSTANCE = new GameFusionIdModifyConfidenceThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_fusion_id_modify_confidence_threshold", DEFAULT);
    }
}
