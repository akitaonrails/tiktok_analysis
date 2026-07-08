package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class InstantFeedFrequencyConfig {

    @C09CT("count")
    public final int count;

    @C09CT("time")
    public final int time;

    public InstantFeedFrequencyConfig() {
        this(0, 0);
    }

    public InstantFeedFrequencyConfig(int i, int i2) {
        this.time = i;
        this.count = i2;
    }
}
