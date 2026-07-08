package com.bytedance.android.livesdk.performance.power;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("watch_refresh_rate_setting")
public final class WatchRefreshRateSetting {
    public static final WatchRefreshRateSetting INSTANCE = new WatchRefreshRateSetting();
    public static final RefreshRateConfig DEFAULT = new RefreshRateConfig(false, 30.0f, 20.0f);

    public static final float getBatteryThreshold() {
        return INSTANCE.getConfig().getLowBatteryThreshold();
    }

    private final RefreshRateConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RefreshRateConfig refreshRateConfig = DEFAULT;
        RefreshRateConfig refreshRateConfig2 = (RefreshRateConfig) settingsManager.getValueSafely("watch_refresh_rate_setting", refreshRateConfig);
        return refreshRateConfig2 != null ? refreshRateConfig2 : refreshRateConfig;
    }

    public static final float getTemperatureThreshold() {
        return INSTANCE.getConfig().getHighTempThreshold();
    }

    public static final boolean isEnable() {
        return INSTANCE.getConfig().isEnabled();
    }
}
