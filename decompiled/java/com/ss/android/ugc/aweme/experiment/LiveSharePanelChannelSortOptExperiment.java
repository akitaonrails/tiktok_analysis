package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveSharePanelChannelSortOptExperiment {
    public static final boolean DEFAULT = false;
    public static final LiveSharePanelChannelSortOptExperiment INSTANCE = new LiveSharePanelChannelSortOptExperiment();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1005));
    public static final int $stable = 8;

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getValue();
    }
}
