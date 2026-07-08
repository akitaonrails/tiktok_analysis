package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_match_audience_launcher_setting")
public final class LiveMatchAudienceLauncherSetting {
    public static final int DEFAULT = 1;
    public static final LiveMatchAudienceLauncherSetting INSTANCE = new LiveMatchAudienceLauncherSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_match_audience_launcher_setting", DEFAULT) == 1;
    }
}
