package com.ss.android.ugc.aweme.ecommerce.mall;

import X.C04TD;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class MallServiceManager implements IMallServiceManager {
    public static IMallServiceManager LIZIZ() {
        Object objLIZ = C04TD.LIZ(IMallServiceManager.class, false);
        if (objLIZ != null) {
            return (IMallServiceManager) objLIZ;
        }
        if (C04TD.V == null) {
            synchronized (IMallServiceManager.class) {
                if (C04TD.V == null) {
                    C04TD.V = new MallServiceManager();
                }
            }
        }
        return C04TD.V;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager
    public final IShopIconService LIZ() {
        return (IShopIconService) ServiceManager.get().getService(IShopIconService.class);
    }
}
