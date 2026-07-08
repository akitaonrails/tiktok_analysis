package com.ss.android.ugc.aweme.localcache.exp;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes10.dex */
public final class LoadMoreIntoCacheRefactorConfig {

    @C09CT("background_delay_ms")
    public final int backgroundDelayMs;

    @C09CT("check_cache_least_value")
    public final int checkCacheLeastValue;

    @C09CT("check_video_cache_in_advance")
    public final boolean checkVideoCacheInAdvance;

    @C09CT("cold_cache_max_pool")
    public final int coldCacheMaxPool;

    @C09CT("cold_cache_step_size")
    public final int coldCacheStepSize;

    @C09CT("copy_out")
    public final boolean copyOut;

    @C09CT("enable_refactor")
    public final boolean enableRefactor;

    @C09CT("enable_report")
    public final boolean enableReport;

    @C09CT("exhausted_trigger")
    public final boolean exhaustedTrigger;

    @C09CT("filter_dash_strictly")
    public boolean filterDashStrictly;

    @C09CT("filter_mp3")
    public boolean filterMp3;

    @C09CT("filter_not_cache")
    public final boolean filterNotCache;

    @C09CT("include_bytevc2")
    public final boolean includeByteVC2;

    @C09CT("no_using_json_type")
    public final boolean noUsingJSONType;

    @C09CT("opt_select_process")
    public final boolean optSelectProcess;

    @C09CT("preload_size")
    public final int preloadSize;

    @C09CT("replenish_num_each_brush")
    public final int replenishNumEachBrush;

    @C09CT("support_show_two")
    public final boolean supportShowTwo;

    @C09CT("use_need_check_cache")
    public final boolean useNeedCheckCache;

    @C09CT("using_unconsumed_firstly")
    public final boolean usingUnconsumedFirstly;

    public LoadMoreIntoCacheRefactorConfig() {
        this(true, false, false, false, false, false, 0, 0, 1, 0, false, false, false, false, false, false, -1, false, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoreIntoCacheRefactorConfig)) {
            return false;
        }
        LoadMoreIntoCacheRefactorConfig loadMoreIntoCacheRefactorConfig = (LoadMoreIntoCacheRefactorConfig) obj;
        return this.enableRefactor == loadMoreIntoCacheRefactorConfig.enableRefactor && this.filterNotCache == loadMoreIntoCacheRefactorConfig.filterNotCache && this.includeByteVC2 == loadMoreIntoCacheRefactorConfig.includeByteVC2 && this.filterMp3 == loadMoreIntoCacheRefactorConfig.filterMp3 && this.filterDashStrictly == loadMoreIntoCacheRefactorConfig.filterDashStrictly && this.exhaustedTrigger == loadMoreIntoCacheRefactorConfig.exhaustedTrigger && this.coldCacheMaxPool == loadMoreIntoCacheRefactorConfig.coldCacheMaxPool && this.coldCacheStepSize == loadMoreIntoCacheRefactorConfig.coldCacheStepSize && this.replenishNumEachBrush == loadMoreIntoCacheRefactorConfig.replenishNumEachBrush && this.preloadSize == loadMoreIntoCacheRefactorConfig.preloadSize && this.optSelectProcess == loadMoreIntoCacheRefactorConfig.optSelectProcess && this.useNeedCheckCache == loadMoreIntoCacheRefactorConfig.useNeedCheckCache && this.checkVideoCacheInAdvance == loadMoreIntoCacheRefactorConfig.checkVideoCacheInAdvance && this.enableReport == loadMoreIntoCacheRefactorConfig.enableReport && this.copyOut == loadMoreIntoCacheRefactorConfig.copyOut && this.supportShowTwo == loadMoreIntoCacheRefactorConfig.supportShowTwo && this.checkCacheLeastValue == loadMoreIntoCacheRefactorConfig.checkCacheLeastValue && this.noUsingJSONType == loadMoreIntoCacheRefactorConfig.noUsingJSONType && this.backgroundDelayMs == loadMoreIntoCacheRefactorConfig.backgroundDelayMs && this.usingUnconsumedFirstly == loadMoreIntoCacheRefactorConfig.usingUnconsumedFirstly;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((C786410Ut5.Z2(this.enableRefactor) * 31) + C786410Ut5.Z2(this.filterNotCache)) * 31) + C786410Ut5.Z2(this.includeByteVC2)) * 31) + C786410Ut5.Z2(this.filterMp3)) * 31) + C786410Ut5.Z2(this.filterDashStrictly)) * 31) + C786410Ut5.Z2(this.exhaustedTrigger)) * 31) + this.coldCacheMaxPool) * 31) + this.coldCacheStepSize) * 31) + this.replenishNumEachBrush) * 31) + this.preloadSize) * 31) + C786410Ut5.Z2(this.optSelectProcess)) * 31) + C786410Ut5.Z2(this.useNeedCheckCache)) * 31) + C786410Ut5.Z2(this.checkVideoCacheInAdvance)) * 31) + C786410Ut5.Z2(this.enableReport)) * 31) + C786410Ut5.Z2(this.copyOut)) * 31) + C786410Ut5.Z2(this.supportShowTwo)) * 31) + this.checkCacheLeastValue) * 31) + C786410Ut5.Z2(this.noUsingJSONType)) * 31) + this.backgroundDelayMs) * 31) + C786410Ut5.Z2(this.usingUnconsumedFirstly);
    }

    public final String toString() {
        return "LoadMoreIntoCacheRefactorConfig(enableRefactor=" + this.enableRefactor + ", filterNotCache=" + this.filterNotCache + ", includeByteVC2=" + this.includeByteVC2 + ", filterMp3=" + this.filterMp3 + ", filterDashStrictly=" + this.filterDashStrictly + ", exhaustedTrigger=" + this.exhaustedTrigger + ", coldCacheMaxPool=" + this.coldCacheMaxPool + ", coldCacheStepSize=" + this.coldCacheStepSize + ", replenishNumEachBrush=" + this.replenishNumEachBrush + ", preloadSize=" + this.preloadSize + ", optSelectProcess=" + this.optSelectProcess + ", useNeedCheckCache=" + this.useNeedCheckCache + ", checkVideoCacheInAdvance=" + this.checkVideoCacheInAdvance + ", enableReport=" + this.enableReport + ", copyOut=" + this.copyOut + ", supportShowTwo=" + this.supportShowTwo + ", checkCacheLeastValue=" + this.checkCacheLeastValue + ", noUsingJSONType=" + this.noUsingJSONType + ", backgroundDelayMs=" + this.backgroundDelayMs + ", usingUnconsumedFirstly=" + this.usingUnconsumedFirstly + ')';
    }

    public LoadMoreIntoCacheRefactorConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, int i3, int i4, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i5, boolean z13, int i6, boolean z14) {
        this.enableRefactor = z;
        this.filterNotCache = z2;
        this.includeByteVC2 = z3;
        this.filterMp3 = z4;
        this.filterDashStrictly = z5;
        this.exhaustedTrigger = z6;
        this.coldCacheMaxPool = i;
        this.coldCacheStepSize = i2;
        this.replenishNumEachBrush = i3;
        this.preloadSize = i4;
        this.optSelectProcess = z7;
        this.useNeedCheckCache = z8;
        this.checkVideoCacheInAdvance = z9;
        this.enableReport = z10;
        this.copyOut = z11;
        this.supportShowTwo = z12;
        this.checkCacheLeastValue = i5;
        this.noUsingJSONType = z13;
        this.backgroundDelayMs = i6;
        this.usingUnconsumedFirstly = z14;
    }
}
