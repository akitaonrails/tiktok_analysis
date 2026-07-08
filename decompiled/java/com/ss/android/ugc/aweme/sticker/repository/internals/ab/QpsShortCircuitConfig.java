package com.ss.android.ugc.aweme.sticker.repository.internals.ab;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class QpsShortCircuitConfig {
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final QpsShortCircuitConfig INSTANCE = new QpsShortCircuitConfig();
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(554));
    public static final int $stable = 8;

    public final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }
}
