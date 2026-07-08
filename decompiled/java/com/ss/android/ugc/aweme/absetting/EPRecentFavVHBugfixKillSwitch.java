package com.ss.android.ugc.aweme.absetting;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class EPRecentFavVHBugfixKillSwitch {
    public static final boolean DISABLE = false;
    public static final EPRecentFavVHBugfixKillSwitch INSTANCE = new EPRecentFavVHBugfixKillSwitch();
    public static final boolean ENABLE = true;
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(941));

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean isEnabled() {
        return getValue();
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
