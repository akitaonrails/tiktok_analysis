package com.ss.android.ugc.aweme.ecommerce.asyncinflater;

import X.C034S;
import X.C1120604Zw;
import X.C13SZ;
import X.C1AQS;
import X.C2188811AlT;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomAsyncInflateMonitorImpl implements IEcomAsyncInflateMonitor {
    @Override // com.ss.android.ugc.aweme.ecommerce.asyncinflater.IEcomAsyncInflateMonitor
    public final void LIZ(boolean z, int i, String str, long j, Throwable th) {
        String str2;
        if (z) {
            str2 = "preloadSuccess";
        } else {
            str2 = "preloadError";
        }
        LIZJ(str2, str, Integer.valueOf(i), "", j, th);
    }

    public static void LIZJ(String str, String str2, Integer num, String str3, long j, Throwable th) {
        IECommerceHostService iECommerceHostService;
        String strLIZIZ;
        boolean z;
        String name;
        boolean z2 = true;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcomAsyncInflater ");
            sbLIZ.append(str);
            sbLIZ.append(" => layoutId : ");
            sbLIZ.append(num);
            sbLIZ.append(" ; layoutName : ");
            sbLIZ.append(str2);
            sbLIZ.append(" ; ");
            if (str3.length() <= 0) {
                z2 = false;
            }
            String strLIZIZ2 = "";
            if (!z2) {
                strLIZIZ = "";
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cacheType : ");
                sbLIZ2.append(str3);
                sbLIZ2.append(" ; ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            sbLIZ.append(strLIZIZ);
            sbLIZ.append("timeCost : ");
            sbLIZ.append(j);
            sbLIZ.append(" ; ");
            if (th != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("throwable : ");
                sbLIZ3.append(C13SZ.LIZIZ(th));
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            }
            sbLIZ.append(strLIZIZ2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.asyncinflater.IEcomAsyncInflateMonitor
    public final void LIZIZ(boolean z, int i, String str, String str2, long j, Throwable th) {
        String str3;
        if (z) {
            str3 = "inflateSuccess";
        } else {
            str3 = "inflateError";
        }
        LIZJ(str3, str, Integer.valueOf(i), str2, j, th);
    }
}
