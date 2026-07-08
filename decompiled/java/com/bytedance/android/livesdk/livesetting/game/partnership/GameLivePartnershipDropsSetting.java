package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_partnership_drops_config")
public final class GameLivePartnershipDropsSetting {
    public static final GameLivePartnershipDropsSetting INSTANCE = new GameLivePartnershipDropsSetting();
    public static final GameLivePartnershipDropsConfig DEFAULT = new GameLivePartnershipDropsConfig(false, "", "", 1, true);

    public final GameLivePartnershipDropsConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameLivePartnershipDropsConfig gameLivePartnershipDropsConfig = DEFAULT;
        GameLivePartnershipDropsConfig gameLivePartnershipDropsConfig2 = (GameLivePartnershipDropsConfig) settingsManager.getValueSafely("ttlive_game_partnership_drops_config", gameLivePartnershipDropsConfig);
        return gameLivePartnershipDropsConfig2 != null ? gameLivePartnershipDropsConfig2 : gameLivePartnershipDropsConfig;
    }
}
