package com.bytedance.android.livesdk.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("live_host_jato_settings")
public final class LiveJatoSetting {
    public static final LiveJatoSetting INSTANCE = new LiveJatoSetting();
    public static final LiveJatoConfig DEFAULT = new LiveJatoConfig(false, false, false, false, false, false, false, false, false, 3, Mp4ScreenVideoLoadTimeout.CONTROL);

    private final LiveJatoConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveJatoConfig liveJatoConfig = DEFAULT;
        LiveJatoConfig liveJatoConfig2 = (LiveJatoConfig) settingsManager.getValueSafely("live_host_jato_settings", liveJatoConfig);
        return liveJatoConfig2 != null ? liveJatoConfig2 : liveJatoConfig;
    }

    public static final long getDebounceIntervalMs() {
        long debounceIntervalMs = INSTANCE.getConfig().getDebounceIntervalMs();
        return debounceIntervalMs < Mp4ScreenVideoLoadTimeout.CONTROL ? Mp4ScreenVideoLoadTimeout.CONTROL : debounceIntervalMs;
    }

    public static final long getDurationMs() {
        int durationSeconds = INSTANCE.getConfig().getDurationSeconds();
        if (durationSeconds < 0) {
            durationSeconds = 0;
        }
        return ((long) durationSeconds) * 1000;
    }

    public static final boolean isBindCoreEnable() {
        return INSTANCE.getConfig().getBindCoreEnable();
    }

    public static final boolean isCpuBoostEnable() {
        return INSTANCE.getConfig().getCpuBoostEnable();
    }

    public static final boolean isEnable() {
        return INSTANCE.getConfig().getEnable();
    }

    public static final boolean isGcEnable() {
        return INSTANCE.getConfig().getGcEnable();
    }

    public static final boolean isJitEnable() {
        return INSTANCE.getConfig().getJitEnable();
    }

    public static final boolean isLivePageEnable() {
        return INSTANCE.getConfig().getLivePageEnable();
    }

    public static final boolean isLivePreviewPageEnable() {
        return INSTANCE.getConfig().getLivePreviewPageEnable();
    }

    public static final boolean isRenderThreadEnable() {
        return INSTANCE.getConfig().getRenderThreadEnable();
    }

    public static final boolean isThreadEnable() {
        return INSTANCE.getConfig().getThreadEnable();
    }
}
