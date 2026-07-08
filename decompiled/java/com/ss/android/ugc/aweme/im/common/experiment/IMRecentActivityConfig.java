package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class IMRecentActivityConfig implements Serializable {

    @C09CT("enabled")
    public final int enabled;

    @C09CT("fetch_interval_hours")
    public final int fetchIntervalHours;

    @C09CT("card_disable_cycles")
    public final int kTotalDismissCycleCount;

    @C09CT("card_max_count")
    public final int xDismissWithoutInteractionCount;

    @C09CT("card_max_count_interval_days")
    public final int yCooldownDaysAfterOneCycle;

    @C09CT("card_min_interval_days")
    public final int zMinimumDaysBetweenTwoDisplay;

    public IMRecentActivityConfig() {
        this(0, 0, 100, 0, 10, 0);
    }

    public IMRecentActivityConfig(int i, int i2, int i3, int i4, int i5, int i6) {
        this.enabled = i;
        this.zMinimumDaysBetweenTwoDisplay = i2;
        this.xDismissWithoutInteractionCount = i3;
        this.yCooldownDaysAfterOneCycle = i4;
        this.kTotalDismissCycleCount = i5;
        this.fetchIntervalHours = i6;
    }
}
