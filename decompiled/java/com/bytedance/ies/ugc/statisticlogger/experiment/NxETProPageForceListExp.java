package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes28.dex */
public final class NxETProPageForceListExp {
    public static final NxETProPageForceListExp INSTANCE = new NxETProPageForceListExp();
    public static final NxETProPageForceListExpModel DEFAULT_GROUP = new NxETProPageForceListExpModel(false, "incentive_campaign|ug/incentive|pa_fe");
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(84));
    public static final C01GW reg$delegate = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(83));

    public final Regex getReg() {
        return (Regex) reg$delegate.getValue();
    }

    public final NxETProPageForceListExpModel getValue() {
        return (NxETProPageForceListExpModel) value$delegate.getValue();
    }

    public final NxETProPageForceListExpModel getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
