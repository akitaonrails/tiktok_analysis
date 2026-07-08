package com.bytedance.android.livesdk.performance.memory;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("player_memory_opt_setting")
public final class PlayerMemOptimizeSetting {
    public static final PlayerMemOptimizeSetting INSTANCE = new PlayerMemOptimizeSetting();
    public static final PlayerMemoryCleanConfig DEFAULT = new PlayerMemoryCleanConfig(false, 30000, false, false, 0);

    public static final boolean enableLowMemRestrict() {
        return INSTANCE.getConfig().getLowMemoryRestrict();
    }

    public static final boolean enableSlowMethodOpt() {
        return INSTANCE.getConfig().getOptSlowMethod();
    }

    private final PlayerMemoryCleanConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PlayerMemoryCleanConfig playerMemoryCleanConfig = DEFAULT;
        PlayerMemoryCleanConfig playerMemoryCleanConfig2 = (PlayerMemoryCleanConfig) settingsManager.getValueSafely("player_memory_opt_setting", playerMemoryCleanConfig);
        return playerMemoryCleanConfig2 != null ? playerMemoryCleanConfig2 : playerMemoryCleanConfig;
    }

    public static final long getDelayTimeMs() {
        return INSTANCE.getConfig().getDelayTimeMs();
    }

    public static final int getReleaseType() {
        return INSTANCE.getConfig().getReleaseType();
    }

    public static final boolean isEnable() {
        return INSTANCE.getConfig().isEnabled();
    }
}
