package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_voice_chat_bg_opt")
public final class LinkMicVoiceChatBgOptSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicVoiceChatBgOptSetting INSTANCE = new LinkMicVoiceChatBgOptSetting();

    public final boolean opt() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_voice_chat_bg_opt", DEFAULT);
    }
}
