package com.ss.android.ugc.aweme.feed.model.live;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class LiveFeedStructParseWithOriginSetting {
    public static final boolean DEFAULT = false;
    public static final LiveFeedStructParseWithOriginSetting INSTANCE = new LiveFeedStructParseWithOriginSetting();
    public static final C01GW enable$delegate = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(140));

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
