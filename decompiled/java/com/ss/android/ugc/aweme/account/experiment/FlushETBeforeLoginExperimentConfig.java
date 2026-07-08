package com.ss.android.ugc.aweme.account.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class FlushETBeforeLoginExperimentConfig {

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("time_out")
    public final long timeOut;

    public FlushETBeforeLoginExperimentConfig() {
        this(false, 1000L);
    }

    public FlushETBeforeLoginExperimentConfig(boolean z, long j) {
        this.isEnable = z;
        this.timeOut = j;
    }
}
