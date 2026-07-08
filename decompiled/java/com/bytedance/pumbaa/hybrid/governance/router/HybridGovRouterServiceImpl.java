package com.bytedance.pumbaa.hybrid.governance.router;

import X.C04TD;
import X.C0VZK;
import X.C0VZT;
import X.C0WM7;
import X.C0WMA;
import X.C0WMB;
import X.C0WN8;
import X.C0WNH;
import X.C0WNL;
import X.C0WNM;
import X.C1104804Tu;
import X.C19719612Di;
import X.C790430UzZ;
import X.C822110WMv;
import X.EnumC822260WNk;
import android.app.Application;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebRouterService;
import com.bytedance.pumbaa.hybrid.governance.api.IHybridRouterGovService;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridGovRouterServiceImpl extends C0WM7<C0WNM> implements IHybridRouterGovService {
    public C822110WMv LIZ;

    public static IHybridRouterGovService LJ() {
        Object objLIZ = C04TD.LIZ(IHybridRouterGovService.class, false);
        if (objLIZ != null) {
            return (IHybridRouterGovService) objLIZ;
        }
        if (C04TD.LJJJJL == null) {
            synchronized (IHybridRouterGovService.class) {
                if (C04TD.LJJJJL == null) {
                    C04TD.LJJJJL = new HybridGovRouterServiceImpl();
                }
            }
        }
        return C04TD.LJJJJL;
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final C0WN8 LIZIZ() {
        return C0WN8.ROUTER;
    }

    @Override // X.C0WM7, com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void LIZJ(C0WMB c0wmb) {
        C822110WMv c822110WMv = this.LIZ;
        if (c822110WMv != null) {
            C0WNH c0wnh = (C0WNH) c0wmb;
            C19719612Di.LJJIIJ(c822110WMv.LIZJ, new AwS592S0100000_13(c0wnh, 60), true);
            C19719612Di.LJJIIJ(c822110WMv.LIZLLL, new AwS592S0100000_13(c0wnh, 61), true);
            C19719612Di.LJJIIJ(c822110WMv.LJ, new AwS592S0100000_13(c0wnh, 62), true);
            C19719612Di.LJJIIJ(c822110WMv.LJFF, new AwS592S0100000_13(c0wnh, 63), true);
            c822110WMv.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0WMx] */
    @Override // X.C0WM7
    public final void LIZLLL(C0WNM c0wnm) {
        C0WNM c0wnm2 = c0wnm;
        if (c0wnm2 != null && !c0wnm2.LIZ) {
            return;
        }
        C790430UzZ c790430UzZ = C0VZK.LIZ;
        if (c790430UzZ != null) {
            Application application = c790430UzZ.LIZ;
            boolean z = c790430UzZ.LIZIZ;
            if (C0VZT.LIZ == null) {
                C0VZT.LIZ = application;
                C0VZT.LIZIZ = z;
                application.registerActivityLifecycleCallbacks(C0VZT.LJIIIIZZ);
            }
        }
        C822110WMv c822110WMv = new C822110WMv(c0wnm2);
        this.LIZ = c822110WMv;
        SparkSecurityServiceCenter.INSTANCE.registerService(SparkSecurityWebRouterService.class, new ThirdWebRouterServiceImpl(c822110WMv));
        C1104804Tu.LIZ().LIZJ(EnumC822260WNk.Isolate, new C0WNL() { // from class: X.0WMx
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:73:0x0174  */
            @Override // X.C0WNL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0WM1 LIZ(X.C0WMD r12, com.bytedance.pumbaa.hybrid.engine.api.model.RuleModel r13) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 414
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C822130WMx.LIZ(X.0WMD, com.bytedance.pumbaa.hybrid.engine.api.model.RuleModel):X.0WM1");
            }
        });
    }

    @Override // X.C0WM7, com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void addAction(C0WMB c0wmb) {
        C822110WMv c822110WMv = this.LIZ;
        if (c822110WMv != null) {
            C0WNH c0wnh = (C0WNH) c0wmb;
            C0WMA.LIZJ(c0wnh);
            c822110WMv.LIZLLL(c0wnh);
            c822110WMv.LJ();
        }
    }
}
