package com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "voice_chat_guest_no_cap_video")
public final class VoiceChatGuestNoPushVideoSetting {
    public static final boolean DEFAULT = false;
    public static final VoiceChatGuestNoPushVideoSetting INSTANCE = new VoiceChatGuestNoPushVideoSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("voice_chat_guest_no_cap_video", DEFAULT);
    }
}
