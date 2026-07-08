package com.ss.android.ugc.aweme.coldcache.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class LoadMoreIntoCacheStrategyConfig {

    @C09CT("cache_size_weight")
    public final int cacheSizeWeight;

    @C09CT("content_duration_weight")
    public final int contentDurationWeight;

    @C09CT("enable_refactor")
    public final boolean enableRefactor;

    @C09CT("index_weight")
    public final int indexWeight;

    @C09CT("rec_finish_weight")
    public final int recFinishWeight;

    @C09CT("resolution_weight")
    public final int resolutionWeight;

    @C09CT("sorted_after_picked")
    public final boolean sortedAfterPicked;

    @C09CT("time_liness_weight")
    public final int timeLinessWeight;

    @C09CT("use_similarity_sort")
    public final boolean useSimilaritySort;

    public LoadMoreIntoCacheStrategyConfig() {
        this(false, false, false, 0, 0, 0, 0, 0, 0);
    }

    public LoadMoreIntoCacheStrategyConfig(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6) {
        this.enableRefactor = z;
        this.useSimilaritySort = z2;
        this.sortedAfterPicked = z3;
        this.recFinishWeight = i;
        this.indexWeight = i2;
        this.timeLinessWeight = i3;
        this.contentDurationWeight = i4;
        this.cacheSizeWeight = i5;
        this.resolutionWeight = i6;
    }
}
