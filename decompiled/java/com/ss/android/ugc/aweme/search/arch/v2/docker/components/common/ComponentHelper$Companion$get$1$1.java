package com.ss.android.ugc.aweme.search.arch.v2.docker.components.common;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ComponentHelper$Companion$get$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ LifecycleOwner LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
    }

    public ComponentHelper$Companion$get$1$1(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Map<LifecycleOwner, ComponentHelper> map = ComponentHelper.LIZJ;
        ComponentHelper componentHelper = (ComponentHelper) ((LinkedHashMap) map).get(this.LL);
        if (componentHelper != null) {
            ((LinkedHashMap) componentHelper.LIZ).clear();
            ((LinkedHashMap) componentHelper.LIZIZ).clear();
        }
        map.remove(this.LL);
    }
}
