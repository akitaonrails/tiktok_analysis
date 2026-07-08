package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C2211151BgP;
import X.C452501pT;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogFilterOptExperiment {
    public static final AppLogFilterOptExperiment INSTANCE = new AppLogFilterOptExperiment();
    public static final AppLogFilterOptExperimentModel DEFAULT_GROUP = new AppLogFilterOptExperimentModel(false, false, false);
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C2211151BgP());

    public final AppLogFilterOptExperimentModel getValue() {
        return (AppLogFilterOptExperimentModel) value$delegate.getValue();
    }

    public final AppLogFilterOptExperimentModel getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
