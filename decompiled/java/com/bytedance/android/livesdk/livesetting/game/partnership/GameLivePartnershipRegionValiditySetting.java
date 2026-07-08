package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, value = "ttlive_game_partnership_region_config")
public final class GameLivePartnershipRegionValiditySetting {
    public static final int DEFAULT = 0;
    public static final GameLivePartnershipRegionValiditySetting INSTANCE = new GameLivePartnershipRegionValiditySetting();
    public static final int IS_IN_EU = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_partnership_region_config", DEFAULT);
    }

    public final boolean isInEuRegion() {
        return getValue() == 1;
    }
}
