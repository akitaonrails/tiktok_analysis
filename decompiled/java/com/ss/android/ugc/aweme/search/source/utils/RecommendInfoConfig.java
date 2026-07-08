package com.ss.android.ugc.aweme.search.source.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class RecommendInfoConfig {

    @C09CT("max_gid_count")
    public final int maxGidCount;

    @C09CT("max_query_count")
    public final int maxQueryCount;

    @C09CT("reporting_time_span_minutes")
    public final int reportingTime;

    public RecommendInfoConfig() {
        this(3, 3, 10);
    }

    public RecommendInfoConfig(int i, int i2, int i3) {
        this.maxGidCount = i;
        this.maxQueryCount = i2;
        this.reportingTime = i3;
    }
}
