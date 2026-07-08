package com.ss.android.ugc.aweme.feed.helper;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes.dex */
public final class AutoRemoveLifecycleObserver implements GenericLifecycleObserver {
    public final Lifecycle LL;
    public final Runnable LLILLJJLI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Runnable runnable = this.LLILLJJLI;
        if (runnable != null) {
            runnable.run();
        }
        this.LL.removeObserver(this);
    }

    public AutoRemoveLifecycleObserver(Lifecycle lifecycle, Runnable runnable) {
        this.LL = lifecycle;
        this.LLILLJJLI = runnable;
    }
}
