package com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "voice_chat_bg_linkmic_call_leave_setting")
public final class VoiceChatBgLinkMicCallLeaveSetting {
    public static final boolean DEFAULT = true;
    public static final VoiceChatBgLinkMicCallLeaveSetting INSTANCE = new VoiceChatBgLinkMicCallLeaveSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("voice_chat_bg_linkmic_call_leave_setting", DEFAULT);
    }
}
