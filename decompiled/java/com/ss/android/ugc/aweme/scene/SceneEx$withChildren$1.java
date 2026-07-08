package com.ss.android.ugc.aweme.scene;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class SceneEx$withChildren$1 implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            oActivityCreated();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void oActivityCreated() {
        new ArrayList();
        throw null;
    }
}
