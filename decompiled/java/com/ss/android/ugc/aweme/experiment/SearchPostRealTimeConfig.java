package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class SearchPostRealTimeConfig implements Serializable {

    @C09CT("expire_seconds")
    public final long expireSeconds;

    @C09CT("feature_enable")
    public final boolean featureEnable;

    @C09CT("max_gid_limit_pre_query")
    public final int maxGidLimitPreQuery;

    @C09CT("max_query_limit")
    public final int maxQueryLimit;

    public SearchPostRealTimeConfig() {
        this(false, 10, 3, 900L);
    }

    public SearchPostRealTimeConfig(boolean z, int i, int i2, long j) {
        this.featureEnable = z;
        this.maxQueryLimit = i;
        this.maxGidLimitPreQuery = i2;
        this.expireSeconds = j;
    }
}
