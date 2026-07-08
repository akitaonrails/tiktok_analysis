package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_main_framework_update_top_one_line_profile_log_report")
public final class LiveMainFrameworkUpdateTopOneLineProfileLogReportSetting {
    public static final LiveMainFrameworkUpdateTopOneLineProfileLogReportSetting INSTANCE = new LiveMainFrameworkUpdateTopOneLineProfileLogReportSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_main_framework_update_top_one_line_profile_log_report", DEFAULT);

    public final boolean enableReport() {
        return value;
    }
}
