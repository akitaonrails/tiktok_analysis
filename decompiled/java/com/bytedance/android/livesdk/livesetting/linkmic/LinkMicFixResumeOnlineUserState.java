package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_linkmic_fix_resume_online_user_state")
public final class LinkMicFixResumeOnlineUserState {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixResumeOnlineUserState INSTANCE = new LinkMicFixResumeOnlineUserState();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_linkmic_fix_resume_online_user_state", DEFAULT);
    }
}
