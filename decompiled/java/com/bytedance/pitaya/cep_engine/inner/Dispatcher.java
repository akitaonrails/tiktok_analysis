package com.bytedance.pitaya.cep_engine.inner;

import X.C1305160k4I;
import X.C1C7U;
import X.C786410Ut5;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS14S0000100_20;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public final class Dispatcher implements CepKeeper {
    public static final Dispatcher INSTANCE = new Dispatcher();
    public static final ExecutorService executor1 = C786410Ut5.i4(new ThreadFactory() { // from class: X.08UY
        public final AtomicInteger LL = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pty-cep-");
            sbLIZ.append(this.LL.getAndIncrement());
            sbLIZ.append("-t");
            BPEAThread bPEAThread = new BPEAThread(null, runnable, C2188811AlT.LIZIZ(sbLIZ), 0L);
            bPEAThread.setDaemon(false);
            ThreadMethodProxy.setPriority(bPEAThread, 5);
            return bPEAThread;
        }
    });
    public static final ExecutorService executor2 = C786410Ut5.i4(new ThreadFactory() { // from class: X.08UY
        public final AtomicInteger LL = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pty-cep-");
            sbLIZ.append(this.LL.getAndIncrement());
            sbLIZ.append("-t");
            BPEAThread bPEAThread = new BPEAThread(null, runnable, C2188811AlT.LIZIZ(sbLIZ), 0L);
            bPEAThread.setDaemon(false);
            ThreadMethodProxy.setPriority(bPEAThread, 5);
            return bPEAThread;
        }
    });
    public static final ExecutorService executor3 = C786410Ut5.i4(new ThreadFactory() { // from class: X.08UY
        public final AtomicInteger LL = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pty-cep-");
            sbLIZ.append(this.LL.getAndIncrement());
            sbLIZ.append("-t");
            BPEAThread bPEAThread = new BPEAThread(null, runnable, C2188811AlT.LIZIZ(sbLIZ), 0L);
            bPEAThread.setDaemon(false);
            ThreadMethodProxy.setPriority(bPEAThread, 5);
            return bPEAThread;
        }
    });
    public static final ExecutorService executor4 = C786410Ut5.i4(new ThreadFactory() { // from class: X.08UY
        public final AtomicInteger LL = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pty-cep-");
            sbLIZ.append(this.LL.getAndIncrement());
            sbLIZ.append("-t");
            BPEAThread bPEAThread = new BPEAThread(null, runnable, C2188811AlT.LIZIZ(sbLIZ), 0L);
            bPEAThread.setDaemon(false);
            ThreadMethodProxy.setPriority(bPEAThread, 5);
            return bPEAThread;
        }
    });
    public static final ExecutorService globalExecutor = C786410Ut5.e4(2, new ThreadFactory() { // from class: X.08UY
        public final AtomicInteger LL = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pty-cep-");
            sbLIZ.append(this.LL.getAndIncrement());
            sbLIZ.append("-t");
            BPEAThread bPEAThread = new BPEAThread(null, runnable, C2188811AlT.LIZIZ(sbLIZ), 0L);
            bPEAThread.setDaemon(false);
            ThreadMethodProxy.setPriority(bPEAThread, 5);
            return bPEAThread;
        }
    });

    public static /* synthetic */ void lambda$semisugar$dispatchGlobalV2$lambda$3$0(long j) {
        C1C7U.LIZ("Dispatcher@f1c0.dispatchGlobalV2$1L");
        dispatchGlobalV2$lambda$3(j);
        C1C7U.LIZIZ("Dispatcher@f1c0.dispatchGlobalV2$1L");
    }

    public static /* synthetic */ void lambda$semisugar$dispatchV2$lambda$1$0(C1305160k4I c1305160k4I) {
        C1C7U.LIZ("Dispatcher@f1c0.dispatchV2$1L");
        dispatchV2$lambda$1(c1305160k4I);
        C1C7U.LIZIZ("Dispatcher@f1c0.dispatchV2$1L");
    }

    public static final void dispatchGlobalV2$lambda$3(long j) {
        try {
            JniCaller.callNoParamsCallback(j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void dispatchV2$lambda$1(C1305160k4I c1305160k4I) {
        JniCaller jniCaller = JniCaller.LIZ;
        try {
            JniCaller.callNoParamsCallback(c1305160k4I.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Semaphore semaphore = c1305160k4I.LIZIZ;
        if (semaphore != null) {
            semaphore.release();
        }
    }

    public final void dispatchGlobalV2(long j) {
        globalExecutor.execute(new ARunnableS14S0000100_20(j, 1));
    }

    private final void dispatchV2(long j, Runnable runnable) {
        int i = (int) (j % ((long) 4));
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        executor4.execute(runnable);
                        return;
                    }
                    return;
                }
                executor3.execute(runnable);
                return;
            }
            executor2.execute(runnable);
            return;
        }
        executor1.execute(runnable);
    }

    public final void dispatchAsyncV2(long j, long j2) {
        dispatchV2(j, new C1305160k4I(j2, null));
    }

    public final void dispatchSyncV2(long j, long j2) throws InterruptedException {
        Semaphore semaphore = new Semaphore(0);
        dispatchV2(j, new C1305160k4I(j2, semaphore));
        semaphore.acquire();
    }

    private final void dispatchV2(long j, C1305160k4I c1305160k4I) {
        dispatchV2(j, new ARunnableS120S0100000_20(c1305160k4I, 224));
    }
}
