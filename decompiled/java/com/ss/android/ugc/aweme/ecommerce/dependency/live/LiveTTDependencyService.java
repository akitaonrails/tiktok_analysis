package com.ss.android.ugc.aweme.ecommerce.dependency.live;

import X.C04TD;
import X.C1ACD;
import X.EnumC1913520ztW;
import X.InterfaceC2175541ACi;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveTTDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: loaded from: classes3.dex */
public final class LiveTTDependencyService implements ILiveTTDependencyService {
    public void initService() {
    }

    public static ILiveTTDependencyService createILiveTTDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ILiveTTDependencyService.class, z);
        if (objLIZ != null) {
            return (ILiveTTDependencyService) objLIZ;
        }
        if (C04TD.A == null) {
            synchronized (ILiveTTDependencyService.class) {
                if (C04TD.A == null) {
                    C04TD.A = new LiveTTDependencyService();
                }
            }
        }
        return C04TD.A;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveTTDependencyService
    public C1ACD generateLivePlayHelper(InterfaceC2175541ACi interfaceC2175541ACi, EnumC1913520ztW enumC1913520ztW) {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            return iLiveOuterService.generateLivePlayHelper(interfaceC2175541ACi, enumC1913520ztW);
        }
        return null;
    }
}
