package com.ss.android.ugc.aweme.ecommerce.preloader;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class ImagePreloader$Queue$2 implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            resume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            pause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        throw null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void pause() {
        throw null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void resume() {
        throw null;
    }
}
