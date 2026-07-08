package com.bytedance.pumbaa.hybrid.governance.jsi;

import X.C01GW;
import X.C04TD;
import X.C08XD;
import X.C0WM7;
import X.C0WMA;
import X.C0WMB;
import X.C0WMH;
import X.C0WMO;
import X.C0WN8;
import X.C452501pT;
import Y.AComparatorS32S0000000_13;
import Y.AComparatorS512S0100000_13;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSIService;
import com.bytedance.pumbaa.hybrid.governance.api.IHybridJsiGovService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridGovJSIServiceImpl extends C0WM7<C0WMO> implements IHybridJsiGovService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(48));

    public static IHybridJsiGovService LJ() {
        Object objLIZ = C04TD.LIZ(IHybridJsiGovService.class, false);
        if (objLIZ != null) {
            return (IHybridJsiGovService) objLIZ;
        }
        if (C04TD.LJJJJI == null) {
            synchronized (IHybridJsiGovService.class) {
                if (C04TD.LJJJJI == null) {
                    C04TD.LJJJJI = new HybridGovJSIServiceImpl();
                }
            }
        }
        return C04TD.LJJJJI;
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final C0WN8 LIZIZ() {
        return C0WN8.JSInterface;
    }

    @Override // X.C0WM7, com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void LIZJ(C0WMB c0wmb) {
        C0WMH c0wmh = (C0WMH) this.LIZ.getValue();
        ((ArrayList) c0wmh.LIZ).remove(c0wmb);
        C08XD.LJJ(c0wmh.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(37), 6));
    }

    @Override // X.C0WM7
    public final void LIZLLL(C0WMO c0wmo) {
        C0WMO c0wmo2 = c0wmo;
        if (c0wmo2 != null && !c0wmo2.LIZ) {
            return;
        }
        SparkSecurityServiceCenter.INSTANCE.registerService(SparkSecurityJSIService.class, new JavaScriptInterfaceGovServiceImpl((C0WMH) this.LIZ.getValue()));
    }

    @Override // X.C0WM7, com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void addAction(C0WMB c0wmb) {
        C0WMH c0wmh = (C0WMH) this.LIZ.getValue();
        c0wmh.getClass();
        C0WMA.LIZJ(c0wmb);
        ((ArrayList) c0wmh.LIZ).add(c0wmb);
        C08XD.LJJ(c0wmh.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(37), 6));
    }
}
