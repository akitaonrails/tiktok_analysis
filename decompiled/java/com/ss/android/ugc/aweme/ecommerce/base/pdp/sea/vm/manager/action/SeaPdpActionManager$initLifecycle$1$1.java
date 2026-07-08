package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.action;

import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpActionManager$initLifecycle$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ SeaPdpActionManager LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public SeaPdpActionManager$initLifecycle$1$1(SeaPdpActionManager seaPdpActionManager) {
        this.LL = seaPdpActionManager;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        SeaPdpActionManager seaPdpActionManager = this.LL;
        ISeaPdpCommunicationService iSeaPdpCommunicationService = seaPdpActionManager.LLILZ;
        if (iSeaPdpCommunicationService != null) {
            iSeaPdpCommunicationService.jb(seaPdpActionManager.LL);
        }
    }
}
