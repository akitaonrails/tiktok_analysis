package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_guessing_drawer_cache_time")
public final class GameLiveGuessingDrawerCacheTimeSetting {
    public static final long DEFAULT = 300;
    public static final GameLiveGuessingDrawerCacheTimeSetting INSTANCE = new GameLiveGuessingDrawerCacheTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("game_live_guessing_drawer_cache_time", DEFAULT);
    }
}
