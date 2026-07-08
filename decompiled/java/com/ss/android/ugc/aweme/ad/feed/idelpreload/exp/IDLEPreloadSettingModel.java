package com.ss.android.ugc.aweme.ad.feed.idelpreload.exp;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class IDLEPreloadSettingModel {

    @C09CT("submit_delay_time_on_page_scroll")
    public final long delayTimeOnPageScroll;

    @C09CT("enable_idle_preload")
    public final boolean enableIdlePreload;

    @C09CT("failed_strategy_type")
    public final int failedStrategyType;

    @C09CT("idle_preload_feature_list")
    public final List<IdlePreloadFeatureConfig> featureConfig;

    @C09CT("idle_check_polling_interval")
    public final long idleCheckPollingInterval;

    @C09CT("idle_check_polling_success_rounds")
    public final int idleCheckPollingSuccessRounds;

    @C09CT("max_feature_score")
    public final double maxFeatureScore;

    @C09CT("idle_preload_format_list")
    public final List<String> preloadStyleList;

    @C09CT("stop_delay_time_after_complete")
    public final long stopDelayTimeAfterCompleteJob;

    public IDLEPreloadSettingModel() {
        this(false, null, 9999.0d, 2500L, 2, Mp4ScreenVideoLoadTimeout.CONTROL, 0, null, 200L);
    }

    public IDLEPreloadSettingModel(boolean z, List<String> list, double d, long j, int i, long j2, int i2, List<IdlePreloadFeatureConfig> list2, long j3) {
        this.enableIdlePreload = z;
        this.preloadStyleList = list;
        this.maxFeatureScore = d;
        this.idleCheckPollingInterval = j;
        this.idleCheckPollingSuccessRounds = i;
        this.stopDelayTimeAfterCompleteJob = j2;
        this.failedStrategyType = i2;
        this.featureConfig = list2;
        this.delayTimeOnPageScroll = j3;
    }
}
