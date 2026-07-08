package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_fans_level_replace_setting")
public final class FansClubReplaceEnableSettings {
    public static final boolean DEFAULT = true;
    public static final FansClubReplaceEnableSettings INSTANCE = new FansClubReplaceEnableSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_level_replace_setting", DEFAULT);
    }
}
