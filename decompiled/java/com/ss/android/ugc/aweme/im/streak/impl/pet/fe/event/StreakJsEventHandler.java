package com.ss.android.ugc.aweme.im.streak.impl.pet.fe.event;

import X.AbstractC1573806Ee;
import X.C13IQ;
import X.C1574006Eg;
import X.C1574106Eh;
import X.C1574206Ei;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C23250099c;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class StreakJsEventHandler<T extends AbstractC1573806Ee> implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final String LL;
    public final C13IQ<T> LLILLJJLI;
    public final Function1<T, Unit> LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPetJsEventHandler(tag='");
        sbLIZ.append(this.LL);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C1574006Eg.LLILLJJLI.getClass();
        C23250099c.LIZLLL(C1574006Eg.LLILZ, null, null, new C1574106Eh(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C1574006Eg.LLILLJJLI.getClass();
        C23250099c.LIZLLL(C1574006Eg.LLILZ, null, null, new C1574206Ei(this, null), 3);
    }

    public StreakJsEventHandler(String str, C19719912Dl c19719912Dl, Function1 function1) {
        this.LL = str;
        this.LLILLJJLI = c19719912Dl;
        this.LLILLL = function1;
    }
}
