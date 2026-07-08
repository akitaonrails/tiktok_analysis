package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_voice_chat_live_core_release")
public final class LinkMicVoiceChatLiveCoreRelease {
    public static final boolean DEFAULT = true;
    public static final LinkMicVoiceChatLiveCoreRelease INSTANCE = new LinkMicVoiceChatLiveCoreRelease();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_voice_chat_live_core_release", DEFAULT);
    }
}
