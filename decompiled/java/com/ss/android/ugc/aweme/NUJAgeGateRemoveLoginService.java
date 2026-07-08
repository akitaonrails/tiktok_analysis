package com.ss.android.ugc.aweme;

import X.C0C64;
import X.C1400250mXf;
import X.C1514430pVp;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INUJAgeGateRemoveLoginService;
import com.ss.android.ugc.aweme.plugin.IPluginService;

/* JADX INFO: loaded from: classes13.dex */
public final class NUJAgeGateRemoveLoginService implements INUJAgeGateRemoveLoginService {
    @Override // com.ss.android.ugc.aweme.journey.INUJAgeGateRemoveLoginService
    public final boolean LIZ() {
        String storeRegionUpperCase;
        IPluginService iPluginService;
        IPluginService.ReinstallCheck deviceCheckResult;
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            return false;
        }
        C1400250mXf.LIZ.getClass();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (storeRegionUpperCase = iAccountService.getStoreRegionUpperCase()) == null) {
            storeRegionUpperCase = "";
        }
        if (!C1400250mXf.LIZIZ.contains(storeRegionUpperCase) || (iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null)) == null || (deviceCheckResult = iPluginService.getDeviceCheckResult()) == null || deviceCheckResult != IPluginService.ReinstallCheck.NON_REINSTALL) {
            return false;
        }
        return C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "remove_age_login", false, false);
    }
}
