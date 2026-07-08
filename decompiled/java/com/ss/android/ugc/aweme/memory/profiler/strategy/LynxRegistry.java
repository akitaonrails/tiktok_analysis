package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.C098200Yq;
import X.C189200o6;
import X.C1C7U;
import X.C2179971ATj;
import X.C822660WOy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.LynxProfiler;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class LynxRegistry extends AbsPeriodicRegistry {
    public static LynxProfiler.LynxProfilerListener listener;
    public static volatile ScheduledExecutorService scheduler;
    public static volatile ScheduledFuture<?> task;
    public static final LynxRegistry INSTANCE = new LynxRegistry();
    public static volatile long intervalMs = Mp4ScreenVideoLoadTimeout.CONTROL;
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 4;
    }

    private final void attachListener(final int i) {
        LynxProfiler.LynxProfilerListener lynxProfilerListener = new LynxProfiler.LynxProfilerListener() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.LynxRegistry.attachListener.1
            @Override // com.ss.android.ugc.aweme.memory.profiler.strategy.LynxProfiler.LynxProfilerListener
            public void onDetached(String str) {
                try {
                    n nVar = new n();
                    nVar.LJJIIJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "detached");
                    nVar.LJJIIJ(FollowStatusChangeMethod.PARAM_UID, str);
                    LynxRegistry.INSTANCE.sendEvent(i, nVar);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // com.ss.android.ugc.aweme.memory.profiler.strategy.LynxProfiler.LynxProfilerListener
            public void onReattached(String str) {
                try {
                    n nVar = new n();
                    nVar.LJJIIJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "reattached");
                    nVar.LJJIIJ(FollowStatusChangeMethod.PARAM_UID, str);
                    LynxRegistry.INSTANCE.sendEvent(i, nVar);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
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
            @Override // com.ss.android.ugc.aweme.memory.profiler.strategy.LynxProfiler.LynxProfilerListener
            public void onCheck(Map<String, LinkedHashSet<String>> map, Set<String> set) {
                try {
                    n nVar = new n();
                    nVar.LJJIIJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "check");
                    h hVar = new h();
                    for (Map.Entry<String, LinkedHashSet<String>> entry : map.entrySet()) {
                        String key = entry.getKey();
                        LinkedHashSet<String> value = entry.getValue();
                        n nVar2 = new n();
                        nVar2.LJJIIJ("url", key);
                        h hVar2 = new h();
                        Iterator<String> it2 = value.iterator();
                        while (it2.hasNext()) {
                            hVar2.LJJIII(it2.next());
                        }
                        nVar2.LJJIFFI("ids", hVar2);
                        nVar2.LJJIII(Integer.valueOf(value.size()), "count");
                        hVar.LJJIFFI(nVar2);
                    }
                    nVar.LJJIFFI("groups", hVar);
                    h hVar3 = new h();
                    Iterator<T> it3 = set.iterator();
                    while (it3.hasNext()) {
                        hVar3.LJJIII((String) it3.next());
                    }
                    nVar.LJJIFFI("remainIds", hVar3);
                    LynxRegistry.INSTANCE.sendEvent(i, nVar);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // com.ss.android.ugc.aweme.memory.profiler.strategy.LynxProfiler.LynxProfilerListener
            public void onCreate(String str, String str2, String str3) {
                try {
                    n nVar = new n();
                    nVar.LJJIIJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "create");
                    nVar.LJJIIJ(FollowStatusChangeMethod.PARAM_UID, str);
                    nVar.LJJIIJ("class", str2);
                    nVar.LJJIIJ("stack", str3);
                    LynxRegistry.INSTANCE.sendEvent(i, nVar);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        };
        listener = lynxProfilerListener;
        LynxProfiler.setListener(lynxProfilerListener);
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void startMonitoring(int i, n nVar) {
        long jLJIIZILJ;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        if (listener == null) {
            attachListener(i);
            LynxProfiler.start();
        }
        k kVarLJJIIZ = nVar.LJJIIZ("interval");
        if (kVarLJJIIZ != null) {
            jLJIIZILJ = kVarLJJIIZ.LJIIZILJ();
        } else {
            jLJIIZILJ = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        intervalMs = jLJIIZILJ;
        if (intervalMs < 2000) {
            intervalMs = 2000L;
        }
        if (scheduler == null) {
            scheduler = new C822660WOy(1);
        }
        ScheduledFuture<?> scheduledFuture = task;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ScheduledExecutorService scheduledExecutorService = scheduler;
        if (scheduledExecutorService != null) {
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.LynxRegistry.startMonitoring.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("LynxRegistry@cb86.startMonitoring$1");
                    com_ss_android_ugc_aweme_memory_profiler_strategy_LynxRegistry$startMonitoring$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("LynxRegistry@cb86.startMonitoring$1");
                }

                public final void com_ss_android_ugc_aweme_memory_profiler_strategy_LynxRegistry$startMonitoring$1__run$___twin___() {
                    LynxRegistry lynxRegistry = LynxRegistry.INSTANCE;
                    try {
                        LynxProfiler.checkLynxViewReference();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }

                public static void com_ss_android_ugc_aweme_memory_profiler_strategy_LynxRegistry$startMonitoring$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC2325591 runnableC2325591) {
                    try {
                        runnableC2325591.com_ss_android_ugc_aweme_memory_profiler_strategy_LynxRegistry$startMonitoring$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            }, 0L, intervalMs, TimeUnit.MILLISECONDS);
        } else {
            scheduledFutureScheduleWithFixedDelay = null;
        }
        task = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void stopMonitoring(int i, n nVar) {
        LynxProfiler.stop();
        if (listener != null) {
            LynxProfiler.setListener(null);
        }
        listener = null;
        ScheduledFuture<?> scheduledFuture = task;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        task = null;
        ScheduledExecutorService scheduledExecutorService = scheduler;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        scheduler = null;
    }
}
