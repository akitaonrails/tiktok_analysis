package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_1vn_bugfix_enable")
public final class LiveMatch1vNBugFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatch1vNBugFixSetting INSTANCE = new LiveMatch1vNBugFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_1vn_bugfix_enable", DEFAULT);
    }
}
