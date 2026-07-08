package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("ttlive_game_partnership_new_attribution_config")
public final class GameLivePartnershipNewAttributionConfig {
    public static final GameLivePartnershipNewAttributionConfig INSTANCE = new GameLivePartnershipNewAttributionConfig();
    public static final NewAttributionConfig DEFAULT = new NewAttributionConfig(0);

    public final NewAttributionConfig getConfig() {
        NewAttributionConfig newAttributionConfig = (NewAttributionConfig) SettingsManager.INSTANCE.getValueSafely(GameLivePartnershipNewAttributionConfig.class);
        return newAttributionConfig == null ? DEFAULT : newAttributionConfig;
    }
}
