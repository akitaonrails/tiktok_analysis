package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogPackDirectSendExperiment {
    public static final AppLogPackDirectSendExperiment INSTANCE = new AppLogPackDirectSendExperiment();
    public static final AppLogPackDirectSendModel DEFAULT_GROUP = new AppLogPackDirectSendModel(false, false);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(24));

    public final AppLogPackDirectSendModel getValue() {
        return (AppLogPackDirectSendModel) value$delegate.getValue();
    }

    public final AppLogPackDirectSendModel getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
