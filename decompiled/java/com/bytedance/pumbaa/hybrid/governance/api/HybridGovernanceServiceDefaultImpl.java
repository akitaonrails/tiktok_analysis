package com.bytedance.pumbaa.hybrid.governance.api;

import X.C04TD;
import X.C0WMB;
import X.C0WMQ;
import X.C13LQ;
import com.bytedance.pumbaa.hybrid.governance.csp.HybridGovCSPServiceImpl;
import com.bytedance.pumbaa.hybrid.governance.jsb.HybridGovJSBServiceImpl;
import com.bytedance.pumbaa.hybrid.governance.jsi.HybridGovJSIServiceImpl;
import com.bytedance.pumbaa.hybrid.governance.jsinjection.HybridGovJSInjectionServiceImpl;
import com.bytedance.pumbaa.hybrid.governance.navigation.HybridGovNavigationServiceImpl;
import com.bytedance.pumbaa.hybrid.governance.network.HybridGovNetworkServiceImpl;
import com.bytedance.pumbaa.hybrid.governance.router.HybridGovRouterServiceImpl;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class HybridGovernanceServiceDefaultImpl implements IHybridGovernanceService {
    public C0WMQ config;

    private final List<IHybridGovService<?>> getGovServices() {
        return C13LQ.LJIJI(new IHybridGovService[]{HybridGovCSPServiceImpl.LJ(), HybridGovJSInjectionServiceImpl.LJ(), HybridGovJSIServiceImpl.LJ(), HybridGovJSBServiceImpl.LJ(), HybridGovRouterServiceImpl.LJ(), HybridGovNavigationServiceImpl.LJ(), HybridGovNetworkServiceImpl.LJ()});
    }

    public final C0WMQ getConfig$com_bytedance_pumbaa_hybrid_governance_api() {
        return this.config;
    }

    public static IHybridGovernanceService createIHybridGovernanceServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IHybridGovernanceService.class, z);
        if (objLIZ != null) {
            return (IHybridGovernanceService) objLIZ;
        }
        if (C04TD.LJJJ == null) {
            synchronized (IHybridGovernanceService.class) {
                if (C04TD.LJJJ == null) {
                    C04TD.LJJJ = new HybridGovernanceServiceDefaultImpl();
                }
            }
        }
        return C04TD.LJJJ;
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovernanceService
    public void addAction(C0WMB c0wmb) {
        for (IHybridGovService<?> iHybridGovService : getGovServices()) {
            if (iHybridGovService.LIZIZ() == c0wmb.LIZLLL().LIZIZ) {
                iHybridGovService.addAction(c0wmb);
                return;
            }
        }
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovernanceService
    public void init(C0WMQ c0wmq) {
        this.config = c0wmq;
        IHybridCspGovService iHybridCspGovServiceLJ = HybridGovCSPServiceImpl.LJ();
        if (iHybridCspGovServiceLJ != null) {
            iHybridCspGovServiceLJ.LIZ(c0wmq.LJFF);
        }
        IHybridJsInjectionGovService iHybridJsInjectionGovServiceLJ = HybridGovJSInjectionServiceImpl.LJ();
        if (iHybridJsInjectionGovServiceLJ != null) {
            iHybridJsInjectionGovServiceLJ.LIZ(c0wmq.LJ);
        }
        IHybridJsiGovService iHybridJsiGovServiceLJ = HybridGovJSIServiceImpl.LJ();
        if (iHybridJsiGovServiceLJ != null) {
            iHybridJsiGovServiceLJ.LIZ(c0wmq.LIZLLL);
        }
        IHybridJsbGovService iHybridJsbGovServiceLJ = HybridGovJSBServiceImpl.LJ();
        if (iHybridJsbGovServiceLJ != null) {
            iHybridJsbGovServiceLJ.LIZ(c0wmq.LIZJ);
        }
        IHybridRouterGovService iHybridRouterGovServiceLJ = HybridGovRouterServiceImpl.LJ();
        if (iHybridRouterGovServiceLJ != null) {
            iHybridRouterGovServiceLJ.LIZ(c0wmq.LIZ);
        }
        IHybridNavigationGovService iHybridNavigationGovServiceLJ = HybridGovNavigationServiceImpl.LJ();
        if (iHybridNavigationGovServiceLJ != null) {
            iHybridNavigationGovServiceLJ.LIZ(c0wmq.LIZIZ);
        }
        IHybridNetworkGovService iHybridNetworkGovServiceLJ = HybridGovNetworkServiceImpl.LJ();
        if (iHybridNetworkGovServiceLJ != null) {
            iHybridNetworkGovServiceLJ.LIZ(c0wmq.LJI);
        }
    }

    public void removeAction(C0WMB c0wmb) {
        for (IHybridGovService<?> iHybridGovService : getGovServices()) {
            if (iHybridGovService.LIZIZ() == c0wmb.LIZLLL().LIZIZ) {
                iHybridGovService.LIZJ(c0wmb);
                return;
            }
        }
    }

    public final void setConfig$com_bytedance_pumbaa_hybrid_governance_api(C0WMQ c0wmq) {
        this.config = c0wmq;
    }

    public void updateConfig(C0WMQ c0wmq) {
        this.config = c0wmq;
        IHybridCspGovService iHybridCspGovServiceLJ = HybridGovCSPServiceImpl.LJ();
        if (iHybridCspGovServiceLJ != null) {
            iHybridCspGovServiceLJ.updateConfig();
        }
        IHybridJsInjectionGovService iHybridJsInjectionGovServiceLJ = HybridGovJSInjectionServiceImpl.LJ();
        if (iHybridJsInjectionGovServiceLJ != null) {
            iHybridJsInjectionGovServiceLJ.updateConfig();
        }
        IHybridJsiGovService iHybridJsiGovServiceLJ = HybridGovJSIServiceImpl.LJ();
        if (iHybridJsiGovServiceLJ != null) {
            iHybridJsiGovServiceLJ.updateConfig();
        }
        IHybridJsbGovService iHybridJsbGovServiceLJ = HybridGovJSBServiceImpl.LJ();
        if (iHybridJsbGovServiceLJ != null) {
            iHybridJsbGovServiceLJ.updateConfig();
        }
        IHybridRouterGovService iHybridRouterGovServiceLJ = HybridGovRouterServiceImpl.LJ();
        if (iHybridRouterGovServiceLJ != null) {
            iHybridRouterGovServiceLJ.updateConfig();
        }
        IHybridNavigationGovService iHybridNavigationGovServiceLJ = HybridGovNavigationServiceImpl.LJ();
        if (iHybridNavigationGovServiceLJ != null) {
            iHybridNavigationGovServiceLJ.updateConfig();
        }
        IHybridNetworkGovService iHybridNetworkGovServiceLJ = HybridGovNetworkServiceImpl.LJ();
        if (iHybridNetworkGovServiceLJ != null) {
            iHybridNetworkGovServiceLJ.updateConfig();
        }
    }
}
