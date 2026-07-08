package com.bytedance.assem.arch.viewModel.internal;

import X.C09AE;
import X.C11HA;
import X.C11HC;
import X.C725080ScM;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class FlowLifecycleAwareCollector<T> implements LifecycleEventObserver {
    public final LifecycleOwner LL;
    public final boolean LLILLJJLI;
    public final C11HA LLILLL;
    public final Function1<T, Unit> LLILZ;
    public volatile T LLILZLL;
    public volatile T LLIZ;
    public LifecycleOwner LLJ;
    public C09AE LLJI;
    public final AtomicBoolean LLILZIL = new AtomicBoolean(false);
    public volatile boolean LLIZLLLIL = true;
    public final AwS608S0100000_29 LLJIJIL = new AwS608S0100000_29(this, 36);

    public final void LIZ(LifecycleOwner lifecycleOwner, boolean z) {
        boolean zLIZ;
        T t;
        Lifecycle.State currentState = lifecycleOwner.getLifecycle().getCurrentState();
        C11HA c11ha = this.LLILLL;
        if (c11ha != null) {
            zLIZ = c11ha.LIZ();
        } else {
            zLIZ = true;
        }
        if (zLIZ && currentState.isAtLeast(Lifecycle.State.STARTED)) {
            if (this.LLIZLLLIL) {
                z = false;
            }
            if (!this.LLILZIL.getAndSet(true)) {
                if (!z && this.LLILLJJLI) {
                    t = this.LLILZLL;
                    if (t == null) {
                        t = this.LLIZ;
                    }
                } else {
                    t = this.LLILZLL;
                }
                this.LLILZLL = null;
                if (t != null) {
                    if (this.LLILZIL.get()) {
                        this.LLILZ.invoke(t);
                    } else {
                        this.LLILZLL = t;
                    }
                    this.LLIZ = t;
                }
            }
            this.LLIZLLLIL = false;
            return;
        }
        this.LLILZIL.set(false);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AwS273S0300000_29 awS273S0300000_29 = new AwS273S0300000_29((FlowLifecycleAwareCollector) this, lifecycleOwner, (LifecycleOwner) event, (Lifecycle.Event) 1);
        C11HC c11hc = C725080ScM.LJJIJIIJI;
        if (c11hc != null) {
            c11hc.LIZ(event, awS273S0300000_29);
        } else {
            awS273S0300000_29.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowLifecycleAwareCollector(LifecycleOwner lifecycleOwner, boolean z, C11HA c11ha, Function1<? super T, Unit> function1) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = z;
        this.LLILLL = c11ha;
        this.LLILZ = function1;
        this.LLJ = lifecycleOwner;
    }
}
