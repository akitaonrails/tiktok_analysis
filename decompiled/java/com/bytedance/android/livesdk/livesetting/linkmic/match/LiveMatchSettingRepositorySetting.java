package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("match_setting_repository")
public final class LiveMatchSettingRepositorySetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchSettingRepositorySetting INSTANCE = new LiveMatchSettingRepositorySetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("match_setting_repository", DEFAULT);
    }
}
