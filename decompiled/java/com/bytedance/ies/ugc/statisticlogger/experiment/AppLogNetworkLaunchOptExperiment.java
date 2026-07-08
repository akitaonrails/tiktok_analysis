package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C2210631BfZ;
import X.C452501pT;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogNetworkLaunchOptExperiment {
    public static final AppLogNetworkLaunchOptExperiment INSTANCE = new AppLogNetworkLaunchOptExperiment();
    public static final AppLogNetworkLaunchOptExperimentModel DEFAULT_GROUP = new AppLogNetworkLaunchOptExperimentModel(false, false, null, false, 15, null);
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C2210631BfZ());

    public final AppLogNetworkLaunchOptExperimentModel getValue() {
        return (AppLogNetworkLaunchOptExperimentModel) value$delegate.getValue();
    }

    public final AppLogNetworkLaunchOptExperimentModel getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
