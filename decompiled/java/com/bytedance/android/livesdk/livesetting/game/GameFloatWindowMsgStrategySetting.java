package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_float_window_msg_strategy_setting")
public final class GameFloatWindowMsgStrategySetting {
    public static final GameFloatWindowMsgStrategySetting INSTANCE = new GameFloatWindowMsgStrategySetting();
    public static final GameFloatWindowMsgStrategyConfig DEFAULT = new GameFloatWindowMsgStrategyConfig(2000, 1000, 3, false, false, 3, 3);

    public final GameFloatWindowMsgStrategyConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameFloatWindowMsgStrategyConfig gameFloatWindowMsgStrategyConfig = DEFAULT;
        GameFloatWindowMsgStrategyConfig gameFloatWindowMsgStrategyConfig2 = (GameFloatWindowMsgStrategyConfig) settingsManager.getValueSafely("game_float_window_msg_strategy_setting", gameFloatWindowMsgStrategyConfig);
        return gameFloatWindowMsgStrategyConfig2 != null ? gameFloatWindowMsgStrategyConfig2 : gameFloatWindowMsgStrategyConfig;
    }
}
