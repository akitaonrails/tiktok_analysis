package com.ss.android.ugc.aweme.ecommerce.dependency.ecmall;

import X.C04TD;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IEcMallUgService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IEcMallUgDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class EcMallUgDependencyService implements IEcMallUgDependencyService {
    public void initService() {
    }

    public static IEcMallUgDependencyService createIEcMallUgDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IEcMallUgDependencyService.class, z);
        if (objLIZ != null) {
            return (IEcMallUgDependencyService) objLIZ;
        }
        if (C04TD.n == null) {
            synchronized (IEcMallUgDependencyService.class) {
                if (C04TD.n == null) {
                    C04TD.n = new EcMallUgDependencyService();
                }
            }
        }
        return C04TD.n;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IEcMallUgDependencyService
    public void verifyTrackEvent(String str, Map<String, ? extends Object> map) {
        ((IEcMallUgService) ServiceManager.get().getService(IEcMallUgService.class)).verifyTrackEvent(str, map);
    }
}
