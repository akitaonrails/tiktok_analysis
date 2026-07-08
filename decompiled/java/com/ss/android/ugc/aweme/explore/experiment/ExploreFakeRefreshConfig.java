package com.ss.android.ugc.aweme.explore.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreFakeRefreshConfig {

    @C09CT("is_enable")
    public final boolean enable;

    @C09CT("enable_launch_refresh")
    public final boolean enableLaunchRefresh;

    @C09CT("enable_manual_refresh")
    public final boolean enableManualRefresh;

    @C09CT("enable_save_switching_tab")
    public final boolean enableSaveSwitching;

    @C09CT("expire_time")
    public final long expireTime;

    @C09CT("max_cache_cnt")
    public final int maxCacheCnt;

    @C09CT("valid_model_cnt")
    public final int validModelCnt;

    public ExploreFakeRefreshConfig() {
        this(false, 6, 12, 129600L, true, true, true);
    }

    public ExploreFakeRefreshConfig(boolean z, int i, int i2, long j, boolean z2, boolean z3, boolean z4) {
        this.enable = z;
        this.validModelCnt = i;
        this.maxCacheCnt = i2;
        this.expireTime = j;
        this.enableSaveSwitching = z2;
        this.enableLaunchRefresh = z3;
        this.enableManualRefresh = z4;
    }
}
