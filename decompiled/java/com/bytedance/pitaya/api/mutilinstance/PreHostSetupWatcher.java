package com.bytedance.pitaya.api.mutilinstance;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes28.dex */
public final class PreHostSetupWatcher implements ReflectionCall {
    public static final PreHostSetupWatcher INSTANCE = new PreHostSetupWatcher();
    public static final CopyOnWriteArrayList<PreHostSetupListener> listeners = new CopyOnWriteArrayList<>();
    public static final AtomicBoolean isPreHostSetup = new AtomicBoolean(false);

    private final void notifyAllListener() {
        CopyOnWriteArrayList<PreHostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            try {
                Iterator<PreHostSetupListener> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().onPreHostSetup(true);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final boolean isPreHostSetup() {
        return isPreHostSetup.get();
    }

    public final void onPreHostSetup() {
        synchronized (listeners) {
            try {
                isPreHostSetup.set(true);
                INSTANCE.notifyAllListener();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void registerListener(PreHostSetupListener preHostSetupListener) {
        CopyOnWriteArrayList<PreHostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            try {
                if (isPreHostSetup.get()) {
                    preHostSetupListener.onPreHostSetup(true);
                } else {
                    copyOnWriteArrayList.add(preHostSetupListener);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void unregisterListener(PreHostSetupListener preHostSetupListener) {
        CopyOnWriteArrayList<PreHostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            try {
                copyOnWriteArrayList.remove(preHostSetupListener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
