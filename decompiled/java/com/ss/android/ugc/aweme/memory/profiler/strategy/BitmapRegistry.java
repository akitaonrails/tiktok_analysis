package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.C08M9;
import X.C1883907Zl;
import X.C1C7U;
import X.C2084608Eq;
import X.C2179971ATj;
import X.C822660WOy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class BitmapRegistry extends AbsPeriodicRegistry {
    public static ScheduledThreadPoolExecutor scheduler;
    public static ScheduledFuture<?> task;
    public static final BitmapRegistry INSTANCE = new BitmapRegistry();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 5;
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void startMonitoring(final int i, n nVar) {
        long jLJIIZILJ;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        ScheduledFuture<?> scheduledFuture = task;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = scheduler;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.shutdownNow();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        scheduler = new C822660WOy(1);
        k kVarLJJIIZ = nVar.LJJIIZ("interval");
        if (kVarLJJIIZ != null) {
            jLJIIZILJ = kVarLJJIIZ.LJIIZILJ();
        } else {
            jLJIIZILJ = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        long jMax = Math.max(2000L, jLJIIZILJ);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = scheduler;
        if (scheduledThreadPoolExecutor2 != null) {
            scheduledFutureScheduleWithFixedDelay = scheduledThreadPoolExecutor2.scheduleWithFixedDelay(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.BitmapRegistry.startMonitoring.2
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("BitmapRegistry@4484.startMonitoring$2");
                    com_ss_android_ugc_aweme_memory_profiler_strategy_BitmapRegistry$startMonitoring$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("BitmapRegistry@4484.startMonitoring$2");
                }

                public final void com_ss_android_ugc_aweme_memory_profiler_strategy_BitmapRegistry$startMonitoring$2__run$___twin___() {
                    try {
                        C1883907Zl c1883907ZlLIZ = C2084608Eq.LIZ();
                        n nVar2 = new n();
                        nVar2.LJJIII(Integer.valueOf(c1883907ZlLIZ.LIZ), "count");
                        nVar2.LJJIII(Integer.valueOf(C08M9.LIZ(c1883907ZlLIZ.LIZIZ, true)), "sizeMB");
                        BitmapRegistry.INSTANCE.sendEvent(i, nVar2);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }

                public static void com_ss_android_ugc_aweme_memory_profiler_strategy_BitmapRegistry$startMonitoring$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    try {
                        anonymousClass2.com_ss_android_ugc_aweme_memory_profiler_strategy_BitmapRegistry$startMonitoring$2__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            }, 0L, jMax, TimeUnit.MILLISECONDS);
        } else {
            scheduledFutureScheduleWithFixedDelay = null;
        }
        task = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void stopMonitoring(int i, n nVar) {
        try {
            ScheduledFuture<?> scheduledFuture = task;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        task = null;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = scheduler;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.shutdownNow();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        scheduler = null;
    }
}
