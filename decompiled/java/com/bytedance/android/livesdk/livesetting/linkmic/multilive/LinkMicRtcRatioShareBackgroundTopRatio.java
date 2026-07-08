package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_rtc_ratio_bg_top_ratio")
public final class LinkMicRtcRatioShareBackgroundTopRatio {
    public static final LinkMicRtcRatioShareBackgroundTopRatio INSTANCE = new LinkMicRtcRatioShareBackgroundTopRatio();
    public static final double DEFAULT = 0.3d;

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("linkmic_rtc_ratio_bg_top_ratio", DEFAULT);
    }
}
