package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_gecko_banner_low_device_optimize")
public final class LiveGeckoBannerOptimizeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGeckoBannerOptimizeSetting INSTANCE = new LiveGeckoBannerOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gecko_banner_low_device_optimize", DEFAULT);
    }
}
