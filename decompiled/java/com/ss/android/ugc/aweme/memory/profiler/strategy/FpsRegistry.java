package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.AbstractC1387200mCc;
import X.C09AY;
import X.C09JN;
import X.C1388190mED;
import X.C1397950mTx;
import X.C1906580ziK;
import X.C1C7U;
import X.C2095108Ir;
import X.C2179971ATj;
import android.app.Activity;
import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry;
import com.ss.android.ugc.aweme.memory.profiler.util.ProfilerFpsMonitor;
import com.ss.android.ugc.aweme.memory.profiler.util.ProfilerRefreshRate;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS18S0001000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class FpsRegistry extends AbsPeriodicRegistry {
    public static Application app;
    public static volatile WeakReference<Activity> currentRef;
    public static int monitorSubType;
    public static boolean subscribed;
    public static final FpsRegistry INSTANCE = new FpsRegistry();
    public static boolean enableVsync = true;
    public static boolean enableDraw = true;
    public static long intervalMs = 1000;
    public static final AtomicBoolean isMonitoring = new AtomicBoolean(false);
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 7;
    }

    private final void ensureSubscribed() {
        if (subscribed) {
            return;
        }
        subscribed = true;
        C1906580ziK.LIZJ().LJIIJ().LJLLLLLL(new C09JN() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.FpsRegistry.ensureSubscribed.1
            public final void accept(AbstractC1387200mCc abstractC1387200mCc) {
                Activity activityLIZIZ;
                final Activity activityLIZ;
                if (FpsRegistry.isMonitoring.get() && (activityLIZIZ = abstractC1387200mCc.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                    C2095108Ir.LIZJ(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.FpsRegistry.ensureSubscribed.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("FpsRegistry@7b18.ensureSubscribed$1$1");
                            com_ss_android_ugc_aweme_memory_profiler_strategy_FpsRegistry$ensureSubscribed$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            C1C7U.LIZIZ("FpsRegistry@7b18.ensureSubscribed$1$1");
                        }

                        public final void com_ss_android_ugc_aweme_memory_profiler_strategy_FpsRegistry$ensureSubscribed$1$1__run$___twin___() {
                            FpsRegistry.INSTANCE.switchTo(activityLIZ, FpsRegistry.monitorSubType);
                        }

                        public static void com_ss_android_ugc_aweme_memory_profiler_strategy_FpsRegistry$ensureSubscribed$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00161 runnableC00161) {
                            try {
                                runnableC00161.com_ss_android_ugc_aweme_memory_profiler_strategy_FpsRegistry$ensureSubscribed$1$1__run$___twin___();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (!C2179971ATj.LIZ(th)) {
                                    throw th;
                                }
                            }
                        }
                    });
                }
            }

            @Override // X.C09JN
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FpsRegistry@7b18.ensureSubscribed$1");
                accept((AbstractC1387200mCc) obj);
                C1C7U.LIZIZ("FpsRegistry@7b18.ensureSubscribed$1");
            }
        });
        C1906580ziK.LIZJ().LIZIZ().LJLLLLLL(new C09JN() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.FpsRegistry.ensureSubscribed.2
            public final void accept(AbstractC1387200mCc abstractC1387200mCc) {
                Activity activityLIZIZ;
                Activity activityLIZ;
                WeakReference<Activity> weakReference;
                if (FpsRegistry.isMonitoring.get() && (abstractC1387200mCc instanceof C1397950mTx) && (activityLIZIZ = abstractC1387200mCc.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && (weakReference = FpsRegistry.currentRef) != null && weakReference.get() == activityLIZ) {
                    FpsRegistry.INSTANCE.stopAndClearCurrent();
                }
            }

            @Override // X.C09JN
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FpsRegistry@7b18.ensureSubscribed$2");
                accept((AbstractC1387200mCc) obj);
                C1C7U.LIZIZ("FpsRegistry@7b18.ensureSubscribed$2");
            }
        });
    }

    public final void stopAndClearCurrent() {
        WeakReference<Activity> weakReference = currentRef;
        if (weakReference != null && weakReference.get() != null) {
            ProfilerFpsMonitor.INSTANCE.stop();
        }
        currentRef = null;
    }

    public final void attach(Application application) {
        app = application;
        ensureSubscribed();
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.memory.profiler.strategy.FpsRegistry$switchTo$1, reason: invalid class name and case insensitive filesystem */
    public final class C2325571 extends C09AY implements Function2<Integer, Integer, Unit> {
        public final /* synthetic */ int $subType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2325571(int i) {
            super(2);
            this.$subType = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            Integer num3 = num;
            Integer num4 = num2;
            n nVar = new n();
            if (num3 != null) {
                nVar.LJJIII(num3, "vsync");
            }
            if (num4 != null) {
                nVar.LJJIII(num4, "draw");
            }
            FpsRegistry.INSTANCE.sendEvent(this.$subType, nVar);
            return Unit.LIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void startMonitoring(final int i, n nVar) {
        boolean zLJ;
        boolean zLJ2;
        long jLJIIZILJ;
        Activity activityLIZIZ;
        final Activity activityLIZ;
        monitorSubType = i;
        k kVarLJJIIZ = nVar.LJJIIZ("enableVsync");
        if (kVarLJJIIZ != null) {
            zLJ = kVarLJJIIZ.LJ();
        } else {
            zLJ = true;
        }
        enableVsync = zLJ;
        k kVarLJJIIZ2 = nVar.LJJIIZ("enableDraw");
        if (kVarLJJIIZ2 != null) {
            zLJ2 = kVarLJJIIZ2.LJ();
        } else {
            zLJ2 = true;
        }
        enableDraw = zLJ2;
        k kVarLJJIIZ3 = nVar.LJJIIZ("interval");
        if (kVarLJJIIZ3 != null) {
            jLJIIZILJ = kVarLJJIIZ3.LJIIZILJ();
        } else {
            jLJIIZILJ = 1000;
        }
        intervalMs = jLJIIZILJ;
        Application application = app;
        if (application != null) {
            ProfilerRefreshRate.INSTANCE.start(application, new AwS18S0001000_3(i, 2));
        }
        isMonitoring.set(true);
        ensureSubscribed();
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C2095108Ir.LIZJ(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.FpsRegistry$startMonitoring$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("FpsRegistry@7b18.startMonitoring$2$1");
                    com_ss_android_ugc_aweme_memory_profiler_strategy_FpsRegistry$startMonitoring$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("FpsRegistry@7b18.startMonitoring$2$1");
                }

                public final void com_ss_android_ugc_aweme_memory_profiler_strategy_FpsRegistry$startMonitoring$2$1__run$___twin___() {
                    FpsRegistry.INSTANCE.switchTo(activityLIZ, i);
                }

                public static void com_ss_android_ugc_aweme_memory_profiler_strategy_FpsRegistry$startMonitoring$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(FpsRegistry$startMonitoring$2$1 fpsRegistry$startMonitoring$2$1) {
                    try {
                        fpsRegistry$startMonitoring$2$1.com_ss_android_ugc_aweme_memory_profiler_strategy_FpsRegistry$startMonitoring$2$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void stopMonitoring(int i, n nVar) {
        isMonitoring.set(false);
        stopAndClearCurrent();
        ProfilerRefreshRate.INSTANCE.stop();
    }

    public final void switchTo(Activity activity, int i) {
        WeakReference<Activity> weakReference = currentRef;
        Activity activity2 = null;
        if (weakReference != null) {
            activity2 = weakReference.get();
        }
        if (activity2 == activity) {
            return;
        }
        WeakReference<Activity> weakReference2 = currentRef;
        if (weakReference2 != null && weakReference2.get() != null) {
            ProfilerFpsMonitor.INSTANCE.stop();
        }
        ProfilerFpsMonitor.INSTANCE.start(activity, new C2325571(i), enableVsync, enableDraw, intervalMs);
        currentRef = new WeakReference<>(activity);
    }
}
