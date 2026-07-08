package com.bytedance.android.livesdk.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("broadcast_perf_score_setting_new")
public final class BroadcastPerfScoreSetting {
    public static final BroadcastPerfScoreSetting INSTANCE = new BroadcastPerfScoreSetting();
    public static final Option DEFAULT = new Option(false, false, false, false, false);

    public static final boolean enableAdaptiveOverallScore() {
        return INSTANCE.getOption().autoAdaptiveOverallScore;
    }

    public static final boolean enableAdaptiveThermalScore() {
        return INSTANCE.getOption().autoAdaptiveThermalScore;
    }

    public static final boolean enableEffectAdaptiveOverallScore() {
        return INSTANCE.getOption().effectAdaptiveOverallScore;
    }

    public static final boolean enableSpeedTestOverallScore() {
        return INSTANCE.getOption().speedTestOverallScore;
    }

    public static final boolean enableSpeedTestThermalScore() {
        return INSTANCE.getOption().speedTestThermalScore;
    }

    private final Option getOption() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Option option = DEFAULT;
        Option option2 = (Option) settingsManager.getValueSafely("broadcast_perf_score_setting_new", option);
        return option2 != null ? option2 : option;
    }
}
