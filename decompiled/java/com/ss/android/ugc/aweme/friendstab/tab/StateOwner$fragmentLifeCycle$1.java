package com.ss.android.ugc.aweme.friendstab.tab;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public final class StateOwner$fragmentLifeCycle$1 implements GenericLifecycleObserver {
    public final /* synthetic */ Fragment LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LL.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        StateOwner.LL.getClass();
        StateOwner.LLJILLL.postValue(Unit.LIZ);
    }

    public StateOwner$fragmentLifeCycle$1(Fragment fragment) {
        this.LL = fragment;
    }
}
