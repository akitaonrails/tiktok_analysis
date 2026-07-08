package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_rust_voice_chat_audience")
public final class MtLinkMicRustVoiceChatAudienceSetting {
    public static final boolean DEFAULT = true;
    public static final MtLinkMicRustVoiceChatAudienceSetting INSTANCE = new MtLinkMicRustVoiceChatAudienceSetting();

    public static final boolean isLinkerEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_rust_voice_chat_audience", DEFAULT);
    }
}
