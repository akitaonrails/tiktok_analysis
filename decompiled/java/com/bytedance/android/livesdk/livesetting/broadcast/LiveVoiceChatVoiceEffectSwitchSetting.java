package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_sdk_voice_chat_voice_effect_switch")
public final class LiveVoiceChatVoiceEffectSwitchSetting {
    public static final int DEFAULT = 0;
    public static final LiveVoiceChatVoiceEffectSwitchSetting INSTANCE = new LiveVoiceChatVoiceEffectSwitchSetting();

    public static final boolean isOpen() {
        return SettingsManager.INSTANCE.getIntValue(LiveVoiceChatVoiceEffectSwitchSetting.class) == 1;
    }
}
