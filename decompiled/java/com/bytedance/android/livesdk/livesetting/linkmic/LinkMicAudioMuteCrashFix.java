package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_audio_mute_crash_fix")
public final class LinkMicAudioMuteCrashFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicAudioMuteCrashFix INSTANCE = new LinkMicAudioMuteCrashFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_audio_mute_crash_fix", DEFAULT);
    }
}
