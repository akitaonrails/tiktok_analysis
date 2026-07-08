package com.bytedance.android.livesdk.performance;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("realtime_host_perf_score_settings")
public final class RealtimeHostPerfScoreSettings {
    public static volatile boolean isDisableLog;
    public static final RealtimeHostPerfScoreSettings INSTANCE = new RealtimeHostPerfScoreSettings();
    public static final RealtimeHostPerfScoreConfig DEFAULT = new RealtimeHostPerfScoreConfig(false, false, false, false, 1.0f, null, null, null, null, null, C1697810uHb.LJIILJJIL(Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.8f), Float.valueOf(0.9f)));

    private final RealtimeHostPerfScoreConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RealtimeHostPerfScoreConfig realtimeHostPerfScoreConfig = DEFAULT;
        RealtimeHostPerfScoreConfig realtimeHostPerfScoreConfig2 = (RealtimeHostPerfScoreConfig) settingsManager.getValueSafely("realtime_host_perf_score_settings", realtimeHostPerfScoreConfig);
        return realtimeHostPerfScoreConfig2 != null ? realtimeHostPerfScoreConfig2 : realtimeHostPerfScoreConfig;
    }

    public static final boolean isEnabled() {
        return INSTANCE.getConfig().isEnabled();
    }

    public final PerfItemConfig cpuSpeedConfig() {
        return getConfig().getCpuSpeed();
    }

    public final PerfItemConfig drop3Config() {
        return getConfig().getDrop3();
    }

    public final PerfItemConfig effectRenderTimeConfig() {
        return getConfig().getEffectRenderTime();
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

    public final boolean isDisableLog$liveperformance_api_release() {
        return isDisableLog;
    }

    public final void setDisableLog$liveperformance_api_release(boolean z) {
        isDisableLog = z;
    }
}
