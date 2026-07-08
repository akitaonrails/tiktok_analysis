package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_perf_auto_adaptive_setting")
public final class LiveHostPerfAutoAdaptiveSetting {
    public static final LiveHostPerfAutoAdaptiveConfig DEFAULT;
    public static final LiveHostPerfAutoAdaptiveSetting INSTANCE = new LiveHostPerfAutoAdaptiveSetting();
    public static boolean isLiveHost;
    public static final LiveHostPerfAutoAdaptiveConfig value;

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void isLiveHost$annotations() {
    }

    static {
        LiveHostPerfAutoAdaptiveConfig liveHostPerfAutoAdaptiveConfig = new LiveHostPerfAutoAdaptiveConfig();
        DEFAULT = liveHostPerfAutoAdaptiveConfig;
        LiveHostPerfAutoAdaptiveConfig liveHostPerfAutoAdaptiveConfig2 = (LiveHostPerfAutoAdaptiveConfig) SettingsManager.INSTANCE.getValueSafely(LiveHostPerfAutoAdaptiveSetting.class);
        if (liveHostPerfAutoAdaptiveConfig2 != null) {
            liveHostPerfAutoAdaptiveConfig = liveHostPerfAutoAdaptiveConfig2;
        }
        value = liveHostPerfAutoAdaptiveConfig;
    }

    public static final boolean enable() {
        return (value.enable || BroadcastNewStableModeSetting.INSTANCE.getConfig().enable) && isLiveHost;
    }

    public static final LiveHostPerfAutoAdaptiveConfig getValue() {
        return value;
    }

    public static final boolean isLiveHost() {
        return isLiveHost;
    }

    public static final void setLiveHost(boolean z) {
        isLiveHost = z;
    }
}
