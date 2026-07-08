package com.ss.android.ugc.aweme.main;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes25.dex */
public final class CreativityToolsPluginUpdater {
    public boolean LIZ;

    public final void LIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJFF(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.main.CreativityToolsPluginUpdater$startObserve$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    CreativityToolsPluginUpdater creativityToolsPluginUpdater = this.LL;
                    if (creativityToolsPluginUpdater.LIZ) {
                        creativityToolsPluginUpdater.LIZ = false;
                    }
                }
            }
        });
    }
}
