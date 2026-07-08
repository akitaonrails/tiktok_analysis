package com.bytedance.jedi.arch;

import X.C004I;
import X.C11EC;
import X.C11IR;
import X.C1765020w20;
import X.C2217381BqS;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes26.dex */
public abstract class BaseJediViewModel<S extends C004I> extends JediViewModel<S> {
    public final C004I hR2() {
        AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(462);
        S sFQ2 = FQ2();
        aFwS266S0000000_25.getClass();
        return sFQ2;
    }

    public static InterfaceC420801kM iR2(BaseJediViewModel baseJediViewModel, LifecycleOwner lifecycleOwner, C2217381BqS c2217381BqS, Function1 function1) {
        C1765020w20 c1765020w20 = new C1765020w20();
        baseJediViewModel.getClass();
        return baseJediViewModel.jR2(lifecycleOwner, c2217381BqS, c1765020w20, new AwS587S0100000_8(function1, 636));
    }

    public final <A> InterfaceC420801kM jR2(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function1<? super A, Unit> function1) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return C11IR.LL.LJJLJ();
        }
        final InterfaceC420801kM interfaceC420801kMWQ2 = WQ2(interfaceC2217241BqE, c1765020w20, function1);
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.jedi.arch.BaseJediViewModel$selectSubscribe$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                if (interfaceC420801kMWQ2.isDisposed()) {
                    return;
                }
                interfaceC420801kMWQ2.dispose();
            }
        });
        return interfaceC420801kMWQ2;
    }
}
