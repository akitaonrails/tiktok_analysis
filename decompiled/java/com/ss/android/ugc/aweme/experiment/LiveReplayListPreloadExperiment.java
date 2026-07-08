package com.ss.android.ugc.aweme.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayListPreloadExperiment {
    public static final LiveReplayListPreloadExperiment INSTANCE = new LiveReplayListPreloadExperiment();
    public static final LiveReplayPreloadConfig DEFAULT = new LiveReplayPreloadConfig();

    private final LiveReplayPreloadConfig value() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveReplayPreloadConfig liveReplayPreloadConfig = DEFAULT;
        LiveReplayPreloadConfig liveReplayPreloadConfig2 = (LiveReplayPreloadConfig) c0c64LJIILLIIL.LJJII(LiveReplayPreloadConfig.class, liveReplayPreloadConfig, "live_replay_preload_opt_config", true);
        return liveReplayPreloadConfig2 != null ? liveReplayPreloadConfig2 : liveReplayPreloadConfig;
    }

    public final long getInterval() {
        return value().interval;
    }

    public final long getTtl() {
        return value().ttl;
    }

    public final boolean isEnable() {
        return value().liveRecordPreloadEnable > 0;
    }

    public final LiveReplayPreloadConfig getDEFAULT() {
        return DEFAULT;
    }
}
