package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("report_urls")
public final class LiveEffectReportUrlSetting {
    public static final ReportFeedbackUrls DEFAULT;
    public static final LiveEffectReportUrlSetting INSTANCE = new LiveEffectReportUrlSetting();
    public static final ReportFeedbackUrls setting;

    static {
        ReportFeedbackUrls reportFeedbackUrls = new ReportFeedbackUrls("", "");
        DEFAULT = reportFeedbackUrls;
        setting = (ReportFeedbackUrls) SettingsManager.INSTANCE.getValueSafely("report_urls", reportFeedbackUrls);
    }

    public final String getReportCreatorUrl() {
        String str;
        ReportFeedbackUrls reportFeedbackUrls = setting;
        return (reportFeedbackUrls == null || (str = reportFeedbackUrls.reportCreatorUrl) == null) ? DEFAULT.reportCreatorUrl : str;
    }

    public final String getReportOfficialUrl() {
        String str;
        ReportFeedbackUrls reportFeedbackUrls = setting;
        return (reportFeedbackUrls == null || (str = reportFeedbackUrls.reportOfficialUrl) == null) ? DEFAULT.reportOfficialUrl : str;
    }
}
