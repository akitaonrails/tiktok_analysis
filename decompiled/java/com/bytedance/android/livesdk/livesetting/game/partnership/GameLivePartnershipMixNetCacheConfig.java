package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_game_mix_net_cache_config")
public final class GameLivePartnershipMixNetCacheConfig {
    public static final GameLivePartnershipMixNetCacheConfig INSTANCE = new GameLivePartnershipMixNetCacheConfig();
    public static final GameMixCacheConfig DEFAULT = new GameMixCacheConfig(null, null, 3, null);

    public final GameMixCacheConfig getConfig() {
        GameMixCacheConfig gameMixCacheConfig = (GameMixCacheConfig) SettingsManager.INSTANCE.getValueSafely(GameLivePartnershipMixNetCacheConfig.class);
        return gameMixCacheConfig == null ? DEFAULT : gameMixCacheConfig;
    }
}
