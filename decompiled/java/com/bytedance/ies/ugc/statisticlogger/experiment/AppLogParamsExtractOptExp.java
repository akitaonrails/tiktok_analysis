package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class AppLogParamsExtractOptExp {
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final AppLogParamsExtractOptExp INSTANCE = new AppLogParamsExtractOptExp();
    public static final C01GW enable$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(767));

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
