package com.ss.android.ugc.aweme.benchmark;

import X.C04TD;
import X.C21310918aZ;
import X.C21311018aa;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;

/* JADX INFO: loaded from: classes33.dex */
public final class BenchmarkServiceImpl implements IBenchmarkService {
    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkService
    public void stopBenchmark() {
        C21310918aZ c21310918aZ;
        C21311018aa c21311018aa = C21311018aa.LIZIZ;
        synchronized (c21311018aa) {
            c21310918aZ = c21311018aa.LIZ;
        }
        if (c21310918aZ != null) {
            c21310918aZ.stop();
        }
    }

    public static IBenchmarkService createIBenchmarkServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IBenchmarkService.class, z);
        if (objLIZ != null) {
            return (IBenchmarkService) objLIZ;
        }
        if (C04TD.LLILLIZIL == null) {
            synchronized (IBenchmarkService.class) {
                if (C04TD.LLILLIZIL == null) {
                    C04TD.LLILLIZIL = new BenchmarkServiceImpl();
                }
            }
        }
        return C04TD.LLILLIZIL;
    }

    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkService
    public void startBenchmark(int i) {
        C21310918aZ c21310918aZ;
        C21311018aa c21311018aa = C21311018aa.LIZIZ;
        synchronized (c21311018aa) {
            c21310918aZ = c21311018aa.LIZ;
        }
        if (c21310918aZ != null) {
            c21310918aZ.start(i);
        }
    }
}
