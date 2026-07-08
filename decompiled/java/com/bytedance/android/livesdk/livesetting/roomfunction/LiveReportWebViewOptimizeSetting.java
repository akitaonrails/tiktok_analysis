package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_report_webview_optimize")
public final class LiveReportWebViewOptimizeSetting {
    public static final boolean DEFAULT = true;
    public static final LiveReportWebViewOptimizeSetting INSTANCE = new LiveReportWebViewOptimizeSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_report_webview_optimize", DEFAULT);
    }
}
