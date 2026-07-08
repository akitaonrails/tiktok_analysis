package com.ss.android.ugc.aweme.services.performance;

import X.C04TD;
import X.ExecutorServiceC822430WOb;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes24.dex */
public final class CreationPerformanceService implements ICreationPerformanceService {
    public static ICreationPerformanceService createICreationPerformanceServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ICreationPerformanceService.class, z);
        if (objLIZ != null) {
            return (ICreationPerformanceService) objLIZ;
        }
        if (C04TD.K4 == null) {
            synchronized (ICreationPerformanceService.class) {
                if (C04TD.K4 == null) {
                    C04TD.K4 = new CreationPerformanceService();
                }
            }
        }
        return C04TD.K4;
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreationPerformanceService
    public ExecutorService createFixedExecutorService(ExecutorService executorService, int i) {
        return new ExecutorServiceC822430WOb(executorService, i);
    }
}
