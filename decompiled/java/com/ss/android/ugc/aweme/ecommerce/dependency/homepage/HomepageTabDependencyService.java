package com.ss.android.ugc.aweme.ecommerce.dependency.homepage;

import X.C04TD;
import X.C1204000hR8;
import X.EnumC1593290rZ1;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.homepage.IHomepageTabDependencyService;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;

/* JADX INFO: loaded from: classes25.dex */
public final class HomepageTabDependencyService implements IHomepageTabDependencyService {
    public void initService() {
    }

    public static IHomepageTabDependencyService createIHomepageTabDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IHomepageTabDependencyService.class, z);
        if (objLIZ != null) {
            return (IHomepageTabDependencyService) objLIZ;
        }
        if (C04TD.w == null) {
            synchronized (IHomepageTabDependencyService.class) {
                if (C04TD.w == null) {
                    C04TD.w = new HomepageTabDependencyService();
                }
            }
        }
        return C04TD.w;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.homepage.IHomepageTabDependencyService
    public void onCacheRefreshTrigger(boolean z) {
        String str;
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ != null) {
            if (z) {
                str = "Shop";
            } else {
                str = "SHOP_MALL";
            }
            tabSwitchMetricServiceLIZ.LIZIZ(str, EnumC1593290rZ1.LYNX, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.homepage.IHomepageTabDependencyService
    public void onFetchRefreshTrigger(boolean z) {
        String str;
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ != null) {
            if (z) {
                str = "Shop";
            } else {
                str = "SHOP_MALL";
            }
            tabSwitchMetricServiceLIZ.LJIIJ(str, EnumC1593290rZ1.LYNX);
        }
    }
}
