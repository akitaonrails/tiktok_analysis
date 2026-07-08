package com.ss.android.ugc.aweme.ecommerce.core.preloader;

import X.AbstractRunnableC204495150b;
import X.C034S;
import X.C1120604Zw;
import X.C1326490kch;
import X.C1AQS;
import X.EnumC1153730g83;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: loaded from: classes21.dex */
public final class ECMallPreloadPdpResourceTask extends AbstractRunnableC204495150b {
    public ECMallPreloadPdpResourceTask() {
        super(EnumC1153730g83.MAIN_PAGE_ONLINE_RENDER, true);
    }

    @Override // X.AbstractRunnableC204495150b
    public final void LIZIZ(AwS397S0200000_31 awS397S0200000_31) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        C1326490kch.LJI("mall preload task start");
        IECommerceService iECommerceService = (IECommerceService) ServiceManager.get().getService(IECommerceService.class);
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
        iECommerceService.prefetchPdpResource("", ((IApplicationDependencyService) iECommerceHostService).getApplicationContext(), 8, true, null);
    }
}
