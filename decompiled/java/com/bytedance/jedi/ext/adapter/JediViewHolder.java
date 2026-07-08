package com.bytedance.jedi.ext.adapter;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C01GW;
import X.C11DL;
import X.C11E6;
import X.C11E9;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11EV;
import X.C1634100scq;
import X.C1644460stY;
import X.C1765020w20;
import X.C19464911Dj;
import X.C19465411Do;
import X.C19465911Dt;
import X.C452501pT;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public abstract class JediViewHolder extends C11EV implements LifecycleOwner, InterfaceC874803bO, C11E9, GenericLifecycleObserver {
    public LifecycleOwner LLILZ;
    public C19465411Do LLILZIL;
    public JediViewHolderProxy LLILZLL;
    public final C01GW LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.C11EV
    public final void L5(int i, Object obj) {
    }

    public void T5(List<Object> list) {
    }

    public void U5() {
    }

    @Override // X.C11E9
    public boolean getUniqueOnlyGlobal() {
        return false;
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            create$ext_adapter_release();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            start$ext_adapter_release();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            resume$ext_adapter_release();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            pause$ext_adapter_release();
        } else if (event == Lifecycle.Event.ON_STOP) {
            stop$ext_adapter_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            destroy$ext_adapter_release();
        }
    }

    public void onStop() {
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LLIZ.getValue();
    }

    @Override // X.C11EV
    public void I5() {
        JediViewHolderProxy jediViewHolderProxy = this.LLILZLL;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.LLILLJJLI) {
            jediViewHolderProxy.LLILLL = false;
        }
        this.LLIZLLLIL = true;
        int i = C19465911Dt.LIZ[getLifecycle().getCurrentState().ordinal()];
        if (i == 2) {
            start$ext_adapter_release();
            resume$ext_adapter_release();
        } else if (i == 3) {
            resume$ext_adapter_release();
        }
    }

    @Override // X.C11EV
    public void P5() {
        JediViewHolderProxy jediViewHolderProxy = this.LLILZLL;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.LLILLJJLI) {
            jediViewHolderProxy.LLILLL = true;
        }
        S5();
    }

    public final LifecycleOwner R5() {
        LifecycleOwner lifecycleOwner = this.LLILZ;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void create$ext_adapter_release() {
        C19465411Do c19465411Do = this.LLILZIL;
        if (c19465411Do == null) {
            c19465411Do = null;
        }
        C19464911Dj c19464911Dj = c19465411Do.LIZJ;
        int i = this.LLILLL;
        if (i < 0) {
            c19464911Dj.getClass();
        } else if (i < ((ArrayList) c19464911Dj.LIZ).size() && ((Boolean) ListProtector.get(c19464911Dj.LIZ, i)).booleanValue()) {
            return;
        }
        onCreate();
        C19465411Do c19465411Do2 = this.LLILZIL;
        (c19465411Do2 != null ? c19465411Do2 : null).LIZJ.LIZ(this.LLILLL, true);
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void pause$ext_adapter_release() {
        if (this.LLIZLLLIL) {
            onPause();
            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void resume$ext_adapter_release() {
        if (this.LLIZLLLIL) {
            onResume();
            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void start$ext_adapter_release() {
        if (this.LLIZLLLIL) {
            onStart();
            LifecycleRegistry lifecycleRegistry = getLifecycleRegistry();
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            lifecycleRegistry.handleLifecycleEvent(event);
            JediViewHolderProxy jediViewHolderProxy = this.LLILZLL;
            if (jediViewHolderProxy == null || this != jediViewHolderProxy.LLILLJJLI) {
                return;
            }
            jediViewHolderProxy.LL = false;
            jediViewHolderProxy.LLILZLL = true;
            jediViewHolderProxy.getLifecycleRegistry().handleLifecycleEvent(event);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void stop$ext_adapter_release() {
        if (this.LLIZLLLIL) {
            onStop();
            LifecycleRegistry lifecycleRegistry = getLifecycleRegistry();
            Lifecycle.Event event = Lifecycle.Event.ON_STOP;
            lifecycleRegistry.handleLifecycleEvent(event);
            JediViewHolderProxy jediViewHolderProxy = this.LLILZLL;
            if (jediViewHolderProxy == null || this != jediViewHolderProxy.LLILLJJLI) {
                return;
            }
            jediViewHolderProxy.LL = false;
            jediViewHolderProxy.getLifecycleRegistry().handleLifecycleEvent(event);
        }
    }

    public final void S5() {
        int i = C19465911Dt.LIZ[getLifecycle().getCurrentState().ordinal()];
        if (i == 1) {
            pause$ext_adapter_release();
            stop$ext_adapter_release();
        } else if (i == 2 || i == 3) {
            stop$ext_adapter_release();
        }
        this.LLIZLLLIL = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy$ext_adapter_release() {
        onDestroy();
        R5().getLifecycle().removeObserver(this);
        S5();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this.LLILZLL;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC874803bO> getReceiverHolder() {
        return this.LLILZLL;
    }

    public JediViewHolder(View view) {
        super(view);
        this.LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 43));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    @Override // X.C11EV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(java.util.List r7, int r8, java.lang.Object r9) {
        /*
            r6 = this;
            super.N5(r7, r8, r9)
            r4 = 0
            r3 = 1
            if (r7 == 0) goto L31
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L31
            java.util.Iterator r2 = r7.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof kotlin.Pair
            if (r0 == 0) goto L2f
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r1.getSecond()
        L27:
            java.lang.Object r0 = X.C19465211Dm.LIZ
            if (r1 != r0) goto L11
        L2b:
            r6.T5(r7)
            return
        L2f:
            r1 = r4
            goto L27
        L31:
            r6.LLIZLLLIL = r3
            androidx.lifecycle.LifecycleOwner r0 = r6.R5()
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r0.removeObserver(r6)
            r6.S5()
            X.11Do r5 = r6.LLILZIL
            if (r5 != 0) goto L46
            r5 = r4
        L46:
            X.11Di r1 = r5.LIZLLL
            if (r8 < 0) goto L99
            java.util.List<com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy> r0 = r1.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r8 >= r0) goto L5e
            java.util.List<com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy> r0 = r1.LIZIZ
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r8)
            com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy r2 = (com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy) r2
            if (r2 != 0) goto L6d
        L5e:
            kotlin.jvm.internal.AFwS218S0000000_29 r0 = r5.LIZIZ
            r0.getClass()
            com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy r2 = new com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy
            r2.<init>()
            X.11Di r0 = r5.LIZLLL
            r0.LIZIZ(r8, r2)
        L6d:
            com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy r1 = r6.LLILZLL
            if (r2 == r1) goto L81
            if (r1 == 0) goto L81
            com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r1.LLILLJJLI
            if (r6 != r0) goto L81
            X.11Do r0 = r6.LLILZIL
            if (r0 != 0) goto L7c
            r0 = r4
        L7c:
            X.11Dp r0 = r0.LIZ
            r1.LIZ(r0, r4)
        L81:
            X.11Do r0 = r6.LLILZIL
            if (r0 == 0) goto L86
            r4 = r0
        L86:
            X.11Dp r0 = r4.LIZ
            r2.LIZ(r0, r6)
            r6.LLIZLLLIL = r3
            androidx.lifecycle.LifecycleOwner r0 = r6.R5()
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r0.addObserver(r6)
            goto L2b
        L99:
            r1.getClass()
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.JediViewHolder.N5(java.util.List, int, java.lang.Object):void");
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<InterfaceC874803bO, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<InterfaceC874803bO, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<InterfaceC874803bO, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<InterfaceC874803bO, ? super Throwable, Unit> function2, Function1<InterfaceC874803bO, Unit> function1, Function2<InterfaceC874803bO, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<InterfaceC874803bO, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<InterfaceC874803bO, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
