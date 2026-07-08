package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("replace_setting")
public final class UserLevelReplaceEnableSettings {
    public static final boolean DEFAULT = true;
    public static final UserLevelReplaceEnableSettings INSTANCE = new UserLevelReplaceEnableSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("replace_setting", DEFAULT);
    }
}
