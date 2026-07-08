package com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt;

import X.C04TD;
import X.C1150504el;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IBootLogDependencyService;

/* JADX INFO: loaded from: classes3.dex */
public final class BootLogDependencyService implements IBootLogDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IBootLogDependencyService
    public long coldBootBegin() {
        return C1150504el.LIZ().LJJII;
    }

    public static IBootLogDependencyService createIBootLogDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IBootLogDependencyService.class, z);
        if (objLIZ != null) {
            return (IBootLogDependencyService) objLIZ;
        }
        if (C04TD.K == null) {
            synchronized (IBootLogDependencyService.class) {
                if (C04TD.K == null) {
                    C04TD.K = new BootLogDependencyService();
                }
            }
        }
        return C04TD.K;
    }
}
