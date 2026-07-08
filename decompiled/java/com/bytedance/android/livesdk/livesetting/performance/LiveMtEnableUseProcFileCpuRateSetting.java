package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_mt_enable_use_proc_file_cpu_rate")
public final class LiveMtEnableUseProcFileCpuRateSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMtEnableUseProcFileCpuRateSetting INSTANCE = new LiveMtEnableUseProcFileCpuRateSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_mt_enable_use_proc_file_cpu_rate", DEFAULT);
    }
}
