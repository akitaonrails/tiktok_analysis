package com.ss.android.ugc.aweme.poi.autoplay;

import X.AbstractC1193580hAK;
import X.C01GW;
import X.C01LK;
import X.C01LL;
import X.C0PEM;
import X.C1203610hQV;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C452501pT;
import X.C606770Nr1;
import X.InterfaceC1193590hAL;
import X.InterfaceC588530N6l;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AutoPlayController implements GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public C1203610hQV LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(269));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 872));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(270));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(271));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws Throwable {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() throws Throwable {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.LL;
        LifeCycleEnableStatus lifeCycleEnableStatus = (LifeCycleEnableStatus) this.LLILZIL.getValue();
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LJ(C2107308Nj.LIZ, new C01LL(lifecycleOwner, lifeCycleEnableStatus, null));
        } else if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(lifeCycleEnableStatus);
        }
        C606770Nr1 c606770Nr1 = (C606770Nr1) this.LLILZ.getValue();
        Iterator it2 = ((ArrayList) c606770Nr1.LIZIZ.getValue()).iterator();
        while (it2.hasNext()) {
            MutableLiveData<Integer> mutableLiveDataLIZ = ((InterfaceC588530N6l) it2.next()).LIZ();
            if (mutableLiveDataLIZ != null) {
                mutableLiveDataLIZ.removeObserver(c606770Nr1.LIZJ);
            }
        }
        ((ArrayList) c606770Nr1.LIZIZ.getValue()).clear();
        C1203610hQV c1203610hQV = this.LLILLJJLI;
        if (c1203610hQV != null) {
            c1203610hQV.LJFF(null);
            ((Handler) c1203610hQV.LIZIZ.getValue()).removeCallbacksAndMessages(null);
        }
        SparseArray sparseArray = (SparseArray) this.LLILZLL.getValue();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            ((InterfaceC1193590hAL) sparseArray.valueAt(i)).LJL();
        }
        ((SparseArray) this.LLILZLL.getValue()).clear();
    }

    public AutoPlayController(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    public final void LIZIZ(InterfaceC588530N6l interfaceC588530N6l) {
        if (interfaceC588530N6l == null) {
            return;
        }
        C606770Nr1 c606770Nr1 = (C606770Nr1) this.LLILZ.getValue();
        if (!((ArrayList) c606770Nr1.LIZIZ.getValue()).contains(interfaceC588530N6l)) {
            MutableLiveData<Integer> mutableLiveDataLIZ = interfaceC588530N6l.LIZ();
            if (mutableLiveDataLIZ != null) {
                mutableLiveDataLIZ.observeForever(c606770Nr1.LIZJ);
            }
            ((ArrayList) c606770Nr1.LIZIZ.getValue()).add(interfaceC588530N6l);
        }
        if (interfaceC588530N6l instanceof AbstractC1193580hAK) {
            this.LLILLL.getValue();
        }
    }

    public static void LIZ(LifecycleOwner lifecycleOwner, GenericLifecycleObserver genericLifecycleObserver) throws Throwable {
        Lifecycle lifecycle;
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(genericLifecycleObserver);
                return;
            }
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LJ(C2107308Nj.LIZ, new C01LK(lifecycleOwner, genericLifecycleObserver, null));
    }
}
