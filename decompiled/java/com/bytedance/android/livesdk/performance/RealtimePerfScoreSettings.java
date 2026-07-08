package com.bytedance.android.livesdk.performance;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("realtime_perf_score_settings")
public final class RealtimePerfScoreSettings {
    public static volatile boolean isDisableLog;
    public static final RealtimePerfScoreSettings INSTANCE = new RealtimePerfScoreSettings();
    public static final RealtimePerfScoreConfig DEFAULT = new RealtimePerfScoreConfig(false, false, false, false, 1.0f, null, null, null, null, null, C1697810uHb.LJIILJJIL(Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.8f), Float.valueOf(0.9f)));

    private final RealtimePerfScoreConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RealtimePerfScoreConfig realtimePerfScoreConfig = DEFAULT;
        RealtimePerfScoreConfig realtimePerfScoreConfig2 = (RealtimePerfScoreConfig) settingsManager.getValueSafely("realtime_perf_score_settings", realtimePerfScoreConfig);
        return realtimePerfScoreConfig2 != null ? realtimePerfScoreConfig2 : realtimePerfScoreConfig;
    }

    public static final boolean isEnabled() {
        return INSTANCE.getConfig().isEnabled();
    }

    public static final boolean isUploadServer() {
        return INSTANCE.getConfig().isUploadServer();
    }

    public final PerfItemConfig cpuRateConfig() {
        return getConfig().getCpuRate();
    }

    public final PerfItemConfig cpuSpeedConfig() {
        return getConfig().getCpuSpeed();
    }

    public final PerfItemConfig drop3Config() {
        return getConfig().getDrop3();
    }

    public final PerfItemConfig fpsConfig() {
        return getConfig().getFps();
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

    public final boolean useOtisCpuRate() {
        return getConfig().getUseOtisCpuRate();
    }

    public final boolean useOtisCpuSpeed() {
        return getConfig().getUseOtisCpuSpeed();
    }

    public final boolean isDisableLog$liveperformance_api_release() {
        return isDisableLog;
    }

    public final void setDisableLog$liveperformance_api_release(boolean z) {
        isDisableLog = z;
    }
}
