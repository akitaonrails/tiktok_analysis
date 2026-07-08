package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "ttlive_game_guess_points_preview_opt")
public final class GameLiveGuessPointsPreviewOptSetting {
    public static final int DEFAULT = 0;
    public static final GameLiveGuessPointsPreviewOptSetting INSTANCE = new GameLiveGuessPointsPreviewOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_guess_points_preview_opt", DEFAULT) == 1;
    }
}
