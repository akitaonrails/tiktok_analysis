package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes29.dex */
public final class ChannelAuthEdmAndSmsGuideV3 {
    public static final int DEFAULT = 0;
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final int V3 = 3;
    public static final int V4 = 4;
    public static final int V5 = 5;
    public static final ChannelAuthEdmAndSmsGuideV3 INSTANCE = new ChannelAuthEdmAndSmsGuideV3();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2123));

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean canShowBanner() {
        return isV4() || isV5();
    }

    public final boolean enabled() {
        return getValue() != 0;
    }

    public final boolean isV1() {
        return getValue() == 1;
    }

    public final boolean isV2() {
        return getValue() == 2;
    }

    public final boolean isV3() {
        return getValue() == 3;
    }

    public final boolean isV4() {
        return getValue() == 4;
    }

    public final boolean isV5() {
        return getValue() == 5;
    }
}
