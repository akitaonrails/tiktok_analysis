package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_banner_report_optimize")
public final class LiveBannerReportOptimizeSetting {
    public static final boolean DEFAULT = true;
    public static final LiveBannerReportOptimizeSetting INSTANCE = new LiveBannerReportOptimizeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_banner_report_optimize", DEFAULT);
    }
}
