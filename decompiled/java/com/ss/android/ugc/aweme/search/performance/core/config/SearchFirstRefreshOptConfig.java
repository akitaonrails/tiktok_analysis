package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchFirstRefreshOptConfig {

    @C09CT("await_optimize")
    public final boolean enableAwaitOptimize;

    @C09CT("chunk_method_optimize")
    public final boolean enableChunkMethodOptimize;

    @C09CT("forecast_optimize")
    public final boolean enableForecastOptimize;

    @C09CT("jato_optimize")
    public final boolean enableJatoOptimize;

    @C09CT("pre_request_optimize")
    public final boolean enablePreRequestNotFirst;

    @C09CT("research_item_pre_create")
    public final boolean enableResearchItemPreCreate;

    @C09CT("update_aweme_optimize")
    public final boolean enableUpdateAwemeOptimize;

    @C09CT("video_layout_pre_inflate")
    public final boolean enableVideoLayoutPreInflate;

    public SearchFirstRefreshOptConfig() {
        this(false, false, false, false, false, false, false, false);
    }

    public SearchFirstRefreshOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.enableVideoLayoutPreInflate = z;
        this.enableResearchItemPreCreate = z2;
        this.enableChunkMethodOptimize = z3;
        this.enableUpdateAwemeOptimize = z4;
        this.enableJatoOptimize = z5;
        this.enablePreRequestNotFirst = z6;
        this.enableAwaitOptimize = z7;
        this.enableForecastOptimize = z8;
    }
}
