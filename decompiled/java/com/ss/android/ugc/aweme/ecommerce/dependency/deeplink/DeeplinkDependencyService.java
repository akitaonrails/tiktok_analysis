package com.ss.android.ugc.aweme.ecommerce.dependency.deeplink;

import X.C04TD;
import X.C1619690sFb;
import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.deeplink.IDeeplinkDependencyService;

/* JADX INFO: loaded from: classes3.dex */
public final class DeeplinkDependencyService implements IDeeplinkDependencyService {
    public void initService() {
    }

    public static IDeeplinkDependencyService createIDeeplinkDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IDeeplinkDependencyService.class, z);
        if (objLIZ != null) {
            return (IDeeplinkDependencyService) objLIZ;
        }
        if (C04TD.k == null) {
            synchronized (IDeeplinkDependencyService.class) {
                if (C04TD.k == null) {
                    C04TD.k = new DeeplinkDependencyService();
                }
            }
        }
        return C04TD.k;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.deeplink.IDeeplinkDependencyService
    public void onFinish(Activity activity) {
        C1619690sFb.LIZ(activity, null);
    }
}
