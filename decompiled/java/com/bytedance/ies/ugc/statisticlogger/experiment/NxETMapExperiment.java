package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class NxETMapExperiment {
    public static final NxETMapExperiment INSTANCE = new NxETMapExperiment();
    public static final NxETMapExperimentModel DEFAULT_GROUP = new NxETMapExperimentModel(false, false);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(82));

    public final NxETMapExperimentModel getValue() {
        return (NxETMapExperimentModel) value$delegate.getValue();
    }

    public final NxETMapExperimentModel getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
