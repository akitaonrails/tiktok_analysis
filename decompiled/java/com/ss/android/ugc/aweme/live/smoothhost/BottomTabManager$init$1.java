package com.ss.android.ugc.aweme.live.smoothhost;

import X.C19EG;
import X.C2188811AlT;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class BottomTabManager$init$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
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
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ondestroy....save: ");
        sbLIZ.append(BottomTabManager.LJI);
        sbLIZ.append(", parentActivity?.isFinishing:");
        C19EG c19eg = BottomTabManager.LIZLLL;
        if (c19eg != null) {
            boolValueOf = Boolean.valueOf(c19eg.isFinishing());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (BottomTabManager.LJI) {
            BottomTabManager.LJI = false;
            return;
        }
        BottomTabManager.LIZ.getClass();
        BottomTabManager.LIZLLL = null;
        BottomTabManager.LJ = null;
        BottomTabManager.LJFF = null;
        ((ArrayList) BottomTabManager.LIZIZ).clear();
        BottomTabManager.LJIIIIZZ = null;
    }
}
