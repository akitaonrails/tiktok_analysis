package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C1295950jpR;
import X.C20626315nR;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes21.dex */
public final class SearchLoadingTextLayout$3 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C20626315nR LL;

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

    public SearchLoadingTextLayout$3(C20626315nR c20626315nR) {
        this.LL = c20626315nR;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C1295950jpR c1295950jpR = this.LL.LLILZIL;
        c1295950jpR.stop();
        c1295950jpR.LIZLLL();
        c1295950jpR.setCallback(null);
        C356901a3.LIZIZ(this, lifecycleOwner);
    }
}
