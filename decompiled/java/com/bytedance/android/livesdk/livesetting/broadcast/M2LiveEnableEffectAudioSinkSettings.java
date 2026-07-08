package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("m2live_enable_effect_audio_sink")
public final class M2LiveEnableEffectAudioSinkSettings {
    public static final M2LiveEnableEffectAudioSinkSettings INSTANCE = new M2LiveEnableEffectAudioSinkSettings();
    public static final boolean DEFAULT = true;

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("m2live_enable_effect_audio_sink", DEFAULT);
    }
}
