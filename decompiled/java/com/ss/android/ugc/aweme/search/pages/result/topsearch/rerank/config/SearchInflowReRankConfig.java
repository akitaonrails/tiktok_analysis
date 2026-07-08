package com.ss.android.ugc.aweme.search.pages.result.topsearch.rerank.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInflowReRankConfig {

    @C09CT("enable_debug")
    public final int enableDebug;

    @C09CT("enable_inflow_rerank")
    public final int enableInflowReRank;

    @C09CT("rerank_position")
    public final int reRankPosition;

    @C09CT("rerank_timing")
    public final int reRankTiming;

    @C09CT("rerank_type")
    public final int reRankType;

    public SearchInflowReRankConfig() {
        this(0, 1, 1, 1, 0);
    }

    public SearchInflowReRankConfig(int i, int i2, int i3, int i4, int i5) {
        this.enableInflowReRank = i;
        this.reRankTiming = i2;
        this.reRankType = i3;
        this.reRankPosition = i4;
        this.enableDebug = i5;
    }
}
