package com.ss.android.ugc.aweme.ecommerce.dependency.ecug;

import X.C04TD;
import X.InterfaceC2211711BhJ;
import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPdpPageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ECUgPdpPageDependencyService implements IECUgPdpPageDependencyService {
    public void initService() {
    }

    public static IECUgPdpPageDependencyService createIECUgPdpPageDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IECUgPdpPageDependencyService.class, z);
        if (objLIZ != null) {
            return (IECUgPdpPageDependencyService) objLIZ;
        }
        if (C04TD.r == null) {
            synchronized (IECUgPdpPageDependencyService.class) {
                if (C04TD.r == null) {
                    C04TD.r = new ECUgPdpPageDependencyService();
                }
            }
        }
        return C04TD.r;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPdpPageDependencyService
    public String handlePdpShareInfo(String str, String str2, Map<String, Object> map) {
        String strHandlePdpShareInfo;
        IEcUgOutOfAppService iEcUgOutOfAppService = (IEcUgOutOfAppService) PluggableExtentionKt.pluggableSpi$default(IEcUgOutOfAppService.class, false, false, false, 14, null);
        if (iEcUgOutOfAppService == null || (strHandlePdpShareInfo = iEcUgOutOfAppService.handlePdpShareInfo(str, str2, map)) == null) {
            return "";
        }
        return strHandlePdpShareInfo;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPdpPageDependencyService
    public void onPdpFragmentRenderCompleted(Activity activity, boolean z, Map<String, ? extends Object> map) {
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            iEcUgPopupService.onPdpFragmentRenderCompleted(activity, z, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPdpPageDependencyService
    public void onPdpFragmentOnDestroy(Activity activity, InterfaceC2211711BhJ interfaceC2211711BhJ, boolean z, Map<String, ? extends Object> map) {
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            iEcUgPopupService.onPdpFragmentOnDestroy(activity, interfaceC2211711BhJ, z, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPdpPageDependencyService
    public void onPopupFragmentExpandFull(Activity activity, String str, Map<String, ? extends Object> map, String str2) {
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            iEcUgPopupService.onPopupFragmentExpandFull(activity, str, map, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPdpPageDependencyService
    public void onPdpFragmentOnCreate(Activity activity, InterfaceC2211711BhJ interfaceC2211711BhJ, boolean z, Map<String, ? extends Object> map, String str) {
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            iEcUgPopupService.onPdpFragmentOnCreate(activity, interfaceC2211711BhJ, z, map, str);
        }
    }
}
