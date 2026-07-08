package com.ss.android.ugc.aweme.benchmark;

import X.C04TD;
import X.C0CCZ;
import com.ss.android.ugc.aweme.bl.IBenchmarkCollectionInitService;

/* JADX INFO: loaded from: classes3.dex */
public final class BenchmarkCollectionInitService implements IBenchmarkCollectionInitService {
    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkCollectionInitService
    public C0CCZ getBenchmarkCollectionInitTask() {
        return new BenchmarkCollectionInitRequest();
    }

    public static IBenchmarkCollectionInitService createIBenchmarkCollectionInitServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IBenchmarkCollectionInitService.class, z);
        if (objLIZ != null) {
            return (IBenchmarkCollectionInitService) objLIZ;
        }
        if (C04TD.LLILIL == null) {
            synchronized (IBenchmarkCollectionInitService.class) {
                if (C04TD.LLILIL == null) {
                    C04TD.LLILIL = new BenchmarkCollectionInitService();
                }
            }
        }
        return C04TD.LLILIL;
    }
}
