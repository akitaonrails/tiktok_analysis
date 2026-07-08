package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_group_chat_go_live_age_verify_safe_switch")
public final class GroupChatGoLiveAgeVerifySafeSwitch {
    public static final boolean DEFAULT = true;
    public static final GroupChatGoLiveAgeVerifySafeSwitch INSTANCE = new GroupChatGoLiveAgeVerifySafeSwitch();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_group_chat_go_live_age_verify_safe_switch", DEFAULT);
    }
}
