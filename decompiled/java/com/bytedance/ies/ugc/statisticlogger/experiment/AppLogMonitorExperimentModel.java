package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogMonitorExperimentModel {

    @C09CT("big_event_period")
    public final long bigEventPeroid;

    @C09CT("big_event_report_threshold")
    public final int bigEventReportThreshold;

    @C09CT("big_event_threshold")
    public final long bigEventThreshold;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("high_frequency_period")
    public final long highFrequencyPeroid;

    @C09CT("high_frequency_report_threshold")
    public final int highFrequencyReportThreshold;

    @C09CT("high_frequency_threshold")
    public final long highFrequencyThreshold;

    public AppLogMonitorExperimentModel() {
        this(false, 60000L, 1600L, 600, 60000L, 5242880L, 1048576);
    }

    public AppLogMonitorExperimentModel(boolean z, long j, long j2, int i, long j3, long j4, int i2) {
        this.enable = z;
        this.highFrequencyPeroid = j;
        this.highFrequencyThreshold = j2;
        this.highFrequencyReportThreshold = i;
        this.bigEventPeroid = j3;
        this.bigEventThreshold = j4;
        this.bigEventReportThreshold = i2;
    }
}
