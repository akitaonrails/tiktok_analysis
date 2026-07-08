package com.bytedance.android.livesdk.performance.strategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "watch_live_task_reschedule")
public final class WatchLiveDowngradeLegoTaskSettings {
    public static final DowngradeLegoConfig DEFAULT;
    public static final WatchLiveDowngradeLegoTaskSettings INSTANCE = new WatchLiveDowngradeLegoTaskSettings();
    public static final DowngradeLegoConfig config;
    public static final boolean enableDowngrade;

    public static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getEnableDowngrade$annotations() {
    }

    static {
        DowngradeLegoConfig downgradeLegoConfig = new DowngradeLegoConfig();
        DEFAULT = downgradeLegoConfig;
        DowngradeLegoConfig downgradeLegoConfig2 = (DowngradeLegoConfig) SettingsManager.INSTANCE.getValueSafely("watch_live_task_reschedule", downgradeLegoConfig);
        if (downgradeLegoConfig2 != null) {
            downgradeLegoConfig = downgradeLegoConfig2;
        }
        config = downgradeLegoConfig;
        enableDowngrade = downgradeLegoConfig.strategy == 1;
    }

    public static final DowngradeLegoConfig getConfig() {
        return config;
    }

    public static final boolean getEnableDowngrade() {
        return enableDowngrade;
    }
}
