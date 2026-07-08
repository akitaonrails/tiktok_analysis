package com.bytedance.memrelief.gc;

import X.C1C7U;
import X.C786410Ut5;
import Y.ARunnableS83S0000000_3;
import android.os.Debug;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class WeakRefQueueMonitor {
    public static final ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
    public static Reference<Object> sGcWatcher = null;
    public static final List<Runnable> sGcWatchers = new CopyOnWriteArrayList();
    public static final List<Runnable> sBlockingGcWatchers = new CopyOnWriteArrayList();
    public static volatile boolean failGetBlockingGc = false;
    public static volatile long lastBlockingGcCount = 0;

    public static boolean checkForBlockingGc() {
        try {
            String runtimeStat = Debug.getRuntimeStat("art.gc.blocking-gc-count");
            if (TextUtils.isEmpty(runtimeStat)) {
                return false;
            }
            long j = CastLongProtector.parseLong(runtimeStat);
            long j2 = j - lastBlockingGcCount;
            lastBlockingGcCount = j;
            if (j2 > 0) {
                return true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            failGetBlockingGc = true;
        }
        return false;
    }

    static {
        start();
    }

    public static void initReference() {
        sGcWatcher = new WeakReference(new Object(), referenceQueue);
    }

    public static /* synthetic */ void lambda$start$0() {
        C1C7U.LIZ("WeakRefQueueMonitor@75ca.start$1L");
        while (!C786410Ut5.u3().isInterrupted()) {
            try {
                referenceQueue.remove();
                Iterator<Runnable> it2 = sGcWatchers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().run();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                if (!failGetBlockingGc) {
                    List<Runnable> list = sBlockingGcWatchers;
                    if (!list.isEmpty() && checkForBlockingGc()) {
                        Iterator<Runnable> it3 = list.iterator();
                        while (it3.hasNext()) {
                            try {
                                it3.next().run();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        }
                    }
                }
                initReference();
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C786410Ut5.u3().interrupt();
            }
        }
        C1C7U.LIZIZ("WeakRefQueueMonitor@75ca.start$1L");
    }

    public static void start() {
        initReference();
        BPEAThread bPEAThread = new BPEAThread(new ARunnableS83S0000000_3(8), "QueueGC");
        bPEAThread.setDaemon(true);
        bPEAThread.start();
    }

    public static void addBlockingGcWatcher(Runnable runnable) {
        sBlockingGcWatchers.add(runnable);
    }

    public static void addGcWatcher(Runnable runnable) {
        sGcWatchers.add(runnable);
    }

    public static void removeBlockingGcWatcher(Runnable runnable) {
        sBlockingGcWatchers.remove(runnable);
    }

    public static void removeGcWatcher(Runnable runnable) {
        sGcWatchers.remove(runnable);
    }
}
