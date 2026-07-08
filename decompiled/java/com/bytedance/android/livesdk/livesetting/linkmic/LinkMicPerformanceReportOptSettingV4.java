package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_performance_report_opt_v4")
public final class LinkMicPerformanceReportOptSettingV4 {
    public static final int DEFAULT = 1;
    public static final LinkMicPerformanceReportOptSettingV4 INSTANCE = new LinkMicPerformanceReportOptSettingV4();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_performance_report_opt_v4", DEFAULT);
    }

    public final boolean useOpt() {
        return getValue() == 1;
    }
}
