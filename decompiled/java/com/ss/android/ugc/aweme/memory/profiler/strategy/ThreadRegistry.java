package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.C1C7U;
import X.C2179971ATj;
import X.C822660WOy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class ThreadRegistry extends AbsPeriodicRegistry {
    public static ScheduledThreadPoolExecutor scheduler;
    public static ScheduledFuture<?> task;
    public static final ThreadRegistry INSTANCE = new ThreadRegistry();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void startMonitoring(final int i, n nVar) {
        long jLJIIZILJ;
        k kVarLJJIIZ = nVar.LJJIIZ("interval");
        if (kVarLJJIIZ != null) {
            jLJIIZILJ = kVarLJJIIZ.LJIIZILJ();
        } else {
            jLJIIZILJ = 2000;
        }
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
        C822660WOy c822660WOy = new C822660WOy(1);
        scheduler = c822660WOy;
        task = c822660WOy.scheduleWithFixedDelay(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.ThreadRegistry.startMonitoring.2
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("ThreadRegistry@604a.startMonitoring$2");
                com_ss_android_ugc_aweme_memory_profiler_strategy_ThreadRegistry$startMonitoring$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("ThreadRegistry@604a.startMonitoring$2");
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
            
                if (r1 == null) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
            
                r2 = r1.activeCount();
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void com_ss_android_ugc_aweme_memory_profiler_strategy_ThreadRegistry$startMonitoring$2__run$___twin___() {
                /*
                    r5 = this;
                    com.google.gson.n r4 = new com.google.gson.n     // Catch: java.lang.Exception -> L48
                    r4.<init>()     // Catch: java.lang.Exception -> L48
                    int r3 = X.C08M6.LIZIZ()     // Catch: java.lang.Exception -> L48
                    android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L29
                    java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L29
                    java.lang.ThreadGroup r1 = r0.getThreadGroup()     // Catch: java.lang.Throwable -> L29
                L15:
                    if (r1 == 0) goto L2d
                    java.lang.ThreadGroup r0 = r1.getParent()     // Catch: java.lang.Throwable -> L29
                    if (r0 == 0) goto L22
                    java.lang.ThreadGroup r1 = r1.getParent()     // Catch: java.lang.Throwable -> L29
                    goto L15
                L22:
                    if (r1 == 0) goto L2d
                    int r2 = r1.activeCount()     // Catch: java.lang.Throwable -> L29
                    goto L2e
                L29:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L48
                L2d:
                    r2 = 0
                L2e:
                    java.lang.String r1 = "all"
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L48
                    r4.LJJIII(r0, r1)     // Catch: java.lang.Exception -> L48
                    java.lang.String r1 = "java"
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L48
                    r4.LJJIII(r0, r1)     // Catch: java.lang.Exception -> L48
                    com.ss.android.ugc.aweme.memory.profiler.strategy.ThreadRegistry r1 = com.ss.android.ugc.aweme.memory.profiler.strategy.ThreadRegistry.INSTANCE     // Catch: java.lang.Exception -> L48
                    int r0 = r1     // Catch: java.lang.Exception -> L48
                    r1.sendEvent(r0, r4)     // Catch: java.lang.Exception -> L48
                    return
                L48:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.memory.profiler.strategy.ThreadRegistry.AnonymousClass2.com_ss_android_ugc_aweme_memory_profiler_strategy_ThreadRegistry$startMonitoring$2__run$___twin___():void");
            }

            public static void com_ss_android_ugc_aweme_memory_profiler_strategy_ThreadRegistry$startMonitoring$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                try {
                    anonymousClass2.com_ss_android_ugc_aweme_memory_profiler_strategy_ThreadRegistry$startMonitoring$2__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        }, 0L, jLJIIZILJ, TimeUnit.MILLISECONDS);
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
