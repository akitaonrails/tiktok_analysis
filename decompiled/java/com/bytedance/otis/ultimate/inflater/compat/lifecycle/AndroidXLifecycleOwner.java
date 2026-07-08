package com.bytedance.otis.ultimate.inflater.compat.lifecycle;

import X.AbstractC1563340qmi;
import X.C1565730qqZ;
import X.C199Y;
import X.C19FO;
import X.C2482109o3;
import X.EnumC682280QpW;
import X.InterfaceC1567710qtl;
import X.InterfaceC21143917oj;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class AndroidXLifecycleOwner implements InterfaceC21143917oj, GenericLifecycleObserver {
    public final List<InterfaceC1567710qtl> LL = new ArrayList();
    public final Activity LLILLJJLI;

    @Override // X.InterfaceC21143917oj
    public final String getType() {
        return "androidx-lifecycle";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy(lifecycleOwner);
        }
    }

    @Override // X.InterfaceC21143917oj
    public final Activity getActivity() {
        return this.LLILLJJLI;
    }

    public AndroidXLifecycleOwner(Activity activity) {
        this.LLILLJJLI = activity;
    }

    @Override // X.InterfaceC21143917oj
    public final void LIZ(InterfaceC1567710qtl interfaceC1567710qtl) {
        Integer numLIZ;
        Activity activity = this.LLILLJJLI;
        if (activity instanceof C199Y) {
            C19FO c19fo = (C19FO) activity;
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) c19fo.getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.MAIN;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), c19fo)) != null) {
                LIZIZ(interfaceC1567710qtl);
                C1565730qqZ.LIZIZ(numLIZ.intValue(), c19fo);
                return;
            }
        }
        LIZIZ(interfaceC1567710qtl);
    }

    public final void LIZIZ(InterfaceC1567710qtl interfaceC1567710qtl) {
        if (((ArrayList) this.LL).isEmpty()) {
            ComponentCallbacks2 componentCallbacks2 = this.LLILLJJLI;
            if (componentCallbacks2 != null) {
                ((LifecycleOwner) componentCallbacks2).getLifecycle().addObserver(this);
            } else {
                throw new C2482109o3("null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            }
        }
        ((ArrayList) this.LL).add(interfaceC1567710qtl);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Iterator<InterfaceC1567710qtl> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(this);
        }
        ((ArrayList) this.LL).clear();
    }
}
