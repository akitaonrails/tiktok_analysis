package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class Configuration {
    public static final int $stable = 0;

    @C09CT("interval_days")
    public final int intervalDays;

    @C09CT("max_times")
    public final int maxTimes;

    public Configuration(int i, int i2) {
        this.intervalDays = i;
        this.maxTimes = i2;
    }
}
