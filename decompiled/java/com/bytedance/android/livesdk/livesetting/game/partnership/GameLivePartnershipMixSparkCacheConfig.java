package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("ttlive_game_mix_spark_cache_config")
public final class GameLivePartnershipMixSparkCacheConfig {
    public static final GameLivePartnershipMixSparkCacheConfig INSTANCE = new GameLivePartnershipMixSparkCacheConfig();
    public static final GameMixSparkCacheConfig DEFAULT = new GameMixSparkCacheConfig();

    public final GameMixSparkCacheConfig getConfig() {
        GameMixSparkCacheConfig gameMixSparkCacheConfig = (GameMixSparkCacheConfig) SettingsManager.INSTANCE.getValueSafely(GameLivePartnershipMixSparkCacheConfig.class);
        return gameMixSparkCacheConfig == null ? DEFAULT : gameMixSparkCacheConfig;
    }
}
