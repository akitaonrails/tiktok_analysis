package com.ss.android.ugc.aweme.tako.botpage.cards.base;

import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerBaseAssem$registerMessageContentExposureHostObserverIfNeeded$3 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ TakoAnswerBaseAssem<T> LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
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

    public TakoAnswerBaseAssem$registerMessageContentExposureHostObserverIfNeeded$3(TakoAnswerBaseAssem<T> takoAnswerBaseAssem) {
        this.LL = takoAnswerBaseAssem;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LL.Xp("hostFragmentOnDestroy");
        this.LL.Zq("hostFragmentOnDestroy");
        this.LL.kq();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        TakoAnswerBaseAssem<T> takoAnswerBaseAssem = this.LL;
        takoAnswerBaseAssem.LLLIIII = false;
        takoAnswerBaseAssem.Mq("hostPause");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        TakoAnswerBaseAssem<T> takoAnswerBaseAssem = this.LL;
        takoAnswerBaseAssem.LLLIIII = true;
        takoAnswerBaseAssem.Fq("hostResume");
    }
}
