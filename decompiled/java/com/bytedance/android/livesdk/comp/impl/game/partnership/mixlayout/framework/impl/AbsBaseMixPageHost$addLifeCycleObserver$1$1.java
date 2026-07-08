package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.impl;

import X.AbstractC1882430z5N;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes29.dex */
public final class AbsBaseMixPageHost$addLifeCycleObserver$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ AbstractC1882430z5N LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
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
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LLILLJJLI.getLifecycle().removeObserver(this);
        AbstractC1882430z5N abstractC1882430z5N = this.LL;
        abstractC1882430z5N.LLILLL = false;
        abstractC1882430z5N.LJI();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LL.LJIIL();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LL.LJIJI();
    }

    public AbsBaseMixPageHost$addLifeCycleObserver$1$1(AbstractC1882430z5N abstractC1882430z5N, LifecycleOwner lifecycleOwner) {
        this.LL = abstractC1882430z5N;
        this.LLILLJJLI = lifecycleOwner;
    }
}
