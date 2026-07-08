package com.bytedance.router.arg;

import X.C13LP;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class RouteArgInjector {
    public static final RouteArgInjector INSTANCE = new RouteArgInjector();
    public static final ConcurrentHashMap<WeakReference<LifecycleOwner>, List<Function0<Unit>>> map = new ConcurrentHashMap<>();

    public final void inject(LifecycleOwner lifecycleOwner) {
        ConcurrentHashMap<WeakReference<LifecycleOwner>, List<Function0<Unit>>> concurrentHashMap = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WeakReference<LifecycleOwner>, List<Function0<Unit>>> entry : concurrentHashMap.entrySet()) {
            if (entry.getKey().get() == lifecycleOwner) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((Iterable) ((Map.Entry) it2.next()).getValue()).iterator();
            while (it3.hasNext()) {
                ((Function0) it3.next()).invoke();
            }
        }
    }

    public final void register(final LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        if (lifecycleOwner == null) {
            return;
        }
        ConcurrentHashMap<WeakReference<LifecycleOwner>, List<Function0<Unit>>> concurrentHashMap = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WeakReference<LifecycleOwner>, List<Function0<Unit>>> entry : concurrentHashMap.entrySet()) {
            if (entry.getKey().get() == lifecycleOwner) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            ConcurrentHashMap<WeakReference<LifecycleOwner>, List<Function0<Unit>>> concurrentHashMap2 = map;
            WeakReference<LifecycleOwner> weakReference = new WeakReference<>(lifecycleOwner);
            ArrayList arrayList = new ArrayList();
            arrayList.add(function0);
            concurrentHashMap2.put(weakReference, arrayList);
            lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.router.arg.RouteArgInjector$register$2$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    ConcurrentHashMap<WeakReference<LifecycleOwner>, List<Function0<Unit>>> concurrentHashMap3 = RouteArgInjector.map;
                    LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<WeakReference<LifecycleOwner>, List<Function0<Unit>>> entry2 : concurrentHashMap3.entrySet()) {
                        if (entry2.getKey().get() == lifecycleOwner2) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    ConcurrentHashMap<WeakReference<LifecycleOwner>, List<Function0<Unit>>> concurrentHashMap4 = RouteArgInjector.map;
                    Set setKeySet = linkedHashMap2.keySet();
                    concurrentHashMap4.keySet().removeAll(setKeySet instanceof Collection ? setKeySet : C13LP.LLIIII(setKeySet));
                }
            });
            return;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List list = (List) ((Map.Entry) it2.next()).getValue();
            if (list != null) {
                list.add(function0);
            }
        }
    }
}
