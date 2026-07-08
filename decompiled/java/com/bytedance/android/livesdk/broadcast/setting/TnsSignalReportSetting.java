package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_tns_signal_report_setting")
public final class TnsSignalReportSetting {
    public static final TnsSignalReport DEFAULT;
    public static final TnsSignalReportSetting INSTANCE = new TnsSignalReportSetting();
    public static final TnsSignalReport config;

    static {
        TnsSignalReport tnsSignalReport = new TnsSignalReport(0, 0, 60L, 300L);
        DEFAULT = tnsSignalReport;
        config = (TnsSignalReport) SettingsManager.INSTANCE.getValueSafely("live_tns_signal_report_setting", tnsSignalReport);
    }

    public final boolean enable() {
        return config.getEnable() != 0;
    }

    public final boolean forceEnable() {
        return config.getForceEnable() != 0;
    }

    public final long reportInterval() {
        return config.getReportInterval() * 1000;
    }

    public final long reportNewInterval() {
        return config.getReportNewInterval() * 1000;
    }
}
