package com.ss.android.ugc.aweme.ecommerce.dependency.commonutils;

import X.C04TD;
import X.C19724912Fj;
import X.C21316318bR;
import X.InterfaceC1763090vyt;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService;

/* JADX INFO: loaded from: classes33.dex */
public final class CommonUtilsDependencyService implements ICommonUtilsDependencyService {
    public final InterfaceC1763090vyt configurationChangedManager = new C21316318bR();

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService
    public InterfaceC1763090vyt getConfigurationChangedManager() {
        return this.configurationChangedManager;
    }

    public static ICommonUtilsDependencyService createICommonUtilsDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ICommonUtilsDependencyService.class, z);
        if (objLIZ != null) {
            return (ICommonUtilsDependencyService) objLIZ;
        }
        if (C04TD.e == null) {
            synchronized (ICommonUtilsDependencyService.class) {
                if (C04TD.e == null) {
                    C04TD.e = new CommonUtilsDependencyService();
                }
            }
        }
        return C04TD.e;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService
    public boolean openRouterWithParam(Activity activity, String str, Bundle bundle) {
        return C19724912Fj.LIZLLL().LJIIIZ(activity, str, bundle, null);
    }
}
