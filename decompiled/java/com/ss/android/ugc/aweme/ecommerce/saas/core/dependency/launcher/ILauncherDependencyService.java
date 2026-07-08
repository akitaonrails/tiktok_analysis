package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher;

import X.C19EG;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes31.dex */
public interface ILauncherDependencyService extends IECommerceHostService {
    String getSessionId();

    void initPowerPreload();

    Lifecycle requireTopSAFExpLifecycle(C19EG c19eg, boolean z);

    LifecycleOwner requireTopSAFExpLifecycleOwner(C19EG c19eg, boolean z);

    LifecycleOwner requireTopSAFExpLifecycleOwner(Fragment fragment, boolean z);
}
