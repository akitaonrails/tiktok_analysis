package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C104100aN;
import X.C1E2P;
import X.C1E2Q;
import X.C452501pT;

/* JADX INFO: loaded from: classes36.dex */
public final class NUJAutoRefreshConfigExp {
    public static final NUJAutoRefreshConfigExp INSTANCE = new NUJAutoRefreshConfigExp();
    public static final NUJAutoRefreshConfig none = new NUJAutoRefreshConfig(false, 0);
    public static final C01GW config$delegate = C452501pT.LIZIZ(new C1E2Q());

    public static final int refreshIndex() {
        return INSTANCE.getConfig().refreshIndex;
    }

    public final NUJAutoRefreshConfig getConfig() {
        return (NUJAutoRefreshConfig) config$delegate.getValue();
    }

    public static final boolean isEnable() {
        return C104100aN.LIZ().LJJIJ(new C1E2P());
    }
}
