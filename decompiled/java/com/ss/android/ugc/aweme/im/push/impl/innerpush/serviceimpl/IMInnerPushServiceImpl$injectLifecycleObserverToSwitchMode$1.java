package com.ss.android.ugc.aweme.im.push.impl.innerpush.serviceimpl;

import X.C356901a3;
import X.C876760YaQ;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes14.dex */
public final class IMInnerPushServiceImpl$injectLifecycleObserverToSwitchMode$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C876760YaQ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL = 2;

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
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.LL.LIZLLL(this.LLILLL, this.LLILLJJLI, "other_page_on_start", false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.LL.LIZLLL(0, this.LLILLJJLI, "other_page_on_stop", false);
    }

    public IMInnerPushServiceImpl$injectLifecycleObserverToSwitchMode$1(C876760YaQ c876760YaQ, String str) {
        this.LL = c876760YaQ;
        this.LLILLJJLI = str;
    }
}
