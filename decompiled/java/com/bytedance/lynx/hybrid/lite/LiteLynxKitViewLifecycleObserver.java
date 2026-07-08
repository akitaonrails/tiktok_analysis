package com.bytedance.lynx.hybrid.lite;

import X.C086F;
import X.C1535630q41;
import X.C1537480q70;
import X.C1537720q7O;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class LiteLynxKitViewLifecycleObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final WeakReference<C1537720q7O> LL;

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

    public LiteLynxKitViewLifecycleObserver(WeakReference<C1537720q7O> weakReference) {
        this.LL = weakReference;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        long j;
        C1537480q70 hybridContext;
        C356901a3.LIZIZ(this, lifecycleOwner);
        if (Intrinsics.LJFF(C1535630q41.LIZIZ("destroy_kit_view_automatically"), Boolean.TRUE)) {
            C086F c086f = C086F.LIZ;
            Runnable runnable = new Runnable() { // from class: X.0qPw
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiteLynxKitViewLifecycleObserver@25b.onDestroy$1");
                    try {
                        C1537720q7O c1537720q7O = this.LL.LL.get();
                        if (c1537720q7O != null) {
                            c1537720q7O.LLD(true);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiteLynxKitViewLifecycleObserver@25b.onDestroy$1");
                }
            };
            C1537720q7O c1537720q7O = this.LL.get();
            if (c1537720q7O != null && (hybridContext = c1537720q7O.getHybridContext()) != null) {
                j = hybridContext.autoDestroyDelayTimeInMillSeconds;
            } else {
                j = 200;
            }
            c086f.getClass();
            C086F.LIZIZ(j, runnable);
        }
    }
}
