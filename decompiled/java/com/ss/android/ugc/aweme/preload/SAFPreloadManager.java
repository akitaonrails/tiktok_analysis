package com.ss.android.ugc.aweme.preload;

import X.C199R;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class SAFPreloadManager {
    public static final SAFPreloadManager LIZ = new SAFPreloadManager();
    public static final ConcurrentHashMap<Integer, List<C199R>> LIZIZ = new ConcurrentHashMap<>();

    public static final class SAFPreloadLifecycleObserver implements LifecycleEventObserver {
        public final int LL;

        public SAFPreloadLifecycleObserver(int i) {
            this.LL = i;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                SAFPreloadManager.LIZIZ.remove(Integer.valueOf(this.LL));
            }
        }
    }
}
