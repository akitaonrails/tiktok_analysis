package com.ss.android.ugc.aweme.ecommerce.dependency.buildconfigdiff;

import X.C04TD;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.buildconfigdiff.IBuildConfigDiffDependencyService;

/* JADX INFO: loaded from: classes3.dex */
public final class BuildConfigDIffDependencyService implements IBuildConfigDiffDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.buildconfigdiff.IBuildConfigDiffDependencyService
    public boolean getSecCaptchaRegionType() {
        return true;
    }

    public static IBuildConfigDiffDependencyService createIBuildConfigDiffDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IBuildConfigDiffDependencyService.class, z);
        if (objLIZ != null) {
            return (IBuildConfigDiffDependencyService) objLIZ;
        }
        if (C04TD.a == null) {
            synchronized (IBuildConfigDiffDependencyService.class) {
                if (C04TD.a == null) {
                    C04TD.a = new BuildConfigDIffDependencyService();
                }
            }
        }
        return C04TD.a;
    }
}
