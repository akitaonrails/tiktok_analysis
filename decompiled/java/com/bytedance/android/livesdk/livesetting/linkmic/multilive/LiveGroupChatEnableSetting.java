package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_linkmic_enable_group_chat_enter_room")
public final class LiveGroupChatEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveGroupChatEnableSetting INSTANCE = new LiveGroupChatEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_linkmic_enable_group_chat_enter_room", DEFAULT);
    }
}
