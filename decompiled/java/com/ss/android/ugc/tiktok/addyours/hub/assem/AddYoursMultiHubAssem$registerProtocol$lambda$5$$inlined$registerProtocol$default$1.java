package com.ss.android.ugc.tiktok.addyours.hub.assem;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.addyours.mob.hub.IAddYoursHubProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class AddYoursMultiHubAssem$registerProtocol$lambda$5$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, IAddYoursHubProtocol.class, null);
        }
    }
}
