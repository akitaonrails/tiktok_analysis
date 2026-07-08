package com.ss.android.ugc.aweme.inbox.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinGuideFrequencyConfiguration {
    public static final int $stable = 0;

    @C09CT("show_interval_day")
    public final int intervalMillisecond;

    @C09CT("show_times_all")
    public final int timesAll;

    @C09CT("show_times_once")
    public final int timesOnce;

    public BulletinGuideFrequencyConfiguration() {
        this(7, 3, 5);
    }

    public BulletinGuideFrequencyConfiguration(int i, int i2, int i3) {
        this.intervalMillisecond = i;
        this.timesOnce = i2;
        this.timesAll = i3;
    }
}
