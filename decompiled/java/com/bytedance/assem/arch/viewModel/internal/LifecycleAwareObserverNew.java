package com.bytedance.assem.arch.viewModel.internal;

import X.C11HA;
import X.C11HC;
import X.C11JB;
import X.C11JQ;
import X.C11KK;
import X.C11KM;
import X.C19489211Ms;
import X.C20630086i;
import X.C725080ScM;
import X.C786410Ut5;
import X.InterfaceC420801kM;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS129S0100000_29;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class LifecycleAwareObserverNew<T> extends C11KK<T> implements LifecycleEventObserver {
    public final LifecycleOwner LLILLL;
    public final C11HA LLILZ;
    public final AtomicBoolean LLILZIL = new AtomicBoolean(false);
    public final AwS608S0100000_29 LLILZLL;
    public volatile boolean LLIZ;
    public LifecycleOwner owner;

    public final void onProxyAttach() {
        this.LLIZ = true;
        LIZ(this.LLILLL, false);
    }

    public final void onProxyDetach() {
        this.LLIZ = true;
        isActive().set(false);
    }

    public final LifecycleOwner requireOwner() {
        LifecycleOwner lifecycleOwner = this.owner;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        "cannot access owner after destroy".toString();
        throw new IllegalArgumentException("cannot access owner after destroy");
    }

    @Override // X.C11KK, X.InterfaceC420801kM
    public void dispose() {
        super.dispose();
        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(8);
        Iterator<C11JQ<T, ?>> it2 = this.deliveries.iterator();
        while (it2.hasNext()) {
            aFwS273S0000000_29.invoke(it2.next());
        }
        C11HA c11ha = this.LLILZ;
        if (c11ha != null) {
            c11ha.LIZIZ(this.LLILZLL);
        }
    }

    public final void onDestroy() {
        if (!C20630086i.LIZ()) {
            C786410Ut5.LJJZZIII(C20630086i.LIZ, new ARunnableS129S0100000_29(this, 13));
            return;
        }
        requireOwner().getLifecycle().removeObserver(this);
        if (!isDisposed()) {
            dispose();
        }
        this.owner = null;
    }

    @Override // X.C11KK
    public AtomicBoolean isActive() {
        return this.LLILZIL;
    }

    public final void onLifecycleEvent(LifecycleOwner lifecycleOwner) {
        LIZ(lifecycleOwner, true);
    }

    @Override // X.C11KK, X.InterfaceC626120Oh8
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (!compareAndSet(null, interfaceC420801kM)) {
            interfaceC420801kM.dispose();
            if (get() != C11KM.LIZ) {
                C19489211Ms.LIZIZ(new C11JB("Disposable already set!"));
                return;
            }
            return;
        }
        if (C20630086i.LIZ()) {
            requireOwner().getLifecycle().addObserver(this);
        } else {
            C786410Ut5.LJJZZIII(C20630086i.LIZ, new ARunnableS112S0100000_12(this, 144));
        }
    }

    public LifecycleAwareObserverNew(LifecycleOwner lifecycleOwner, C11HA c11ha) {
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c11ha;
        this.owner = lifecycleOwner;
        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29((LifecycleAwareObserverNew) this, 37);
        this.LLILZLL = awS608S0100000_29;
        if (c11ha != null) {
            c11ha.LIZJ(awS608S0100000_29);
        }
        this.LLIZ = true;
    }

    public final void LIZ(LifecycleOwner lifecycleOwner, boolean z) {
        boolean zLIZ;
        Lifecycle.State currentState = lifecycleOwner.getLifecycle().getCurrentState();
        C11HA c11ha = this.LLILZ;
        if (c11ha != null) {
            zLIZ = c11ha.LIZ();
        } else {
            zLIZ = true;
        }
        if (zLIZ && currentState.isAtLeast(Lifecycle.State.STARTED)) {
            if (this.LLIZ) {
                z = false;
            }
            if (!isActive().getAndSet(true) && !isDisposed()) {
                Iterator<C11JQ<T, ?>> it2 = this.deliveries.iterator();
                while (it2.hasNext()) {
                    it2.next().onActive(z);
                }
            }
            this.LLIZ = false;
            return;
        }
        isActive().set(false);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AwS273S0300000_29 awS273S0300000_29 = new AwS273S0300000_29((LifecycleAwareObserverNew) this, lifecycleOwner, (LifecycleOwner) event, (Lifecycle.Event) 2);
        C11HC c11hc = C725080ScM.LJJIJIIJI;
        if (c11hc != null) {
            c11hc.LIZ(event, awS273S0300000_29);
        } else {
            awS273S0300000_29.invoke();
        }
    }
}
