package com.ss.android.ugc.aweme.experiment;

import X.C2188811AlT;
import com.ss.android.ugc.bytex.pthread.base.convergence.helper.ThreadGroupUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class ThreadConvergenceAB {
    public static final ThreadConvergenceAB LIZ = new ThreadConvergenceAB();

    private final void preloadThreadGroup() {
        ThreadGroup cacheThreadGroup = ThreadGroupUtils.INSTANCE.getCacheThreadGroup();
        if (cacheThreadGroup != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preload thread proxy group:");
            sbLIZ.append(cacheThreadGroup);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
