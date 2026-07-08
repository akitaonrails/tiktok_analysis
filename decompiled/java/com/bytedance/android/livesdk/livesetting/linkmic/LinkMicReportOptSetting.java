package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_report_opt")
public final class LinkMicReportOptSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicReportOptSetting INSTANCE = new LinkMicReportOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_report_opt", DEFAULT);
    }
}
