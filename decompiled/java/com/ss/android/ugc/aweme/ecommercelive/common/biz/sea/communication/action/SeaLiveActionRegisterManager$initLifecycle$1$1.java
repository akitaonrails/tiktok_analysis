package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.communication.action;

import X.C1733450vD5;
import X.C2341109Fh;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AwS427S0200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaLiveActionRegisterManager$initLifecycle$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C1733450vD5 LL;

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

    public SeaLiveActionRegisterManager$initLifecycle$1$1(C1733450vD5 c1733450vD5) {
        this.LL = c1733450vD5;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(lifecycleOwner, this.LL, 39);
        c2341109Fh.getClass();
        C2341109Fh.LJFF(awS427S0200000_26);
        this.LL.LIZIZ.LIZLLL();
    }
}
