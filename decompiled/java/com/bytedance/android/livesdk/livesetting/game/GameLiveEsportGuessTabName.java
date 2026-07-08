package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_esport_guess_tab_name")
public final class GameLiveEsportGuessTabName {
    public static final String DEFAULT = "guess";
    public static final GameLiveEsportGuessTabName INSTANCE = new GameLiveEsportGuessTabName();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("game_live_esport_guess_tab_name", DEFAULT);
    }
}
