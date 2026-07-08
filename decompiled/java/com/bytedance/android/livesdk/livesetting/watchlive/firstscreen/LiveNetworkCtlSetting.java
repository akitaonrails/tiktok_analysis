package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_net_ctl_config")
public final class LiveNetworkCtlSetting {
    public static final LiveNetworkControlConfig DEFAULT;
    public static final LiveNetworkCtlSetting INSTANCE = new LiveNetworkCtlSetting();
    public static final LiveNetworkControlConfig value;

    static {
        LiveNetworkControlConfig liveNetworkControlConfig = new LiveNetworkControlConfig(false, null, null, null, null, null, null, 0L);
        DEFAULT = liveNetworkControlConfig;
        value = liveNetworkControlConfig;
    }

    public final long getDelayMs() {
        Long l = value.delayReleaseTimeMs;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final boolean isEnable() {
        return value.enabled;
    }

    public final LiveNetworkControlConfig getConfig() {
        return value;
    }
}
