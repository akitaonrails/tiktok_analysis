package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_privilege_announcement_container_setting")
public final class LivePrivilegeAnnouncementContainerSetting {
    public static final LivePrivilegeAnnouncementContainerSetting INSTANCE = new LivePrivilegeAnnouncementContainerSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_privilege_announcement_container_setting", DEFAULT);
    }
}
