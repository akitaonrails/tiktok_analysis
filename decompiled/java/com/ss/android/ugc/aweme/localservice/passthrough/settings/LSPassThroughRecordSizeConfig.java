package com.ss.android.ugc.aweme.localservice.passthrough.settings;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class LSPassThroughRecordSizeConfig {
    public static final int DEFAULT = 1000;
    public static final LSPassThroughRecordSizeConfig INSTANCE = new LSPassThroughRecordSizeConfig();
    public static final C01GW configSize$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1734));

    private final int getConfigSize() {
        return ((Number) configSize$delegate.getValue()).intValue();
    }

    public final int getRecordSize() {
        return getConfigSize();
    }
}
