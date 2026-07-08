package com.ss.android.ugc.aweme.ecommerce.init;

import X.C04TD;
import com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECHostInitService;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomInitService implements IECHostInitService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECHostInitService
    public void init() {
    }

    public void initService() {
    }

    public static IECHostInitService createIECHostInitServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IECHostInitService.class, z);
        if (objLIZ != null) {
            return (IECHostInitService) objLIZ;
        }
        if (C04TD.U == null) {
            synchronized (IECHostInitService.class) {
                if (C04TD.U == null) {
                    C04TD.U = new EcomInitService();
                }
            }
        }
        return C04TD.U;
    }
}
