package com.ss.android.ugc.aweme.inbox.widget.multi.vh;

import X.C0ZP4;
import X.C1598160rgs;
import X.C1598650rhf;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightContainerVH$subscribeState$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C1598650rhf LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public SkylightContainerVH$subscribeState$1(C1598650rhf c1598650rhf) {
        this.LL = c1598650rhf;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C1598160rgs c1598160rgs = C1598160rgs.LIZ;
        List<C0ZP4> listT5 = this.LL.T5();
        c1598160rgs.getClass();
        Iterator<C0ZP4> it2 = listT5.iterator();
        while (it2.hasNext()) {
            it2.next().dispose();
        }
    }
}
