package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_anchor_quick_connect_for_voice_chat")
public final class MultiguestAnchorQuickConnectForVoiceChatSetting {
    public static final boolean DEFAULT = false;
    public static final MultiguestAnchorQuickConnectForVoiceChatSetting INSTANCE = new MultiguestAnchorQuickConnectForVoiceChatSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_anchor_quick_connect_for_voice_chat", DEFAULT);
    }
}
