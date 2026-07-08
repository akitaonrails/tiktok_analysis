package com.ss.android.ugc.aweme.ecommerce.dependency.tab;

import X.C04TD;
import X.C0DMM;
import X.C0S4U;
import X.C19EG;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.tab.ITabDependencyService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class TabDependencyService implements ITabDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.tab.ITabDependencyService
    public int getBottomBarAdaptationHeightDp() {
        return 50;
    }

    public void initService() {
    }

    public static ITabDependencyService createITabDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ITabDependencyService.class, z);
        if (objLIZ != null) {
            return (ITabDependencyService) objLIZ;
        }
        if (C04TD.T == null) {
            synchronized (ITabDependencyService.class) {
                if (C04TD.T == null) {
                    C04TD.T = new TabDependencyService();
                }
            }
        }
        return C04TD.T;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.tab.ITabDependencyService
    public boolean isCurrentProfileTab(C19EG c19eg) {
        String strZj2;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        if (c19eg != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
            strZj2 = homeTabAbilityLIZ.Zj2();
        } else {
            strZj2 = null;
        }
        return Intrinsics.LJFF(strZj2, "USER");
    }
}
