package com.ss.android.ugc.aweme.verify;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PlusButtonPinExperiment {
    public static final int OFF = 0;
    public static final int VARIANT_ONE = 1;
    public static final int VARIANT_THREE = 3;
    public static final int VARIANT_TWO = 2;
    public static final PlusButtonPinExperiment INSTANCE = new PlusButtonPinExperiment();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2128));
    public static final C01GW enabled$delegate = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(296));
    public static final C01GW atLeastPin$delegate = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(295));
    public static final C01GW pinOnly$delegate = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(298));
    public static final C01GW pinAndApply$delegate = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(297));

    public final boolean getAtLeastPin() {
        return ((Boolean) atLeastPin$delegate.getValue()).booleanValue();
    }

    public final boolean getEnabled() {
        return ((Boolean) enabled$delegate.getValue()).booleanValue();
    }

    public final boolean getPinAndApply() {
        return ((Boolean) pinAndApply$delegate.getValue()).booleanValue();
    }

    public final boolean getPinOnly() {
        return ((Boolean) pinOnly$delegate.getValue()).booleanValue();
    }

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
