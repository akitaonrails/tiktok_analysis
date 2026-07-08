package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_voice_background_opt")
public final class LinkMicVoiceBackgroundSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicVoiceBackgroundSetting INSTANCE = new LinkMicVoiceBackgroundSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_voice_background_opt", DEFAULT);
    }
}
