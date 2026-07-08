package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_client_infer_debug")
public final class GameLiveClientInferDebugSetting {
    public static final GameLiveClientInferDebugSetting INSTANCE = new GameLiveClientInferDebugSetting();
    public static final GameLiveClientInferConfig DEFAULT = new GameLiveClientInferConfig();

    public final GameLiveClientInferConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameLiveClientInferConfig gameLiveClientInferConfig = DEFAULT;
        GameLiveClientInferConfig gameLiveClientInferConfig2 = (GameLiveClientInferConfig) settingsManager.getValueSafely("game_live_client_infer_debug", gameLiveClientInferConfig);
        return gameLiveClientInferConfig2 != null ? gameLiveClientInferConfig2 : gameLiveClientInferConfig;
    }

    public final String fusionId() {
        return getValue().fusionId;
    }

    public final boolean isOpenDebug() {
        return getValue().isOpenDebug;
    }

    public final String module() {
        return getValue().module;
    }
}
