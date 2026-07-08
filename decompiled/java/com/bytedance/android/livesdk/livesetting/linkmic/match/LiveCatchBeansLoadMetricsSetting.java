package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_catch_beans_load_metrics_config")
public final class LiveCatchBeansLoadMetricsSetting {
    public static final LiveCatchBeansLoadMetricsSetting INSTANCE = new LiveCatchBeansLoadMetricsSetting();
    public static final LiveCatchBeansLoadMetricsConfig DEFAULT = new LiveCatchBeansLoadMetricsConfig(false, 0.8f);

    public final LiveCatchBeansLoadMetricsConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveCatchBeansLoadMetricsConfig liveCatchBeansLoadMetricsConfig = DEFAULT;
        LiveCatchBeansLoadMetricsConfig liveCatchBeansLoadMetricsConfig2 = (LiveCatchBeansLoadMetricsConfig) settingsManager.getValueSafely("live_catch_beans_load_metrics_config", liveCatchBeansLoadMetricsConfig);
        return liveCatchBeansLoadMetricsConfig2 != null ? liveCatchBeansLoadMetricsConfig2 : liveCatchBeansLoadMetricsConfig;
    }
}
