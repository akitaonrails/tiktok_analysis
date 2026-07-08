package com.bytedance.tux.window.controller;

import X.C20590815hi;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes27.dex */
public final class TuxWindowSizeController$bindLifecycleAutoRemove$observer$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C20590815hi.LL.getClass();
            SystemClock.uptimeMillis();
        }
    }
}
