package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class FetchCountThreshold {

    @C09CT("dec_fetch_count")
    public int decFetchCount;

    @C09CT("inc_fetch_count")
    public int incFetchCount;

    public FetchCountThreshold() {
        this(30, 30);
    }

    public FetchCountThreshold(int i, int i2) {
        this.incFetchCount = i;
        this.decFetchCount = i2;
    }
}
