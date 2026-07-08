package com.ss.android.ugc.aweme.ecommerce;

import com.ss.android.ugc.aweme.ecommerce.router.IThirdPartySparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEComThirdPartyHybridSparkInterceptorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ECommerceThirdPartyHybridServiceImpl implements IECommerceThirdPartyHybridService {
    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceThirdPartyHybridService
    public final List<IThirdPartySparkRouterInterceptor> LIZ(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ServiceManager.get().getServices(IEComThirdPartyHybridSparkInterceptorService.class).iterator();
        while (it2.hasNext()) {
            arrayList.addAll(((IEComThirdPartyHybridSparkInterceptorService) it2.next()).LIZ());
        }
        return arrayList;
    }
}
