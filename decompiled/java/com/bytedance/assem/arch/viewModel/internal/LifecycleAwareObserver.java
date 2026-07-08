package com.bytedance.assem.arch.viewModel.internal;

import X.AbstractActivityC1602020rn6;
import X.AbstractC1563340qmi;
import X.C09JN;
import X.C11HA;
import X.C11HC;
import X.C11HD;
import X.C11JB;
import X.C11JF;
import X.C11KF;
import X.C11KG;
import X.C11KH;
import X.C11KI;
import X.C1565730qqZ;
import X.C19487811Me;
import X.C19489211Ms;
import X.C199Y;
import X.C20630086i;
import X.C725080ScM;
import X.C786410Ut5;
import X.EnumC682280QpW;
import X.InterfaceC420801kM;
import X.InterfaceC626120Oh8;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.service.IStrictModeService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public final class LifecycleAwareObserver<T> extends AtomicReference<InterfaceC420801kM> implements LifecycleEventObserver, InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final LifecycleOwner LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final C11HA LLILZ;
    public T LLILZIL;
    public T LLILZLL;
    public final AtomicBoolean LLIZ = new AtomicBoolean(false);
    public final C11HD LLIZLLLIL;
    public volatile boolean LLJ;
    public final Function1<InterfaceC420801kM, Unit> onDestroyAction;
    public LifecycleOwner owner;
    public InterfaceC626120Oh8<T> sourceObserver;

    @Override // X.InterfaceC626120Oh8
    public void onNext(Object obj) {
        com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_onNext(this, obj);
    }

    public final void onProxyAttach() {
        this.LLJ = true;
        com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_tryActivate(this, false, this.LL);
    }

    public final void onProxyDetach() {
        this.LLJ = true;
        this.LLIZ.set(false);
    }

    public final void onSubscribeInMainThread() {
        com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_onSubscribeInMainThread(this);
    }

    public final InterfaceC626120Oh8<T> LIZ() {
        InterfaceC626120Oh8<T> interfaceC626120Oh8 = this.sourceObserver;
        if (interfaceC626120Oh8 != null) {
            return interfaceC626120Oh8;
        }
        "cannot access observer after destroy".toString();
        throw new IllegalArgumentException("cannot access observer after destroy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (((r1 == null || (r0 = r1.getLifecycle()) == null) ? null : r0.getCurrentState()) == androidx.lifecycle.Lifecycle.State.DESTROYED) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r1.getLifecycle().getCurrentState() != androidx.lifecycle.Lifecycle.State.DESTROYED) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver__onSubscribeInMainThread$___twin___() {
        /*
            r2 = this;
            boolean r0 = X.C725080ScM.LJIILLIIL
            if (r0 == 0) goto L35
            androidx.lifecycle.LifecycleOwner r1 = r2.owner
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L22
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentManager r0 = r1.getFragmentManager()
            if (r0 == 0) goto L1e
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r0) goto L35
        L1e:
            r2.onDestroy()
            return
        L22:
            if (r1 == 0) goto L33
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            if (r0 == 0) goto L33
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
        L2e:
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r0) goto L35
            goto L1e
        L33:
            r1 = 0
            goto L2e
        L35:
            androidx.lifecycle.LifecycleOwner r0 = r2.requireOwner()
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r0.addObserver(r2)
            X.0Oh8 r0 = r2.LIZ()
            r0.onSubscribe(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.assem.arch.viewModel.internal.LifecycleAwareObserver.com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver__onSubscribeInMainThread$___twin___():void");
    }

    public final LifecycleOwner requireOwner() {
        LifecycleOwner lifecycleOwner = this.owner;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        "cannot access owner after destroy".toString();
        throw new IllegalArgumentException("cannot access owner after destroy");
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        InterfaceC420801kM andSet;
        InterfaceC420801kM interfaceC420801kM = get();
        C11KG c11kg = C11KH.LIZ;
        if (interfaceC420801kM != c11kg && (andSet = getAndSet(c11kg)) != c11kg && andSet != null) {
            andSet.dispose();
        }
        C11HA c11ha = this.LLILZ;
        if (c11ha != null) {
            c11ha.LIZIZ(this.LLIZLLLIL);
        }
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == C11KH.LIZ;
    }

    @Override // X.InterfaceC626120Oh8
    public void onComplete() {
        LIZ().onComplete();
    }

    public final void onDestroy() {
        if (!C20630086i.LIZ()) {
            C786410Ut5.LJJZZIII(C20630086i.LIZ, new ARunnableS129S0100000_29(this, 12));
            return;
        }
        Function1<InterfaceC420801kM, Unit> function1 = this.onDestroyAction;
        if (function1 != null) {
            function1.invoke(this);
        }
        requireOwner().getLifecycle().removeObserver(this);
        if (!isDisposed()) {
            dispose();
        }
        this.owner = null;
        this.sourceObserver = null;
    }

    public static void com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_onSubscribeInMainThread(LifecycleAwareObserver lifecycleAwareObserver) {
        Context context;
        Integer numLIZ;
        LifecycleOwner lifecycleOwner = lifecycleAwareObserver.owner;
        if (lifecycleOwner != null && (lifecycleOwner.getLifecycle() instanceof AbstractC1563340qmi)) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleOwner.getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.ADD_OBSERVER;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) ((AbstractC1563340qmi) lifecycleOwner.getLifecycle()).LL))) != null) {
                lifecycleAwareObserver.com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver__onSubscribeInMainThread$___twin___();
                C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                return;
            }
        }
        lifecycleAwareObserver.com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver__onSubscribeInMainThread$___twin___();
    }

    public void com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver__onNext$___twin___(T t) {
        if (this.LLILLL || this.LLIZ.get()) {
            LIZ().onNext(t);
        } else {
            this.LLILZIL = t;
        }
        this.LLILZLL = t;
    }

    @Override // X.InterfaceC626120Oh8
    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(C11KH.LIZ);
            LIZ().onError(th);
        }
    }

    public final void onLifecycleEvent(LifecycleOwner lifecycleOwner) {
        com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_tryActivate(this, true, lifecycleOwner);
    }

    @Override // X.InterfaceC626120Oh8
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (!compareAndSet(null, interfaceC420801kM)) {
            interfaceC420801kM.dispose();
            if (get() != C11KH.LIZ) {
                C19489211Ms.LIZIZ(new C11JB("Disposable already set!"));
                return;
            }
            return;
        }
        if (C20630086i.LIZ()) {
            onSubscribeInMainThread();
        } else {
            C786410Ut5.LJJZZIII(C20630086i.LIZ, new Runnable() { // from class: X.0uOD
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LifecycleAwareObserver@3e3d.onSubscribe$$inlined$runOnUI$1");
                    try {
                        this.LL.onSubscribeInMainThread();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LifecycleAwareObserver@3e3d.onSubscribe$$inlined$runOnUI$1");
                }
            });
        }
    }

    public static void com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_onNext(LifecycleAwareObserver lifecycleAwareObserver, Object obj) {
        LifecycleOwner lifecycleOwner = lifecycleAwareObserver.owner;
        if ((lifecycleOwner instanceof MainActivity) && ((AbstractC1563340qmi) lifecycleOwner.getLifecycle()).LJI(EnumC682280QpW.GET_CURRENT_STATE)) {
            AbstractActivityC1602020rn6 abstractActivityC1602020rn6 = (AbstractActivityC1602020rn6) lifecycleOwner;
            if (abstractActivityC1602020rn6.getMainSAFFragmentOrNull() != null && !abstractActivityC1602020rn6.getMainSAFFragmentOrNull().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                C11KI.LIZ().LIZJ();
                abstractActivityC1602020rn6.throwSAFLifecycleCheckException("activity.lifecycle.tryActivate");
                C11KI.LIZ().LJFF();
                lifecycleAwareObserver.com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver__onNext$___twin___(obj);
                IStrictModeService iStrictModeServiceLIZ = C11KI.LIZ();
                ((AbstractC1563340qmi) lifecycleOwner.getLifecycle()).LJ();
                iStrictModeServiceLIZ.LJII();
                return;
            }
        }
        lifecycleAwareObserver.com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver__onNext$___twin___(obj);
    }

    public final void com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver__tryActivate$___twin___(boolean z, LifecycleOwner lifecycleOwner) {
        boolean zLIZ;
        T t;
        Lifecycle.State currentState = lifecycleOwner.getLifecycle().getCurrentState();
        C11HA c11ha = this.LLILZ;
        if (c11ha != null) {
            zLIZ = c11ha.LIZ();
        } else {
            zLIZ = true;
        }
        if (zLIZ && currentState.isAtLeast(Lifecycle.State.STARTED)) {
            if (this.LLJ) {
                z = false;
            }
            if (!this.LLIZ.getAndSet(true) && !isDisposed()) {
                if (!z && this.LLILLJJLI) {
                    t = this.LLILZIL;
                    if (t == null) {
                        t = this.LLILZLL;
                    }
                } else {
                    t = this.LLILZIL;
                }
                this.LLILZIL = null;
                if (t != null) {
                    onNext(t);
                }
            }
            this.LLJ = false;
            return;
        }
        this.LLIZ.set(false);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C11KF c11kf = new C11KF(this, lifecycleOwner, event);
        C11HC c11hc = C725080ScM.LJJIJIIJI;
        if (c11hc != null) {
            c11hc.LIZ(event, c11kf);
        } else {
            c11kf.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_tryActivate(LifecycleAwareObserver lifecycleAwareObserver, boolean z, LifecycleOwner lifecycleOwner) {
        Context context;
        Integer numLIZ;
        if (lifecycleOwner instanceof C199Y) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleOwner.getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.GET_CURRENT_STATE;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) lifecycleOwner))) != null) {
                lifecycleAwareObserver.com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver__tryActivate$___twin___(z, lifecycleOwner);
                C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                return;
            }
        }
        lifecycleAwareObserver.com_bytedance_assem_arch_viewModel_internal_LifecycleAwareObserver__tryActivate$___twin___(z, lifecycleOwner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleAwareObserver(LifecycleOwner lifecycleOwner, boolean z, boolean z2, C11HA c11ha, final Function1<? super T, Unit> function1, final Function1<? super Throwable, Unit> function12, Function1<? super InterfaceC420801kM, Unit> function13) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c11ha;
        this.onDestroyAction = function13;
        this.owner = lifecycleOwner;
        this.sourceObserver = new C11JF(new C09JN() { // from class: X.0uOE
            @Override // X.C09JN
            public final void accept(T t) {
                C1C7U.LIZ("LifecycleAwareObserver@3e3d.sourceObserver$1");
                function1.invoke(t);
                C1C7U.LIZIZ("LifecycleAwareObserver@3e3d.sourceObserver$1");
            }
        }, new C09JN() { // from class: X.0uOC
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LifecycleAwareObserver@3e3d.sourceObserver$2");
                Throwable th = (Throwable) obj;
                Function1<Throwable, Unit> function14 = function12;
                if (function14 != null) {
                    function14.invoke(th);
                } else {
                    C19489211Ms.LIZIZ(th);
                }
                C1C7U.LIZIZ("LifecycleAwareObserver@3e3d.sourceObserver$2");
            }
        }, C19487811Me.LIZJ, C19487811Me.LIZLLL);
        C11HD c11hd = new C11HD(this);
        this.LLIZLLLIL = c11hd;
        if (c11ha != null) {
            c11ha.LIZJ(c11hd);
        }
        this.LLJ = true;
    }
}
