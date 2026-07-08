package com.ttnet.org.chromium.base;

import J.N;
import X.C786410Ut5;
import Y.ARunnableS23S0100100_23;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;

/* JADX INFO: loaded from: classes24.dex */
public class JavaHandlerThread {
    public final HandlerThread LIZ;
    public Throwable LIZIZ;

    private boolean isAlive() {
        return this.LIZ.isAlive();
    }

    private void joinThread() {
        while (true) {
            try {
                this.LIZ.join();
                return;
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    private void listenForUncaughtExceptionsForTesting() {
        this.LIZ.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0p6C
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                this.LIZ.LIZIZ = th;
            }
        });
    }

    private Throwable getUncaughtExceptionIfAny() {
        return this.LIZIZ;
    }

    private void quitThreadSafely(long j) {
        C786410Ut5.LJJZZIII(new BPEAHandler(C786410Ut5.W2(this.LIZ)), new ARunnableS23S0100100_23(j, this, 2));
        C786410Ut5.W2(this.LIZ).quitSafely();
    }

    public JavaHandlerThread(String str, int i) {
        this.LIZ = new HandlerThread(str, i);
    }

    public static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    private void startAndInitialize(final long j, final long j2) {
        if (this.LIZ.getState() == Thread.State.NEW) {
            this.LIZ.start();
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(C786410Ut5.W2(this.LIZ)), new Runnable() { // from class: X.0p6B
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("JavaHandlerThread@e31d.startAndInitialize$1");
                try {
                    N.M3RaWo13(j, j2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("JavaHandlerThread@e31d.startAndInitialize$1");
            }
        });
    }
}
