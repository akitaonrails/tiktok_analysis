package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_voice_wave_privilege")
public final class MultiGuestVoiceWavePrivilegeSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestVoiceWavePrivilegeSetting INSTANCE = new MultiGuestVoiceWavePrivilegeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_voice_wave_privilege", DEFAULT);
    }
}
