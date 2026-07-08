package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_refresh_period")
public final class LiveCoHostRefreshPeriodSetting {
    public static final int DEFAULT = 30;
    public static final LiveCoHostRefreshPeriodSetting INSTANCE = new LiveCoHostRefreshPeriodSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_refresh_period", DEFAULT);
    }
}
