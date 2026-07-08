package com.bytedance.assem.arch.viewModel;

import X.AbstractC1623806Xk;
import X.AbstractC19484711Kz;
import X.AbstractC19486711Lt;
import X.AnonymousClass0694;
import X.C01GW;
import X.C01KH;
import X.C01KI;
import X.C09JN;
import X.C0RTH;
import X.C0RTY;
import X.C0ZP4;
import X.C11H9;
import X.C11NJ;
import X.C11NZ;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19478111Il;
import X.C19719512Dh;
import X.C2135108Yb;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2192808iU;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C724640Sbe;
import X.C724710Sbl;
import X.C725080ScM;
import X.C725430Scv;
import X.C735780Stc;
import X.C736750SvB;
import X.C736780SvE;
import X.C736820SvI;
import X.C736860SvM;
import X.C736870SvN;
import X.C736880SvO;
import X.C736900SvQ;
import X.C736920SvS;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import X.InterfaceC1294060jmO;
import X.InterfaceC1487280oo2;
import X.InterfaceC149400hg;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import X.InterfaceC723720SaA;
import X.InterfaceC736830SvJ;
import X.InterfaceC736910SvR;
import Y.AkS474S0100000_11;
import android.util.SparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS20S0600000_11;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS5S0700000_11;
import kotlin.jvm.internal.AwS73S0500000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AssemViewModel<S extends InterfaceC0148002o> extends ViewModel implements LifecycleOwner {
    public volatile boolean _initialized;
    public Object _item;
    public final C2192808iU assemVMScope$delegate;
    public final C01GW disposables$delegate;
    public C0RTY hierarchyDataStore;
    public WeakReference<Function0<InterfaceC665370Q7z>> hierarchyDataVScopeProducerRef;
    public C724710Sbl hierarchyServiceStore;
    public S initialState;
    public final C2192808iU internalAssemVMScope$delegate;
    public boolean isCleared;
    public final boolean isHolderVM;
    public Function1<Object, Unit> itemSync2StateCallback;
    public WeakReference<Lifecycle> lifecycleRef;
    public final C01GW mainThreadVMScope$delegate;
    public long maxScheduledGeneration;
    public Object onItemChangeCallback;
    public final SparseArray<InterfaceC736910SvR<?>> repos;
    public final C01GW singleThreadVMScope$delegate;
    public Function2<Object, ? super S, ? extends Object> syncState2Item;
    public boolean useOwnerLifecycle;
    public boolean usedInReusedScene;
    public InterfaceC736830SvJ<S> vmDispatcher;

    public static /* synthetic */ void getHierarchyDataStore$annotations() {
    }

    public static /* synthetic */ void getHierarchyDataVScopeProducer$annotations() {
    }

    public static /* synthetic */ void getHierarchyServiceStore$annotations() {
    }

    public static /* synthetic */ void getLifecycleRef$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getLifecycleScope$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSingleThreadVMScope$annotations() {
    }

    public static /* synthetic */ void getVmDispatcher$annotations() {
    }

    public abstract S defaultState();

    public void onPrepared() {
    }

    private final C11NJ getDisposables() {
        return (C11NJ) this.disposables$delegate.getValue();
    }

    private final InterfaceC497601wk getMainThreadVMScope() {
        return (InterfaceC497601wk) this.mainThreadVMScope$delegate.getValue();
    }

    public final InterfaceC497601wk getAssemVMScope() {
        return (InterfaceC497601wk) this.assemVMScope$delegate.getValue();
    }

    public final Function0<InterfaceC665370Q7z> getHierarchyDataVScopeProducer() {
        WeakReference<Function0<InterfaceC665370Q7z>> weakReference = this.hierarchyDataVScopeProducerRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final InterfaceC497601wk getInternalAssemVMScope$assem_release() {
        return (InterfaceC497601wk) this.internalAssemVMScope$delegate.getValue();
    }

    public final WeakReference<Lifecycle> getLifecycleRef() {
        WeakReference<Lifecycle> weakReference = this.lifecycleRef;
        if (weakReference != null) {
            return weakReference;
        }
        return null;
    }

    public final InterfaceC497601wk getSingleThreadVMScope() {
        return (InterfaceC497601wk) this.singleThreadVMScope$delegate.getValue();
    }

    public final S getState() {
        return (S) this.vmDispatcher.getState();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        C0RTY c0rty;
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        if (!C725080ScM.LJIIZILJ && (c0rty = this.hierarchyDataStore) != null) {
            c0rty.LIZ();
        }
        C724710Sbl c724710Sbl = this.hierarchyServiceStore;
        if (c724710Sbl != null) {
            ((LinkedHashMap) c724710Sbl.LIZIZ).clear();
            ((LinkedHashMap) c724710Sbl.LIZJ).clear();
        }
        this.hierarchyDataVScopeProducerRef = null;
        int size = this.repos.size();
        for (int i = 0; i < size; i++) {
            InterfaceC736910SvR<?> interfaceC736910SvR = this.repos.get(i);
            if (interfaceC736910SvR != null) {
                interfaceC736910SvR.release();
            }
        }
        C2296808zG.LIZJ(getAssemVMScope(), null);
        C2296808zG.LIZJ(getInternalAssemVMScope$assem_release(), null);
        C2296808zG.LIZJ(getMainThreadVMScope(), null);
        getDisposables().LJ();
        InterfaceC736830SvJ<S> interfaceC736830SvJ = this.vmDispatcher;
        if (interfaceC736830SvJ != null) {
            interfaceC736830SvJ.LJJIJIIJIL();
        }
        super.onCleared();
    }

    public AssemViewModel() {
        Executor executor = C725080ScM.LJJ;
        this.assemVMScope$delegate = new C2192808iU(executor == null ? C725080ScM.LIZ() : executor);
        this.internalAssemVMScope$delegate = new C2192808iU(C725080ScM.LIZ());
        this.singleThreadVMScope$delegate = C452501pT.LIZIZ(new AwS555S0100000_11((AssemViewModel) this, 50));
        this.mainThreadVMScope$delegate = C452501pT.LIZ(EnumC452301pR.NONE, new C2135108Yb());
        this.disposables$delegate = C452501pT.LIZIZ(new C736920SvS());
        this.repos = new SparseArray<>();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = getLifecycleRef().get();
        if (lifecycle != null) {
            return lifecycle;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final InterfaceC497601wk getLifecycleScope() {
        return LifecycleKt.getCoroutineScope(getLifecycle());
    }

    public final C0RTY getHierarchyDataStore() {
        return this.hierarchyDataStore;
    }

    public final C724710Sbl getHierarchyServiceStore() {
        return this.hierarchyServiceStore;
    }

    public final long getMaxScheduledGeneration$assem_release() {
        return this.maxScheduledGeneration;
    }

    public boolean getUseCoroutines() {
        return false;
    }

    public final boolean getUseOwnerLifecycle$assem_release() {
        return this.useOwnerLifecycle;
    }

    public final boolean getUsedInReusedScene$assem_release() {
        return this.usedInReusedScene;
    }

    public final InterfaceC736830SvJ<S> getVmDispatcher() {
        return this.vmDispatcher;
    }

    public boolean isHolderVM() {
        return this.isHolderVM;
    }

    public final boolean isInitialized() {
        return this._initialized;
    }

    /* JADX INFO: renamed from: getState, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ AnonymousClass0694 m129getState() {
        return (AnonymousClass0694) getState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Function1<S, Unit> wrapBlock(Function1<? super S, Unit> function1) {
        if (C725080ScM.LIZ) {
            return new AwS590S0100000_11(function1, (Function1<? super C0RTH, Unit>) 30);
        }
        return function1;
    }

    public final InterfaceC420801kM disposeOnClear(InterfaceC420801kM interfaceC420801kM) {
        getDisposables().LIZ(interfaceC420801kM);
        return interfaceC420801kM;
    }

    public final void injectHierarchyDataStore(C0RTY c0rty) {
        this.hierarchyDataStore = c0rty;
    }

    public final void injectHierarchyDataVScopeProducer(Function0<? extends InterfaceC665370Q7z> function0) {
        this.hierarchyDataVScopeProducerRef = new WeakReference<>(function0);
    }

    public final void injectHierarchyServiceStore(C724710Sbl c724710Sbl) {
        this.hierarchyServiceStore = c724710Sbl;
    }

    public <OPT extends InterfaceC149400hg> void putCreatedRepository(InterfaceC736910SvR<OPT> interfaceC736910SvR) {
        SparseArray<InterfaceC736910SvR<?>> sparseArray = this.repos;
        sparseArray.put(sparseArray.size(), interfaceC736910SvR);
    }

    public final void runOnUIThread(Function1<? super InterfaceC497601wk, Unit> function1) {
        C23250099c.LIZLLL(getMainThreadVMScope(), null, null, new C01KH(function1, null), 3);
    }

    public final void runOnWorkThread(Function1<? super InterfaceC497601wk, Unit> function1) {
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C01KI(function1, null), 3);
    }

    public final void setHierarchyDataStore(C0RTY c0rty) {
        this.hierarchyDataStore = c0rty;
    }

    public final void setHierarchyServiceStore(C724710Sbl c724710Sbl) {
        this.hierarchyServiceStore = c724710Sbl;
    }

    public final void setLifecycleRef(WeakReference<Lifecycle> weakReference) {
        this.lifecycleRef = weakReference;
    }

    public final void setMaxScheduledGeneration$assem_release(long j) {
        this.maxScheduledGeneration = j;
    }

    public final void setState(Function1<? super S, ? extends S> function1) {
        this.vmDispatcher.LIZ(new C735780Stc(this, function1));
    }

    public final void setStateImmediate(Function1<? super S, ? extends S> function1) {
        this.vmDispatcher.LJJJJIZL(function1);
    }

    public final void setUseOwnerLifecycle$assem_release(boolean z) {
        this.useOwnerLifecycle = z;
    }

    public final void setUsedInReusedScene$assem_release(boolean z) {
        this.usedInReusedScene = z;
    }

    public final void setVmDispatcher(InterfaceC736830SvJ<S> interfaceC736830SvJ) {
        this.vmDispatcher = interfaceC736830SvJ;
    }

    public final void withState(Function1<? super S, Unit> function1) {
        this.vmDispatcher.LJJIJIL(wrapBlock(function1));
    }

    public final void withStateImmediate(Function1<? super S, Unit> function1) {
        function1.invoke(this.vmDispatcher.getState());
    }

    public final InterfaceC420801kM execute(AbstractC19486711Lt abstractC19486711Lt, Function2<? super S, ? super AbstractC1623806Xk<Unit>, ? extends S> function2) {
        Callable callable = new Callable() { // from class: X.09aS
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                C1C7U.LIZ("AssemViewModel@239f.execute$2");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AssemViewModel@239f.execute$2");
                return unit;
            }
        };
        abstractC19486711Lt.getClass();
        return execute(new C19478111Il(abstractC19486711Lt, callable, null), function2);
    }

    public final void initialize(InterfaceC736830SvJ<S> interfaceC736830SvJ, Function1<? super S, ? extends S> function1) {
        if (this.initialState == null) {
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("try init vm ");
                        sbLIZ.append(this);
                        sbLIZ.append(" on thread ");
                        sbLIZ.append(C786410Ut5.u3());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        int i = C2187451AjH.LIZ;
                        interfaceC723720SaA.log("assem_vm", strLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C724640Sbe.LIZIZ(new C736860SvM(function1, this, interfaceC736830SvJ));
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA2 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("done init vm ");
                        sbLIZ2.append(this);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        int i2 = C2187451AjH.LIZ;
                        interfaceC723720SaA2.log("assem_vm", strLIZIZ2);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> InterfaceC420801kM execute(AbstractC19484711Kz<T> abstractC19484711Kz, Function2<? super S, ? super AbstractC1623806Xk<? extends T>, ? extends S> function2) {
        return execute(abstractC19484711Kz.LJJIJLIJ(), AFwS243S0000000_11.get$arr$(17), function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> InterfaceC420801kM execute(C11NZ<T> c11nz, Function2<? super S, ? super AbstractC1623806Xk<? extends T>, ? extends S> function2) {
        return execute(c11nz, AFwS243S0000000_11.get$arr$(18), function2);
    }

    public final <T, V> InterfaceC420801kM execute(C11NZ<T> c11nz, Function1<? super T, ? extends V> function1, final Function2<? super S, ? super AbstractC1623806Xk<? extends V>, ? extends S> function2) {
        final Thread threadU3;
        final boolean z = C725080ScM.LIZ;
        if (z) {
            threadU3 = C786410Ut5.u3();
        } else {
            threadU3 = null;
        }
        setState(new AwS590S0100000_11((Function2) function2, 29));
        InterfaceC420801kM interfaceC420801kMLJJLJLI = c11nz.LJJJJZI(new AkS474S0100000_11(function1, 1)).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.0CnI
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return new C491001vg((Throwable) obj);
            }
        }).LJJLJLI(new C09JN() { // from class: X.0SvP
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AssemViewModel@239f.execute$7");
                AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
                if (z && threadU3 == C786410Ut5.u3()) {
                    "you need schedule upstream to another thread, you can call subscribeOn(IO)".toString();
                    throw new IllegalStateException("you need schedule upstream to another thread, you can call subscribeOn(IO)");
                }
                this.setState(new AwS369S0200000_3(function2, (Function2<InterfaceC0148002o, ? super AbstractC1623806Xk<Object>, InterfaceC0148002o>) abstractC1623806Xk, (AbstractC1623806Xk<Object>) 1));
                C1C7U.LIZIZ("AssemViewModel@239f.execute$7");
            }
        });
        disposeOnClear(interfaceC420801kMLJJLJLI);
        return interfaceC420801kMLJJLJLI;
    }

    public final void syncState2Item$assem_release(Object obj, Object obj2, Object obj3) {
        C19719512Dh.LJ(2, obj2);
        this.syncState2Item = (Function2) obj2;
        this._item = obj;
        this.onItemChangeCallback = obj3;
    }

    public final <T, V> InterfaceC420801kM execute(AbstractC19484711Kz<T> abstractC19484711Kz, Function1<? super T, ? extends V> function1, Function2<? super S, ? super AbstractC1623806Xk<? extends V>, ? extends S> function2) {
        return execute(abstractC19484711Kz.LJJIJLIJ(), function1, function2);
    }

    public final C0ZP4 subscribe(LifecycleOwner lifecycleOwner, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function1<? super S, Unit> function12) {
        return (C0ZP4) C725430Scv.LIZLLL(C736780SvE.LIZ, new C736750SvB(this), new AwS73S0500000_11((AssemViewModel) this, lifecycleOwner, (LifecycleOwner) c1770850wBP, (Function1) function1, (Function1<? super Throwable, Unit>) function12, 0));
    }

    public final void subscribeInternal(C1770850wBP<S> c1770850wBP, LifecycleOwner lifecycleOwner, Function1<? super Throwable, Unit> function1, Function1<? super S, Unit> function12) {
        C725430Scv.LIZLLL(C736780SvE.LIZ, new C736750SvB(this), new AwS73S0500000_11((AssemViewModel) this, lifecycleOwner, (LifecycleOwner) c1770850wBP, (Function1) function1, (Function1<? super Throwable, Unit>) function12, 1));
    }

    public final void syncItem2State$assem_release(Object obj, List<? extends Object> list, Object obj2, Function2<Object, ? super List<? extends Object>, Unit> function2) {
        boolean z;
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("syncItem2State in ");
                    sbLIZ.append(this);
                    sbLIZ.append(", isInit: ");
                    sbLIZ.append(this._initialized);
                    sbLIZ.append(", initialState is null: ");
                    if (this.initialState == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ.append(z);
                    sbLIZ.append("， thread: ");
                    sbLIZ.append(C786410Ut5.u3());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("assem_vm", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.vmDispatcher.LIZ(new C736900SvQ(obj2, list, obj, function2));
    }

    @InterfaceC1294060jmO
    public final <T> C0ZP4 asyncSubscribe(InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        return (C0ZP4) C725430Scv.LIZLLL(C736780SvE.LIZ, new C736750SvB(this), new AwS20S0600000_11((AssemViewModel) this, (InterfaceC2217241BqE) interfaceC2217241BqE, (C1770850wBP) c1770850wBP, (Function1) function1, (Function1<? super Throwable, Unit>) function0, (Function0<Unit>) function12, 0));
    }

    public final <A> C0ZP4 selectSubscribe(InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, LifecycleOwner lifecycleOwner, Function1<? super Throwable, Unit> function1, Function1<? super A, Unit> function12) {
        return (C0ZP4) C725430Scv.LIZLLL(C736780SvE.LIZ, new C736750SvB(this), new C736880SvO(this, lifecycleOwner, interfaceC2217241BqE, c1770850wBP, function1, function12));
    }

    public final <T> C0ZP4 asyncSubscribe(InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, LifecycleOwner lifecycleOwner, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        return (C0ZP4) C725430Scv.LIZLLL(C736780SvE.LIZ, new C736750SvB(this), new AwS5S0700000_11((AssemViewModel) this, lifecycleOwner, (LifecycleOwner) interfaceC2217241BqE, (C1770850wBP) c1770850wBP, (Function1) function1, (Function1<? super Throwable, Unit>) function0, (Function0<Unit>) function12, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0ZP4 subscribe$default(AssemViewModel assemViewModel, LifecycleOwner lifecycleOwner, C1770850wBP c1770850wBP, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                lifecycleOwner = null;
            }
            if ((i & 2) != 0) {
                c1770850wBP = C736820SvI.LIZIZ(assemViewModel.usedInReusedScene);
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            return assemViewModel.subscribe(lifecycleOwner, c1770850wBP, function1, function12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void subscribeInternal$default(AssemViewModel assemViewModel, C1770850wBP c1770850wBP, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                c1770850wBP = C736820SvI.LIZIZ(false);
            }
            if ((i & 2) != 0) {
                lifecycleOwner = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            assemViewModel.subscribeInternal(c1770850wBP, lifecycleOwner, function1, function12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeInternal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void syncItem2State$assem_release$default(AssemViewModel assemViewModel, Object obj, List list, Object obj2, Function2 function2, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 8) != 0) {
                function2 = null;
            }
            assemViewModel.syncItem2State$assem_release(obj, list, obj2, function2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncItem2State");
    }

    public final <A, B> C0ZP4 selectSubscribe(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, Function2<? super A, ? super B, Unit> function2) {
        return (C0ZP4) C725430Scv.LIZLLL(C736780SvE.LIZ, new C736750SvB(this), new C736870SvN(this, lifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, c1770850wBP, function0, function1, function2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0ZP4 asyncSubscribe$default(AssemViewModel assemViewModel, InterfaceC2217241BqE interfaceC2217241BqE, C1770850wBP c1770850wBP, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        Function0 function02 = function0;
        Function1 function13 = function1;
        C1770850wBP c1770850wBPLIZIZ = c1770850wBP;
        if (obj == null) {
            if ((i & 2) != 0) {
                c1770850wBPLIZIZ = C736820SvI.LIZIZ(false);
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
            return assemViewModel.asyncSubscribe(interfaceC2217241BqE, c1770850wBPLIZIZ, function13, function02, function14);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asyncSubscribe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0ZP4 selectSubscribe$default(AssemViewModel assemViewModel, InterfaceC2217241BqE interfaceC2217241BqE, C1770850wBP c1770850wBP, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, int i, Object obj) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        C1770850wBP c1770850wBPLIZIZ = c1770850wBP;
        if (obj == null) {
            if ((i & 2) != 0) {
                c1770850wBPLIZIZ = C736820SvI.LIZIZ(false);
            }
            Function1 function13 = null;
            if ((i & 4) != 0) {
                lifecycleOwner2 = null;
            }
            if ((i & 8) == 0) {
                function13 = function1;
            }
            return assemViewModel.selectSubscribe(interfaceC2217241BqE, c1770850wBPLIZIZ, lifecycleOwner2, function13, function12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0ZP4 asyncSubscribe$default(AssemViewModel assemViewModel, InterfaceC2217241BqE interfaceC2217241BqE, LifecycleOwner lifecycleOwner, C1770850wBP c1770850wBP, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        Function0 function02 = function0;
        Function1 function13 = function1;
        C1770850wBP c1770850wBPLIZIZ = c1770850wBP;
        if (obj == null) {
            if ((i & 4) != 0) {
                c1770850wBPLIZIZ = C736820SvI.LIZIZ(false);
            }
            Function1 function14 = null;
            if ((i & 8) != 0) {
                function13 = null;
            }
            if ((i & 16) != 0) {
                function02 = null;
            }
            if ((i & 32) == 0) {
                function14 = function12;
            }
            return assemViewModel.asyncSubscribe(interfaceC2217241BqE, lifecycleOwner, c1770850wBPLIZIZ, function13, function02, function14);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asyncSubscribe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0ZP4 selectSubscribe$default(AssemViewModel assemViewModel, LifecycleOwner lifecycleOwner, InterfaceC2217241BqE interfaceC2217241BqE, InterfaceC2217241BqE interfaceC2217241BqE2, C1770850wBP c1770850wBP, Function0 function0, Function1 function1, Function2 function2, int i, Object obj) {
        Function0 function02 = function0;
        C1770850wBP c1770850wBPLIZIZ = c1770850wBP;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (obj == null) {
            Function1 function12 = null;
            if ((i & 1) != 0) {
                lifecycleOwner2 = null;
            }
            if ((i & 8) != 0) {
                c1770850wBPLIZIZ = C736820SvI.LIZIZ(false);
            }
            if ((i & 16) != 0) {
                function02 = AFwS193S0000000_7.get$arr$(101);
            }
            if ((i & 32) == 0) {
                function12 = function1;
            }
            return assemViewModel.selectSubscribe(lifecycleOwner2, interfaceC2217241BqE, interfaceC2217241BqE2, c1770850wBPLIZIZ, function02, function12, function2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }
}
