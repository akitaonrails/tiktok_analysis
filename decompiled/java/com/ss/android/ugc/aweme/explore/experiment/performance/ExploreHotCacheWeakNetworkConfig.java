package com.ss.android.ugc.aweme.explore.experiment.performance;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes5.dex */
public final class ExploreHotCacheWeakNetworkConfig {

    @C09CT("delay_check_duration")
    public final long delayCheckDuration;

    @C09CT("disable_hot_cache")
    public final boolean disEnableHotCache;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("expire_time")
    public final long expireTime;

    @C09CT("valid_model_cnt")
    public final int validModelCnt;

    @C09CT("weak_network_level")
    public final int weakNetworkLevel;

    public ExploreHotCacheWeakNetworkConfig() {
        this(false, false, 2, 6, 86400L, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public ExploreHotCacheWeakNetworkConfig(boolean z, boolean z2, int i, int i2, long j, long j2) {
        this.enable = z;
        this.disEnableHotCache = z2;
        this.weakNetworkLevel = i;
        this.validModelCnt = i2;
        this.expireTime = j;
        this.delayCheckDuration = j2;
    }
}
