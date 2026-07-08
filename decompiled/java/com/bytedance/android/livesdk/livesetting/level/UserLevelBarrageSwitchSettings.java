package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("barrage_show_with_gecko_exist")
public final class UserLevelBarrageSwitchSettings {
    public static final boolean DEFAULT = true;
    public static final UserLevelBarrageSwitchSettings INSTANCE = new UserLevelBarrageSwitchSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("barrage_show_with_gecko_exist", DEFAULT);
    }
}
