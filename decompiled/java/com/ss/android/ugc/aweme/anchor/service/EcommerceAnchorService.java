package com.ss.android.ugc.aweme.anchor.service;

import X.C04TD;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class EcommerceAnchorService implements IEcommerceAnchorService {
    public static IEcommerceAnchorService LIZJ() {
        Object objLIZ = C04TD.LIZ(IEcommerceAnchorService.class, false);
        if (objLIZ != null) {
            return (IEcommerceAnchorService) objLIZ;
        }
        if (C04TD.LLFFF == null) {
            synchronized (IEcommerceAnchorService.class) {
                if (C04TD.LLFFF == null) {
                    C04TD.LLFFF = new EcommerceAnchorService();
                }
            }
        }
        return C04TD.LLFFF;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IEcommerceAnchorService
    public final boolean LIZ() {
        return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IEcommerceAnchorService
    public final Map<String, Object> LIZIZ(Aweme aweme) {
        return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJII(aweme);
    }
}
