package com.bytedance.apm.thread;

import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class ThreadWithBlockingQueue {
    public final BPEAThread LIZ;
    public final BlockingQueue<Runnable> LIZIZ = new LinkedTransferQueue();

    public ThreadWithBlockingQueue(String str) {
        this.LIZ = new BPEAThread(new Runnable() { // from class: X.0C9o
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("ThreadWithBlockingQueue@7a99.<init>$2");
                while (true) {
                    try {
                        try {
                            ((Runnable) ((LinkedTransferQueue) this.LL.LIZIZ).take()).run();
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                        C1C7U.LIZIZ("ThreadWithBlockingQueue@7a99.<init>$2");
                        return;
                    }
                }
            }
        }, str);
        new FakeHandler(this, Looper.getMainLooper());
    }

    public final void LIZ(Runnable runnable) {
        ((LinkedTransferQueue) this.LIZIZ).offer(runnable);
    }

    public static class FakeHandler extends BPEAHandler {
        public final ThreadWithBlockingQueue LL;

        public FakeHandler(ThreadWithBlockingQueue threadWithBlockingQueue, Looper looper) {
            super(looper);
            this.LL = threadWithBlockingQueue;
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            if (message.getCallback() != null) {
                this.LL.LIZ(message.getCallback());
                return true;
            }
            return true;
        }
    }
}
