package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_duplicate_user_list_fix_setting")
public final class LiveCoHostDuplicateUserListFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCoHostDuplicateUserListFixSetting INSTANCE = new LiveCoHostDuplicateUserListFixSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_duplicate_user_list_fix_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
