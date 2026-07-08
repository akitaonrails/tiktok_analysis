package com.ss.android.ugc.aweme.live.skylight;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveSkylightMatchExperiment {
    public static final int DEFAULT = 1;
    public static final LiveSkylightMatchExperiment INSTANCE = new LiveSkylightMatchExperiment();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(507));
    public static final int $stable = 8;

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean enable() {
        return getValue() > 0;
    }

    public final boolean enableGoLiveBtn() {
        return getValue() == 1 || getValue() == 3;
    }
}
