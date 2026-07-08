package com.bytedance.pumbaa.hybrid.governance.navigation;

import X.C01GW;
import X.C04TD;
import X.C08XD;
import X.C0WM7;
import X.C0WMA;
import X.C0WMB;
import X.C0WMK;
import X.C0WMS;
import X.C0WN8;
import X.C452501pT;
import Y.AComparatorS32S0000000_13;
import Y.AComparatorS512S0100000_13;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebNavigationService;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.pumbaa.hybrid.governance.api.IHybridNavigationGovService;
import com.bytedance.pumbaa.hybrid.governance.navigation.ext.HybridGovWebViewClientExt;
import com.bytedance.pumbaa.hybrid.governance.navigation.ext.HybridGovWebViewProviderExt;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridGovNavigationServiceImpl extends C0WM7<C0WMS> implements IHybridNavigationGovService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(49));

    public static IHybridNavigationGovService LJ() {
        Object objLIZ = C04TD.LIZ(IHybridNavigationGovService.class, false);
        if (objLIZ != null) {
            return (IHybridNavigationGovService) objLIZ;
        }
        if (C04TD.LJJJJJ == null) {
            synchronized (IHybridNavigationGovService.class) {
                if (C04TD.LJJJJJ == null) {
                    C04TD.LJJJJJ = new HybridGovNavigationServiceImpl();
                }
            }
        }
        return C04TD.LJJJJJ;
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final C0WN8 LIZIZ() {
        return C0WN8.NAVIGATION;
    }

    @Override // X.C0WM7, com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void LIZJ(C0WMB c0wmb) {
        C0WMK c0wmk = (C0WMK) this.LIZ.getValue();
        ((ArrayList) c0wmk.LIZ).remove(c0wmb);
        C08XD.LJJ(c0wmk.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(45), 9));
    }

    @Override // X.C0WM7
    public final void LIZLLL(C0WMS c0wms) {
        C0WMS c0wms2 = c0wms;
        if (c0wms2 != null && !c0wms2.LIZ) {
            return;
        }
        SparkSecurityServiceCenter.INSTANCE.registerService(SparkSecurityWebNavigationService.class, new ThirdWebNavigationServiceImpl((C0WMK) this.LIZ.getValue()));
        WebViewHooker.LIZLLL(new HybridGovWebViewClientExt());
        WebViewHooker.LJ(new HybridGovWebViewProviderExt());
    }

    @Override // X.C0WM7, com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void addAction(C0WMB c0wmb) {
        C0WMK c0wmk = (C0WMK) this.LIZ.getValue();
        c0wmk.getClass();
        C0WMA.LIZJ(c0wmb);
        ((ArrayList) c0wmk.LIZ).add(c0wmb);
        C08XD.LJJ(c0wmk.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(45), 9));
    }
}
