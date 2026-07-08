package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_rtc_ratio_optimize_audience")
public final class LinkmicRtcRatioOptimizeAudience {
    public static final LinkmicRtcRatioOptimizeAudience INSTANCE = new LinkmicRtcRatioOptimizeAudience();
    public static final int DEFAULT = 1;

    public static final boolean isEnable() {
        return INSTANCE.getValue() > 0;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_rtc_ratio_optimize_audience", DEFAULT);
    }
}
