package com.bytedance.pumbaa.hybrid.monitor.jsb;

import X.C04TD;
import X.C0WLB;
import X.C0WLC;
import X.C0WQX;
import X.C2123408To;
import X.C2123508Tp;
import X.C823050WQl;
import com.bytedance.pumbaa.hybrid.api.IHybridHookService;
import com.bytedance.pumbaa.hybrid.monitor.api.IHybridJsbMonitorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridMonitorJsbServiceImpl implements IHybridJsbMonitorService {
    public C0WLC LIZ;

    public static IHybridJsbMonitorService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IHybridJsbMonitorService.class, false);
        if (objLIZ != null) {
            return (IHybridJsbMonitorService) objLIZ;
        }
        if (C04TD.LJJJJLI == null) {
            synchronized (IHybridJsbMonitorService.class) {
                if (C04TD.LJJJJLI == null) {
                    C04TD.LJJJJLI = new HybridMonitorJsbServiceImpl();
                }
            }
        }
        return C04TD.LJJJJLI;
    }

    @Override // com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService
    public final void LIZ(C0WLB c0wlb) {
        IHybridHookService iHybridHookService;
        C0WLB c0wlb2 = c0wlb;
        if (c0wlb2.LIZ && (iHybridHookService = (IHybridHookService) ServiceManager.get().getService(IHybridHookService.class)) != null) {
            C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
            c2123408To.LIZJ = 1;
            c2123408To.LIZIZ = "hybrid_security_monitor_jsb";
            C0WLC c0wlc = new C0WLC(c0wlb2, C823050WQl.LIZ(new C2123508Tp(c2123408To)));
            iHybridHookService.LIZJ(c0wlc);
            this.LIZ = c0wlc;
        }
    }

    @Override // com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService
    public final void LIZJ(C0WLB c0wlb) {
        C0WLB c0wlb2 = c0wlb;
        C0WLC c0wlc = this.LIZ;
        if (c0wlc != null) {
            c0wlc.LIZ = c0wlb2;
        }
    }
}
