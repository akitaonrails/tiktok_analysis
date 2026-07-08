package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_ttlh_adaptive_perf_log_enable")
public final class LiveSdkMultiGuestTTLHAdaptivePerfLogSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestTTLHAdaptivePerfLogSetting INSTANCE = new LiveSdkMultiGuestTTLHAdaptivePerfLogSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_ttlh_adaptive_perf_log_enable", DEFAULT);
    }
}
