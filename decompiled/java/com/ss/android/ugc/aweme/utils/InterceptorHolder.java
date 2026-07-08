package com.ss.android.ugc.aweme.utils;

import X.C01GW;
import X.C04TD;
import X.C0X0T;
import X.C0X15;
import X.C277680AuU;
import X.C841830X0r;
import X.C841860X0u;
import X.InterfaceC836900WsK;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider;
import com.ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import com.ss.android.ugc.aweme.net.monitor.OkHttpMonitorInterceptor;
import com.ss.android.ugc.aweme.service.IComplianceOfflineService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class InterceptorHolder implements InterceptorProvider {
    public static InterceptorProvider LIZLLL() {
        Object objLIZ = C04TD.LIZ(InterceptorProvider.class, false);
        if (objLIZ != null) {
            return (InterceptorProvider) objLIZ;
        }
        if (C04TD.V5 == null) {
            synchronized (InterceptorProvider.class) {
                if (C04TD.V5 == null) {
                    C04TD.V5 = new InterceptorHolder();
                }
            }
        }
        return C04TD.V5;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider
    public final List LIZ() {
        ArrayList arrayList = new ArrayList();
        if (!((Boolean) C277680AuU.LIZ.getValue()).booleanValue()) {
            arrayList.add(new FeedRetryInterceptorTTNet());
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider
    public final void LIZIZ() {
        C0X0T c0x0t = new C0X0T();
        C01GW<Boolean> c01gw = C841860X0u.LIZ;
        C841830X0r.LIZ(c0x0t);
        C841830X0r.LIZ(ComplianceServiceProvider.LJII().LJFF());
        C841830X0r.LIZ(ComplianceServiceProvider.LJII().LJIIZILJ());
        C841830X0r.LIZ(ComplianceServiceProvider.LJII().LJIJI());
        C841830X0r.LIZ(ComplianceServiceProvider.LJII().LJIJJLI());
        IComplianceOfflineService iComplianceOfflineService = (IComplianceOfflineService) ServiceManager.get().getService(IComplianceOfflineService.class);
        if (iComplianceOfflineService != null) {
            iComplianceOfflineService.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider
    public final List<InterfaceC836900WsK> LIZJ() {
        ArrayList arrayList = new ArrayList();
        if (!C0X15.LIZ().enable) {
            arrayList.add(new OkHttpMonitorInterceptor());
        }
        return arrayList;
    }
}
