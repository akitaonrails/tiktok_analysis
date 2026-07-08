package com.bytedance.aweme.core;

import X.C0X3Q;
import X.C0X3R;
import X.C0X3T;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class SimbaLifeTrigger implements GenericLifecycleObserver {
    public final List<Long> LL = new ArrayList();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Collection<ArrayList<C0X3R>> collectionValues;
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ConcurrentHashMap<C0X3Q, ArrayList<C0X3R>> concurrentHashMap = C0X3T.LJFF.get(Long.valueOf(((Number) it2.next()).longValue()));
            if (concurrentHashMap != null && (collectionValues = concurrentHashMap.values()) != null) {
                Iterator<T> it3 = collectionValues.iterator();
                while (it3.hasNext()) {
                    ArrayList<C0X3R> arrayList = (ArrayList) it3.next();
                    synchronized (arrayList) {
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            for (C0X3R c0x3r : arrayList) {
                                if (c0x3r.LIZIZ() == C0X3Q.ATFIRST) {
                                    C0X3T.LJI.remove(c0x3r);
                                }
                                arrayList2.add(c0x3r);
                            }
                            arrayList.removeAll(arrayList2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
