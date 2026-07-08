package com.ss.android.ugc.aweme.story.experiment.viewlist;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class DisablePostViewerListExp {
    public static final int DEFAULT = 0;
    public static final int DISABLE = 1;
    public static final DisablePostViewerListExp INSTANCE = new DisablePostViewerListExp();
    public static final C01GW expValue$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1980));
    public static final int $stable = 8;

    private final int getExpValue() {
        return ((Number) expValue$delegate.getValue()).intValue();
    }

    public final boolean disable() {
        return getExpValue() == 1;
    }
}
