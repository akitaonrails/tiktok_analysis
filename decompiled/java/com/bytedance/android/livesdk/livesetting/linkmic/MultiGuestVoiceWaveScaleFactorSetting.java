package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_voice_wave_scale_factor")
public final class MultiGuestVoiceWaveScaleFactorSetting {
    public static final float DEFAULT = 1.8f;
    public static final MultiGuestVoiceWaveScaleFactorSetting INSTANCE = new MultiGuestVoiceWaveScaleFactorSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("multi_guest_voice_wave_scale_factor", DEFAULT);
    }
}
