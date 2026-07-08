package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class SubsOptOutSetting {
    public static final boolean DEFAULT = false;
    public static final SubsOptOutSetting INSTANCE = new SubsOptOutSetting();
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(350));

    public final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }
}
