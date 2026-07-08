package com.ss.android.ugc.aweme.relation.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsTabConfig {

    @C09CT("frequency_control_intervals")
    public int[] frequencyControlIntervals;

    @C09CT("flow_position_history")
    public int historyFlowPosition;

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

    @C09CT("flow_position_unread")
    public int unreadFlowPosition;

    public FriendsTabConfig() {
        this(1, 1, 1, 1, 4, 1, new int[]{1, 1, 4}, new int[]{5, 60, 10000}, 5, 3);
    }

    public FriendsTabConfig(int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, int i7, int i8) {
        this.intervalLite = i;
        this.showsPerDayLite = i2;
        this.interval = i3;
        this.showsPerDay = i4;
        this.intervalPlus = i5;
        this.showsPerDayPlus = i6;
        this.frequencyControlIntervals = iArr;
        this.mufGroupUpperBounds = iArr2;
        this.unreadFlowPosition = i7;
        this.historyFlowPosition = i8;
    }
}
