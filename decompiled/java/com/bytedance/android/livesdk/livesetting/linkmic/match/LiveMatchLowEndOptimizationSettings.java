package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey("live_match_high_traffic_optimization_strategy")
public final class LiveMatchLowEndOptimizationSettings {
    public static final LiveMatchLowEndOptimizationSettings INSTANCE = new LiveMatchLowEndOptimizationSettings();
    public static final MatchHighTrafficConfig DEFAULT = new MatchHighTrafficConfig(false, true, 0, true, false, false, 300, 500, 450, 1350, 225, 64.5f, 56.0f, 6.0f, 40.0f, 30.0f, 38.0f, 40.0f);

    private final MatchHighTrafficConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MatchHighTrafficConfig matchHighTrafficConfig = DEFAULT;
        MatchHighTrafficConfig matchHighTrafficConfig2 = (MatchHighTrafficConfig) settingsManager.getValueSafely("live_match_high_traffic_optimization_strategy", matchHighTrafficConfig);
        return matchHighTrafficConfig2 != null ? matchHighTrafficConfig2 : matchHighTrafficConfig;
    }

    public final long getArmiesMessageCriticalInterval() {
        return getConfig().armies_message_critical_interval;
    }

    public final long getArmiesMessageSeriousInterval() {
        return getConfig().armies_message_serious_interval;
    }

    public final float getDeviceScoreBoundary() {
        return getConfig().battle_start_animation_device_score_boundary;
    }

    public final float getFpsLevelCriticalBoundary() {
        return getConfig().fps_level_critical_boundary;
    }

    public final float getFpsLevelSeriousBoundary() {
        return getConfig().fps_level_serious_boundary;
    }

    public final long getHammerCriticalInterval() {
        return getConfig().hammer_critical_interval;
    }

    public final long getHammerNormalInterval() {
        return getConfig().hammer_normal_interval;
    }

    public final long getHammerSeriousInterval() {
        return getConfig().hammer_serious_interval;
    }

    public final boolean getScoreMessageFrequencyControl() {
        return getConfig().score_message_frequececy_control;
    }

    public final float getScoreSystemCriticalBoundary() {
        return getConfig().score_system_critical_boundary;
    }

    public final float getScoreSystemSeriousBoundary() {
        return getConfig().score_system_serious_boundary;
    }

    public final float getTempLevelCriticalBoundary() {
        return getConfig().temperature_level_critical_boundary;
    }

    public final float getTempLevelSeriousBoundary() {
        return getConfig().temperature_level_serious_boundary;
    }

    public final int getTriggerType() {
        return getConfig().trigger_method;
    }

    public final boolean isCpuBoostEnabled() {
        return getConfig().cpu_boost;
    }

    public final boolean isEnabled() {
        return getConfig().enabled;
    }

    public final boolean isExtraBufferEnabled() {
        return getConfig().extraBuffer;
    }

    public final boolean isPowerUpRequestLayoutEnabled() {
        return getConfig().is_power_up_request_layout_enabled;
    }
}
