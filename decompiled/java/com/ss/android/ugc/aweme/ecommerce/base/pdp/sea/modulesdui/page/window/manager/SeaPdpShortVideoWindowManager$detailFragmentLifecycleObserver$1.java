package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.window.manager;

import X.C1757410vpj;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes10.dex */
public final class SeaPdpShortVideoWindowManager$detailFragmentLifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C1757410vpj LL;
    public final /* synthetic */ Lifecycle LLILLJJLI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
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
        Lifecycle lifecycle = this.LLILLJJLI;
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        }
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LL.LJIILIIL = true;
    }

    public SeaPdpShortVideoWindowManager$detailFragmentLifecycleObserver$1(C1757410vpj c1757410vpj, Lifecycle lifecycle) {
        this.LL = c1757410vpj;
        this.LLILLJJLI = lifecycle;
    }
}
