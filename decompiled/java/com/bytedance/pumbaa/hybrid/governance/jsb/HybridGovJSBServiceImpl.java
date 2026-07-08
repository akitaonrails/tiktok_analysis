package com.bytedance.pumbaa.hybrid.governance.jsb;

import X.C01GW;
import X.C04TD;
import X.C08XD;
import X.C0WM7;
import X.C0WMA;
import X.C0WMB;
import X.C0WMG;
import X.C0WMM;
import X.C0WMN;
import X.C0WN8;
import X.C452501pT;
import Y.AComparatorS32S0000000_13;
import Y.AComparatorS512S0100000_13;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService;
import com.bytedance.pumbaa.hybrid.governance.api.IHybridJsbGovService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridGovJSBServiceImpl extends C0WM7<C0WMN> implements IHybridJsbGovService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(47));

    public static IHybridJsbGovService LJ() {
        Object objLIZ = C04TD.LIZ(IHybridJsbGovService.class, false);
        if (objLIZ != null) {
            return (IHybridJsbGovService) objLIZ;
        }
        if (C04TD.LJJJJ == null) {
            synchronized (IHybridJsbGovService.class) {
                if (C04TD.LJJJJ == null) {
                    C04TD.LJJJJ = new HybridGovJSBServiceImpl();
                }
            }
        }
        return C04TD.LJJJJ;
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final C0WN8 LIZIZ() {
        return C0WN8.JSBridge;
    }

    @Override // X.C0WM7, com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void LIZJ(C0WMB c0wmb) {
        if ((c0wmb instanceof C0WMM) && c0wmb != null) {
            C0WMG c0wmg = (C0WMG) this.LIZ.getValue();
            ((ArrayList) c0wmg.LIZ).remove(c0wmb);
            C08XD.LJJ(c0wmg.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(29), 4));
        }
    }

    @Override // X.C0WM7
    public final void LIZLLL(C0WMN c0wmn) {
        C0WMN c0wmn2 = c0wmn;
        if (c0wmn2 != null && !c0wmn2.LIZ) {
            return;
        }
        SparkSecurityServiceCenter.INSTANCE.registerService(SparkSecurityJSBService.class, new JSBridgeIFrameGovServiceImpl((C0WMG) this.LIZ.getValue()));
    }

    @Override // X.C0WM7, com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void addAction(C0WMB c0wmb) {
        if ((c0wmb instanceof C0WMM) && c0wmb != null) {
            C0WMG c0wmg = (C0WMG) this.LIZ.getValue();
            c0wmg.getClass();
            C0WMA.LIZJ(c0wmb);
            ((ArrayList) c0wmg.LIZ).add(c0wmb);
            C08XD.LJJ(c0wmg.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(29), 4));
        }
    }
}
