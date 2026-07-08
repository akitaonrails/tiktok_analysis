package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.monitor;

import X.C01CU;
import X.C034S;
import X.C1120604Zw;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1AQS;
import X.C21186817ve;
import X.C21186917vf;
import X.C21187717vn;
import X.C21187817vo;
import X.C21187917vp;
import X.C21188017vq;
import X.C2188811AlT;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class ToastResultHandler implements IResultHandler {
    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler
    public final List<Class<? extends C21186817ve>> LIZ() {
        return C1697810uHb.LJIIJJI(C21188017vq.class, C21186917vf.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler
    public final void LIZIZ(String str, String str2, long j, String str3, List<? extends C21186817ve> list, long j2, String str4, String str5, C01CU c01cu) {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        boolean z;
        boolean z2;
        String name;
        C21187917vp c21187917vp = C21187917vp.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToastResultHandler: ");
        sbLIZ.append(((ArrayList) list).size());
        C2188811AlT.LIZIZ(sbLIZ);
        String name2 = null;
        C21187917vp.LIZ(c21187917vp, null, 6);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (!((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name2 = iECommerceHostService2.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (!((IApplicationDependencyService) iECommerceHostService2).isRegressionTest()) {
                return;
            }
        }
        if (!r2.isEmpty()) {
            if (C21187717vn.LIZ().debugConfig.enable || C21187817vo.LIZ().debugConfig.enable) {
                IEComOfflineService iEComOfflineService = (IEComOfflineService) ServiceManager.get().getService(IEComOfflineService.class);
                C1741890vQh.LJIIIIZZ(list);
                iEComOfflineService.LJ();
            }
        }
    }
}
