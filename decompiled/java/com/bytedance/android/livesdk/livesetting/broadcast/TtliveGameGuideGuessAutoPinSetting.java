package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_guide_guess_auto_pin")
public final class TtliveGameGuideGuessAutoPinSetting {
    public static final boolean DEFAULT = true;
    public static final TtliveGameGuideGuessAutoPinSetting INSTANCE = new TtliveGameGuideGuessAutoPinSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_guide_guess_auto_pin", DEFAULT);
    }
}
