package com.bytedance.pitaya.api.mutilinstance;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class LiteHostSetupWatcher implements ReflectionCall {
    public static final LiteHostSetupWatcher INSTANCE = new LiteHostSetupWatcher();
    public static final CopyOnWriteArrayList<LiteHostSetupListener> listeners = new CopyOnWriteArrayList<>();
    public static final AtomicBoolean isLiteHostSetup = new AtomicBoolean(false);

    private final void notifyAllListener() {
        CopyOnWriteArrayList<LiteHostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            try {
                Iterator<LiteHostSetupListener> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().onLiteHostSetup(true);
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

    public final boolean isLiteHostSetup() {
        return isLiteHostSetup.get();
    }

    public final void onLiteHostSetup() {
        synchronized (listeners) {
            try {
                isLiteHostSetup.set(true);
                INSTANCE.notifyAllListener();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void registerListener(LiteHostSetupListener liteHostSetupListener) {
        CopyOnWriteArrayList<LiteHostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            try {
                if (isLiteHostSetup.get()) {
                    liteHostSetupListener.onLiteHostSetup(true);
                } else {
                    copyOnWriteArrayList.add(liteHostSetupListener);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void unregisterListener(LiteHostSetupListener liteHostSetupListener) {
        CopyOnWriteArrayList<LiteHostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            try {
                copyOnWriteArrayList.remove(liteHostSetupListener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
