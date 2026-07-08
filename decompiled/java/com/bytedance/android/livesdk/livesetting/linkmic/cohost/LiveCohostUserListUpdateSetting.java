package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_user_list_update_setting")
public final class LiveCohostUserListUpdateSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostUserListUpdateSetting INSTANCE = new LiveCohostUserListUpdateSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_user_list_update_setting", DEFAULT);
    }
}
