package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_main_frame_perf_opt")
public final class LiveMainFrameworkUpdatePerformanceOptSetting {
    public static final LiveMainFrameworkUpdatePerformanceOptSetting INSTANCE = new LiveMainFrameworkUpdatePerformanceOptSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_main_frame_perf_opt", true);

    public final boolean enable() {
        return value;
    }
}
