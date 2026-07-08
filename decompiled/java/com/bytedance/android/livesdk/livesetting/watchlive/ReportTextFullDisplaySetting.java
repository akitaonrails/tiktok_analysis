package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("report_text_full_display_setting")
public final class ReportTextFullDisplaySetting {
    public static final boolean DEFAULT = true;
    public static final boolean DISABLE = false;
    public static final ReportTextFullDisplaySetting INSTANCE = new ReportTextFullDisplaySetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("report_text_full_display_setting", DEFAULT);
    }
}
