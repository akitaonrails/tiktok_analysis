package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_slardar_uid_report_opt")
public final class LiveSlardarUidReportOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSlardarUidReportOptSetting INSTANCE = new LiveSlardarUidReportOptSetting();

    public final boolean isExp() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_slardar_uid_report_opt", DEFAULT);
    }
}
