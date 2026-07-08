package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_points_short_touch_delay")
public final class GameLiveGuessPointsViewDelaySetting {
    public static final int DEFAULT = 0;
    public static final GameLiveGuessPointsViewDelaySetting INSTANCE = new GameLiveGuessPointsViewDelaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_points_short_touch_delay", DEFAULT);
    }
}
