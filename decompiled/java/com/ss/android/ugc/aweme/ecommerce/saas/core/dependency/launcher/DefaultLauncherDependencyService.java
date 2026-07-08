package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher;

import X.C19EG;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultLauncherDependencyService implements ILauncherDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService
    public String getSessionId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService
    public void initPowerPreload() {
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService
    public LifecycleOwner requireTopSAFExpLifecycleOwner(C19EG c19eg, boolean z) {
        return c19eg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService
    public LifecycleOwner requireTopSAFExpLifecycleOwner(Fragment fragment, boolean z) {
        return fragment;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService
    public Lifecycle requireTopSAFExpLifecycle(C19EG c19eg, boolean z) {
        return c19eg.getLifecycle();
    }
}
