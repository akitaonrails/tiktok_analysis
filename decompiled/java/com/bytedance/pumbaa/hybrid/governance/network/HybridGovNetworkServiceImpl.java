package com.bytedance.pumbaa.hybrid.governance.network;

import X.C04TD;
import X.C0WM7;
import X.C0WMR;
import X.C0WN8;
import X.C0WON;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService;
import com.bytedance.pumbaa.hybrid.api.IHybridHookService;
import com.bytedance.pumbaa.hybrid.governance.api.IHybridNetworkGovService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridGovNetworkServiceImpl extends C0WM7<C0WMR> implements IHybridNetworkGovService {
    public static IHybridNetworkGovService LJ() {
        Object objLIZ = C04TD.LIZ(IHybridNetworkGovService.class, false);
        if (objLIZ != null) {
            return (IHybridNetworkGovService) objLIZ;
        }
        if (C04TD.LJJJJJL == null) {
            synchronized (IHybridNetworkGovService.class) {
                if (C04TD.LJJJJJL == null) {
                    C04TD.LJJJJJL = new HybridGovNetworkServiceImpl();
                }
            }
        }
        return C04TD.LJJJJJL;
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final C0WN8 LIZIZ() {
        return C0WN8.NETWORK;
    }

    @Override // X.C0WM7
    public final void LIZLLL(C0WMR c0wmr) {
        C0WMR c0wmr2 = c0wmr;
        if (c0wmr2 != null && !c0wmr2.LIZ) {
            return;
        }
        IHybridHookService iHybridHookService = (IHybridHookService) ServiceManager.get().getService(IHybridHookService.class);
        if (iHybridHookService != null) {
            iHybridHookService.LIZJ(new C0WON() { // from class: X.0WMU
                @Override // X.C0WON
                public final void LIZIZ(C0WLA c0wla) {
                }

                @Override // X.C0WON
                public final boolean LIZ(C0WLA c0wla) {
                    C0WMW c0wmwLIZ = C0WMX.LIZ();
                    Intrinsics.LJFF("H5", c0wla.LJIILLIIL);
                    ((HashMap) c0wmwLIZ.LIZ).put(C0WMV.class, new C0WMV());
                    return false;
                }

                @Override // X.C0WON
                public final void LIZJ(C0WLA c0wla) {
                    ((HashMap) C0WMX.LIZ().LIZ).remove(C0WMV.class);
                }
            });
        }
        SparkSecurityServiceCenter.INSTANCE.registerService(SparkSecurityJSBService.class, new JSBridgeNetColoringServiceImpl(c0wmr2));
    }
}
