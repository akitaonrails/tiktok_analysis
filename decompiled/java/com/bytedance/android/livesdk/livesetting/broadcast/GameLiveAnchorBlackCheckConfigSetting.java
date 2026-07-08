package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_anchor_black_check_config")
public final class GameLiveAnchorBlackCheckConfigSetting {
    public static final GameLiveAnchorBlackCheckConfigSetting INSTANCE = new GameLiveAnchorBlackCheckConfigSetting();
    public static final BlackCheckConfig DEFAULT = new BlackCheckConfig();

    public final BlackCheckConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BlackCheckConfig blackCheckConfig = DEFAULT;
        BlackCheckConfig blackCheckConfig2 = (BlackCheckConfig) settingsManager.getValueSafely("game_live_anchor_black_check_config", blackCheckConfig);
        return blackCheckConfig2 != null ? blackCheckConfig2 : blackCheckConfig;
    }
}
