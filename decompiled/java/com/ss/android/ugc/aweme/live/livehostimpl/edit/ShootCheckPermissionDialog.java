package com.ss.android.ugc.aweme.live.livehostimpl.edit;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes13.dex */
public final class ShootCheckPermissionDialog implements GenericLifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onStart();
        }
    }
}
