package com.ss.android.ugc.aweme.titlebar.viewmodel;

import X.C356901a3;
import X.C897520ZIw;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupTitleBarViewModel$lifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ GroupTitleBarViewModel LL;

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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public GroupTitleBarViewModel$lifecycleObserver$1(GroupTitleBarViewModel groupTitleBarViewModel) {
        this.LL = groupTitleBarViewModel;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        C897520ZIw c897520ZIwXQ2 = this.LL.xQ2();
        if (c897520ZIwXQ2 != null) {
            c897520ZIwXQ2.destroy();
        }
        this.LL.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
        C897520ZIw c897520ZIwXQ2 = this.LL.xQ2();
        if (c897520ZIwXQ2 != null) {
            c897520ZIwXQ2.LJ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
        C897520ZIw c897520ZIwXQ2 = this.LL.xQ2();
        if (c897520ZIwXQ2 != null) {
            c897520ZIwXQ2.LJII();
        }
    }
}
