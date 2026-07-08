package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_downgrade_lego_strategy_settings")
public final class LiveHostDowngradeLegoTaskSettings {
    public static final DowngradeLegoConfig DEFAULT;
    public static final LiveHostDowngradeLegoTaskSettings INSTANCE = new LiveHostDowngradeLegoTaskSettings();
    public static final DowngradeLegoConfig config;
    public static final boolean downgradeAllTypes;
    public static final boolean downgradeOnlyVideoType;

    public static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getDowngradeAllTypes$annotations() {
    }

    public static /* synthetic */ void getDowngradeOnlyVideoType$annotations() {
    }

    static {
        DowngradeLegoConfig downgradeLegoConfig = new DowngradeLegoConfig();
        DEFAULT = downgradeLegoConfig;
        DowngradeLegoConfig downgradeLegoConfig2 = (DowngradeLegoConfig) SettingsManager.INSTANCE.getValueSafely("live_host_downgrade_lego_strategy_settings", downgradeLegoConfig);
        if (downgradeLegoConfig2 != null) {
            downgradeLegoConfig = downgradeLegoConfig2;
        }
        config = downgradeLegoConfig;
        int i = downgradeLegoConfig.strategy;
        downgradeOnlyVideoType = i == 1;
        downgradeAllTypes = i == 2;
    }

    public static final DowngradeLegoConfig getConfig() {
        return config;
    }

    public static final boolean getDowngradeAllTypes() {
        return downgradeAllTypes;
    }

    public static final boolean getDowngradeOnlyVideoType() {
        return downgradeOnlyVideoType;
    }
}
