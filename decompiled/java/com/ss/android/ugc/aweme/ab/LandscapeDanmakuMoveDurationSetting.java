package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class LandscapeDanmakuMoveDurationSetting {
    public static final LandscapeDanmakuMoveDurationSetting INSTANCE = new LandscapeDanmakuMoveDurationSetting();
    public static final long DEFAULT = 13000;
    public static final C01GW duration$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(777));

    public final long getDuration() {
        return ((Number) duration$delegate.getValue()).longValue();
    }

    public final long getDEFAULT() {
        return DEFAULT;
    }
}
