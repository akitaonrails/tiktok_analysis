package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.AbstractC1387200mCc;
import X.C1388190mED;
import X.C1397950mTx;
import X.C1844400y62;
import X.C1906580ziK;
import X.C1C7U;
import X.C2095108Ir;
import X.C2102408Lm;
import X.C2179971ATj;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsCommandRegistry;
import com.ss.android.ugc.aweme.memory.profiler.util.ProfilerViewTreeCollector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes4.dex */
public final class PageDumpRegistry extends AbsCommandRegistry {
    public static final PageDumpRegistry INSTANCE = new PageDumpRegistry();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 13;
    }

    private final void dumpPageStack(final String str) {
        C2095108Ir.LIZJ(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.PageDumpRegistry.dumpPageStack.1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpPageStack$1__run$___twin___() {
                Activity activityLIZ;
                try {
                    h hVar = new h();
                    for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                        n nVar = new n();
                        if (abstractC1387200mCc instanceof C1397950mTx) {
                            Activity activity = ((C1397950mTx) abstractC1387200mCc).LIZLLL;
                            nVar.LJJIIJ("page", activity.getClass().getName());
                            nVar.LJJIIJ(FollowStatusChangeMethod.PARAM_UID, C2095108Ir.LIZ(activity));
                        } else if (abstractC1387200mCc instanceof C1844400y62) {
                            F f = ((C1844400y62) abstractC1387200mCc).LIZLLL;
                            nVar.LJJIIJ("page", f.getClass().getName());
                            nVar.LJJIIJ(FollowStatusChangeMethod.PARAM_UID, C2095108Ir.LIZ(f));
                            Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                            if (activityLIZIZ != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                                nVar.LJJIIJ("hostActivity", activityLIZ.getClass().getName());
                                nVar.LJJIIJ("hostActivityId", C2095108Ir.LIZ(activityLIZ));
                            }
                        } else {
                            nVar.LJJIIJ("page", abstractC1387200mCc.getClass().getName());
                        }
                        hVar.LJJIFFI(nVar);
                    }
                    n nVar2 = new n();
                    nVar2.LJJII(Boolean.TRUE, "isNew");
                    nVar2.LJJIFFI("pageStack", hVar);
                    PageDumpRegistry.INSTANCE.sendAck(1, str, nVar2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PageDumpRegistry.INSTANCE.sendErrorAck(1, str, e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("PageDumpRegistry@f4c3.dumpPageStack$1");
                com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpPageStack$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("PageDumpRegistry@f4c3.dumpPageStack$1");
            }

            public static void com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpPageStack$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC2325601 runnableC2325601) {
                try {
                    runnableC2325601.com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpPageStack$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    private final void dumpViewTree(final String str) {
        C2095108Ir.LIZJ(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.PageDumpRegistry.dumpViewTree.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("PageDumpRegistry@f4c3.dumpViewTree$1");
                com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpViewTree$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("PageDumpRegistry@f4c3.dumpViewTree$1");
            }

            public final void com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpViewTree$1__run$___twin___() {
                n nVar = new n();
                try {
                    nVar.LJJIII(Long.valueOf(System.currentTimeMillis()), "ts");
                    nVar.LJJIFFI("windows", ProfilerViewTreeCollector.INSTANCE.collect());
                    PageDumpRegistry.INSTANCE.sendAck(2, str, nVar);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PageDumpRegistry.INSTANCE.sendErrorAck(2, str, e);
                }
            }

            public static void com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpViewTree$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC2325611 runnableC2325611) {
                try {
                    runnableC2325611.com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpViewTree$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    private final void dumpFragment(final String str, final boolean z) {
        C2095108Ir.LIZJ(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.PageDumpRegistry.dumpFragment.1
            public final void com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpFragment$1__run$___twin___() {
                Activity activityLIZIZ;
                try {
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    Activity activityLIZ = (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) ? null : C1388190mED.LIZ(activityLIZIZ);
                    n nVar = new n();
                    h hVar = new h();
                    if (activityLIZ != null) {
                        hVar.LJJIFFI(C2102408Lm.LIZ(activityLIZ, z));
                    }
                    nVar.LJJIFFI("fragmentTree", hVar);
                    PageDumpRegistry.INSTANCE.sendAck(0, str, nVar);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PageDumpRegistry.INSTANCE.sendErrorAck(0, str, e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("PageDumpRegistry@f4c3.dumpFragment$1");
                com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpFragment$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("PageDumpRegistry@f4c3.dumpFragment$1");
            }

            public static void com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpFragment$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_android_ugc_aweme_memory_profiler_strategy_PageDumpRegistry$dumpFragment$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsCommandRegistry
    public void executeCommand(int i, String str, n nVar) {
        boolean zLJ;
        k kVarLJJIIZ = nVar.LJJIIZ("includeLegacy");
        if (kVarLJJIIZ != null) {
            zLJ = kVarLJJIIZ.LJ();
        } else {
            zLJ = false;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    AbsBridge.sendAck$default(this, i, str, null, 4, null);
                    return;
                } else {
                    dumpViewTree(str);
                    return;
                }
            }
            dumpPageStack(str);
            return;
        }
        dumpFragment(str, zLJ);
    }

    public final void sendErrorAck(int i, String str, Exception exc) {
        n nVar = new n();
        nVar.LJJIIJ("error", exc.getMessage());
        sendAck(i, str, nVar);
    }
}
