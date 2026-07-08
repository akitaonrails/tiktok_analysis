package com.ss.android.ugc.cut_ui_base;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class LifeCycleLogger implements GenericLifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
    }
}
