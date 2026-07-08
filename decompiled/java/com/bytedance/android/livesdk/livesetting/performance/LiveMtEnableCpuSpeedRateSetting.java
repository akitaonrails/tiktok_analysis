package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_mt_enable_cpu_speed_rate")
public final class LiveMtEnableCpuSpeedRateSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMtEnableCpuSpeedRateSetting INSTANCE = new LiveMtEnableCpuSpeedRateSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_mt_enable_cpu_speed_rate", DEFAULT);
    }
}
