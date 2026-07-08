package com.ss.android.ugc.aweme.tako.autoplay;

import X.AnonymousClass0956;
import X.C08CX;
import X.C15442062u;
import X.C1783660wW4;
import X.C1783720wWA;
import X.C2252321DDq;
import X.C356901a3;
import X.InterfaceC1783630wW1;
import X.InterfaceC1783650wW3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAutoPlayController$start$obs$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ TakoAutoPlayController LL;

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

    public TakoAutoPlayController$start$obs$1(TakoAutoPlayController takoAutoPlayController) {
        this.LL = takoAutoPlayController;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Object value;
        Lifecycle lifecycle;
        TakoAutoPlayController takoAutoPlayController = this.LL;
        takoAutoPlayController.LJIIJ = false;
        C2252321DDq c2252321DDq = takoAutoPlayController.LJIIJJI;
        Boolean bool = Boolean.FALSE;
        c2252321DDq.setValue(bool);
        LifecycleOwner lifecycleOwner2 = takoAutoPlayController.LJ;
        TakoAutoPlayController$start$obs$1 takoAutoPlayController$start$obs$1 = takoAutoPlayController.LJFF;
        if (lifecycleOwner2 != null && takoAutoPlayController$start$obs$1 != null) {
            lifecycleOwner2.getLifecycle().removeObserver(takoAutoPlayController$start$obs$1);
        }
        AnonymousClass0956 anonymousClass0956 = takoAutoPlayController.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        takoAutoPlayController.LJI = null;
        AnonymousClass0956 anonymousClass09562 = takoAutoPlayController.LJII;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        takoAutoPlayController.LJII = null;
        AnonymousClass0956 anonymousClass09563 = takoAutoPlayController.LJIIIIZZ;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
        takoAutoPlayController.LJIIIIZZ = null;
        InterfaceC1783630wW1 interfaceC1783630wW1 = takoAutoPlayController.LJIILJJIL;
        if (interfaceC1783630wW1 != null) {
            interfaceC1783630wW1.LJI();
        }
        takoAutoPlayController.LJIILJJIL = null;
        AnonymousClass0956 anonymousClass09564 = takoAutoPlayController.LJIIIZ;
        if (anonymousClass09564 != null) {
            anonymousClass09564.LIZIZ(null);
        }
        takoAutoPlayController.LJIIIZ = null;
        takoAutoPlayController.LJFF = null;
        takoAutoPlayController.LJ = null;
        takoAutoPlayController.LJIIL.setValue(null);
        LifecycleEnableStatus lifecycleEnableStatus = takoAutoPlayController.LIZLLL;
        LifecycleOwner lifecycleOwner3 = lifecycleEnableStatus.LIZJ;
        if (lifecycleOwner3 != null && (lifecycle = lifecycleOwner3.getLifecycle()) != null) {
            lifecycle.removeObserver(lifecycleEnableStatus.LIZLLL);
        }
        lifecycleEnableStatus.LIZJ = null;
        lifecycleEnableStatus.LIZ.setValue(bool);
        C1783720wWA c1783720wWA = takoAutoPlayController.LIZJ;
        LifecycleEnableStatus lifecycleEnableStatus2 = takoAutoPlayController.LIZLLL;
        C2252321DDq c2252321DDq2 = c1783720wWA.LIZJ;
        do {
            value = c2252321DDq2.getValue();
        } while (!c2252321DDq2.compareAndSet(value, C15442062u.LJI(lifecycleEnableStatus2, (Set) value)));
        C1783720wWA c1783720wWA2 = takoAutoPlayController.LIZJ;
        C2252321DDq c2252321DDq3 = c1783720wWA2.LIZJ;
        while (!c2252321DDq3.compareAndSet(c2252321DDq3.getValue(), C08CX.INSTANCE)) {
        }
        AnonymousClass0956 anonymousClass09565 = c1783720wWA2.LIZLLL;
        if (anonymousClass09565 != null) {
            anonymousClass09565.LIZIZ(null);
        }
        ((LinkedHashMap) takoAutoPlayController.LJIILL).clear();
        C1783660wW4 c1783660wW4 = takoAutoPlayController.LIZIZ;
        InterfaceC1783650wW3 interfaceC1783650wW3 = c1783660wW4.LIZ;
        if (interfaceC1783650wW3 != null) {
            interfaceC1783650wW3.release();
        }
        c1783660wW4.LIZ = null;
    }
}
