package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_performance_tracking_enabled")
public final class LiveWalletPerformanceTrackingEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final LiveWalletPerformanceTrackingEnabledSetting INSTANCE = new LiveWalletPerformanceTrackingEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_performance_tracking_enabled", DEFAULT);
    }
}
