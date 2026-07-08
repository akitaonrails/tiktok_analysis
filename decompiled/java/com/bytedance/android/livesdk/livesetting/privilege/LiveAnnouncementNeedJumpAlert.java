package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_announcement_need_jump_alert")
public final class LiveAnnouncementNeedJumpAlert {
    public static final boolean DEFAULT = false;
    public static final LiveAnnouncementNeedJumpAlert INSTANCE = new LiveAnnouncementNeedJumpAlert();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_announcement_need_jump_alert", DEFAULT);
    }
}
