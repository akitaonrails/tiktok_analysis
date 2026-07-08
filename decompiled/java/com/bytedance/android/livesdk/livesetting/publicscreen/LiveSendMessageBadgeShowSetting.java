package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_send_message_badge_show")
public final class LiveSendMessageBadgeShowSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSendMessageBadgeShowSetting INSTANCE = new LiveSendMessageBadgeShowSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_send_message_badge_show", DEFAULT);
    }
}
