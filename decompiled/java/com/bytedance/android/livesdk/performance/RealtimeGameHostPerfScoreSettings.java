package com.bytedance.android.livesdk.performance;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("realtime_game_host_perf_score_settings")
public final class RealtimeGameHostPerfScoreSettings {
    public static final RealtimeGameHostPerfScoreSettings INSTANCE = new RealtimeGameHostPerfScoreSettings();
    public static final RealtimeGameHostPerfScoreConfig DEFAULT = new RealtimeGameHostPerfScoreConfig(false, 1.0f, null, null, null, null, null, C1697810uHb.LJIILJJIL(Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.8f), Float.valueOf(0.9f)));

    private final RealtimeGameHostPerfScoreConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RealtimeGameHostPerfScoreConfig realtimeGameHostPerfScoreConfig = DEFAULT;
        RealtimeGameHostPerfScoreConfig realtimeGameHostPerfScoreConfig2 = (RealtimeGameHostPerfScoreConfig) settingsManager.getValueSafely("realtime_game_host_perf_score_settings", realtimeGameHostPerfScoreConfig);
        return realtimeGameHostPerfScoreConfig2 != null ? realtimeGameHostPerfScoreConfig2 : realtimeGameHostPerfScoreConfig;
    }

    public static final boolean isEnabled() {
        return INSTANCE.getConfig().isEnabled();
    }

    public final PerfItemConfig cpuSpeedConfig() {
        return getConfig().getCpuSpeed();
    }

    public final List<Float> levelConfig() {
        List<Float> levelConfig = getConfig().getLevelConfig();
        return levelConfig == null ? C1697810uHb.LJIIJJI(Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.8f), Float.valueOf(0.9f)) : levelConfig;
    }

    public final float maxScore() {
        return getConfig().getMaxScore();
    }

    public final PerfItemConfig temperatureConfig() {
        return getConfig().getBatteryTemperature();
    }

    public final PerfItemConfig videoDropFrameConfig() {
        return getConfig().getVideoDropFrame();
    }
}
