package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_backpress_intercept_time")
public final class LiveHostBackPressInterceptTime {
    public static final LiveHostBackPressInterceptTime INSTANCE = new LiveHostBackPressInterceptTime();
    public static final long DEFAULT = 2000;

    public static final long interceptTime() {
        return SettingsManager.INSTANCE.getLongValue("live_host_backpress_intercept_time", DEFAULT);
    }
}
