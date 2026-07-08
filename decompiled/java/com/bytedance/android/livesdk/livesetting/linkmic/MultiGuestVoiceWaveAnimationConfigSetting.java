package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_voice_wave_animation_config")
public final class MultiGuestVoiceWaveAnimationConfigSetting {
    public static final MultiGuestVoiceWaveAnimationConfigSetting INSTANCE = new MultiGuestVoiceWaveAnimationConfigSetting();
    public static final MultiGuestVoiceWaveAnimationConfig DEFAULT = new MultiGuestVoiceWaveAnimationConfig(2, 10);

    public final MultiGuestVoiceWaveAnimationConfig getValue() {
        MultiGuestVoiceWaveAnimationConfig multiGuestVoiceWaveAnimationConfig = (MultiGuestVoiceWaveAnimationConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestVoiceWaveAnimationConfigSetting.class);
        return multiGuestVoiceWaveAnimationConfig == null ? DEFAULT : multiGuestVoiceWaveAnimationConfig;
    }
}
