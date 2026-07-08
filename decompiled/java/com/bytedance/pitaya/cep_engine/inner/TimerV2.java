package com.bytedance.pitaya.cep_engine.inner;

import X.C1C7U;
import X.C786410Ut5;
import Y.ARunnableS14S0000100_20;
import Y.ARunnableS21S0100100_20;
import Y.ARunnableS96S0000000_20;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class TimerV2 implements CepKeeper {
    public static volatile Handler handler;
    public static Thread timerThread;
    public static final TimerV2 INSTANCE = new TimerV2();
    public static Object globalLock = new Object();
    public static final ConcurrentHashMap<Long, Runnable> runnableMap = new ConcurrentHashMap<>();

    public static /* synthetic */ void lambda$semisugar$timer$lambda$1$0(long j) {
        C1C7U.LIZ("TimerV2@32d6.timer$1L");
        timer$lambda$1(j);
        C1C7U.LIZIZ("TimerV2@32d6.timer$1L");
    }

    public static /* synthetic */ void lambda$semisugar$timer$lambda$5$lambda$3$0() {
        C1C7U.LIZ("TimerV2@32d6.timer$2L");
        timer$lambda$5$lambda$3();
        C1C7U.LIZIZ("TimerV2@32d6.timer$2L");
    }

    public static /* synthetic */ void lambda$semisugar$timer$lambda$6$0(long j, Runnable runnable) {
        C1C7U.LIZ("TimerV2@32d6.timer$3L");
        timer$lambda$6(j, runnable);
        C1C7U.LIZIZ("TimerV2@32d6.timer$3L");
    }

    public static final void timer$lambda$5$lambda$3() {
        synchronized (globalLock) {
            try {
                Looper.prepare();
                handler = new BPEAHandler(Looper.myLooper());
                globalLock.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (handler != null) {
            Looper.loop();
        }
    }

    public static final void timer$lambda$1(long j) {
        try {
            JniCaller.callNoParamsCallback(j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void cancelTimer(long j) {
        Handler handler2;
        ConcurrentHashMap<Long, Runnable> concurrentHashMap = runnableMap;
        Runnable runnable = concurrentHashMap.get(Long.valueOf(j));
        if (runnable != null && (handler2 = handler) != null) {
            handler2.removeCallbacks(runnable);
        }
        concurrentHashMap.remove(Long.valueOf(j));
    }

    public static final void timer$lambda$6(long j, Runnable runnable) {
        runnableMap.remove(Long.valueOf(j));
        runnable.run();
    }

    private final void timer(long j, Runnable runnable, long j2) {
        if (handler == null) {
            synchronized (this) {
                try {
                    if (handler == null) {
                        BPEAThread bPEAThread = new BPEAThread(null, new ARunnableS96S0000000_20(9), "cep-timer_thread", 0L);
                        timerThread = bPEAThread;
                        bPEAThread.start();
                        synchronized (globalLock) {
                            while (handler == null) {
                                try {
                                    globalLock.wait();
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ARunnableS21S0100100_20 aRunnableS21S0100100_20 = new ARunnableS21S0100100_20(j, runnable, 4);
        runnableMap.put(Long.valueOf(j), aRunnableS21S0100100_20);
        Handler handler2 = handler;
        if (handler2 != null) {
            C786410Ut5.LJLIIL(j2, handler2, aRunnableS21S0100100_20);
        }
    }

    public final void timer(long j, long j2, long j3) {
        timer(j, new ARunnableS14S0000100_20(j2, 2), j3);
    }
}
