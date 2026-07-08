package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_voice_chat_fix_context_assignment")
public final class LinkMicVoiceChatFixContextAssignment {
    public static final boolean DEFAULT = true;
    public static final LinkMicVoiceChatFixContextAssignment INSTANCE = new LinkMicVoiceChatFixContextAssignment();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_voice_chat_fix_context_assignment", DEFAULT);
    }
}
