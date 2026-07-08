package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_refresh_interval")
public final class LiveCoHostRefreshIntervalSetting {
    public static final int DEFAULT = 2;
    public static final LiveCoHostRefreshIntervalSetting INSTANCE = new LiveCoHostRefreshIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_refresh_interval", DEFAULT);
    }
}
