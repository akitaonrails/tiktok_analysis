package com.ss.android.ugc.aweme.ecommerce.dependency.ecug;

import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgPopupDependencyService implements IEcUgPopupDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService
    public void checkPageSourceInfo(String str) {
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            iEcUgPopupService.checkPageSourceInfo(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService
    public Boolean isFromEcUg(Map<String, ? extends Object> map) {
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            return Boolean.valueOf(iEcUgPopupService.isFromEcUg(map));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService
    public Boolean isFromEcUgVSA(Map<String, ? extends Object> map) {
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            return Boolean.valueOf(iEcUgPopupService.isFromEcUgVSA(map));
        }
        return null;
    }
}
