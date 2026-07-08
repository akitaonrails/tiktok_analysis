package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class AppLogEventFilterDelayExperiment {
    public static final long DEFAULT = 0;
    public static final String KEY = "applog_event_filter_delay";
    public static final AppLogEventFilterDelayExperiment INSTANCE = new AppLogEventFilterDelayExperiment();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(764));

    public final long getValue() {
        return ((Number) value$delegate.getValue()).longValue();
    }
}
