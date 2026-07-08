package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "auto_report_switcher")
public final class AutoReportSwitcherSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE = 1;
    public static final AutoReportSwitcherSetting INSTANCE = new AutoReportSwitcherSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("auto_report_switcher", DEFAULT) == 1;
    }
}
