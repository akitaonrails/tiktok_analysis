package com.bytedance.assem.arch.reused;

import X.AbstractC724600Sba;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C0RDQ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C452501pT;
import X.C694070RKj;
import X.C713010Rxz;
import X.C723500SZo;
import X.C724130Sap;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724300Sb6;
import X.C724370SbD;
import X.C724420SbI;
import X.C724430SbJ;
import X.C724440SbK;
import X.C724450SbL;
import X.C724460SbM;
import X.C724500SbQ;
import X.C724510SbR;
import X.C724520SbS;
import X.C724570SbX;
import X.C724580SbY;
import X.C724590SbZ;
import X.C725080ScM;
import X.C736680Sv4;
import X.EnumC724380SbE;
import X.EnumC738160SxS;
import X.InterfaceC0148002o;
import X.InterfaceC1294060jmO;
import X.InterfaceC1587906Jp;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1790830whd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724800Sbu;
import X.InterfaceC725030ScH;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.RunnableC724360SbC;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.optimize.ReverseQueueHandler;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ReusedAssem<RECEIVER extends C03H5> extends AbstractC738140SxQ implements InterfaceC725030ScH<RECEIVER>, InterfaceC725050ScJ<RECEIVER>, C03H5, InterfaceC736810SvH, InterfaceC1790830whd {
    public C694070RKj LLJ;
    public C724270Sb3 LLJI;
    public boolean LLJILJIL;
    public C724430SbJ LLJILJILJ;
    public final /* synthetic */ C724460SbM LL = new C724460SbM();
    public boolean LLILLJJLI = true;
    public boolean LLILLL = true;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C0RDQ(this));
    public final Map<String, Object> LLILZIL = new LinkedHashMap();
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C724570SbX(this));
    public final C01GW LLIZ = C452501pT.LIZIZ(new C723500SZo(this));
    public final C724300Sb6 LLIZLLLIL = new C724300Sb6();
    public final CopyOnWriteArraySet<InterfaceC724800Sbu<?, ?>> LLJIJIL = new CopyOnWriteArraySet<>();
    public AbstractC724600Sba LLJILLL = C724500SbQ.LIZ;

    @Override // X.InterfaceC1790830whd
    public final void Sd(Function0<Unit> function0) {
        this.LL.Sd(function0);
    }

    @Override // X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final RECEIVER getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final RECEIVER getReceiverForHostVM() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1790830whd
    public final void h5(Function0<Unit> function0) {
        this.LL.h5(function0);
    }

    public void mo() {
    }

    @Override // X.AbstractC738140SxQ
    public void onStop() {
        super.onStop();
        fo().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        vo(this, EnumC724380SbE.HOSTSTOP, false, false, false, 14);
    }

    public abstract void oo();

    @InterfaceC1294060jmO
    public void so() {
    }

    public void xo() {
    }

    public void yo() {
    }

    public final <T> T bo() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            return (T) c724270Sb3.LL;
        }
        return null;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final LifecycleOwner m128do() {
        return (LifecycleOwner) this.LLILZLL.getValue();
    }

    public final LifecycleRegistry fo() {
        return (LifecycleRegistry) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        C724430SbJ c724430SbJ = this.LLJILJILJ;
        if (c724430SbJ != null) {
            return (InterfaceC736810SvH) c724430SbJ.LLILLL.getValue();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<RECEIVER> getActualReceiverHolder() {
        C724430SbJ c724430SbJ = this.LLJILJILJ;
        if (c724430SbJ != null) {
            return c724430SbJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return (LifecycleOwner) this.LLILZ.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public void handleOnResume() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        onResume();
    }

    public final void lo() {
        vo(this, EnumC724380SbE.HOSTDETACH, false, false, false, 14);
        track$assem_release(EnumC738160SxS.ON_UNBIND, new C713010Rxz(this));
        ko(new C724580SbY());
    }

    public void uo() {
        if (this.LLILLJJLI) {
            return;
        }
        C724240Sb0.LJII(new C724130Sap(this));
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return m128do();
    }

    @Override // X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        fo().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        fo().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        ((CopyOnWriteArrayList) this.LL.LL.getValue()).clear();
    }

    @Override // X.AbstractC738140SxQ
    public void onPause() {
        super.onPause();
        fo().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        fo().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        wo(true, false);
    }

    @Override // X.AbstractC738140SxQ
    public void onStart() {
        super.onStart();
        fo().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    public final <T extends InterfaceC1587906Jp> void ho(T t) {
        xo();
        if (C725080ScM.LJJIIJZLJL) {
            this.LLILLL = true;
        }
        vo(this, EnumC724380SbE.HOSTATTACH, false, true, false, 10);
        ko(new C724520SbS(t));
        yo();
    }

    public final void ko(Function1<? super ReusedAssem<?>, Unit> function1) {
        List<AbstractC738140SxQ> children = getChildren();
        if (children != null) {
            for (AbstractC738140SxQ abstractC738140SxQ : children) {
                if ((abstractC738140SxQ instanceof ReusedAssem) && abstractC738140SxQ != null) {
                    function1.invoke(abstractC738140SxQ);
                }
            }
        }
    }

    public final void wo(boolean z, boolean z2) {
        if (this.LLILLJJLI && fo().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            C724240Sb0.LJII(new C724420SbI(this));
            vo(this, EnumC724380SbE.HOSTRESUME, z, false, z2, 4);
        } else {
            vo(this, EnumC724380SbE.HOSTSTOP, false, false, false, 14);
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super RECEIVER, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super RECEIVER, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super RECEIVER, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.0Ry0, java.lang.Object] */
    public static void vo(final ReusedAssem reusedAssem, EnumC724380SbE enumC724380SbE, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        reusedAssem.getClass();
        int i2 = C724370SbD.LIZ[enumC724380SbE.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3 && !C725080ScM.LJJIIJZLJL) {
                    reusedAssem.LLILLL = true;
                }
            } else {
                C724240Sb0.LJII(new C724450SbL(reusedAssem));
            }
        } else {
            C724240Sb0.LJII(new C724440SbK(reusedAssem));
            if (!C725080ScM.LJJIIJZLJL) {
                reusedAssem.LLILLL = true;
            }
        }
        AbstractC724600Sba abstractC724600Sba = reusedAssem.LLJILLL;
        AbstractC724600Sba abstractC724600SbaLIZ = abstractC724600Sba.LIZ(enumC724380SbE);
        reusedAssem.LLJILLL = abstractC724600SbaLIZ;
        if ((Intrinsics.LJFF(abstractC724600SbaLIZ, abstractC724600Sba) && !z2) || !Intrinsics.LJFF(reusedAssem.LLJILLL, C724510SbR.LIZ)) {
            return;
        }
        if (C725080ScM.LJJIIJZLJL) {
            if (!reusedAssem.LLILLL) {
                return;
            }
        } else {
            if (z && !reusedAssem.LLILLL) {
                return;
            }
            if (z3 && !reusedAssem.LLILLL) {
                return;
            }
        }
        reusedAssem.LLILLL = false;
        final InterfaceC1587906Jp interfaceC1587906Jp = (InterfaceC1587906Jp) reusedAssem.bo();
        if (interfaceC1587906Jp == null) {
            return;
        }
        ?? r2 = new Runnable(reusedAssem) { // from class: X.0Ry0
            public final /* synthetic */ ReusedAssem<C03H5> LL;

            {
                this.LL = reusedAssem;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ReusedAssem@6d62.toBindState$3$action$1");
                try {
                    if (this.LL.getLifecycle().getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
                        ReusedAssem<C03H5> reusedAssem2 = this.LL;
                        InterfaceC1587906Jp interfaceC1587906Jp2 = interfaceC1587906Jp;
                        C724270Sb3 c724270Sb3 = reusedAssem2.LLJI;
                        List<? extends Object> list = c724270Sb3 != null ? c724270Sb3.LLILLJJLI : null;
                        if (reusedAssem2.LLILLJJLI) {
                            reusedAssem2.track$assem_release(EnumC738160SxS.ON_BIND, new C713000Rxy(reusedAssem2, interfaceC1587906Jp2, list));
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ReusedAssem@6d62.toBindState$3$action$1");
            }
        };
        if (C725080ScM.LJIIIIZZ) {
            ReverseQueueHandler reverseQueueHandler = ReverseQueueHandler.LL;
            reverseQueueHandler.getClass();
            ((CopyOnWriteArrayList) ReverseQueueHandler.LLILLJJLI.getValue()).add(r2);
            RunnableC724360SbC runnableC724360SbC = ReverseQueueHandler.LLILLL;
            reverseQueueHandler.removeCallbacks(runnableC724360SbC);
            reverseQueueHandler.postAtFrontOfQueue(runnableC724360SbC);
            return;
        }
        C724240Sb0.LJII(new C724590SbZ(r2));
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super RECEIVER, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super RECEIVER, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
