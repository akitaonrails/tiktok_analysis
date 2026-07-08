package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogDBOptExperimentModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("wal_checkpoint_interval")
    public final long walCheckpointInterval;

    public AppLogDBOptExperimentModel() {
        this(false, 60000L);
    }

    public AppLogDBOptExperimentModel(boolean z, long j) {
        this.enable = z;
        this.walCheckpointInterval = j;
    }
}
