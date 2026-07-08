package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class MafExitTermConfig implements Serializable {

    @C09CT("exit_time_in_hour")
    public final int blockTimeInHour;

    @C09CT("threshold_count")
    public final int thresholdCount;

    @C09CT("time_window_in_hour")
    public final int timeWindowInHour;

    public MafExitTermConfig() {
        this(0, 0, 0);
    }

    public MafExitTermConfig(int i, int i2, int i3) {
        this.timeWindowInHour = i;
        this.thresholdCount = i2;
        this.blockTimeInHour = i3;
    }
}
