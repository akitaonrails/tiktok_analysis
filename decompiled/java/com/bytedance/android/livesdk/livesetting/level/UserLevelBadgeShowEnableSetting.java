package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("enable_user_level_badge")
public final class UserLevelBadgeShowEnableSetting {
    public static final boolean DEFAULT = true;
    public static final UserLevelBadgeShowEnableSetting INSTANCE = new UserLevelBadgeShowEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_user_level_badge", DEFAULT);
    }
}
