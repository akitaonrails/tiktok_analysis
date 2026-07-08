package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_host_low_mem_monitor")
public final class LiveLowMemoryMonitorSettings {
    public static final boolean DEFAULT = false;
    public static final LiveLowMemoryMonitorSettings INSTANCE = new LiveLowMemoryMonitorSettings();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_low_mem_monitor", DEFAULT);
    }
}
