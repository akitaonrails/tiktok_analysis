package com.bytedance.jedi.arch;

import X.AbstractC1252750ihl;
import X.AbstractC19484711Kz;
import X.AbstractC19486711Lt;
import X.C004I;
import X.C01GW;
import X.C11E5;
import X.C11EC;
import X.C11ED;
import X.C11EE;
import X.C11EF;
import X.C11EG;
import X.C11EH;
import X.C11EI;
import X.C11NJ;
import X.C11NZ;
import X.C11RO;
import X.C1634100scq;
import X.C1644460stY;
import X.C1701830uO5;
import X.C1765020w20;
import X.C19475811Ho;
import X.C19478111Il;
import X.C19488511Ml;
import X.C1C7U;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC194398113s;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import Y.ACallableS154S0000000_29;
import Y.AfS198S0100000_29;
import Y.AkS490S0100000_29;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.LifecycleAwareObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS46S0310000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public abstract class JediViewModel<S extends C004I> extends ViewModel {
    public S LLILLJJLI;
    public final C01GW LL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 40));
    public final C11NJ LLILLL = new C11NJ();
    public final InterfaceC194398113s LLILZ = new InterfaceC194398113s() { // from class: X.113t
        public boolean LIZ = true;

        @Override // X.InterfaceC194398113s
        public final <S extends C004I, VM extends JediViewModel<S>, T extends InterfaceC1766500w4O<S, VM>> T create(Class<VM> cls) {
            T t;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(cls.getName());
            sbLIZ.append("_MiddlewareBinding");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            try {
                if (this.LIZ) {
                    Map<String, Class<?>> map = C236900vn.LIZ;
                    Object obj = ((LinkedHashMap) map).get(strLIZIZ);
                    if (((Class) obj) == null && map.containsKey(strLIZIZ)) {
                        this.LIZ = false;
                        return null;
                    }
                    Class<?> cls2 = (Class) obj;
                    if (cls2 == null) {
                        cls2 = Class.forName(strLIZIZ);
                        map.put(strLIZIZ, cls2);
                    }
                    Object objNewInstance = cls2.newInstance();
                    if ((objNewInstance instanceof InterfaceC1766500w4O) && (t = (T) objNewInstance) != null) {
                        this.LIZ = false;
                        return t;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C236900vn.LIZ.put(strLIZIZ, null);
                this.LIZ = false;
            }
            return null;
        }
    };

    public static /* synthetic */ void GQ2() {
    }

    public static /* synthetic */ Unit KQ2() {
        C1C7U.LIZ("JediViewModel@fda9.execute$1L");
        Unit unitAQ2 = AQ2();
        C1C7U.LIZIZ("JediViewModel@fda9.execute$1L");
        return unitAQ2;
    }

    public static /* synthetic */ void NQ2(Function1 function1, Object obj) {
        C1C7U.LIZ("JediViewModel@fda9.execute$2L");
        DQ2(function1, obj);
        C1C7U.LIZIZ("JediViewModel@fda9.execute$2L");
    }

    public static /* synthetic */ void OQ2(Function1 function1, Object obj) {
        C1C7U.LIZ("JediViewModel@fda9.lifecycleAwareSubscribe$arch_release$1L");
        RQ2(function1, obj);
        C1C7U.LIZIZ("JediViewModel@fda9.lifecycleAwareSubscribe$arch_release$1L");
    }

    public void onStart() {
    }

    public abstract S zQ2();

    private final C11EG<S> HQ2() {
        return (C11EG) this.LL.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.LLILLL.LJ();
    }

    public final C11EH<S> yQ2() {
        S s = this.LLILLJJLI;
        if (s != null) {
            return (C11EH) C11EI.LIZ.invoke(this, s);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot visit store before ViewModel(");
        sbLIZ.append(getClass());
        sbLIZ.append(") is initialized");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final S FQ2() {
        return HQ2().getState();
    }

    public final C11NZ<S> IQ2() {
        return HQ2().LIZIZ();
    }

    public static final Unit AQ2() {
        return Unit.LIZ;
    }

    public final InterfaceC194398113s EQ2() {
        return this.LLILZ;
    }

    public final void JQ2(Function1<? super S, ? extends S> function1) {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = function1.invoke(zQ2());
            onStart();
        }
    }

    public final void cR2(Function1<? super S, ? extends S> function1) {
        HQ2().LIZJ(function1);
    }

    public final void dR2(Function1<? super S, ? extends S> function1) {
        HQ2().LIZ(function1);
    }

    public final InterfaceC420801kM disposeOnClear(InterfaceC420801kM interfaceC420801kM) {
        this.LLILLL.LIZ(interfaceC420801kM);
        return interfaceC420801kM;
    }

    public final void gR2(Function1<? super S, Unit> function1) {
        HQ2().LIZLLL(function1);
    }

    public final void setState(Function1<? super S, ? extends S> function1) {
        dR2(function1);
    }

    public final void setStateImmediate(Function1<? super S, ? extends S> function1) {
        cR2(function1);
    }

    public final void withState(Function1<? super S, Unit> function1) {
        gR2(function1);
    }

    public final void withStateImmediate(Function1<? super S, Unit> function1) {
        function1.invoke(FQ2());
    }

    public final <PROP, MW extends C11E5<S, PROP>> void xQ2(MW mw) {
        mw.LL = this.LLILLL;
        mw.LLILLJJLI = this;
    }

    public static final AbstractC1252750ihl BQ2(Function1 function1, Object obj) {
        return (AbstractC1252750ihl) function1.invoke(obj);
    }

    public static final AbstractC1252750ihl CQ2(Function1 function1, Object obj) {
        return (AbstractC1252750ihl) function1.invoke(obj);
    }

    public static final void DQ2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void RQ2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final InterfaceC420801kM eR2(C1765020w20<S> c1765020w20, Function1<? super S, Unit> function1) {
        return C11ED.LJI(this, null, c1765020w20, function1);
    }

    public final InterfaceC420801kM execute(AbstractC19486711Lt abstractC19486711Lt, Function2<? super S, ? super AbstractC1252750ihl<Unit>, ? extends S> function2) {
        ACallableS154S0000000_29 aCallableS154S0000000_29 = new ACallableS154S0000000_29(1);
        abstractC19486711Lt.getClass();
        return execute(new C19478111Il(abstractC19486711Lt, aCallableS154S0000000_29, null), function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> InterfaceC420801kM execute(AbstractC19484711Kz<T> abstractC19484711Kz, Function2<? super S, ? super AbstractC1252750ihl<? extends T>, ? extends S> function2) {
        return execute(abstractC19484711Kz.LJJIJLIJ(), AFwS273S0000000_29.get$arr$(10), function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> InterfaceC420801kM execute(C11NZ<T> c11nz, Function2<? super S, ? super AbstractC1252750ihl<? extends T>, ? extends S> function2) {
        return execute(c11nz, AFwS273S0000000_29.get$arr$(11), function2);
    }

    public final <A> InterfaceC420801kM WQ2(InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function1<? super A, Unit> function1) {
        return C11ED.LJFF(this, null, interfaceC2217241BqE, c1765020w20, function1);
    }

    public final <T, V> InterfaceC420801kM execute(C11NZ<T> c11nz, Function1<? super T, ? extends V> function1, Function2<? super S, ? super AbstractC1252750ihl<? extends V>, ? extends S> function2) {
        setState(new AwS608S0100000_29(function2, 41));
        InterfaceC420801kM interfaceC420801kMLJJLJLI = c11nz.LJJJJZI(new AkS490S0100000_29(new AwS608S0100000_29(function1, 42), 18)).LJJLIIIIJ(new AkS490S0100000_29(AFwS273S0000000_29.get$arr$(12), 19)).LJJLJLI(new AfS198S0100000_29(new AwS46S0310000_29(this, function2, 0), 46));
        disposeOnClear(interfaceC420801kMLJJLJLI);
        return interfaceC420801kMLJJLJLI;
    }

    public final <T, V> InterfaceC420801kM execute(AbstractC19484711Kz<T> abstractC19484711Kz, Function1<? super T, ? extends V> function1, Function2<? super S, ? super AbstractC1252750ihl<? extends V>, ? extends S> function2) {
        return execute(abstractC19484711Kz.LJJIJLIJ(), function1, function2);
    }

    public final <A, B> InterfaceC420801kM VQ2(InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, Function2<? super A, ? super B, Unit> function2) {
        return C11ED.LJ(this, null, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC420801kM fR2(JediViewModel jediViewModel, C1765020w20 c1765020w20, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                c1765020w20 = new C1765020w20();
            }
            return jediViewModel.eR2(c1765020w20, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
    }

    public final <A, B, C> InterfaceC420801kM UQ2(InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631620sYq<? super A, ? super B, ? super C, Unit> interfaceC1631620sYq) {
        return C11ED.LIZLLL(this, null, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631620sYq);
    }

    public final <T> InterfaceC420801kM vQ2(InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        C11NZ<T> c19475811Ho;
        C19488511Ml c19488511MlLJJII = IQ2().LJJJJZI(new AkS490S0100000_29(new AwS608S0100000_29((InterfaceC2217241BqE) interfaceC2217241BqE, 683), 22)).LJJII(c1765020w20.LIZIZ);
        if (c1765020w20.LIZ) {
            c19475811Ho = new C19475811Ho<>(c19488511MlLJJII);
        } else {
            c19475811Ho = c19488511MlLJJII;
        }
        return PQ2(c19475811Ho, null, c1765020w20.LIZLLL, false, c1765020w20.LJ, new AwS238S0300000_29(function0, function1, function12, 30));
    }

    public static InterfaceC420801kM bR2(JediViewModel jediViewModel, InterfaceC2217241BqE interfaceC2217241BqE, C1765020w20 c1765020w20, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                c1765020w20 = new C1765020w20();
            }
            return jediViewModel.WQ2(interfaceC2217241BqE, c1765020w20, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }

    public final <T> InterfaceC420801kM PQ2(C11NZ<T> c11nz, LifecycleOwner lifecycleOwner, boolean z, boolean z2, C11RO c11ro, Function1<? super T, Unit> function1) {
        if (lifecycleOwner == null) {
            if (c11ro != null) {
                c11nz = c11nz.LJJJLZIJ(c11ro);
            }
            InterfaceC420801kM interfaceC420801kMLJJLJLI = c11nz.LJJLJLI(new AfS198S0100000_29(function1, 45));
            disposeOnClear(interfaceC420801kMLJJLJLI);
            return interfaceC420801kMLJJLJLI;
        }
        if (c11ro != null) {
            c11nz = c11nz.LJJJLZIJ(c11ro);
        }
        LifecycleAwareObserver lifecycleAwareObserver = new LifecycleAwareObserver(lifecycleOwner, !z, z2, function1);
        c11nz.LIZIZ(lifecycleAwareObserver);
        disposeOnClear(lifecycleAwareObserver);
        return lifecycleAwareObserver;
    }

    public final <A, B, C, D> InterfaceC420801kM TQ2(InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1631630sYr<? super A, ? super B, ? super C, ? super D, Unit> interfaceC1631630sYr) {
        return C11ED.LIZJ(this, null, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1631630sYr);
    }

    public static InterfaceC420801kM aR2(JediViewModel jediViewModel, InterfaceC2217241BqE interfaceC2217241BqE, InterfaceC2217241BqE interfaceC2217241BqE2, C1765020w20 c1765020w20, Function2 function2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                c1765020w20 = new C1765020w20();
            }
            return jediViewModel.VQ2(interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, function2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }

    public final <A, B, C, D, E> InterfaceC420801kM SQ2(InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685420txc<? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685420txc) {
        return C11ED.LIZIZ(this, null, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685420txc);
    }

    public static InterfaceC420801kM ZQ2(JediViewModel jediViewModel, InterfaceC2217241BqE interfaceC2217241BqE, InterfaceC2217241BqE interfaceC2217241BqE2, InterfaceC2217241BqE interfaceC2217241BqE3, C1765020w20 c1765020w20, InterfaceC1631620sYq interfaceC1631620sYq, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                c1765020w20 = new C1765020w20();
            }
            return jediViewModel.UQ2(interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631620sYq);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC420801kM wQ2(JediViewModel jediViewModel, InterfaceC2217241BqE interfaceC2217241BqE, C1765020w20 c1765020w20, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        Function0 function02 = function0;
        Function1 function13 = function1;
        C1765020w20 c1765020w202 = c1765020w20;
        if (obj == null) {
            if ((i & 2) != 0) {
                c1765020w202 = new C1765020w20();
            }
            Function1 function14 = null;
            if ((i & 4) != 0) {
                function13 = null;
            }
            if ((i & 8) != 0) {
                function02 = null;
            }
            if ((i & 16) == 0) {
                function14 = function12;
            }
            return jediViewModel.vQ2(interfaceC2217241BqE, c1765020w202, function13, function02, function14);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asyncSubscribe");
    }

    public static InterfaceC420801kM QQ2(JediViewModel jediViewModel, C11NZ c11nz, LifecycleOwner lifecycleOwner, boolean z, boolean z2, C11RO c11ro, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                c11ro = C1701830uO5.LIZIZ;
            }
            return jediViewModel.PQ2(c11nz, lifecycleOwner, z, z2, c11ro, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lifecycleAwareSubscribe");
    }

    public static InterfaceC420801kM YQ2(JediViewModel jediViewModel, InterfaceC2217241BqE interfaceC2217241BqE, InterfaceC2217241BqE interfaceC2217241BqE2, InterfaceC2217241BqE interfaceC2217241BqE3, InterfaceC2217241BqE interfaceC2217241BqE4, C1765020w20 c1765020w20, InterfaceC1631630sYr interfaceC1631630sYr, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                c1765020w20 = new C1765020w20();
            }
            return jediViewModel.TQ2(interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1631630sYr);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }

    public static InterfaceC420801kM XQ2(JediViewModel jediViewModel, InterfaceC2217241BqE interfaceC2217241BqE, InterfaceC2217241BqE interfaceC2217241BqE2, InterfaceC2217241BqE interfaceC2217241BqE3, InterfaceC2217241BqE interfaceC2217241BqE4, InterfaceC2217241BqE interfaceC2217241BqE5, C1765020w20 c1765020w20, InterfaceC1685420txc interfaceC1685420txc, int i, Object obj) {
        if (obj == null) {
            if ((i & 32) != 0) {
                c1765020w20 = new C1765020w20();
            }
            return jediViewModel.SQ2(interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685420txc);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }
}
