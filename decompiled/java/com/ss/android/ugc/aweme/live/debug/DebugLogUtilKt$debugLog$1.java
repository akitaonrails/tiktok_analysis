package com.ss.android.ugc.aweme.live.debug;

import X.C2188811AlT;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class DebugLogUtilKt$debugLog$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public DebugLogUtilKt$debugLog$1() {
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lifecycleOwner);
        sbLIZ.append(", onCreate: ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lifecycleOwner);
        sbLIZ.append(", onDestroy: ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lifecycleOwner);
        sbLIZ.append(", onPause: ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lifecycleOwner);
        sbLIZ.append(", onResume: ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lifecycleOwner);
        sbLIZ.append(", onStart: ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lifecycleOwner);
        sbLIZ.append(", onStop: ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
        C356901a3.LJFF(this, lifecycleOwner);
    }
}
