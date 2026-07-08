package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveFeedFcpConfig {
    public static final int BOTTOM_TAB = 2;
    public static final int DEFAULT = 0;
    public static final LiveFeedFcpConfig INSTANCE = new LiveFeedFcpConfig();
    public static final C01GW cacheValue$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(999));

    public static final int getValue() {
        return INSTANCE.getCacheValue();
    }

    public final int getCacheValue() {
        return ((Number) cacheValue$delegate.getValue()).intValue();
    }

    public static final boolean enableBottomTab() {
        return getValue() == 2;
    }
}
