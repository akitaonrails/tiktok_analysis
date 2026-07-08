package com.ss.android.ugc.aweme.series.innerfeed.interceptor;

import X.C356901a3;
import Y.ARunnableS9S1200000_3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes4.dex */
public final class SeriesInnerFeedInterceptor$launchInnerFeedWhenVisible$observer$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ Lifecycle LL;
    public final /* synthetic */ Runnable LLILLJJLI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
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
    public final void onResume(LifecycleOwner lifecycleOwner) {
        this.LL.removeObserver(this);
        this.LLILLJJLI.run();
    }

    public SeriesInnerFeedInterceptor$launchInnerFeedWhenVisible$observer$1(Lifecycle lifecycle, ARunnableS9S1200000_3 aRunnableS9S1200000_3) {
        this.LL = lifecycle;
        this.LLILLJJLI = aRunnableS9S1200000_3;
    }
}
