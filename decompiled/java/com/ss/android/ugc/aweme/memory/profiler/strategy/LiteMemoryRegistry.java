package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.C08M9;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188571Al5;
import X.C2367709Pn;
import X.C786410Ut5;
import X.C814420VxA;
import X.C822660WOy;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class LiteMemoryRegistry extends AbsPeriodicRegistry {
    public static Context context;
    public static Integer deviceMemoryMb;
    public static boolean enableDeviceAvail;
    public static boolean enableMainThreadPfl;
    public static boolean enablePss;
    public static boolean enableVss;
    public static ScheduledThreadPoolExecutor scheduler;
    public static ScheduledFuture<?> task;
    public static final LiteMemoryRegistry INSTANCE = new LiteMemoryRegistry();
    public static boolean enableJavaHeap = true;
    public static boolean enableNativeHeap = true;
    public static boolean enableProcessPfl = true;
    public static final int maxJavaMb = C08M9.LIZ(C2367709Pn.LJ(), true);
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 8;
    }

    public final Integer getDeviceMemoryMb() {
        return deviceMemoryMb;
    }

    public final int getMaxJavaMb() {
        return maxJavaMb;
    }

    public final void attach(Context context2) {
        context = C786410Ut5.N3(context2);
        deviceMemoryMb = Integer.valueOf(C08M9.LIZ(C2188571Al5.LIZIZ(context2), true));
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void startMonitoring(final int i, n nVar) {
        long jLJIIZILJ;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        boolean zLJJIIJ;
        boolean zLJJIIJ2;
        boolean zLJJIIJ3;
        boolean zLJJIIJ4;
        boolean zLJJIIJ5;
        boolean zLJJIIJ6;
        boolean zLJJIIJ7;
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
        try {
            h hVarLJJIIZI = nVar.LJJIIZI("memory");
            if (hVarLJJIIZI != null) {
                zLJJIIJ3 = hVarLJJIIZI.LJJIIJ(new q("JavaHeap"));
            } else {
                zLJJIIJ3 = enableJavaHeap;
            }
            enableJavaHeap = zLJJIIJ3;
            if (hVarLJJIIZI != null) {
                zLJJIIJ4 = hVarLJJIIZI.LJJIIJ(new q("NativeHeap"));
            } else {
                zLJJIIJ4 = enableNativeHeap;
            }
            enableNativeHeap = zLJJIIJ4;
            if (hVarLJJIIZI != null) {
                zLJJIIJ5 = hVarLJJIIZI.LJJIIJ(new q("PSS"));
            } else {
                zLJJIIJ5 = enablePss;
            }
            enablePss = zLJJIIJ5;
            if (hVarLJJIIZI != null) {
                zLJJIIJ6 = hVarLJJIIZI.LJJIIJ(new q("DeviceAvailable"));
            } else {
                zLJJIIJ6 = enableDeviceAvail;
            }
            enableDeviceAvail = zLJJIIJ6;
            if (hVarLJJIIZI != null) {
                zLJJIIJ7 = hVarLJJIIZI.LJJIIJ(new q("VSS"));
            } else {
                zLJJIIJ7 = enableVss;
            }
            enableVss = zLJJIIJ7;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        int iIntValue = 0;
        try {
            h hVarLJJIIZI2 = nVar.LJJIIZI("fault");
            if (hVarLJJIIZI2 != null) {
                zLJJIIJ = hVarLJJIIZI2.LJJIIJ(new q("Process"));
                zLJJIIJ2 = hVarLJJIIZI2.LJJIIJ(new q("MainThread"));
            } else {
                zLJJIIJ = false;
                zLJJIIJ2 = false;
            }
            enableProcessPfl = zLJJIIJ;
            enableMainThreadPfl = zLJJIIJ2;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            n nVar2 = new n();
            nVar2.LJJII(Boolean.TRUE, "config");
            Integer num = deviceMemoryMb;
            if (num != null) {
                iIntValue = num.intValue();
            }
            nVar2.LJJIII(Integer.valueOf(iIntValue), "deviceMemoryMb");
            int i2 = maxJavaMb;
            nVar2.LJJIII(Integer.valueOf(i2), "maxJavaMb");
            nVar2.LJJIII(Integer.valueOf(C814420VxA.LIZ(((double) i2) * 0.75d)), "javaHeapMaxRecommend");
            nVar2.LJJIII(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), "nativeHeapMaxRecommend");
            nVar2.LJJIII(Double.valueOf(0.75d), "javaHeapRateMaxRecommend");
            nVar2.LJJIII(1024, "pssMaxRecommend");
            nVar2.LJJIII(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), "deviceAvailableMaxRecommend");
            sendEvent(i, nVar2);
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = scheduler;
        if (scheduledThreadPoolExecutor2 != null) {
            scheduledFutureScheduleWithFixedDelay = scheduledThreadPoolExecutor2.scheduleWithFixedDelay(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.LiteMemoryRegistry.startMonitoring.5
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("LiteMemoryRegistry@a5d0.startMonitoring$5");
                    com_ss_android_ugc_aweme_memory_profiler_strategy_LiteMemoryRegistry$startMonitoring$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("LiteMemoryRegistry@a5d0.startMonitoring$5");
                }

                public final void com_ss_android_ugc_aweme_memory_profiler_strategy_LiteMemoryRegistry$startMonitoring$5__run$___twin___() {
                    try {
                        Context context2 = LiteMemoryRegistry.context;
                        if (context2 != null) {
                            int i3 = i;
                            n nVar3 = new n();
                            n nVar4 = new n();
                            n nVar5 = new n();
                            if (LiteMemoryRegistry.enableJavaHeap) {
                                int iLIZ = C08M9.LIZ(C2367709Pn.LIZLLL(), true);
                                nVar4.LJJIII(Integer.valueOf(iLIZ), "javaHeap");
                                nVar5.LJJIII(Double.valueOf(C08M9.LIZIZ(((double) iLIZ) / ((double) LiteMemoryRegistry.INSTANCE.getMaxJavaMb()), 2)), "javaHeapRate");
                            }
                            if (LiteMemoryRegistry.enableNativeHeap) {
                                nVar4.LJJIII(Integer.valueOf(C08M9.LIZ(Debug.getNativeHeapAllocatedSize(), true)), "nativeHeap");
                            }
                            if (LiteMemoryRegistry.enablePss) {
                                int iLIZ2 = C08M9.LIZ(Debug.getPss(), false);
                                nVar4.LJJIII(Integer.valueOf(iLIZ2), "pss");
                                double d = iLIZ2;
                                Integer deviceMemoryMb2 = LiteMemoryRegistry.INSTANCE.getDeviceMemoryMb();
                                nVar5.LJJIII(Double.valueOf(C08M9.LIZIZ(d / ((double) (deviceMemoryMb2 != null ? deviceMemoryMb2.intValue() : 1)), 2)), "pssRate");
                            }
                            if (LiteMemoryRegistry.enableDeviceAvail) {
                                int iLIZ3 = C08M9.LIZ(C2367709Pn.LIZIZ(context2)[0], true);
                                nVar4.LJJIII(Integer.valueOf(iLIZ3), "deviceAvailable");
                                double d2 = iLIZ3;
                                Integer deviceMemoryMb3 = LiteMemoryRegistry.INSTANCE.getDeviceMemoryMb();
                                nVar5.LJJIII(Double.valueOf(C08M9.LIZIZ(d2 / ((double) (deviceMemoryMb3 != null ? deviceMemoryMb3.intValue() : 1)), 2)), "deviceAvailableRate");
                            }
                            if (LiteMemoryRegistry.enableVss) {
                                nVar4.LJJIII(Integer.valueOf(C08M9.LIZ(C2367709Pn.LIZ(), true)), "vss");
                            }
                            if (!nVar4.entrySet().isEmpty()) {
                                nVar3.LJJIFFI("memory", nVar4);
                            }
                            if (!nVar5.entrySet().isEmpty()) {
                                nVar3.LJJIFFI("usage", nVar5);
                            }
                            n nVar6 = new n();
                            if (LiteMemoryRegistry.enableProcessPfl) {
                                long[] jArrLJFF = C2367709Pn.LJFF();
                                nVar6.LJJIII(Long.valueOf(jArrLJFF[0]), "processMinor");
                                nVar6.LJJIII(Long.valueOf(jArrLJFF[1]), "processMajor");
                            }
                            if (LiteMemoryRegistry.enableMainThreadPfl) {
                                long[] jArrLJII = C2367709Pn.LJII(Process.myPid());
                                nVar6.LJJIII(Long.valueOf(jArrLJII[0]), "mainMinor");
                                nVar6.LJJIII(Long.valueOf(jArrLJII[1]), "mainMajor");
                            }
                            if (!nVar6.entrySet().isEmpty()) {
                                nVar3.LJJIFFI("fault", nVar6);
                            }
                            LiteMemoryRegistry.INSTANCE.sendEvent(i3, nVar3);
                        }
                    } catch (Exception e5) {
                        TryCatchGuardChecker.doCheck(e5);
                    }
                }

                public static void com_ss_android_ugc_aweme_memory_profiler_strategy_LiteMemoryRegistry$startMonitoring$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    try {
                        anonymousClass5.com_ss_android_ugc_aweme_memory_profiler_strategy_LiteMemoryRegistry$startMonitoring$5__run$___twin___();
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
