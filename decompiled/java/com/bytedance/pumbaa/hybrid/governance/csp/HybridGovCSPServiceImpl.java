package com.bytedance.pumbaa.hybrid.governance.csp;

import X.C04TD;
import X.C0WM7;
import X.C0WN8;
import X.C1200904mt;
import X.C821960WMg;
import X.C822000WMk;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityModifyResourceService;
import com.bytedance.pumbaa.hybrid.governance.api.IHybridCspGovService;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridGovCSPServiceImpl extends C0WM7<C822000WMk> implements IHybridCspGovService {
    public static IHybridCspGovService LJ() {
        Object objLIZ = C04TD.LIZ(IHybridCspGovService.class, false);
        if (objLIZ != null) {
            return (IHybridCspGovService) objLIZ;
        }
        if (C04TD.LJJJIL == null) {
            synchronized (IHybridCspGovService.class) {
                if (C04TD.LJJJIL == null) {
                    C04TD.LJJJIL = new HybridGovCSPServiceImpl();
                }
            }
        }
        return C04TD.LJJJIL;
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final C0WN8 LIZIZ() {
        return C0WN8.CSP;
    }

    @Override // X.C0WM7
    public final void LIZLLL(C822000WMk c822000WMk) {
        C822000WMk c822000WMk2 = c822000WMk;
        if (c822000WMk2 != null && !c822000WMk2.LIZ) {
            return;
        }
        SparkSecurityServiceCenter sparkSecurityServiceCenter = SparkSecurityServiceCenter.INSTANCE;
        PnsOfflineResComplianceModel pnsOfflineResComplianceModel = C1200904mt.LIZ;
        PnsOfflineResComplianceModel pnsOfflineResComplianceModel2 = (PnsOfflineResComplianceModel) C821960WMg.LIZ(PnsOfflineResComplianceModel.class, "pns_offline_resource_compliance", pnsOfflineResComplianceModel);
        if (pnsOfflineResComplianceModel2 != null) {
            pnsOfflineResComplianceModel = pnsOfflineResComplianceModel2;
        }
        sparkSecurityServiceCenter.registerService(SparkSecurityModifyResourceService.class, new AddCspHeaderServiceImpl(pnsOfflineResComplianceModel));
    }
}
