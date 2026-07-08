package com.ss.android.ugc.aweme.account.base;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes4.dex */
public class SafeHandler extends BPEAHandler implements GenericLifecycleObserver {
    public final LifecycleOwner LL;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
        removeCallbacksAndMessages(null);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    public SafeHandler(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
