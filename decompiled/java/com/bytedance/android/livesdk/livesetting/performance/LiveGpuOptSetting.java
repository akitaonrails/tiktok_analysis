package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_enable_gpu_opt")
public final class LiveGpuOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveGpuOptSetting INSTANCE = new LiveGpuOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_gpu_opt", DEFAULT);
    }
}
