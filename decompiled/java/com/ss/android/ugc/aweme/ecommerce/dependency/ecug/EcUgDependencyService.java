package com.ss.android.ugc.aweme.ecommerce.dependency.ecug;

import X.C04TD;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgDependencyService implements IEcUgDependencyService {
    public void initService() {
    }

    public static IEcUgDependencyService createIEcUgDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IEcUgDependencyService.class, z);
        if (objLIZ != null) {
            return (IEcUgDependencyService) objLIZ;
        }
        if (C04TD.t == null) {
            synchronized (IEcUgDependencyService.class) {
                if (C04TD.t == null) {
                    C04TD.t = new EcUgDependencyService();
                }
            }
        }
        return C04TD.t;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgDependencyService
    public void trackLogCommon(String str, Map<String, Object> map) {
        IEcUgCommonService iEcUgCommonService = (IEcUgCommonService) PluggableExtentionKt.pluggableSpi$default(IEcUgCommonService.class, false, false, false, 14, null);
        if (iEcUgCommonService != null) {
            iEcUgCommonService.trackLogCommon(str, map);
        }
    }
}
