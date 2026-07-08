package com.ss.android.ugc.aweme.live.view;

import X.C356901a3;
import X.C477530Io3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEventSpaceButtonView$registerUnmuteOnReturn$observer$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public boolean LL;
    public final /* synthetic */ C477530Io3 LLILLJJLI;

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

    public LiveEventSpaceButtonView$registerUnmuteOnReturn$observer$1(C477530Io3 c477530Io3) {
        this.LLILLJJLI = c477530Io3;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LLILLJJLI.LIZJ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        this.LL = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        if (this.LL) {
            this.LLILLJJLI.getClass();
            C477530Io3.LIZIZ(false);
            this.LLILLJJLI.LIZJ();
        }
    }
}
