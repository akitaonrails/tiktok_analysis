package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("m2live_enable_audio_mixer")
public final class M2LiveEnableAudioMixerSettings {
    public static final M2LiveEnableAudioMixerSettings INSTANCE = new M2LiveEnableAudioMixerSettings();
    public static final boolean DEFAULT = true;

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("m2live_enable_audio_mixer", DEFAULT);
    }
}
