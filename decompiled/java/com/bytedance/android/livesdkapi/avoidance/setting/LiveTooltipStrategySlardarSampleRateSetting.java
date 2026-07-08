package com.bytedance.android.livesdkapi.avoidance.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_tooltip_strategy_slardar_sample_rate")
public final class LiveTooltipStrategySlardarSampleRateSetting {
    public static final double DEFAULT = 0.0d;
    public static final LiveTooltipStrategySlardarSampleRateSetting INSTANCE = new LiveTooltipStrategySlardarSampleRateSetting();

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_tooltip_strategy_slardar_sample_rate", DEFAULT);
    }
}
