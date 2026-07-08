package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_rtc_ratio_optimize_layout_manager_stream_player")
public final class LinkmicRtcRatioOptimizeLayoutManagerStreamPlayer {
    public static final LinkmicRtcRatioOptimizeLayoutManagerStreamPlayer INSTANCE = new LinkmicRtcRatioOptimizeLayoutManagerStreamPlayer();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_rtc_ratio_optimize_layout_manager_stream_player", DEFAULT);
    }

    public static final boolean isEnable() {
        return LinkmicRtcRatioOptimizeAudience.isEnable() && INSTANCE.getValue() > 0;
    }
}
