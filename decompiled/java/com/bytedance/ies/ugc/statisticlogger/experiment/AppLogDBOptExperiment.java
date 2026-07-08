package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C2211141BgO;
import X.C452501pT;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogDBOptExperiment {
    public static final AppLogDBOptExperiment INSTANCE = new AppLogDBOptExperiment();
    public static final AppLogDBOptExperimentModel DEFAULT_GROUP = new AppLogDBOptExperimentModel(false, 60000);
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C2211141BgO());

    public final AppLogDBOptExperimentModel getValue() {
        return (AppLogDBOptExperimentModel) value$delegate.getValue();
    }

    public final AppLogDBOptExperimentModel getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
