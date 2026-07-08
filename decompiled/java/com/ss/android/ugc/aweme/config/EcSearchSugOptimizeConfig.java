package com.ss.android.ugc.aweme.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchSugOptimizeConfig {

    @C09CT("enable_rich_sug_image_async")
    public final boolean enableAsyncImage;

    @C09CT("enable_sug_cache_more_time")
    public final boolean enableCacheMoreTime;

    @C09CT("enable_sug_preload_view_holder")
    public final boolean enablePreloadViewHolder;

    @C09CT("enable_sug_cache_with_single_word")
    public final boolean enableSugCacheBaseWord;

    @C09CT("enable_sug_skeleton")
    public final boolean enableSugSkeleton;

    public EcSearchSugOptimizeConfig() {
        this(false, false, false, false, false);
    }

    public EcSearchSugOptimizeConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enablePreloadViewHolder = z;
        this.enableSugCacheBaseWord = z2;
        this.enableAsyncImage = z3;
        this.enableCacheMoreTime = z4;
        this.enableSugSkeleton = z5;
    }
}
