package com.ss.android.ugc.aweme.notification.ab;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class UnreadReminderExitData implements Serializable {
    public static final int $stable = 0;

    @C09CT("cycle_times")
    public final int cycleTimes;

    @C09CT("disable_min_interval")
    public final long disableMinInterval;

    @C09CT("enable")
    public final int enable;

    @C09CT("show_count")
    public final int showCount;

    public UnreadReminderExitData() {
        this(0, 5, 21600L, 3);
    }

    public UnreadReminderExitData(int i, int i2, long j, int i3) {
        this.enable = i;
        this.showCount = i2;
        this.disableMinInterval = j;
        this.cycleTimes = i3;
    }
}
