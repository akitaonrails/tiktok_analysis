package com.ss.android.ugc.aweme.ecommerce.showcase;

import X.C034S;
import X.C04TD;
import X.C1120604Zw;
import X.C1751450vg7;
import X.C1AQS;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.showcase.IECShowcaseSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceBusinessService;
import com.ss.android.ugc.aweme.ecommerce.showcase.settings.EcomStoreFgYkModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.saas.ecommerce.service.IShowcaseSaaSService;

/* JADX INFO: loaded from: classes20.dex */
public final class ShowcaseSaaSService implements IShowcaseSaaSService {
    public static IShowcaseSaaSService LIZ() {
        Object objLIZ = C04TD.LIZ(IShowcaseSaaSService.class, false);
        if (objLIZ != null) {
            return (IShowcaseSaaSService) objLIZ;
        }
        if (C04TD.Z == null) {
            synchronized (IShowcaseSaaSService.class) {
                if (C04TD.Z == null) {
                    C04TD.Z = new ShowcaseSaaSService();
                }
            }
        }
        return C04TD.Z;
    }

    @Override // com.ss.android.ugc.aweme.saas.ecommerce.service.IShowcaseSaaSService
    public final ProfileListFragment createProfileTab(int i) {
        IECommerceBusinessService iECommerceBusinessService;
        boolean z;
        String name;
        if (((EcomStoreFgYkModel) C1751450vg7.LIZIZ.getValue()).getDisableList().contains("shop_saas_disable")) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceBusinessService = (IECommerceBusinessService) PluggableExtentionKt.pluggableSpi$default(IECShowcaseSaaSService.class, false, false, false, 14, null);
                if (iECommerceBusinessService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IECShowcaseSaaSService.class.getName();
                if (iECommerceBusinessService != null) {
                    name = iECommerceBusinessService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 2, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceBusinessService = (IECommerceBusinessService) C1120604Zw.LIZJ.LIZLLL(IECShowcaseSaaSService.class);
            }
            IECShowcaseSaaSService iECShowcaseSaaSService = (IECShowcaseSaaSService) iECommerceBusinessService;
            if (iECShowcaseSaaSService == null) {
                return null;
            }
            return iECShowcaseSaaSService.createProfileTab(i);
        }
        TabShowCaseContainerFragment tabShowCaseContainerFragment = new TabShowCaseContainerFragment();
        tabShowCaseContainerFragment.LLILZLL = i;
        return tabShowCaseContainerFragment;
    }
}
