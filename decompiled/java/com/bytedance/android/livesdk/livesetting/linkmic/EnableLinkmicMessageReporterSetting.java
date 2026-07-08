package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("enable_linkmic_message_reporter")
public final class EnableLinkmicMessageReporterSetting {
    public static final int DEFAULT = 0;
    public static final EnableLinkmicMessageReporterSetting INSTANCE = new EnableLinkmicMessageReporterSetting();
    public static final int REPORT_V1 = 1;
    public static final int REPORT_V2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_linkmic_message_reporter", DEFAULT);
    }

    public final boolean isReportV1() {
        return getValue() == 1;
    }

    public final boolean isReportV2() {
        return getValue() == 2;
    }
}
