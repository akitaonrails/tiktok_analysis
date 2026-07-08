package com.bytedance.android.livesdk.livesetting.game.moment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_sound_effect_moment_ignore_duration_ms")
public final class LiveGameSoundEffectMomentIgnoreDurationSetting {
    public static final long DEFAULT = 5000;
    public static final LiveGameSoundEffectMomentIgnoreDurationSetting INSTANCE = new LiveGameSoundEffectMomentIgnoreDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_game_sound_effect_moment_ignore_duration_ms", DEFAULT);
    }
}
