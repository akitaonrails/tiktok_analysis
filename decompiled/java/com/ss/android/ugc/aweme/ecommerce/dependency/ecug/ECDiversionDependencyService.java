package com.ss.android.ugc.aweme.ecommerce.dependency.ecug;

import X.C04TD;
import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECDiversionDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ECDiversionDependencyService implements IECDiversionDependencyService {
    public void initService() {
    }

    public static IECDiversionDependencyService createIECDiversionDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IECDiversionDependencyService.class, z);
        if (objLIZ != null) {
            return (IECDiversionDependencyService) objLIZ;
        }
        if (C04TD.p == null) {
            synchronized (IECDiversionDependencyService.class) {
                if (C04TD.p == null) {
                    C04TD.p = new ECDiversionDependencyService();
                }
            }
        }
        return C04TD.p;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECDiversionDependencyService
    public void onPopupFragmentOnDestroy(Activity activity, Map<String, ? extends Object> map) {
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            iEcUgPopupService.onPopupFragmentOnDestroy(activity, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECDiversionDependencyService
    public void onPopupFragmentRenderCompleted(Activity activity, Map<String, ? extends Object> map) {
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            iEcUgPopupService.onPopupFragmentRenderCompleted(activity, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECDiversionDependencyService
    public void onPopupFragmentOnCreate(Activity activity, String str, Map<String, ? extends Object> map, String str2, String str3) {
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            iEcUgPopupService.onPopupFragmentOnCreate(activity, str, map, str2, str3);
        }
    }
}
