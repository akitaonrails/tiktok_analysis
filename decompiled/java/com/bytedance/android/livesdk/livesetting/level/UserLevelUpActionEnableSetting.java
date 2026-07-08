package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("enable_level_up_all")
public final class UserLevelUpActionEnableSetting {
    public static final boolean DEFAULT = true;
    public static final UserLevelUpActionEnableSetting INSTANCE = new UserLevelUpActionEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_level_up_all", DEFAULT);
    }
}
