package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C879403c8;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniOspLifeObserver implements GenericLifecycleObserver {
    public final C879403c8 LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LL.getClass();
        C879403c8.LIZIZ();
    }

    public MiniOspLifeObserver(C879403c8 c879403c8) {
        this.LL = c879403c8;
    }
}
