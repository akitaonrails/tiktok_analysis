package com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter;

import X.C1389910mGz;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes15.dex */
public final class DeleteForMeUndoCoordinator$lifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ DeleteForMeUndoCoordinator LL;

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

    public DeleteForMeUndoCoordinator$lifecycleObserver$1(DeleteForMeUndoCoordinator deleteForMeUndoCoordinator) {
        this.LL = deleteForMeUndoCoordinator;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        DeleteForMeUndoCoordinator deleteForMeUndoCoordinator = this.LL;
        C1389910mGz c1389910mGz = deleteForMeUndoCoordinator.LIZIZ;
        if (c1389910mGz != null) {
            c1389910mGz.LIZJ();
        }
        deleteForMeUndoCoordinator.LIZIZ = null;
        deleteForMeUndoCoordinator.LIZJ = false;
        this.LL.LIZ.getLifecycle().removeObserver(this);
    }
}
