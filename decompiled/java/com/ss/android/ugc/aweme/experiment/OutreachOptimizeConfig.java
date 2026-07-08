package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class OutreachOptimizeConfig {

    @C09CT("feature_cache_configs")
    public final List<CacheConfig> cacheConfigs;

    @C09CT("disable_outreach_log")
    public final boolean disableOutreachLog;

    @C09CT("enable_async_init")
    public final boolean enableAsyncInit;

    @C09CT("enable_static_config")
    public final boolean enableStaticConfig;

    @C09CT("opt_delay_scene_init")
    public final boolean optDelaySceneInit;

    @C09CT("opt_thread_pool_size")
    public final int optThreadPoolSize;

    @C09CT("opt_video_play_enable")
    public final boolean optVideoPlayEnable;

    @C09CT("opt_video_play_timer_start_events")
    public final List<String> videoPlayTimerStartEvents;

    @C09CT("opt_video_play_timer_stop_events")
    public final List<String> videoPlayTimerStopEvents;

    public OutreachOptimizeConfig() {
        this(false, false, false, null, 0, false, null, null, false);
    }

    public OutreachOptimizeConfig(boolean z, boolean z2, boolean z3, List<CacheConfig> list, int i, boolean z4, List<String> list2, List<String> list3, boolean z5) {
        this.enableAsyncInit = z;
        this.disableOutreachLog = z2;
        this.enableStaticConfig = z3;
        this.cacheConfigs = list;
        this.optThreadPoolSize = i;
        this.optVideoPlayEnable = z4;
        this.videoPlayTimerStartEvents = list2;
        this.videoPlayTimerStopEvents = list3;
        this.optDelaySceneInit = z5;
    }
}
