package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_report_optimize_url")
public final class LiveReportOptimizeUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveReportOptimizeUrlSetting INSTANCE = new LiveReportOptimizeUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_report_optimize_url", DEFAULT);
    }
}
