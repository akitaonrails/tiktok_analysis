package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_mt_enable_instant_cpu_rate")
public final class LiveMtEnableInstantCpuRateSetting {
    public static final int DEFAULT = 1;
    public static final LiveMtEnableInstantCpuRateSetting INSTANCE = new LiveMtEnableInstantCpuRateSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_mt_enable_instant_cpu_rate", DEFAULT);
    }
}
