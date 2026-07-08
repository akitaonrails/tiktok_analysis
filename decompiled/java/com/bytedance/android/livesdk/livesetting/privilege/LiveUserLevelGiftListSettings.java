package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_user_level_gift_list_setting")
public final class LiveUserLevelGiftListSettings {
    public static final LiveUserLevelGiftListSettings INSTANCE = new LiveUserLevelGiftListSettings();
    public static final UserLevelGiftConfig DEFAULT = new UserLevelGiftConfig(new ArrayList());

    public final UserLevelGiftConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        UserLevelGiftConfig userLevelGiftConfig = DEFAULT;
        UserLevelGiftConfig userLevelGiftConfig2 = (UserLevelGiftConfig) settingsManager.getValueSafely("live_user_level_gift_list_setting", userLevelGiftConfig);
        return userLevelGiftConfig2 != null ? userLevelGiftConfig2 : userLevelGiftConfig;
    }
}
