package com.bytedance.android.livesdk.livesetting.skylight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_toplive_notification_setting")
public final class LiveTopLiveNotificationSetting {
    public static final LiveTopLiveNotificationSetting INSTANCE = new LiveTopLiveNotificationSetting();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_toplive_notification_setting", DEFAULT);

    public final boolean getEnable() {
        return enable;
    }
}
