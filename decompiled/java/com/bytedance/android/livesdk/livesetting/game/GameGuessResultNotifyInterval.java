package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "game_guess_result_notify_interval")
public final class GameGuessResultNotifyInterval {
    public static final long DEFAULT = 600;
    public static final GameGuessResultNotifyInterval INSTANCE = new GameGuessResultNotifyInterval();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("game_guess_result_notify_interval", DEFAULT);
    }
}
