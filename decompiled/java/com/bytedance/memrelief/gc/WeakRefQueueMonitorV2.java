package com.bytedance.memrelief.gc;

import X.C1C7U;
import X.C786410Ut5;
import Y.ARunnableS103S0100000_3;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class WeakRefQueueMonitorV2 {
    public final int objectSizeInBytes;
    public final ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
    public Reference<Object> sGcWatcher = null;
    public final List<Runnable> sGcWatchers = new CopyOnWriteArrayList();

    private void initReference() {
        this.sGcWatcher = new WeakReference(new byte[this.objectSizeInBytes], this.referenceQueue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        C1C7U.LIZ("WeakRefQueueMonitorV2@3615.start$1L");
        while (!C786410Ut5.u3().isInterrupted()) {
            try {
                this.referenceQueue.remove();
                Iterator<Runnable> it2 = this.sGcWatchers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().run();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                initReference();
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C786410Ut5.u3().interrupt();
            }
        }
        C1C7U.LIZIZ("WeakRefQueueMonitorV2@3615.start$1L");
    }

    private void start() {
        initReference();
        BPEAThread bPEAThread = new BPEAThread(new ARunnableS103S0100000_3(this, 22), "CustomQueueGC");
        bPEAThread.setDaemon(true);
        bPEAThread.start();
    }

    public WeakRefQueueMonitorV2(int i) {
        this.objectSizeInBytes = i;
        start();
    }

    public void addGcWatcher(Runnable runnable) {
        this.sGcWatchers.add(runnable);
    }

    public void removeGcWatcher(Runnable runnable) {
        this.sGcWatchers.remove(runnable);
    }
}
