package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAiSummaryFrequencyControlConfig {

    @C09CT("close_3_delay_after_days")
    public final int close3FrequencyDays;

    @C09CT("close_accumulated_days")
    public final int closeAccumulatedDays;

    @C09CT("close_once_delay_after_hours")
    public final int closeOnceFrequencyHours;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("24h_max_show_time")
    public final int maxShowTimes;

    public LiveAiSummaryFrequencyControlConfig() {
        this(false, 10, 24, 14, 28);
    }

    public LiveAiSummaryFrequencyControlConfig(boolean z, int i, int i2, int i3, int i4) {
        this.enable = z;
        this.maxShowTimes = i;
        this.closeOnceFrequencyHours = i2;
        this.close3FrequencyDays = i3;
        this.closeAccumulatedDays = i4;
    }
}
