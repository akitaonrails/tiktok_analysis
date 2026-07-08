package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_log_report_opt")
public final class TTLHEnableLogReportOptSettings {
    public static final TTLHEnableLogReportOptSettings INSTANCE = new TTLHEnableLogReportOptSettings();
    public static final boolean DEFAULT = true;

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_enable_log_report_opt", DEFAULT);
    }
}
