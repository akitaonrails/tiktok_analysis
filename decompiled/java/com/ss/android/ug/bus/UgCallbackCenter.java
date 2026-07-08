package com.ss.android.ug.bus;

import X.C786410Ut5;
import X.InterfaceC815710VzF;
import Y.ARunnableS113S0100000_13;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ug.bus.UgCallbackCenter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class UgCallbackCenter {
    public static final Object LIZ = new Object();
    public static final ConcurrentHashMap<Type, ConcurrentHashMap<InterfaceC815710VzF, Object>> LIZIZ = new ConcurrentHashMap<>();
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    public static <Event> void LIZ(Event event) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C786410Ut5.LJJZZIII(LIZJ, new ARunnableS113S0100000_13(event, 81));
            return;
        }
        ConcurrentHashMap<InterfaceC815710VzF, Object> concurrentHashMap = LIZIZ.get(event.getClass());
        if (concurrentHashMap != null) {
            for (InterfaceC815710VzF interfaceC815710VzF : concurrentHashMap.keySet()) {
                if (interfaceC815710VzF != null) {
                    interfaceC815710VzF.LIZ(event);
                }
            }
        }
    }

    public static <EVENT> void LIZIZ(final LifecycleOwner lifecycleOwner, final InterfaceC815710VzF<EVENT> interfaceC815710VzF) {
        if (interfaceC815710VzF == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C786410Ut5.LJJZZIII(LIZJ, new Runnable() { // from class: X.0VzE
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("UgCallbackCenter@4bb0.register$1");
                    try {
                        UgCallbackCenter.LIZIZ(lifecycleOwner, interfaceC815710VzF);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("UgCallbackCenter@4bb0.register$1");
                }
            });
            return;
        }
        final Type type = ((ParameterizedType) interfaceC815710VzF.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
        ConcurrentHashMap<Type, ConcurrentHashMap<InterfaceC815710VzF, Object>> concurrentHashMap = LIZIZ;
        final ConcurrentHashMap<InterfaceC815710VzF, Object> concurrentHashMap2 = concurrentHashMap.get(type);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap.put(type, concurrentHashMap2);
        }
        concurrentHashMap2.put(interfaceC815710VzF, LIZ);
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ug.bus.UgCallbackCenter.2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public void onDestroy() {
                    concurrentHashMap2.remove(interfaceC815710VzF);
                    if (concurrentHashMap2.isEmpty()) {
                        UgCallbackCenter.LIZIZ.remove(type);
                    }
                }
            });
        }
    }
}
