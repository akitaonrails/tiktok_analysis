package com.ss.android.ugc.aweme.ecommerce.router;

import X.C034S;
import X.C1120404Zu;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1AQS;
import android.os.SystemClock;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.util.Logger;
import com.ss.android.ugc.aweme.ecommerce.debug.IEcomDebugService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECBusinessInitService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ECRouterInit implements IECBusinessInitService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECBusinessInitService
    public final void init() {
        C1120404Zu c1120404Zu;
        IECommerceHostService iECommerceHostService;
        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
        c1120604Zw.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ == null || (c1120404Zu = c1121904a9LIZIZ.LIZ) == null || !c1120404Zu.LIZ) {
            return;
        }
        if (C034S.LIZ()) {
            c1120604Zw.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            c1120604Zw.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        IApplicationDependencyService iApplicationDependencyService = (IApplicationDependencyService) iECommerceHostService;
        SmartRouter.init(iApplicationDependencyService.getApplicationContext());
        Logger.setDebug(iApplicationDependencyService.isDebug());
        SmartRouter.configRouter(c1120404Zu.LIZIZ).withOtherSchemes((String[]) c1120404Zu.LIZJ.toArray(new String[0]));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((IEcSchemaService) ServiceManager.get().getService(IEcSchemaService.class)).LIZIZ());
        arrayList.addAll(((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).getECommerceRouterInterceptors());
        arrayList.addAll(((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).getEComPipeRouterInterceptors());
        IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
        if (iECommerceShowcaseService != null) {
            arrayList.addAll(iECommerceShowcaseService.LJI());
        }
        arrayList.addAll(((IEcomDebugService) ServiceManager.get().getService(IEcomDebugService.class)).LIZ());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SmartRouter.addInterceptor((IInterceptor) it2.next());
        }
    }
}
