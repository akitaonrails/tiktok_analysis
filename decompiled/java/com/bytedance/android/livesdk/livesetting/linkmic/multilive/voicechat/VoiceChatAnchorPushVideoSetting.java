package com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "voice_chat_anchor_push_video")
public final class VoiceChatAnchorPushVideoSetting {
    public static final boolean DEFAULT = false;
    public static final VoiceChatAnchorPushVideoSetting INSTANCE = new VoiceChatAnchorPushVideoSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("voice_chat_anchor_push_video", DEFAULT);
    }
}
