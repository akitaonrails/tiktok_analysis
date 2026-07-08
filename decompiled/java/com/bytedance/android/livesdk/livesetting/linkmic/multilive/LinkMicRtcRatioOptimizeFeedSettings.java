package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_rtc_ratio_optimize_feed")
public final class LinkMicRtcRatioOptimizeFeedSettings {
    public static final LinkMicRtcRatioOptimizeFeedSettings INSTANCE = new LinkMicRtcRatioOptimizeFeedSettings();
    public static final Option DEFAULT = new Option();

    public static final Option getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Option option = DEFAULT;
        Option option2 = (Option) settingsManager.getValueSafely("linkmic_rtc_ratio_optimize_feed", option);
        return option2 != null ? option2 : option;
    }

    public static final boolean isEnable() {
        return LinkmicRtcRatioOptimizeAudience.isEnable();
    }
}
