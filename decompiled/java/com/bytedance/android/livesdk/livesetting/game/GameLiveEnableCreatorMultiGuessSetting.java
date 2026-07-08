package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_multi_guess_creator")
public final class GameLiveEnableCreatorMultiGuessSetting {
    public static final int DEFAULT = 0;
    public static final GameLiveEnableCreatorMultiGuessSetting INSTANCE = new GameLiveEnableCreatorMultiGuessSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("game_multi_guess_creator", DEFAULT) == 1;
    }
}
