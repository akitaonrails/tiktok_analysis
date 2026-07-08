package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SubsPaywallSingleBindKillSwitch {
    public static final SubsPaywallSingleBindKillSwitch INSTANCE = new SubsPaywallSingleBindKillSwitch();
    public static final boolean DEFAULT = true;
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(779));

    public final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }
}
