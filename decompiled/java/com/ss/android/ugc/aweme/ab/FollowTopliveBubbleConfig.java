package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowTopliveBubbleConfig {

    @C09CT("delay_duration")
    public final long delayDuration;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("skylight_insert")
    public final boolean skylightInsert;

    @C09CT("toplives_insert")
    public final boolean toplivesInsert;

    public FollowTopliveBubbleConfig() {
        this(false, Mp4ScreenVideoLoadTimeout.CONTROL, false, false);
    }

    public FollowTopliveBubbleConfig(boolean z, long j, boolean z2, boolean z3) {
        this.enable = z;
        this.delayDuration = j;
        this.skylightInsert = z2;
        this.toplivesInsert = z3;
    }
}
