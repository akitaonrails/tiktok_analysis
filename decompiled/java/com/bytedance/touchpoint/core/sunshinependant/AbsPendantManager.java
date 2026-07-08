package com.bytedance.touchpoint.core.sunshinependant;

import X.AbstractC1895130zPr;
import X.C1893670zNV;
import X.C2217381BqS;
import X.C736820SvI;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public abstract class AbsPendantManager<T> extends AbstractC1895130zPr implements GenericLifecycleObserver {
    public C1893670zNV LL;

    public abstract void LJIIJ();

    public abstract void LJIIJJI();

    public abstract void LJIIL();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    public AbsPendantManager() {
        BaseTouchPointDataVM baseTouchPointDataVMLJIIIZ = LJIIIZ();
        if (baseTouchPointDataVMLJIIIZ != null) {
            baseTouchPointDataVMLJIIIZ.vQ2(new C2217381BqS() { // from class: X.0zSG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Long.valueOf(((C1895080zPm) obj).LL);
                }
            }, null, new AwS607S0100000_28((AbsPendantManager) this, 34));
            baseTouchPointDataVMLJIIIZ.vQ2(new C2217381BqS() { // from class: X.0zSH
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1895080zPm) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), new AwS607S0100000_28((AbsPendantManager) this, 35));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestory() {
        LJIIJJI();
    }
}
