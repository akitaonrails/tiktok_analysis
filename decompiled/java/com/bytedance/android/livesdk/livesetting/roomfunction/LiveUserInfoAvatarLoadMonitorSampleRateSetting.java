package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_userinfo_avatar_load_monitor_sample_rate")
public final class LiveUserInfoAvatarLoadMonitorSampleRateSetting {
    public static final LiveUserInfoAvatarLoadMonitorSampleRateSetting INSTANCE = new LiveUserInfoAvatarLoadMonitorSampleRateSetting();
    public static final double DEFAULT = 0.01d;

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_userinfo_avatar_load_monitor_sample_rate", DEFAULT);
    }
}
