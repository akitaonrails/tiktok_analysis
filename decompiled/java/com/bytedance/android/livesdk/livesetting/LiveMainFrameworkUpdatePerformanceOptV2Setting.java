package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_main_frame_perf_opt_2")
public final class LiveMainFrameworkUpdatePerformanceOptV2Setting {
    public static final LiveMainFrameworkUpdatePerformanceOptV2Setting INSTANCE = new LiveMainFrameworkUpdatePerformanceOptV2Setting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_main_frame_perf_opt_2", true);

    public final boolean enable() {
        return value;
    }
}
