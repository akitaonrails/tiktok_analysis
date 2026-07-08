package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_sequential_event_report_conf")
public final class LinkmicSequentialEventReportSetting {
    public static final LinkmicSequentialEventReportSetting INSTANCE = new LinkmicSequentialEventReportSetting();
    public static final LinkmicSequentialEventReportConf DEFAULT = new LinkmicSequentialEventReportConf(false, 300000, 2048, 300000, Long.MAX_VALUE, 0);

    public final LinkmicSequentialEventReportConf getValue() {
        LinkmicSequentialEventReportConf linkmicSequentialEventReportConf = (LinkmicSequentialEventReportConf) SettingsManager.INSTANCE.getValueSafely(LinkmicSequentialEventReportSetting.class);
        return linkmicSequentialEventReportConf == null ? DEFAULT : linkmicSequentialEventReportConf;
    }
}
