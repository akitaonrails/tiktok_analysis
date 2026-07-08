package com.ss.android.ugc.slideslip.ab;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SharedThreadPoolForColorExtractionFix {
    public static final boolean DISABLED = false;
    public static final boolean ENABLED = true;
    public static final SharedThreadPoolForColorExtractionFix INSTANCE = new SharedThreadPoolForColorExtractionFix();
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2290));
    public static final int $stable = 8;

    public final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }
}
