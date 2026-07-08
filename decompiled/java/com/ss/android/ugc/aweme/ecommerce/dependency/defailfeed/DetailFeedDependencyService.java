package com.ss.android.ugc.aweme.ecommerce.dependency.defailfeed;

import X.C04TD;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IDetailFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailFeedDependencyService implements IDetailFeedDependencyService {
    public void initService() {
    }

    public static IDetailFeedDependencyService createIDetailFeedDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IDetailFeedDependencyService.class, z);
        if (objLIZ != null) {
            return (IDetailFeedDependencyService) objLIZ;
        }
        if (C04TD.l == null) {
            synchronized (IDetailFeedDependencyService.class) {
                if (C04TD.l == null) {
                    C04TD.l = new DetailFeedDependencyService();
                }
            }
        }
        return C04TD.l;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IDetailFeedDependencyService
    public boolean startVideoFeed(Context context, RouteIntent routeIntent) {
        return ((IEcommerceAnchorOuterService) ServiceManager.get().getService(IEcommerceAnchorOuterService.class)).startVideoFeed(context, routeIntent);
    }
}
