package com.ss.android.ugc.aweme.ecommerce.dependency.account;

import X.C04TD;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IGuestModeDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes3.dex */
public final class GuestModeDependencyService implements IGuestModeDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IGuestModeDependencyService
    public Boolean isGuestMode() {
        IGuestModeService iGuestModeService = (IGuestModeService) PluggableExtentionKt.pluggableSpi$default(IGuestModeService.class, false, false, false, 14, null);
        if (iGuestModeService != null) {
            return Boolean.valueOf(iGuestModeService.isGuestMode());
        }
        return null;
    }

    public static IGuestModeDependencyService createIGuestModeDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IGuestModeDependencyService.class, z);
        if (objLIZ != null) {
            return (IGuestModeDependencyService) objLIZ;
        }
        if (C04TD.LLZLLIL == null) {
            synchronized (IGuestModeDependencyService.class) {
                if (C04TD.LLZLLIL == null) {
                    C04TD.LLZLLIL = new GuestModeDependencyService();
                }
            }
        }
        return C04TD.LLZLLIL;
    }
}
