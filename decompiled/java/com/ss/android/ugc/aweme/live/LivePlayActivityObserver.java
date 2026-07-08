package com.ss.android.ugc.aweme.live;

import X.C1300430jwf;
import X.C480300IsW;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePlayActivityObserver implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        synchronized (C480300IsW.LIZ) {
            Iterator<Runnable> it2 = C480300IsW.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
            C480300IsW.LIZIZ.clear();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        boolean zLJI = MethodIDManager.LJI(72047);
        C1300430jwf.LIZIZ();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        boolean zLJI = MethodIDManager.LJI(72039);
        synchronized (C480300IsW.LIZ) {
            C480300IsW.LIZIZ.clear();
        }
        C1300430jwf.LIZ();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
