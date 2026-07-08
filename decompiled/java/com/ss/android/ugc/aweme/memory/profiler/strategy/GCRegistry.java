package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.C08M5;
import X.C08U0;
import X.C1C7U;
import X.C2095108Ir;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C814420VxA;
import X.C822660WOy;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.memrelief.gc.WeakRefQueueMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class GCRegistry extends AbsPeriodicRegistry {
    public static C08U0 listener;
    public static long mainWaitStartTime;
    public static ScheduledThreadPoolExecutor scheduler;
    public static ScheduledFuture<?> task;
    public static Runnable weakRefWatcher;
    public static final GCRegistry INSTANCE = new GCRegistry();
    public static final int pid = Process.myPid();
    public static final AtomicInteger threadId = new AtomicInteger(0);
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 9;
    }

    private final void startGCMonitor() {
        if (listener == null) {
            listener = new C08U0() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.GCRegistry.startGCMonitor.1
                @Override // X.C08U0
                public void onGCStart(int i, int i2, int i3) {
                    try {
                        GCRegistry.mainWaitStartTime = 0L;
                        n nVar = new n();
                        nVar.LJJIIJ("kind", "start");
                        nVar.LJJIII(Integer.valueOf(i), "tid");
                        nVar.LJJIIJ("tname", C2095108Ir.LIZIZ(i));
                        nVar.LJJIII(Integer.valueOf(i2), "type");
                        nVar.LJJIII(Integer.valueOf(i3), "cause");
                        GCRegistry.INSTANCE.sendEvent(4, nVar);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.C08U0
                public void onWaitGc(int i, int i2, int i3) throws Throwable {
                    try {
                        String strLIZIZ = C2095108Ir.LIZIZ(i);
                        String strLIZIZ2 = C2095108Ir.LIZIZ(i2);
                        if (i == GCRegistry.pid) {
                            GCRegistry.mainWaitStartTime = System.nanoTime();
                        }
                        n nVar = new n();
                        nVar.LJJIIJ("kind", "wait");
                        nVar.LJJIII(Integer.valueOf(i), "waitTid");
                        nVar.LJJIIJ("waitName", strLIZIZ);
                        nVar.LJJIII(Integer.valueOf(i2), "gcTid");
                        nVar.LJJIIJ("gcName", strLIZIZ2);
                        nVar.LJJIII(Integer.valueOf(i3), "cause");
                        GCRegistry.INSTANCE.sendEvent(4, nVar);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.C08U0
                public void onGCEnd(int i, int i2, int i3, long j, boolean z, long j2, long j3, long j4, long j5, long j6) {
                    try {
                        long j7 = GCRegistry.mainWaitStartTime;
                        long j8 = 0;
                        GCRegistry.mainWaitStartTime = 0L;
                        long jNanoTime = System.nanoTime();
                        if (j7 > 0) {
                            j8 = (jNanoTime - j7) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        }
                        n nVar = new n();
                        nVar.LJJIIJ("kind", "end");
                        nVar.LJJIII(Integer.valueOf(i), "tid");
                        nVar.LJJIIJ("tname", C2095108Ir.LIZIZ(i));
                        nVar.LJJIII(Integer.valueOf(i2), "type");
                        nVar.LJJIII(Integer.valueOf(i3), "cause");
                        nVar.LJJIII(Long.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "durationUs");
                        nVar.LJJII(Boolean.valueOf(z), "clearSoftRefs");
                        nVar.LJJIII(Integer.valueOf(C814420VxA.LIZ(j2 / 1024.0d)), "freedKb");
                        nVar.LJJIII(Long.valueOf(j3), "freedObjects");
                        nVar.LJJIII(Integer.valueOf(C814420VxA.LIZ(j4 / 1024.0d)), "freedLosKb");
                        nVar.LJJIII(Long.valueOf(j5), "freedLosObjects");
                        nVar.LJJIII(Long.valueOf(j8), "mainWaitDuration");
                        GCRegistry.INSTANCE.sendEvent(4, nVar);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            };
        }
        C08U0 c08u0 = listener;
        if (c08u0 != null) {
            C08M5.LIZ.LIZ(c08u0);
        }
    }

    private final void startWeakRefWatch() {
        try {
            if (weakRefWatcher != null) {
                return;
            }
            RunnableC2325581 runnableC2325581 = new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.GCRegistry.startWeakRefWatch.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("GCRegistry@7fd4.startWeakRefWatch$1");
                    com_ss_android_ugc_aweme_memory_profiler_strategy_GCRegistry$startWeakRefWatch$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("GCRegistry@7fd4.startWeakRefWatch$1");
                }

                public final void com_ss_android_ugc_aweme_memory_profiler_strategy_GCRegistry$startWeakRefWatch$1__run$___twin___() {
                    n nVar = new n();
                    nVar.LJJIIJ("kind", "weakref");
                    GCRegistry.INSTANCE.sendEvent(2, nVar);
                }

                public static void com_ss_android_ugc_aweme_memory_profiler_strategy_GCRegistry$startWeakRefWatch$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC2325581 runnableC23255812) {
                    try {
                        runnableC23255812.com_ss_android_ugc_aweme_memory_profiler_strategy_GCRegistry$startWeakRefWatch$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            };
            weakRefWatcher = runnableC2325581;
            WeakRefQueueMonitor.addGcWatcher(runnableC2325581);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private final void stopGCMonitor() {
        C08U0 c08u0 = listener;
        if (c08u0 != null) {
            C08M5.LIZ.LIZJ(c08u0);
        }
        listener = null;
    }

    private final void stopPeriodicForceGC() {
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

    public final void attach() {
        startWeakRefWatch();
    }

    private final void startPeriodicForceGC(n nVar) {
        long jLJIIZILJ;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ("interval");
            if (kVarLJJIIZ != null) {
                jLJIIZILJ = kVarLJJIIZ.LJIIZILJ();
            } else {
                jLJIIZILJ = 15000;
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
            C822660WOy c822660WOy = new C822660WOy(1, new ThreadFactory() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.GCRegistry.startPeriodicForceGC.2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Profiler_PeriodGC-");
                    sbLIZ.append(GCRegistry.threadId.incrementAndGet());
                    BPEAThread bPEAThread = new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ));
                    bPEAThread.setDaemon(true);
                    return bPEAThread;
                }
            });
            scheduler = c822660WOy;
            task = c822660WOy.scheduleWithFixedDelay(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.GCRegistry.startPeriodicForceGC.3
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("GCRegistry@7fd4.startPeriodicForceGC$3");
                    com_ss_android_ugc_aweme_memory_profiler_strategy_GCRegistry$startPeriodicForceGC$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("GCRegistry@7fd4.startPeriodicForceGC$3");
                }

                public final void com_ss_android_ugc_aweme_memory_profiler_strategy_GCRegistry$startPeriodicForceGC$3__run$___twin___() {
                    try {
                        C2095108Ir.LIZLLL();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }

                public static void com_ss_android_ugc_aweme_memory_profiler_strategy_GCRegistry$startPeriodicForceGC$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    try {
                        anonymousClass3.com_ss_android_ugc_aweme_memory_profiler_strategy_GCRegistry$startPeriodicForceGC$3__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            }, 0L, jLJIIZILJ, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void startMonitoring(int i, n nVar) {
        try {
            if (i != 0) {
                if (i == 3) {
                    startPeriodicForceGC(nVar);
                    return;
                }
                return;
            }
            startGCMonitor();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void stopMonitoring(int i, n nVar) {
        try {
            if (i != 0) {
                if (i == 3) {
                    stopPeriodicForceGC();
                    return;
                }
                return;
            }
            stopGCMonitor();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
