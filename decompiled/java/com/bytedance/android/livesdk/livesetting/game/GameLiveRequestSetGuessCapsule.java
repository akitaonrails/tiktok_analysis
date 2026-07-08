package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_request_set_guess_capsule")
public final class GameLiveRequestSetGuessCapsule {
    public static final boolean DEFAULT = false;
    public static final GameLiveRequestSetGuessCapsule INSTANCE = new GameLiveRequestSetGuessCapsule();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_request_set_guess_capsule", DEFAULT);
    }
}
