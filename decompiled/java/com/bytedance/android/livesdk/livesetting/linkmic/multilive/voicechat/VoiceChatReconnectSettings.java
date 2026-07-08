package com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "voice_chat_reconnect_settings")
public final class VoiceChatReconnectSettings {
    public static final boolean DEFAULT = false;
    public static final VoiceChatReconnectSettings INSTANCE = new VoiceChatReconnectSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("voice_chat_reconnect_settings", DEFAULT);
    }
}
