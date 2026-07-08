package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_client_ai_simple_model")
public final class GameLiveClientAiSimpleModelSetting {
    public static final int DEFAULT = 0;
    public static final GameLiveClientAiSimpleModelSetting INSTANCE = new GameLiveClientAiSimpleModelSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_live_client_ai_simple_model", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
