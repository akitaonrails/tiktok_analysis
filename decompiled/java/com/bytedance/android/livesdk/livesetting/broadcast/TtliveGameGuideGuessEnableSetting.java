package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_guide_guess_enable")
public final class TtliveGameGuideGuessEnableSetting {
    public static final boolean DEFAULT = true;
    public static final TtliveGameGuideGuessEnableSetting INSTANCE = new TtliveGameGuideGuessEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_guide_guess_enable", DEFAULT);
    }
}
