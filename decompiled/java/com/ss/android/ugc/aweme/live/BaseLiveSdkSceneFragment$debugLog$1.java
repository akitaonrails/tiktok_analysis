package com.ss.android.ugc.aweme.live;

import X.C2188811AlT;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class BaseLiveSdkSceneFragment$debugLog$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(", onCreate");
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(", onDestroy");
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(", onPause");
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(", onResume");
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(", onStart");
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(", onStop");
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LJFF(this, lifecycleOwner);
    }
}
