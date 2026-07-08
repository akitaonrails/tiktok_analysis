package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("text_display_hybird_report_setting")
public final class TextDisplayHybirdReportSetting {
    public static final TextDisplayHybirdReportSetting INSTANCE = new TextDisplayHybirdReportSetting();
    public static final int DEFAULT = 1;
    public static final int value = SettingsManager.INSTANCE.getIntValue("text_display_hybird_report_setting", 1);

    public final boolean enable() {
        return value > 0;
    }
}
