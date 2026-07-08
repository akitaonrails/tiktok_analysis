package com.ss.android.ugc.aweme.im.common.view;

import X.C01GW;
import X.C452501pT;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public class Widget implements LifecycleOwner, GenericLifecycleObserver {
    public final C01GW LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 596));

    public void onDestroy() {
    }

    public void onResume() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            create();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            start();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            resume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            pause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            stop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void create() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        onDestroy();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void pause() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void resume() {
        onResume();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void start() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void stop() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }
}
