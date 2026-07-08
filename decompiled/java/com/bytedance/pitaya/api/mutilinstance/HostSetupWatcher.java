package com.bytedance.pitaya.api.mutilinstance;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class HostSetupWatcher implements ReflectionCall {
    public static final HostSetupWatcher INSTANCE = new HostSetupWatcher();
    public static final CopyOnWriteArrayList<HostSetupListener> listeners = new CopyOnWriteArrayList<>();
    public static final AtomicBoolean isHostSetup = new AtomicBoolean(false);

    private final void notifyAllListener() {
        CopyOnWriteArrayList<HostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            try {
                Iterator<HostSetupListener> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().onHostSetup(true);
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

    public final boolean isHostSetup() {
        return isHostSetup.get();
    }

    public final void onHostSetup() {
        synchronized (listeners) {
            try {
                isHostSetup.set(true);
                INSTANCE.notifyAllListener();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void registerHostSetupListener(HostSetupListener hostSetupListener) {
        CopyOnWriteArrayList<HostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            try {
                if (isHostSetup.get()) {
                    hostSetupListener.onHostSetup(true);
                } else {
                    copyOnWriteArrayList.add(hostSetupListener);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void unregisterHostSetupListener(HostSetupListener hostSetupListener) {
        CopyOnWriteArrayList<HostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            try {
                copyOnWriteArrayList.remove(hostSetupListener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
