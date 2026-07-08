package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_skylight_cold_start_opt")
public final class LiveSkylightColdStartOptSetting {
    public static final LiveSkylightColdStartOptSetting INSTANCE = new LiveSkylightColdStartOptSetting();
    public static final SkylightColdStartConfig DEFAULT = new SkylightColdStartConfig();

    public static final boolean enableFollowColdPrefetch() {
        return INSTANCE.config().enableFollowColdPrefetch;
    }

    public static final boolean enableInboxColdPrefetch() {
        return INSTANCE.config().enableInboxColdPrefetch;
    }

    public static final boolean enableLocalCache() {
        return INSTANCE.config().enableLocalCache;
    }

    public static final boolean enableUpdateBothWay() {
        return INSTANCE.config().enableUpdateBothWay;
    }

    public static final int getExtraPollingFetchCount() {
        return INSTANCE.config().extraPollingFetchCount;
    }

    public static final long getFollowExpireTime() {
        return INSTANCE.config().followColdPrefetchExpireTime;
    }

    public static final int getGlobalFetchDelayTime() {
        return INSTANCE.config().globalFetchDelayTime;
    }

    public static final long getGlobalFetchInterval() {
        return INSTANCE.config().intervalGlobalFetchSecond;
    }

    public static final boolean getGlobalFetchStartAdvance() {
        return INSTANCE.config().globalFetchStartAdvance;
    }

    public static final int getGlobalFetchStrategy() {
        return INSTANCE.config().globalFetchStrategy;
    }

    public static final long getInboxExpireTime() {
        return INSTANCE.config().inboxColdPrefetchExpireTime;
    }

    public static final long getLocalCacheExpireTime() {
        return INSTANCE.config().localCacheExpireTime;
    }

    public static final int getLocalCacheSize() {
        return INSTANCE.config().localCacheSize;
    }

    public final SkylightColdStartConfig config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SkylightColdStartConfig skylightColdStartConfig = DEFAULT;
        SkylightColdStartConfig skylightColdStartConfig2 = (SkylightColdStartConfig) settingsManager.getValueSafely("live_skylight_cold_start_opt", skylightColdStartConfig);
        return skylightColdStartConfig2 != null ? skylightColdStartConfig2 : skylightColdStartConfig;
    }

    public final SkylightColdStartConfig getDEFAULT() {
        return DEFAULT;
    }
}
