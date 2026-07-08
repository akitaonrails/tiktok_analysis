package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_widget_slardar_report_fix")
public final class LiveWidgetSlardarReportFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveWidgetSlardarReportFixSetting INSTANCE = new LiveWidgetSlardarReportFixSetting();

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_widget_slardar_report_fix", DEFAULT);
    }
}
