package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.C13LQ;
import X.C1C7U;
import X.C2086508Fj;
import X.C2086608Fk;
import X.C2179971ATj;
import X.C822660WOy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class NativeAllocationRegistry extends AbsPeriodicRegistry {
    public static ScheduledThreadPoolExecutor scheduler;
    public static ScheduledFuture<?> task;
    public static final NativeAllocationRegistry INSTANCE = new NativeAllocationRegistry();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashSet, java.util.LinkedHashSet] */
    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void startMonitoring(final int i, n nVar) {
        long jLJIIZILJ;
        final ?? LJLIIL;
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
        h hVarLJJIIZI = nVar.LJJIIZI("filters");
        if (hVarLJJIIZI != null && hVarLJJIIZI.size() > 0) {
            LJLIIL = new LinkedHashSet();
            int size = hVarLJJIIZI.size();
            for (int i2 = 0; i2 < size; i2++) {
                LJLIIL.add(hVarLJJIIZI.LJJIIJZLJL(i2).LJIL());
            }
        } else {
            LJLIIL = C13LQ.LJLIIL(new String[]{"Bitmap", "HardwareBuffer", "Other"});
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = scheduler;
        if (scheduledThreadPoolExecutor2 != null) {
            scheduledFutureScheduleWithFixedDelay = scheduledThreadPoolExecutor2.scheduleWithFixedDelay(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.NativeAllocationRegistry.startMonitoring.2
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("NativeAllocationRegistry@1b6f.startMonitoring$2");
                    com_ss_android_ugc_aweme_memory_profiler_strategy_NativeAllocationRegistry$startMonitoring$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("NativeAllocationRegistry@1b6f.startMonitoring$2");
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public final void com_ss_android_ugc_aweme_memory_profiler_strategy_NativeAllocationRegistry$startMonitoring$2__run$___twin___() {
                    try {
                        HashMap mapLIZ = C2086608Fk.LIZ(LJLIIL);
                        n nVar2 = new n();
                        h hVar = new h();
                        for (String str : LJLIIL) {
                            C2086508Fj c2086508Fj = (C2086508Fj) mapLIZ.get(str);
                            n nVar3 = new n();
                            nVar3.LJJIIJ("type", str);
                            long j = 0;
                            nVar3.LJJIII(Long.valueOf(c2086508Fj != null ? c2086508Fj.LIZ : 0L), "mallocedCount");
                            nVar3.LJJIII(Long.valueOf(c2086508Fj != null ? c2086508Fj.LIZIZ : 0L), "mallocedBytes");
                            nVar3.LJJIII(Long.valueOf(c2086508Fj != null ? c2086508Fj.LIZJ : 0L), "nonmallocedCount");
                            if (c2086508Fj != null) {
                                j = c2086508Fj.LIZLLL;
                            }
                            nVar3.LJJIII(Long.valueOf(j), "nonmallocedBytes");
                            hVar.LJJIFFI(nVar3);
                        }
                        nVar2.LJJIFFI("array", hVar);
                        NativeAllocationRegistry.INSTANCE.sendEvent(i, nVar2);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }

                public static void com_ss_android_ugc_aweme_memory_profiler_strategy_NativeAllocationRegistry$startMonitoring$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    try {
                        anonymousClass2.com_ss_android_ugc_aweme_memory_profiler_strategy_NativeAllocationRegistry$startMonitoring$2__run$___twin___();
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
