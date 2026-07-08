package com.ss.android.ugc.aweme.ecommerce.lynx.spark;

import X.AbstractC1387200mCc;
import X.C09JN;
import X.C11JF;
import X.C2368609Pw;
import X.C356901a3;
import Y.AfS117S0300000_28;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes29.dex */
public final class SinglePageMonitorObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C11JF LL;

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LL.dispose();
    }

    public SinglePageMonitorObserver(Lifecycle lifecycle, C2368609Pw<AbstractC1387200mCc> c2368609Pw, C09JN<? super AbstractC1387200mCc> c09jn) {
        this.LL = c2368609Pw.LJLLLLLL(new AfS117S0300000_28(c09jn, lifecycle, this, 1));
    }
}
