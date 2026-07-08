package com.ss.android.ugc.aweme.ecommerce.dependency.localtest;

import X.C04TD;
import X.C19273110af;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalTestDependencyService implements ILocalTestDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService
    public Boolean isPPEEnable() {
        LocalTestApi localTestApi = (LocalTestApi) PluggableExtentionKt.pluggableSpi$default(LocalTestApi.class, false, false, false, 14, null);
        if (localTestApi != null) {
            return Boolean.valueOf(localTestApi.isPPEEnable());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService
    public boolean enableBoe() {
        LocalTestApi localTestApiLIZ = C19273110af.LIZ();
        return localTestApiLIZ != null && localTestApiLIZ.enableBoe();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService
    public boolean enableManualDowngrade() {
        Boolean boolEnableManualDowngrade;
        LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        if (localTestApi == null || (boolEnableManualDowngrade = localTestApi.enableManualDowngrade()) == null) {
            return false;
        }
        return boolEnableManualDowngrade.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService
    public Map<String, String> getDownGradeList() {
        LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        if (localTestApi != null) {
            return localTestApi.getDownGradeList();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService
    public String getEcommerceBoeHost() {
        LocalTestApi localTestApiLIZ = C19273110af.LIZ();
        if (localTestApiLIZ != null) {
            return localTestApiLIZ.getEcommerceBoeHost();
        }
        return null;
    }

    public static ILocalTestDependencyService createILocalTestDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ILocalTestDependencyService.class, z);
        if (objLIZ != null) {
            return (ILocalTestDependencyService) objLIZ;
        }
        if (C04TD.B == null) {
            synchronized (ILocalTestDependencyService.class) {
                if (C04TD.B == null) {
                    C04TD.B = new LocalTestDependencyService();
                }
            }
        }
        return C04TD.B;
    }
}
