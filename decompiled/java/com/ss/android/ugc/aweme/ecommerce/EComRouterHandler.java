package com.ss.android.ugc.aweme.ecommerce;

import X.C1059860dge;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.service.IEComRouterHandlerInternalService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxService;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class EComRouterHandler implements IEcomRouteOpenHandler {
    @Override // com.ss.android.ugc.aweme.ecommerce.IEcomRouteOpenHandler
    public final boolean LIZ(String str, Map<String, ? extends Object> map, Context context, C1059860dge c1059860dge) {
        IEcRaxService iEcRaxService = (IEcRaxService) PluggableExtentionKt.pluggableSpi$default(IEcRaxService.class, false, false, false, 14, null);
        if (iEcRaxService != null) {
            iEcRaxService.LIZLLL();
        }
        Iterator it2 = ServiceManager.get().getServices(IEComRouterHandlerInternalService.class).iterator();
        while (it2.hasNext()) {
            ((IEComRouterHandlerInternalService) it2.next()).LIZ(str, context, c1059860dge);
        }
        return false;
    }
}
