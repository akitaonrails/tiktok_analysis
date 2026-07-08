package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("user_level_gecko_update_time_interval")
public final class UserLevelGeckoUpdateSetting {
    public static final int DEFAULT = 400;
    public static final UserLevelGeckoUpdateSetting INSTANCE = new UserLevelGeckoUpdateSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("user_level_gecko_update_time_interval", DEFAULT);
    }
}
