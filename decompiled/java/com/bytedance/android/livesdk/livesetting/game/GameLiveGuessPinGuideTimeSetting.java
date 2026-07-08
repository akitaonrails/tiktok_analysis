package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_guess_pin_guide_time")
public final class GameLiveGuessPinGuideTimeSetting {
    public static final long DEFAULT = 300;
    public static final GameLiveGuessPinGuideTimeSetting INSTANCE = new GameLiveGuessPinGuideTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("game_live_guess_pin_guide_time", DEFAULT);
    }
}
