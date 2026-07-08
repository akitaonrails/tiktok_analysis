package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "ttlive_game_live_landscape_top_shadow_opt")
public final class GameLiveLandscapeTopShadowOpt {
    public static final boolean DEFAULT = false;
    public static final GameLiveLandscapeTopShadowOpt INSTANCE = new GameLiveLandscapeTopShadowOpt();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_live_landscape_top_shadow_opt", DEFAULT);
    }
}
