package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_rtc_ratio_optimize_full_canvas_config_id")
public final class LinkmicRtcRatioOptimizeFullCanvasConfigId {
    public static final LinkmicRtcRatioOptimizeFullCanvasConfigId INSTANCE = new LinkmicRtcRatioOptimizeFullCanvasConfigId();
    public static final String[] DEFAULT = {"layout_linkmic_float_full"};

    public static final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("linkmic_rtc_ratio_optimize_full_canvas_config_id", DEFAULT);
    }
}
