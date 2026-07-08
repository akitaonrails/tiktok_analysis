package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("sound_wave_effect_opt_setting")
public final class SoundWaveEffectOtpSetting {
    public static final SoundWaveEffectConfig DEFAULT;
    public static final SoundWaveEffectOtpSetting INSTANCE = new SoundWaveEffectOtpSetting();
    public static final SoundWaveEffectConfig config;

    static {
        SoundWaveEffectConfig soundWaveEffectConfig = new SoundWaveEffectConfig(false, 30, 400L, 600L, 900L);
        DEFAULT = soundWaveEffectConfig;
        SoundWaveEffectConfig soundWaveEffectConfig2 = (SoundWaveEffectConfig) SettingsManager.INSTANCE.getValueSafely("sound_wave_effect_opt_setting", soundWaveEffectConfig);
        if (soundWaveEffectConfig2 != null) {
            soundWaveEffectConfig = soundWaveEffectConfig2;
        }
        config = soundWaveEffectConfig;
    }

    public final int getFPS() {
        return config.fps;
    }

    public final long getHighDuration() {
        return config.highDuration;
    }

    public final long getLowDuration() {
        return config.lowDuration;
    }

    public final long getMidDuration() {
        return config.midDuration;
    }

    public final boolean isEnable() {
        return config.enable;
    }
}
