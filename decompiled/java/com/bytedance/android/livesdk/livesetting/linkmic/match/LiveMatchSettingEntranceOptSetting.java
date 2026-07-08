package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_setting_entrance_fix_enable")
public final class LiveMatchSettingEntranceOptSetting {
    public static final LiveMatchSettingEntranceOptSetting INSTANCE = new LiveMatchSettingEntranceOptSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_setting_entrance_fix_enable", DEFAULT);
    }
}
