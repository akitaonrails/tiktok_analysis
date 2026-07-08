package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_host_cpu_fetch_opt")
public final class LiveHostCpuInfoFetchExp {
    public static final LiveHostCpuInfoFetchExp INSTANCE = new LiveHostCpuInfoFetchExp();
    public static final boolean DEFAULT = false;
    public static final boolean isEnable = SettingsManager.INSTANCE.getBooleanValue("live_host_cpu_fetch_opt", DEFAULT);

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isEnable() {
        return isEnable;
    }
}
