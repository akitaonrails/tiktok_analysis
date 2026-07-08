package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_match_core_scenarios_metrics_config")
public final class LiveMatchCoreScenariosMetricsSetting {
    public static final LiveMatchCoreScenariosMetricsSetting INSTANCE = new LiveMatchCoreScenariosMetricsSetting();
    public static final LiveMatchCoreScenariosMetricsConfig DEFAULT = new LiveMatchCoreScenariosMetricsConfig(true, true, true, true, true, true, true);

    private final LiveMatchCoreScenariosMetricsConfig getConfig() {
        LiveMatchCoreScenariosMetricsConfig liveMatchCoreScenariosMetricsConfig = (LiveMatchCoreScenariosMetricsConfig) SettingsManager.INSTANCE.getValueSafely(LiveMatchCoreScenariosMetricsSetting.class);
        return liveMatchCoreScenariosMetricsConfig == null ? DEFAULT : liveMatchCoreScenariosMetricsConfig;
    }

    public final boolean enableBonusTrack() {
        return getConfig().enableTrack && getConfig().enableBonusTrack;
    }

    public final boolean enableComponentTrack() {
        return getConfig().enableTrack && getConfig().enableComponentTrack;
    }

    public final boolean enablePowerupTrack() {
        return getConfig().enableTrack && getConfig().enablePowerupTrack;
    }

    public final boolean enableResultTrack() {
        return getConfig().enableTrack && getConfig().enableResultTrack;
    }

    public final boolean enableScoreTrack() {
        return getConfig().enableTrack && getConfig().enableScoreTrack;
    }

    public final boolean enableTimerTrack() {
        return getConfig().enableTrack && getConfig().enableTimerTrack;
    }

    public final boolean enableTrack() {
        return getConfig().enableTrack;
    }
}
