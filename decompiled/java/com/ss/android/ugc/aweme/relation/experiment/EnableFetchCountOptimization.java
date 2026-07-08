package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class EnableFetchCountOptimization {

    @C09CT("group")
    public int group;

    @C09CT("inbox_fetch_count")
    public FetchCountThreshold inboxFetchCount;

    @C09CT("suggest_fetch_count")
    public FetchCountThreshold suggestFetchCount;

    public EnableFetchCountOptimization() {
        this(0, new FetchCountThreshold(30, 30), new FetchCountThreshold(30, 30));
    }

    public EnableFetchCountOptimization(int i, FetchCountThreshold fetchCountThreshold, FetchCountThreshold fetchCountThreshold2) {
        this.group = i;
        this.inboxFetchCount = fetchCountThreshold;
        this.suggestFetchCount = fetchCountThreshold2;
    }
}
