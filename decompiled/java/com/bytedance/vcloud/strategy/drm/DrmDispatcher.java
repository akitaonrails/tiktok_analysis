package com.bytedance.vcloud.strategy.drm;

import X.C1C7U;
import X.C786410Ut5;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public class DrmDispatcher {
    public final PriorityBlockingQueue<DrmTask> queue = new PriorityBlockingQueue<>(64);
    public final AtomicBoolean running = new AtomicBoolean(false);
    public Thread worker;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        C1C7U.LIZ("DrmDispatcher@7c3.start$1L");
        while (true) {
            if (!this.running.get() && this.queue.isEmpty()) {
                C1C7U.LIZIZ("DrmDispatcher@7c3.start$1L");
                return;
            }
            try {
                DrmTask drmTaskTake = this.queue.take();
                if (drmTaskTake != null) {
                    Object objExecute = drmTaskTake.execute();
                    if (drmTaskTake.getFuture() != null) {
                        drmTaskTake.getFuture().complete(objExecute);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void start() {
        if (this.running.compareAndSet(false, true)) {
            BPEAThread bPEAThread = new BPEAThread(new Runnable() { // from class: X.0WTm
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$start$0();
                }
            }, "drm-dispatcher");
            this.worker = bPEAThread;
            bPEAThread.start();
        }
    }

    public void stop() {
        this.running.set(false);
        Thread thread = this.worker;
        if (thread != null) {
            thread.interrupt();
            this.worker = null;
        }
    }

    public boolean isOnDispatcherThread() {
        return C786410Ut5.u3() == this.worker;
    }

    public void post(DrmTask drmTask) {
        if (drmTask != null) {
            this.queue.offer(drmTask);
        }
    }

    public <T> T submit(DrmTask drmTask) {
        if (drmTask == null) {
            return null;
        }
        this.queue.offer(drmTask);
        DrmFuture<Object> future = drmTask.getFuture();
        if (future == null) {
            return null;
        }
        return (T) future.get();
    }
}
