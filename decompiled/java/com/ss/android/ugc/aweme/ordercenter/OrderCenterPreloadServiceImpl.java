package com.ss.android.ugc.aweme.ordercenter;

import X.C04TD;
import com.ss.android.ugc.aweme.setting.services.IOrderCenterPreloadService;

/* JADX INFO: loaded from: classes3.dex */
public final class OrderCenterPreloadServiceImpl implements IOrderCenterPreloadService {
    public static IOrderCenterPreloadService LIZ() {
        Object objLIZ = C04TD.LIZ(IOrderCenterPreloadService.class, false);
        if (objLIZ != null) {
            return (IOrderCenterPreloadService) objLIZ;
        }
        if (C04TD.V2 == null) {
            synchronized (IOrderCenterPreloadService.class) {
                if (C04TD.V2 == null) {
                    C04TD.V2 = new OrderCenterPreloadServiceImpl();
                }
            }
        }
        return C04TD.V2;
    }
}
