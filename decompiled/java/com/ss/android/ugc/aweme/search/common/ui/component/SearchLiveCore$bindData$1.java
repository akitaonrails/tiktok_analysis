package com.ss.android.ugc.aweme.search.common.ui.component;

import X.C0PZ5;
import X.C356901a3;
import X.C663070Pzd;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveCore$bindData$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C663070Pzd LL;

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

    public SearchLiveCore$bindData$1(C663070Pzd c663070Pzd) {
        this.LL = c663070Pzd;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C0PZ5 c0pz5 = C0PZ5.LIZ;
        c0pz5.getClass();
        if (Intrinsics.LJFF(C0PZ5.LIZIZ, this.LL.getSearchLiveCoreCallback())) {
            c0pz5.getClass();
            C0PZ5.LIZIZ = null;
        }
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LL.LIZLLL();
    }
}
