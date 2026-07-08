package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.C1906580ziK;
import X.C1C7U;
import X.C2095108Ir;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2421209eE;
import X.C2487409ou;
import X.C786410Ut5;
import X.C822650WOx;
import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsCommandRegistry;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class ToolRegistry extends AbsCommandRegistry {
    public static Context context;
    public static final ToolRegistry INSTANCE = new ToolRegistry();
    public static final ThreadPoolExecutor ioExecutor = new C822650WOx(0, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.ToolRegistry$ioExecutor$1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread = new BPEAThread(runnable, "MemProfiler-IO");
            bPEAThread.setDaemon(true);
            return bPEAThread;
        }
    });
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 2;
    }

    public final void attach(Context context2) {
        context = C786410Ut5.N3(context2);
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsCommandRegistry
    public void executeCommand(final int i, final String str, n nVar) {
        Activity activityLIZ;
        int iLJIIJJI;
        int iLJIIJJI2;
        final String strLJIL;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                AbsBridge.sendAck$default(this, i, str, null, 4, null);
                                return;
                            } else {
                                C786410Ut5.LJJZZIII(C2487409ou.LIZIZ(), new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.ToolRegistry.executeCommand.2
                                    public final void com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$2__run$___twin___() {
                                        Activity activityLIZ2;
                                        boolean z2 = false;
                                        try {
                                            if (C1906580ziK.LIZ() && (activityLIZ2 = C2421209eE.LIZ()) != null) {
                                                activityLIZ2.recreate();
                                                z2 = true;
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("execute recreate main activity:");
                                                sbLIZ.append(activityLIZ2.getLocalClassName());
                                                C2188811AlT.LIZIZ(sbLIZ);
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                        n nVar2 = new n();
                                        nVar2.LJJII(Boolean.valueOf(z2), "result");
                                        ToolRegistry.INSTANCE.sendAck(i, str, nVar2);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C1C7U.LIZ("ToolRegistry@ead.executeCommand$2");
                                        com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                        C1C7U.LIZIZ("ToolRegistry@ead.executeCommand$2");
                                    }

                                    public static void com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                                        try {
                                            anonymousClass2.com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$2__run$___twin___();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            if (!C2179971ATj.LIZ(th)) {
                                                throw th;
                                            }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        final Context context2 = context;
                        if (context2 == null) {
                            return;
                        }
                        ioExecutor.execute(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.ToolRegistry$executeCommand$5$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1C7U.LIZ("ToolRegistry@ead.executeCommand$5$1");
                                com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$5$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                C1C7U.LIZIZ("ToolRegistry@ead.executeCommand$5$1");
                            }

                            public final void com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$5$1__run$___twin___() {
                                ToolRegistry.INSTANCE.sendAck(i, str, SubMemoryFileCollect.INSTANCE.collectSmaps(context2));
                            }

                            public static void com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$5$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ToolRegistry$executeCommand$5$1 toolRegistry$executeCommand$5$1) {
                                try {
                                    toolRegistry$executeCommand$5$1.com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$5$1__run$___twin___();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    if (!C2179971ATj.LIZ(th)) {
                                        throw th;
                                    }
                                }
                            }
                        });
                        return;
                    }
                    final Context context3 = context;
                    if (context3 == null) {
                        return;
                    }
                    k kVarLJJIIZ = nVar.LJJIIZ("bitmapFormat");
                    if (kVarLJJIIZ != null) {
                        strLJIL = kVarLJJIIZ.LJIL();
                    } else {
                        strLJIL = null;
                    }
                    ioExecutor.execute(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.ToolRegistry$executeCommand$4$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("ToolRegistry@ead.executeCommand$4$1");
                            com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$4$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            C1C7U.LIZIZ("ToolRegistry@ead.executeCommand$4$1");
                        }

                        public final void com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$4$1__run$___twin___() {
                            ToolRegistry.INSTANCE.sendAck(i, str, SubMemoryFileCollect.INSTANCE.collectHprof(context3, strLJIL));
                        }

                        public static void com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$4$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ToolRegistry$executeCommand$4$1 toolRegistry$executeCommand$4$1) {
                            try {
                                toolRegistry$executeCommand$4$1.com_ss_android_ugc_aweme_memory_profiler_strategy_ToolRegistry$executeCommand$4$1__run$___twin___();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (!C2179971ATj.LIZ(th)) {
                                    throw th;
                                }
                            }
                        }
                    });
                    return;
                }
                k kVarLJJIIZ2 = nVar.LJJIIZ("detailType");
                if (kVarLJJIIZ2 != null) {
                    iLJIIJJI = kVarLJJIIZ2.LJIIJJI();
                } else {
                    iLJIIJJI = 0;
                }
                k kVarLJJIIZ3 = nVar.LJJIIZ("sizeMb");
                if (kVarLJJIIZ3 != null) {
                    iLJIIJJI2 = kVarLJJIIZ3.LJIIJJI();
                } else {
                    iLJIIJJI2 = 0;
                }
                long[] jArrStart = SubMemoryMock.INSTANCE.start(iLJIIJJI, iLJIIJJI2);
                n nVar2 = new n();
                nVar2.LJJIII(Integer.valueOf(iLJIIJJI), "detailType");
                if (jArrStart != null && jArrStart.length != 0) {
                    h hVar = new h();
                    for (long j : jArrStart) {
                        hVar.LJJII(Long.valueOf(j));
                    }
                    nVar2.LJJIFFI("handles", hVar);
                }
                sendAck(i, str, nVar2);
                return;
            }
            if (!C1906580ziK.LIZ() && (activityLIZ = C2421209eE.LIZ()) != null) {
                activityLIZ.finish();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("execute finish main activity:");
                sbLIZ.append(activityLIZ.getLocalClassName());
                C2188811AlT.LIZIZ(sbLIZ);
            } else {
                z = false;
            }
            n nVar3 = new n();
            nVar3.LJJII(Boolean.valueOf(z), "result");
            sendAck(i, str, nVar3);
            return;
        }
        C2095108Ir.LIZLLL();
        AbsBridge.sendAck$default(this, 0, str, null, 4, null);
    }
}
