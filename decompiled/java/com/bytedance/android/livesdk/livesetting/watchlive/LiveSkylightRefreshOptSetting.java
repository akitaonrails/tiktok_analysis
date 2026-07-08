package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_skylight_refresh_opt")
public final class LiveSkylightRefreshOptSetting {
    public static final LiveSkylightRefreshOptSetting INSTANCE = new LiveSkylightRefreshOptSetting();
    public static final SkylightRefreshConfig DEFAULT = new SkylightRefreshConfig();

    public static final boolean enableFollowAutoRefresh() {
        LiveSkylightRefreshOptSetting liveSkylightRefreshOptSetting = INSTANCE;
        return liveSkylightRefreshOptSetting.config().enableFollowAutoRefresh && liveSkylightRefreshOptSetting.config().intervalFollowSecond > 0;
    }

    public static final boolean enableFollowManualRefresh() {
        return INSTANCE.config().enableFollowManualRefresh;
    }

    public static final boolean enableTopLiveAutoRefresh() {
        LiveSkylightRefreshOptSetting liveSkylightRefreshOptSetting = INSTANCE;
        return liveSkylightRefreshOptSetting.config().enableTopliveAutoRefresh && liveSkylightRefreshOptSetting.config().intervalTopliveSecond > 0;
    }

    public final SkylightRefreshConfig config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SkylightRefreshConfig skylightRefreshConfig = DEFAULT;
        SkylightRefreshConfig skylightRefreshConfig2 = (SkylightRefreshConfig) settingsManager.getValueSafely("live_skylight_refresh_opt", skylightRefreshConfig);
        return skylightRefreshConfig2 != null ? skylightRefreshConfig2 : skylightRefreshConfig;
    }

    public final SkylightRefreshConfig getDEFAULT() {
        return DEFAULT;
    }
}
