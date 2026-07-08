package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.C13BV;
import X.C13LP;
import X.C1977807ou;
import X.C1C7U;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2179971ATj;
import X.C822660WOy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public final class ObjectRegistry extends AbsPeriodicRegistry {
    public static ScheduledThreadPoolExecutor scheduler;
    public static ScheduledFuture<?> task;
    public static final ObjectRegistry INSTANCE = new ObjectRegistry();
    public static List<String> selectedClzNames = C13BV.INSTANCE;
    public static String[] computedClzNames = new String[0];
    public static Map<String, String[]> nameToClasses = C2097608Jq.LJ();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void startMonitoring(final int i, n nVar) {
        long jLJIIZILJ;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        String[] map;
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
        h hVarLJJIIZI = nVar.LJJIIZI("array");
        ArrayList arrayList = new ArrayList();
        if (hVarLJJIIZI != null) {
            int size = hVarLJJIIZI.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(hVarLJJIIZI.LJJIIJZLJL(i2).LJIL());
            }
        }
        selectedClzNames = C13LP.LLIIII(arrayList);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> it2 = selectedClzNames.iterator();
        while (it2.hasNext()) {
            String string = a0.LJLIIIL(it2.next()).toString();
            if (a0.LJJIIZI(string, e3.d, false)) {
                map = new String[]{string};
            } else {
                map = ObjectClassMapping.INSTANCE.map(string);
            }
            linkedHashMap.put(string, map);
            for (String str : map) {
                linkedHashSet.add(str);
            }
        }
        nameToClasses = linkedHashMap;
        computedClzNames = (String[]) linkedHashSet.toArray(new String[0]);
        Map<String, String[]> map2 = nameToClasses;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
        Iterator<T> it3 = map2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap2.put(entry.getKey(), Arrays.toString((Object[]) entry.getValue()));
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = scheduler;
        if (scheduledThreadPoolExecutor2 != null) {
            scheduledFutureScheduleWithFixedDelay = scheduledThreadPoolExecutor2.scheduleWithFixedDelay(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.ObjectRegistry.startMonitoring.3
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("ObjectRegistry@1ed1.startMonitoring$3");
                    com_ss_android_ugc_aweme_memory_profiler_strategy_ObjectRegistry$startMonitoring$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("ObjectRegistry@1ed1.startMonitoring$3");
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
                public final void com_ss_android_ugc_aweme_memory_profiler_strategy_ObjectRegistry$startMonitoring$3__run$___twin___() {
                    try {
                        n nVar2 = new n();
                        h hVar = new h();
                        Method method = C1977807ou.LIZ;
                        Map mapLIZ = C1977807ou.LIZ(true, ObjectRegistry.computedClzNames);
                        for (String str2 : ObjectRegistry.selectedClzNames) {
                            String[] strArr = ObjectRegistry.nameToClasses.get(str2);
                            if (strArr == null) {
                                strArr = new String[0];
                            }
                            long jLongValue = 0;
                            for (String str3 : strArr) {
                                Long l = (Long) mapLIZ.get(str3);
                                jLongValue += l != null ? l.longValue() : 0L;
                            }
                            n nVar3 = new n();
                            nVar3.LJJIII(Long.valueOf(jLongValue), str2);
                            hVar.LJJIFFI(nVar3);
                        }
                        nVar2.LJJIFFI("array", hVar);
                        ObjectRegistry.INSTANCE.sendEvent(i, nVar2);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }

                public static void com_ss_android_ugc_aweme_memory_profiler_strategy_ObjectRegistry$startMonitoring$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    try {
                        anonymousClass3.com_ss_android_ugc_aweme_memory_profiler_strategy_ObjectRegistry$startMonitoring$3__run$___twin___();
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
    }
}
