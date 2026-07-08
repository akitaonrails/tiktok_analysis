package com.bytedance.jedi.arch.internal;

import X.C11JB;
import X.C11JC;
import X.C11JD;
import X.C11JF;
import X.C1701830uO5;
import X.C19487811Me;
import X.C19489211Ms;
import X.C1C7U;
import X.C786410Ut5;
import X.InterfaceC19465811Ds;
import X.InterfaceC420801kM;
import X.InterfaceC626120Oh8;
import Y.ARunnableS129S0100000_29;
import Y.AfS198S0100000_29;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public final class LifecycleAwareObserver extends AtomicReference implements InterfaceC626120Oh8, InterfaceC420801kM, GenericLifecycleObserver {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public LifecycleOwner LLILLL;
    public C11JF LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public final AtomicBoolean LLIZ = new AtomicBoolean(false);

    public final void onDestroy() {
        com_bytedance_jedi_arch_internal_LifecycleAwareObserver_com_ss_android_ugc_aweme_lancet_LifecycleAwareObserverLancet_onDestroy(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        onLifecycleEvent(lifecycleOwner);
        if (event == Lifecycle.Event.ON_DESTROY) {
            com_bytedance_jedi_arch_internal_LifecycleAwareObserver__onDestroy$___twin___();
        }
    }

    public final LifecycleOwner requireOwner() {
        LifecycleOwner lifecycleOwner = this.LLILLL;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        "cannot access owner after destroy".toString();
        throw new IllegalArgumentException("cannot access owner after destroy");
    }

    public final InterfaceC626120Oh8<Object> requireSourceObserver() {
        C11JF c11jf = this.LLILZ;
        if (c11jf != null) {
            return c11jf;
        }
        "cannot access observer after destroy".toString();
        throw new IllegalArgumentException("cannot access observer after destroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void com_bytedance_jedi_arch_internal_LifecycleAwareObserver__onDestroy$___twin___() {
        requireOwner().getLifecycle().removeObserver(this);
        if (!isDisposed()) {
            dispose();
        }
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        InterfaceC420801kM interfaceC420801kM;
        Object obj = get();
        C11JC c11jc = C11JD.LIZ;
        if (obj == c11jc || (interfaceC420801kM = (InterfaceC420801kM) getAndSet(c11jc)) == c11jc || interfaceC420801kM == null) {
            return;
        }
        interfaceC420801kM.dispose();
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == C11JD.LIZ;
    }

    @Override // X.InterfaceC626120Oh8
    public void onComplete() {
        requireSourceObserver().onComplete();
    }

    public static void com_bytedance_jedi_arch_internal_LifecycleAwareObserver_com_ss_android_ugc_aweme_lancet_LifecycleAwareObserverLancet_onDestroy(LifecycleAwareObserver lifecycleAwareObserver) {
        try {
            lifecycleAwareObserver.com_bytedance_jedi_arch_internal_LifecycleAwareObserver__onDestroy$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(C11JD.LIZ);
            requireSourceObserver().onError(th);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public final void onLifecycleEvent(LifecycleOwner lifecycleOwner) {
        boolean zO61;
        Object obj;
        if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            if (lifecycleOwner instanceof InterfaceC19465811Ds) {
                zO61 = ((InterfaceC19465811Ds) lifecycleOwner).O61();
            } else {
                zO61 = true;
            }
            if (!this.LLIZ.getAndSet(true) && !isDisposed()) {
                if (zO61 || !this.LL || (obj = this.LLILZLL) == null) {
                    obj = this.LLILZIL;
                }
                this.LLILZIL = null;
                if (obj != null) {
                    onNext(obj);
                    return;
                }
                return;
            }
            return;
        }
        this.LLIZ.set(false);
    }

    @Override // X.InterfaceC626120Oh8
    public void onNext(Object obj) {
        if (this.LLILLJJLI || this.LLIZ.get()) {
            requireSourceObserver().onNext(obj);
        } else {
            this.LLILZIL = obj;
        }
        this.LLILZLL = obj;
    }

    @Override // X.InterfaceC626120Oh8
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (!compareAndSet(null, interfaceC420801kM)) {
            interfaceC420801kM.dispose();
            if (get() != C11JD.LIZ) {
                C19489211Ms.LIZIZ(new C11JB("Disposable already set!"));
                return;
            }
            return;
        }
        BPEAHandler bPEAHandler = C1701830uO5.LIZ;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            requireOwner().getLifecycle().addObserver(this);
            requireSourceObserver().onSubscribe(this);
        } else {
            C786410Ut5.LJJZZIII(C1701830uO5.LIZ, new ARunnableS129S0100000_29(this, 15));
        }
    }

    public static void lambda$semisugar$sourceObserver$lambda$0$0(Function1 function1, Object obj) {
        C1C7U.LIZ("LifecycleAwareObserver@2234.<init>$1L");
        function1.invoke(obj);
        C1C7U.LIZIZ("LifecycleAwareObserver@2234.<init>$1L");
    }

    public LifecycleAwareObserver(LifecycleOwner lifecycleOwner, boolean z, boolean z2, Function1<Object, Unit> function1) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = new C11JF(new AfS198S0100000_29(function1, 51), C19487811Me.LJFF, C19487811Me.LIZJ, C19487811Me.LIZLLL);
    }
}
