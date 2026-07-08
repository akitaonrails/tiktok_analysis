package com.ss.android.ugc.aweme.benchmark;

import X.C04TD;
import X.C0CCZ;
import com.ss.android.ugc.aweme.bl.IBenchmarkInitService;

/* JADX INFO: loaded from: classes3.dex */
public final class BenchmarkInitService implements IBenchmarkInitService {
    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkInitService
    public C0CCZ getBenchmarkInitTask() {
        return new BenchmarkInitRequest();
    }

    public static IBenchmarkInitService createIBenchmarkInitServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IBenchmarkInitService.class, z);
        if (objLIZ != null) {
            return (IBenchmarkInitService) objLIZ;
        }
        if (C04TD.LLILL == null) {
            synchronized (IBenchmarkInitService.class) {
                if (C04TD.LLILL == null) {
                    C04TD.LLILL = new BenchmarkInitService();
                }
            }
        }
        return C04TD.LLILL;
    }
}
