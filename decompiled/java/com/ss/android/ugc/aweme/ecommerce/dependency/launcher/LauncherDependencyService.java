package com.ss.android.ugc.aweme.ecommerce.dependency.launcher;

import X.C04TD;
import X.C19EG;
import X.C1BYN;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;

/* JADX INFO: loaded from: classes31.dex */
public final class LauncherDependencyService implements ILauncherDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService
    public String getSessionId() {
        return C1BYN.LIZIZ.getSessionId();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService
    public void initPowerPreload() {
        ((ILauncherTaskApi) ServiceManager.get().getService(ILauncherTaskApi.class)).initPowerPreload();
    }

    public static ILauncherDependencyService createILauncherDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ILauncherDependencyService.class, z);
        if (objLIZ != null) {
            return (ILauncherDependencyService) objLIZ;
        }
        if (C04TD.x == null) {
            synchronized (ILauncherDependencyService.class) {
                if (C04TD.x == null) {
                    C04TD.x = new LauncherDependencyService();
                }
            }
        }
        return C04TD.x;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService
    public Lifecycle requireTopSAFExpLifecycle(C19EG c19eg, boolean z) {
        return IMainSAFLifecycleKt.requireTopSAFExpLifecycle(c19eg, z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService
    public LifecycleOwner requireTopSAFExpLifecycleOwner(Fragment fragment, boolean z) {
        return IMainSAFLifecycleKt.requireSAFExpLifecycleOwner(fragment, z, (C19EG) null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService
    public LifecycleOwner requireTopSAFExpLifecycleOwner(C19EG c19eg, boolean z) {
        return IMainSAFLifecycleKt.requireTopSAFExpLifecycleOwner(c19eg, z);
    }
}
