package com.bytedance.applog.params.lifecycle;

import X.C2209791BeD;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes3.dex */
public final class LifecycleValueObserver implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        C2209791BeD.LJIJJ().LIZLLL(null, "params with lifecycle owner destroyed and onDestroy callback invoke start...", new Object[0]);
        throw null;
    }
}
