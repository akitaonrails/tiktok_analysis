package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_enable_invite_group_linkmic")
public final class LinkMicInviteGroupChatSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicInviteGroupChatSetting INSTANCE = new LinkMicInviteGroupChatSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_enable_invite_group_linkmic", DEFAULT);
    }
}
