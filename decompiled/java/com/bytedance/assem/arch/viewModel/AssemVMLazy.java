package com.bytedance.assem.arch.viewModel;

import X.C01GW;
import X.C09R7;
import X.C0RTY;
import X.C13IQ;
import X.C1622206Wu;
import X.C338490DOt;
import X.C451670HnR;
import X.C452070Ho5;
import X.C452501pT;
import X.C634200OuA;
import X.C724710Sbl;
import X.C725430Scv;
import X.C725450Scx;
import X.C725480Sd0;
import X.C737880Sx0;
import X.C738120SxO;
import X.C786410Ut5;
import X.C903300Zc8;
import X.InterfaceC0148002o;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC725440Scw;
import X.InterfaceC736830SvJ;
import X.InterfaceC737790Swr;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS2S1210100_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class AssemVMLazy<S extends InterfaceC0148002o, VM extends AssemViewModel<S>> implements C01GW<VM>, InterfaceC1731706qJ<Object, VM> {
    public final Function0<C13IQ<VM>> LL;
    public final Function0<String> LLILLJJLI;
    public final Function0<InterfaceC736830SvJ<S>> LLILLL;
    public final Function0<LifecycleOwner> LLILZ;
    public final Function0<ViewModelStore> LLILZIL;
    public final Function0<ViewModelProvider.Factory> LLILZLL;
    public final Function1<S, S> LLIZ;
    public final Function0<C0RTY> LLIZLLLIL;
    public final Function0<C724710Sbl> LLJ;
    public VM LLJI;
    public final C01GW LLJIJIL;
    public final Function0<InterfaceC665370Q7z> hierarchyDataVScopeProducer;

    @Override // X.C01GW
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final VM getValue() {
        VM vm = this.LLJI;
        if (vm == null) {
            Class clsLIZ = C09R7.LIZ((C13IQ) this.LLJIJIL.getValue());
            C09R7.LIZ((C13IQ) this.LLJIJIL.getValue());
            synchronized (clsLIZ) {
                try {
                    VM vm2 = this.LLJI;
                    if (vm2 != null) {
                        return vm2;
                    }
                    vm = (VM) LIZIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return vm;
    }

    public final VM LIZIZ() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        C737880Sx0 c737880Sx0 = C737880Sx0.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c737880Sx0);
                }
            }
            if (C725480Sd0.LIZ(c737880Sx0)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c737880Sx0, "default", SystemClock.elapsedRealtimeNanos(), 6));
            }
        }
        LifecycleOwner lifecycleOwnerInvoke = this.LLILZ.invoke();
        if ((lifecycleOwnerInvoke instanceof Fragment) && ((Fragment) lifecycleOwnerInvoke).getFragmentManager() == null) {
            throw new C738120SxO("Can't access AssemViewModel with VMScope.Fragment after the nearest fragment is destroy of this Assem.You can set createViewModelDirectly = true when create this VM.");
        }
        ViewModelProvider.Factory factoryInvoke = this.LLILZLL.invoke();
        VM vm = (VM) new ViewModelProvider(this.LLILZIL.invoke(), factoryInvoke, C903300Zc8.LIZJ).get(this.LLILLJJLI.invoke(), C09R7.LIZ((C13IQ) this.LLJIJIL.getValue()));
        vm.setLifecycleRef(new WeakReference<>(lifecycleOwnerInvoke.getLifecycle()));
        Function0<C0RTY> function0 = this.LLIZLLLIL;
        vm.hierarchyDataStore = function0 != null ? function0.invoke() : null;
        Function0<C724710Sbl> function02 = this.LLJ;
        vm.hierarchyServiceStore = function02 != null ? function02.invoke() : null;
        vm.injectHierarchyDataVScopeProducer(this.hierarchyDataVScopeProducer);
        vm.initialize(this.LLILLL.invoke(), this.LLIZ);
        if ((vm instanceof InterfaceC737790Swr) && (interfaceC665370Q7zLIZ = C634200OuA.LIZ(lifecycleOwnerInvoke)) != null) {
            ((InterfaceC737790Swr) vm).pQ(interfaceC665370Q7zLIZ);
        }
        this.LLJI = vm;
        C737880Sx0 c737880Sx02 = C737880Sx0.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c737880Sx02);
                }
            }
            if (C725480Sd0.LIZ(c737880Sx02)) {
                C725430Scv.LIZ(new AwS2S1210100_11(c737880Sx02, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), this, 3));
            }
        }
        return vm;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLJI != null;
    }

    @Override // X.InterfaceC1731706qJ
    public final Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        return getValue();
    }

    public /* synthetic */ AssemVMLazy(Function0 function0, Function0 function02, C452070Ho5 c452070Ho5, C1622206Wu c1622206Wu, C338490DOt c338490DOt, Function0 function03, Function1 function1) {
        this(function0, function02, c452070Ho5, c1622206Wu, c338490DOt, function03, function1, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssemVMLazy(Function0<? extends C13IQ<VM>> function0, Function0<String> function02, Function0<? extends InterfaceC736830SvJ<S>> function03, Function0<? extends LifecycleOwner> function04, Function0<? extends ViewModelStore> function05, Function0<? extends ViewModelProvider.Factory> function06, Function1<? super S, ? extends S> function1, Function0<C0RTY> function07, Function0<C724710Sbl> function08, Function0<? extends InterfaceC665370Q7z> function09) {
        this.LL = function0;
        this.LLILLJJLI = function02;
        this.LLILLL = function03;
        this.LLILZ = function04;
        this.LLILZIL = function05;
        this.LLILZLL = function06;
        this.LLIZ = function1;
        this.LLIZLLLIL = function07;
        this.LLJ = function08;
        this.hierarchyDataVScopeProducer = function09;
        this.LLJIJIL = C452501pT.LIZIZ(new C451670HnR(this));
    }
}
