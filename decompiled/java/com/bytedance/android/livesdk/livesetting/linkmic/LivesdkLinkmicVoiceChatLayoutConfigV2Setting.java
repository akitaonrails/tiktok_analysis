package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_voice_chat_layout_config_v2")
public final class LivesdkLinkmicVoiceChatLayoutConfigV2Setting {
    public static final String DEFAULT = "3001";
    public static final LivesdkLinkmicVoiceChatLayoutConfigV2Setting INSTANCE = new LivesdkLinkmicVoiceChatLayoutConfigV2Setting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("livesdk_linkmic_voice_chat_layout_config_v2", DEFAULT);
    }
}
