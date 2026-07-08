package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_ai_summary_design_style")
public final class LiveAiSummaryDesignStyleSetting {
    public static final LiveAiSummaryDesignStyleSetting INSTANCE = new LiveAiSummaryDesignStyleSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_ai_summary_design_style", DEFAULT);

    public final boolean style1() {
        return value == 1;
    }

    public final boolean style2() {
        return value == 2;
    }
}
