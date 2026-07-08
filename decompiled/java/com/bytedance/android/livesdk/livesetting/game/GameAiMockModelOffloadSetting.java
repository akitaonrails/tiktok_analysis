package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_ai_mock_model_offload")
public final class GameAiMockModelOffloadSetting {
    public static final int DEFAULT = 0;
    public static final GameAiMockModelOffloadSetting INSTANCE = new GameAiMockModelOffloadSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_ai_mock_model_offload", DEFAULT);
    }

    public final boolean enableSetting() {
        return getValue() != 0;
    }

    public final boolean isOffload() {
        return getValue() == 2;
    }
}
