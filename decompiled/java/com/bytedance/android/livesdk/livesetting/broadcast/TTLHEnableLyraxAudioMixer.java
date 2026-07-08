package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_lyrax_audio_mixer")
public final class TTLHEnableLyraxAudioMixer {
    public static final boolean DEFAULT = false;
    public static final TTLHEnableLyraxAudioMixer INSTANCE = new TTLHEnableLyraxAudioMixer();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_enable_lyrax_audio_mixer", DEFAULT);
    }
}
