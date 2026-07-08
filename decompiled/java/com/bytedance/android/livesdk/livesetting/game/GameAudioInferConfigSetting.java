package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("game_audio_infer_config_setting")
public final class GameAudioInferConfigSetting {
    public static final GameAudioInferConfigSetting INSTANCE = new GameAudioInferConfigSetting();
    public static final GameAudioInferConfig DEFAULT = new GameAudioInferConfig(120000, 3, 5);

    public final GameAudioInferConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameAudioInferConfig gameAudioInferConfig = DEFAULT;
        GameAudioInferConfig gameAudioInferConfig2 = (GameAudioInferConfig) settingsManager.getValueSafely("game_audio_infer_config_setting", gameAudioInferConfig);
        return gameAudioInferConfig2 != null ? gameAudioInferConfig2 : gameAudioInferConfig;
    }
}
