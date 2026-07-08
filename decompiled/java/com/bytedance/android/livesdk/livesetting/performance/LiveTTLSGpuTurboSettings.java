package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("webcast_live_sdk_ttls_disable_gpu_turbo_settings")
public final class LiveTTLSGpuTurboSettings {
    public static final LiveTTLSGpuTurboSettings INSTANCE = new LiveTTLSGpuTurboSettings();
    public static final boolean DEFAULT = true;

    public final boolean isGpuTurboDisabled() {
        return SettingsManager.INSTANCE.getBooleanValue("webcast_live_sdk_ttls_disable_gpu_turbo_settings", DEFAULT);
    }
}
