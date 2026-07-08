package com.ss.android.ugc.aweme.explore.assem;

import X.C1257380ipE;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes20.dex */
public final class ExploreDetailReturnTracker$registerOneShotDetailReturn$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ AtomicBoolean LL;
    public final /* synthetic */ C1257380ipE LLILLJJLI;

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
        if (!this.LL.get()) {
            SAFExtensionKt.LJJIIJ(this.LLILLJJLI);
        }
    }

    public ExploreDetailReturnTracker$registerOneShotDetailReturn$1(AtomicBoolean atomicBoolean, C1257380ipE c1257380ipE) {
        this.LL = atomicBoolean;
        this.LLILLJJLI = c1257380ipE;
    }
}
