package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_match_monitor_add_to_tea_enable")
public final class LiveMatchAppLogSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchAppLogSetting INSTANCE = new LiveMatchAppLogSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_match_monitor_add_to_tea_enable", DEFAULT);
    }
}
