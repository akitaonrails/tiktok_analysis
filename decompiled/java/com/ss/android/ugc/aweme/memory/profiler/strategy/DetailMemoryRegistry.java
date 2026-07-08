package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.C09NZ;
import X.C1962007mM;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C822660WOy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class DetailMemoryRegistry extends AbsPeriodicRegistry {
    public static boolean collectSubTypes;
    public static ScheduledThreadPoolExecutor scheduler;
    public static ScheduledFuture<?> task;
    public static final DetailMemoryRegistry INSTANCE = new DetailMemoryRegistry();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 12;
    }

    private final void sendInitialAck(int i) {
        try {
            n nVar = new n();
            Map<Integer, String> map = C1962007mM.LIZ;
            Map<Integer, String> map2 = C1962007mM.LIZ;
            n nVar2 = new n();
            for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                nVar2.LJJIIJ(String.valueOf(iIntValue), (String) entry.getValue());
            }
            nVar.LJJIFFI("labelMap", nVar2);
            sendEvent(i, nVar);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Sent initial ACK with labelMap: ");
            sbLIZ.append(nVar);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void startMonitoring(final int i, n nVar) {
        long jLJIIZILJ;
        boolean zLJ;
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
            jLJIIZILJ = 1000;
        }
        long jMax = Math.max(1000L, jLJIIZILJ);
        k kVarLJJIIZ2 = nVar.LJJIIZ("collectSubTypes");
        if (kVarLJJIIZ2 != null) {
            zLJ = kVarLJJIIZ2.LJ();
        } else {
            zLJ = false;
        }
        collectSubTypes = zLJ;
        sendInitialAck(i);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = scheduler;
        if (scheduledThreadPoolExecutor2 != null) {
            scheduledFutureScheduleWithFixedDelay = scheduledThreadPoolExecutor2.scheduleWithFixedDelay(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.DetailMemoryRegistry.startMonitoring.2
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("DetailMemoryRegistry@940f.startMonitoring$2");
                    com_ss_android_ugc_aweme_memory_profiler_strategy_DetailMemoryRegistry$startMonitoring$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("DetailMemoryRegistry@940f.startMonitoring$2");
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
                public final void com_ss_android_ugc_aweme_memory_profiler_strategy_DetailMemoryRegistry$startMonitoring$2__run$___twin___() {
                    try {
                        n nVar2 = new n();
                        Map mapLIZ = C09NZ.LIZ(DetailMemoryRegistry.collectSubTypes);
                        n nVar3 = new n();
                        for (Map.Entry entry : mapLIZ.entrySet()) {
                            String str = (String) entry.getKey();
                            Pair pair = (Pair) entry.getValue();
                            String strLJJLIIJ = a0.LJJLIIJ('.', str, "");
                            if ((pair instanceof Pair) && pair != null) {
                                int iIntValue = ((Number) pair.getFirst()).intValue();
                                Map map = (Map) pair.getSecond();
                                nVar3.LJJIII(Integer.valueOf(iIntValue), strLJJLIIJ);
                                if (DetailMemoryRegistry.collectSubTypes && (!map.isEmpty())) {
                                    n nVar4 = new n();
                                    for (Map.Entry entry2 : map.entrySet()) {
                                        int iIntValue2 = ((Number) entry2.getKey()).intValue();
                                        nVar4.LJJIII(Integer.valueOf(((Number) entry2.getValue()).intValue()), String.valueOf(iIntValue2));
                                    }
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(strLJJLIIJ);
                                    sbLIZ.append("-subs");
                                    nVar3.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ), nVar4);
                                }
                            }
                        }
                        nVar2.LJJIFFI("summary", nVar3);
                        DetailMemoryRegistry.INSTANCE.sendEvent(i, nVar2);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }

                public static void com_ss_android_ugc_aweme_memory_profiler_strategy_DetailMemoryRegistry$startMonitoring$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    try {
                        anonymousClass2.com_ss_android_ugc_aweme_memory_profiler_strategy_DetailMemoryRegistry$startMonitoring$2__run$___twin___();
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
        ScheduledFuture<?> scheduledFuture = task;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        task = null;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = scheduler;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.shutdownNow();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        scheduler = null;
        collectSubTypes = false;
    }
}
