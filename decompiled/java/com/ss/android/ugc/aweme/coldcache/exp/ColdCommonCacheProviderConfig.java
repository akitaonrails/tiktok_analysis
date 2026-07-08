package com.ss.android.ugc.aweme.coldcache.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class ColdCommonCacheProviderConfig {

    @C09CT("allow_cold_cache_use_offline_mode_with_net")
    public final boolean allowColdCacheUseOfflineModeWithNet;

    @C09CT("cold_cache_use_offline_mode")
    public final boolean coldCacheUseOfflineMode;

    @C09CT("cold_use_golden_cache")
    public final boolean coldUseGoldenCache;

    @C09CT("enable_cold_provider")
    public final boolean enableColdProvider;

    @C09CT("enable_unconsumed_provider")
    public final boolean enableUnConsumedProvider;

    @C09CT("golden_use_eliminate_cold_cache")
    public final boolean goldenUseEliminateColdCache;

    @C09CT("merge_provider_remind_size_for_cold")
    public final int mergeProviderRemindSizeForCold;

    @C09CT("merge_provider_size_align_online")
    public final boolean mergeProviderSizeAlignOnline;

    @C09CT("play_lag_use_local_cache")
    public final int playLagUseLocalCache;

    @C09CT("remain_golden_num")
    public final int remainGoldenNum;

    @C09CT("supply_when_golden_lack_size")
    public final int supplyWhenGoldenLackSize;

    @C09CT("unconsumed_provider_need_check_cache")
    public final boolean unconsumedProviderNeedCheckCache;

    public ColdCommonCacheProviderConfig() {
        this(false, false, false, 0, false, 2, false, false, false, 0, false, 0);
    }

    public ColdCommonCacheProviderConfig(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6, boolean z7, int i3, boolean z8, int i4) {
        this.enableColdProvider = z;
        this.enableUnConsumedProvider = z2;
        this.coldUseGoldenCache = z3;
        this.playLagUseLocalCache = i;
        this.goldenUseEliminateColdCache = z4;
        this.remainGoldenNum = i2;
        this.coldCacheUseOfflineMode = z5;
        this.allowColdCacheUseOfflineModeWithNet = z6;
        this.unconsumedProviderNeedCheckCache = z7;
        this.supplyWhenGoldenLackSize = i3;
        this.mergeProviderSizeAlignOnline = z8;
        this.mergeProviderRemindSizeForCold = i4;
    }
}
