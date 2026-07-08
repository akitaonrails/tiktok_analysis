package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_live_guess_auto_pin")
public final class TtliveGameLiveGuessAutoPinSetting {
    public static final boolean DEFAULT = true;
    public static final TtliveGameLiveGuessAutoPinSetting INSTANCE = new TtliveGameLiveGuessAutoPinSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_live_guess_auto_pin", DEFAULT);
    }
}
