package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class RecUserCardConfig {

    @C09CT("count_after_insertion")
    public final int countAfterInsertion;

    @C09CT("count_before_insertion")
    public final int countBeforeInsertion;

    @C09CT("enable_deduplicate")
    public boolean enableDeduplicate;

    @C09CT("interval")
    public int interval;

    @C09CT("interval_lite")
    public int intervalLite;

    @C09CT("interval_plus")
    public int intervalPlus;

    public RecUserCardConfig() {
        this(1, 1, 4, 5, 4, true);
    }

    public RecUserCardConfig(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.intervalLite = i;
        this.interval = i2;
        this.intervalPlus = i3;
        this.countBeforeInsertion = i4;
        this.countAfterInsertion = i5;
        this.enableDeduplicate = z;
    }
}
