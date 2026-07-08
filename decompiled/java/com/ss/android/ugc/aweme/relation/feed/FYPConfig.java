package com.ss.android.ugc.aweme.relation.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class FYPConfig {

    @C09CT("flow_position_backup")
    public int backUpFlowPosition;

    @C09CT("flow_index")
    public int flowIndex;

    @C09CT("flow_position")
    public int flowPosition;

    @C09CT("frequency_control_intervals")
    public int[] frequencyControlIntervals;

    @C09CT("interval")
    public int interval;

    @C09CT("interval_lite")
    public int intervalLite;

    @C09CT("interval_plus")
    public int intervalPlus;

    @C09CT("muf_group_upper_bounds")
    public int[] mufGroupUpperBounds;

    @C09CT("shows_per_day")
    public int showsPerDay;

    @C09CT("shows_per_day_lite")
    public int showsPerDayLite;

    @C09CT("shows_per_day_plus")
    public int showsPerDayPlus;

    public FYPConfig() {
        this(1, 1, 1, 1, 3, 1, new int[]{1, 1, 3}, new int[]{5, 60, 10000}, 2, 2, 6);
    }

    public FYPConfig(int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, int i7, int i8, int i9) {
        this.intervalLite = i;
        this.showsPerDayLite = i2;
        this.interval = i3;
        this.showsPerDay = i4;
        this.intervalPlus = i5;
        this.showsPerDayPlus = i6;
        this.frequencyControlIntervals = iArr;
        this.mufGroupUpperBounds = iArr2;
        this.flowIndex = i7;
        this.flowPosition = i8;
        this.backUpFlowPosition = i9;
    }
}
