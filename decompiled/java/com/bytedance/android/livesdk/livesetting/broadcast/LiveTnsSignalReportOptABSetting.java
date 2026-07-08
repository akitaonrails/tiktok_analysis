package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = true, value = "anchor_tns_signal_report_opt")
public final class LiveTnsSignalReportOptABSetting {
    public static final int DEFAULT = 0;
    public static final LiveTnsSignalReportOptABSetting INSTANCE = new LiveTnsSignalReportOptABSetting();

    public final boolean isLibOne() {
        return SettingsManager.INSTANCE.getIntValue("anchor_tns_signal_report_opt", DEFAULT) == 1;
    }

    public final boolean isMatch() {
        return isLibOne();
    }
}
