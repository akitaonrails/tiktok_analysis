package com.ss.android.ugc.aweme.impl;

import X.C08Q0;
import X.C0BEC;
import X.C1214204p2;
import X.C1BWL;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceExperimentApi;

/* JADX INFO: loaded from: classes3.dex */
public final class IPerformanceExperimentServiceImpl implements IPerformanceExperimentApi {
    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceExperimentApi
    public final boolean LIZ() {
        return ((Boolean) C1214204p2.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceExperimentApi
    public final boolean LIZIZ() {
        return C08Q0.LJ(C1BWL.LIZ(), "bootfinish_migrate_phase_one", false);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceExperimentApi
    public final boolean LIZJ() {
        return LIZIZ() && C0BEC.LJI(C1BWL.LIZ());
    }
}
