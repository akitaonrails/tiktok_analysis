package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_sticker_effect_perf_metrics")
public final class LiveEffectPerfMetricsSetting {
    public static final LiveEffectPerfMetricsSetting INSTANCE = new LiveEffectPerfMetricsSetting();
    public static final LiveEffectPerfMetricsParams DEFAULT = new LiveEffectPerfMetricsParams(false, 1);

    private final LiveEffectPerfMetricsParams getSettingParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveEffectPerfMetricsParams liveEffectPerfMetricsParams = DEFAULT;
        LiveEffectPerfMetricsParams liveEffectPerfMetricsParams2 = (LiveEffectPerfMetricsParams) settingsManager.getValueSafely("live_sticker_effect_perf_metrics", liveEffectPerfMetricsParams);
        return liveEffectPerfMetricsParams2 != null ? liveEffectPerfMetricsParams2 : liveEffectPerfMetricsParams;
    }

    public final long getCollectInterval() {
        return getSettingParams().collectInterval;
    }

    public final boolean isEnabled() {
        return getSettingParams().enabled;
    }
}
