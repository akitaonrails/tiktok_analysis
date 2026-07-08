package com.ss.android.ugc.aweme.ecommerce.dependency.network;

import X.C04TD;
import X.C1490190osj;
import X.C1507890pLH;
import X.C1508190pLl;
import X.C1508210pLn;
import X.C1BMD;
import X.EnumC2262571Dh9;
import com.ss.android.ugc.aweme.ecommerce.api.PDPNetworkControlConfig;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.IECNetControllerDependencyService;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class ECNetControllerDependencyService implements IECNetControllerDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.IECNetControllerDependencyService
    public void enterPDPLaunchingScene() {
        DispatchConfig dispatchConfig;
        boolean z = C1508210pLn.LIZ;
        int effectiveConnectionType = C1BMD.LIZIZ.getEffectiveConnectionType();
        PDPNetworkControlConfig pDPNetworkControlConfig = C1508210pLn.LIZIZ;
        if (pDPNetworkControlConfig == null || pDPNetworkControlConfig.blackList.isEmpty() || effectiveConnectionType > pDPNetworkControlConfig.networkScoreThreshold) {
            return;
        }
        if (!C1508210pLn.LIZ && (dispatchConfig = C1508210pLn.LIZLLL) != null) {
            C1490190osj.LIZIZ.LIZIZ(EnumC2262571Dh9.EC_PDP, dispatchConfig);
            C1508210pLn.LIZ = true;
        }
        if (C1508210pLn.LIZJ) {
            C1508210pLn.LIZ();
        }
        C1507890pLH c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ();
        if (c1507890pLHLIZ != null) {
            C1508190pLl c1508190pLl = c1507890pLHLIZ.LIZIZ.LJI;
            c1508190pLl.getClass();
            c1508190pLl.LIZ = System.currentTimeMillis();
            c1508190pLl.LIZIZ = "enter_pdp";
        }
        C1490190osj.LIZIZ.LIZ(EnumC2262571Dh9.EC_PDP);
        C1508210pLn.LIZJ = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.IECNetControllerDependencyService
    public void exitPDPLaunchScene() {
        C1508210pLn.LIZ();
    }

    public static IECNetControllerDependencyService createIECNetControllerDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IECNetControllerDependencyService.class, z);
        if (objLIZ != null) {
            return (IECNetControllerDependencyService) objLIZ;
        }
        if (C04TD.G == null) {
            synchronized (IECNetControllerDependencyService.class) {
                if (C04TD.G == null) {
                    C04TD.G = new ECNetControllerDependencyService();
                }
            }
        }
        return C04TD.G;
    }
}
