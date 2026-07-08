package com.bytedance.sysoptimizer.anr;

import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class AnrManager {
    public static int sLooperWaitMs = 1000;
    public static int sProxyTimeMs = 8000;
    public final CopyOnWriteArrayList<AnrListener> mAnrListeners;

    public static class Holder {
        public static final AnrManager INSTANCE = new AnrManager();
    }

    public AnrManager() {
        this.mAnrListeners = new CopyOnWriteArrayList<>();
        try {
            SysOptimizer.loadOptimizerLibrary(null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static AnrManager getInstance() {
        return Holder.INSTANCE;
    }

    public void registerListener(AnrListener anrListener) {
        if (this.mAnrListeners.isEmpty()) {
            AnrMonitor.getInstance().anrOptStart(sProxyTimeMs, sLooperWaitMs);
        }
        if (anrListener != null && !this.mAnrListeners.contains(anrListener)) {
            this.mAnrListeners.add(anrListener);
        }
    }

    public void unRegisterListener(AnrListener anrListener) {
        this.mAnrListeners.remove(anrListener);
        if (this.mAnrListeners.isEmpty()) {
            AnrMonitor.getInstance().pauseThread();
        }
    }

    public void onAnrChange(boolean z, int i) {
        for (AnrListener anrListener : this.mAnrListeners) {
            if (anrListener != null) {
                anrListener.onAnrChange(z, i);
            }
        }
    }
}
