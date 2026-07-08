package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("partnership_game_card_config")
public final class GameLivePartnershipGameCardShowConfig {
    public static final GameLivePartnershipGameCardShowConfig INSTANCE = new GameLivePartnershipGameCardShowConfig();
    public static final GameCardShownConfig DEFAULT = new GameCardShownConfig(false, 0);

    public final GameCardShownConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameCardShownConfig gameCardShownConfig = DEFAULT;
        GameCardShownConfig gameCardShownConfig2 = (GameCardShownConfig) settingsManager.getValueSafely("partnership_game_card_config", gameCardShownConfig);
        return gameCardShownConfig2 != null ? gameCardShownConfig2 : gameCardShownConfig;
    }
}
