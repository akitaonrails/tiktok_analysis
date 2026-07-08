package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_rtc_ratio_optimize_audience_cohost")
public final class LinkmicRtcRatioOptimizeAudienceCohost {
    public static final LinkmicRtcRatioOptimizeAudienceCohost INSTANCE = new LinkmicRtcRatioOptimizeAudienceCohost();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_rtc_ratio_optimize_audience_cohost", DEFAULT);
    }

    public static final boolean isEnable() {
        return LinkmicRtcRatioOptimizeAudience.isEnable() && INSTANCE.getValue() > 0;
    }
}
