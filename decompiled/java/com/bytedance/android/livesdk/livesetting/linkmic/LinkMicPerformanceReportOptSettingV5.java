package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_performance_report_opt_v5")
public final class LinkMicPerformanceReportOptSettingV5 {
    public static final int DEFAULT = 1;
    public static final LinkMicPerformanceReportOptSettingV5 INSTANCE = new LinkMicPerformanceReportOptSettingV5();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_performance_report_opt_v5", DEFAULT);
    }

    public final boolean useOpt() {
        return getValue() == 1;
    }
}
