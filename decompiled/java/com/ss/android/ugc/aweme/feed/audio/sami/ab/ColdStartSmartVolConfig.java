package com.ss.android.ugc.aweme.feed.audio.sami.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class ColdStartSmartVolConfig {

    @C09CT("adjust_direction")
    public final int adjustDirection;

    @C09CT("effective_play_count")
    public final int effectivePlayCount;

    @C09CT("effective_play_duration_s")
    public final int effectivePlayDurations;

    @C09CT("iteration_period_s")
    public final long iterationPeriods;

    @C09CT("reset_interval_seconds")
    public final long resetIntervalSeconds;

    @C09CT("save_data_interval")
    public final int saveDataInterval;

    public ColdStartSmartVolConfig() {
        this(0, 0, 0L, 0L, 0, 0);
    }

    public ColdStartSmartVolConfig(int i, int i2, long j, long j2, int i3, int i4) {
        this.effectivePlayDurations = i;
        this.effectivePlayCount = i2;
        this.iterationPeriods = j;
        this.resetIntervalSeconds = j2;
        this.adjustDirection = i3;
        this.saveDataInterval = i4;
    }
}
