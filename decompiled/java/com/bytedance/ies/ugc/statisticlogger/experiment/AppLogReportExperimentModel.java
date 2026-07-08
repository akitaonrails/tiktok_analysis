package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogReportExperimentModel {

    @C09CT("count_threshold")
    public final int countThreshold;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("size_threshold")
    public final long sizeThreshold;

    public AppLogReportExperimentModel() {
        this(false, 2000, 1572864L);
    }

    public AppLogReportExperimentModel(boolean z, int i, long j) {
        this.enable = z;
        this.countThreshold = i;
        this.sizeThreshold = j;
    }
}
