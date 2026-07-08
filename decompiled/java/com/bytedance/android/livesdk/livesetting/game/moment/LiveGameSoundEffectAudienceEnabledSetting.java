package com.bytedance.android.livesdk.livesetting.game.moment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_sound_effect_audience_enabled")
public final class LiveGameSoundEffectAudienceEnabledSetting {
    public static final int DEFAULT = 1;
    public static final LiveGameSoundEffectAudienceEnabledSetting INSTANCE = new LiveGameSoundEffectAudienceEnabledSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_game_sound_effect_audience_enabled", DEFAULT);
    }
}
