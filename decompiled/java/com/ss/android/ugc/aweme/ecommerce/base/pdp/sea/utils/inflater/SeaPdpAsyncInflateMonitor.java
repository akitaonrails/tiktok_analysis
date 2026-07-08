package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.utils.inflater;

import X.C034S;
import X.C03XI;
import X.C1018703yb;
import X.C10488048g;
import X.C1120604Zw;
import X.C13LP;
import X.C1AQS;
import X.C2097608Jq;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.asyncinflater.IEcomAsyncInflateMonitor;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SeaPdpAsyncInflateMonitor implements IEcomAsyncInflateMonitor {
    @Override // com.ss.android.ugc.aweme.ecommerce.asyncinflater.IEcomAsyncInflateMonitor
    public final void LIZ(boolean z, int i, String str, long j, Throwable th) {
        IECommerceHostService iECommerceHostService;
        String message;
        boolean z2;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (!((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            return;
        }
        List<C03XI> list = C10488048g.LIZ;
        if (!C13LP.LJJJJ(Integer.valueOf(i), (Set) C10488048g.LJ.getValue())) {
            return;
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("is_success", Boolean.valueOf(z));
        pairArr[1] = new Pair("layout_id", String.valueOf(i));
        pairArr[2] = new Pair("layout_name", str);
        pairArr[3] = new Pair("time_cost", Long.valueOf(j));
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        pairArr[4] = new Pair("error_msg", message);
        pairArr[5] = new Pair("business", "sea_pdp");
        C1018703yb.LJ("ec_ultimate_inflater_preload_result", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.asyncinflater.IEcomAsyncInflateMonitor
    public final void LIZIZ(boolean z, int i, String str, String str2, long j, Throwable th) {
        IECommerceHostService iECommerceHostService;
        boolean z2;
        String message;
        boolean z3;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (!((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            return;
        }
        List<C03XI> list = C10488048g.LIZ;
        if (!C13LP.LJJJJ(Integer.valueOf(i), (Set) C10488048g.LJ.getValue())) {
            return;
        }
        if (Intrinsics.LJFF(str2, "NO_CACHE") && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("is_success", Boolean.valueOf(z));
        pairArr[1] = new Pair("layout_id", String.valueOf(i));
        pairArr[2] = new Pair("layout_name", str);
        pairArr[3] = new Pair("cache_type", str2);
        pairArr[4] = new Pair("time_cost", Long.valueOf(j));
        pairArr[5] = new Pair("is_fallback", Boolean.valueOf(z2));
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        pairArr[6] = new Pair("error_msg", message);
        pairArr[7] = new Pair("business", "sea_pdp");
        C1018703yb.LJ("ec_ultimate_inflater_inflate_result", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
