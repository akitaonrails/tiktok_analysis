package com.ss.android.ugc.aweme.ecommerce.dependency.pitaya;

import X.AnonymousClass1455;
import X.C04TD;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.pitaya.IPitayaDependencyService;

/* JADX INFO: loaded from: classes3.dex */
public final class PitayaDependencyService implements IPitayaDependencyService {
    public void initService() {
    }

    public static IPitayaDependencyService createIPitayaDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IPitayaDependencyService.class, z);
        if (objLIZ != null) {
            return (IPitayaDependencyService) objLIZ;
        }
        if (C04TD.M == null) {
            synchronized (IPitayaDependencyService.class) {
                if (C04TD.M == null) {
                    C04TD.M = new PitayaDependencyService();
                }
            }
        }
        return C04TD.M;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.pitaya.IPitayaDependencyService
    public void initPitaya(String str) {
        AnonymousClass1455.LIZ.LIZLLL(str, null, null);
    }
}
