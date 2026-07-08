package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("max_tns_piracy_report_data_size")
public final class MaxTnsPiracyReportDataSize {
    public static final int DEFAULT = 600;
    public static final MaxTnsPiracyReportDataSize INSTANCE = new MaxTnsPiracyReportDataSize();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("max_tns_piracy_report_data_size", DEFAULT);
    }
}
