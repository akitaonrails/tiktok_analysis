package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.C20691715xz;
import X.C356901a3;
import Y.ARunnableS70S0200000_1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderSubmitFragment$initAssemSubscribe$4$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C20691715xz LL;
    public final /* synthetic */ Runnable LLILLJJLI;

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        HandlerHook.viewRemoveCallbacks(this.LL, this.LLILLJJLI);
    }

    public OrderSubmitFragment$initAssemSubscribe$4$1$1(C20691715xz c20691715xz, ARunnableS70S0200000_1 aRunnableS70S0200000_1) {
        this.LL = c20691715xz;
        this.LLILLJJLI = aRunnableS70S0200000_1;
    }
}
