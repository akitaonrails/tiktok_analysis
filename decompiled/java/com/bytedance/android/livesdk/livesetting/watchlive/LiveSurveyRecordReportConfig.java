package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_survey_record_report_config")
public final class LiveSurveyRecordReportConfig {
    public static final LiveSurveyRecordReportConfig INSTANCE = new LiveSurveyRecordReportConfig();
    public static final ReportConfig DEFAULT = new ReportConfig(5, 30);

    public final ReportConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ReportConfig reportConfig = DEFAULT;
        ReportConfig reportConfig2 = (ReportConfig) settingsManager.getValueSafely("live_survey_record_report_config", reportConfig);
        return reportConfig2 != null ? reportConfig2 : reportConfig;
    }
}
