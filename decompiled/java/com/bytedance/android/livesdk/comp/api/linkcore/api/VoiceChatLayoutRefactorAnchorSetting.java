package com.bytedance.android.livesdk.comp.api.linkcore.api;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "voice_chat_layout_refactor_anchor")
public final class VoiceChatLayoutRefactorAnchorSetting {
    public static final int DEFAULT = 1;
    public static final VoiceChatLayoutRefactorAnchorSetting INSTANCE = new VoiceChatLayoutRefactorAnchorSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("voice_chat_layout_refactor_anchor", DEFAULT);
    }

    public final boolean getEnable() {
        return getValue() > 0;
    }
}
