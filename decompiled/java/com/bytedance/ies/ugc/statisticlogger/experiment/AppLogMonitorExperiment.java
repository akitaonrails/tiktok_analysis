package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C2210681Bfe;
import X.C452501pT;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogMonitorExperiment {
    public static final AppLogMonitorExperiment INSTANCE = new AppLogMonitorExperiment();
    public static final AppLogMonitorExperimentModel DEFAULT_GROUP = new AppLogMonitorExperimentModel(false, 60000, 1600, 600, 60000, 5242880, 1048576);
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C2210681Bfe());

    public final AppLogMonitorExperimentModel getValue() {
        return (AppLogMonitorExperimentModel) value$delegate.getValue();
    }

    public final AppLogMonitorExperimentModel getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
