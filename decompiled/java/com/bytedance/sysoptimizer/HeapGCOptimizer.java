package com.bytedance.sysoptimizer;

import X.C0W9U;
import X.C0W9W;
import X.C1C7U;
import X.C2179971ATj;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Timer;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes21.dex */
public class HeapGCOptimizer {
    public static long currentRegionSpaces = 0;
    public static boolean sGlobalSwitchOff = false;
    public static boolean sInited = false;
    public static int sMaxAPISupport = 33;
    public static boolean sShrinkInited;
    public static Timer sVssCheckTimer;
    public static final Pattern numPattern = PatternProtector.compile("[^0-9]");
    public static VssConfig sVssConfig = new VssConfig();

    public static class VssCheckAndShrinkTask extends C0W9W {
        private void bpea_origin_timer_run() {
            com_bytedance_sysoptimizer_HeapGCOptimizer$VssCheckAndShrinkTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_bytedance_sysoptimizer_HeapGCOptimizer$VssCheckAndShrinkTask__run$___twin___() {
            if (HeapGCOptimizer.currentRegionSpaces - ((long) HeapGCOptimizer.sVssConfig.shrinkStep) < r2.lowerLimit) {
                HeapGCOptimizer.stopVssCheckTimer();
                return;
            }
            long vssSize = HeapGCOptimizer.readVssSize();
            if (vssSize < 0) {
                HeapGCOptimizer.stopVssCheckTimer();
                return;
            }
            float f = vssSize / 4.2949673E9f;
            if (f < 1.0d) {
                VssConfig vssConfig = HeapGCOptimizer.sVssConfig;
                if (f <= vssConfig.periodOfShrink) {
                    VssConfig vssConfig2 = HeapGCOptimizer.sVssConfig;
                    if (f < vssConfig2.periodOfLessMemoryUsage) {
                        HeapGCOptimizer.startVssCheckTimer(-1, vssConfig2.periodOfCheck * 2);
                        return;
                    }
                    return;
                }
                if (!HeapGCOptimizer.shrink_regionspace_vss(((long) vssConfig.shrinkStep) * 1048576)) {
                    HeapGCOptimizer.stopVssCheckTimer();
                } else {
                    HeapGCOptimizer.currentRegionSpaces -= (long) HeapGCOptimizer.sVssConfig.shrinkStep;
                    HeapGCOptimizer.startVssCheckTimer(-1, HeapGCOptimizer.sVssConfig.periodOfCheck / 2);
                }
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C1C7U.LIZ("HeapGCOptimizer$VssCheckAndShrinkTask@de5.run");
            boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
            try {
                com_bytedance_sysoptimizer_HeapGCOptimizer$VssCheckAndShrinkTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("HeapGCOptimizer$VssCheckAndShrinkTask@de5.run");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th;
            }
        }

        public VssCheckAndShrinkTask() {
        }

        public static void com_bytedance_sysoptimizer_HeapGCOptimizer$VssCheckAndShrinkTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(VssCheckAndShrinkTask vssCheckAndShrinkTask) {
            try {
                vssCheckAndShrinkTask.com_bytedance_sysoptimizer_HeapGCOptimizer$VssCheckAndShrinkTask__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public static class VssConfig {
        public int firstDelay = 30;
        public int periodOfCheck = 30;
        public float periodOfShrink = 0.65f;
        public float periodOfLessMemoryUsage = 0.45f;
        public int shrinkStep = 125;
        public int lowerLimit = 384;
    }

    public static native long getCurrentRegionSpaceSize();

    public static native boolean heap_expand(int i, boolean z);

    public static native boolean init(int i);

    public static native boolean init_4shrink_region_space(int i);

    public static native boolean init_shrink_region_space_step_size(long j);

    public static native boolean optimize(int i, float f, float f2, float f3);

    public static native boolean reuse_partial_tlab();

    public static native boolean shrink_regionspace_vss(long j);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r2 = ((long) java.lang.Integer.parseInt(com.bytedance.sysoptimizer.HeapGCOptimizer.numPattern.matcher(r1).replaceAll("").trim())) * 1024;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long readVssSize() {
        /*
            r2 = -1
            r6 = 0
            X.0VSP r5 = new X.0VSP     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L61
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L61
            r1.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "/status"
            r1.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L61
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L61
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5e
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L5e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5e
        L2b:
            java.lang.String r0 = r4.readLine()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L55
            java.lang.String r1 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "vmsize"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L2b
            java.util.regex.Pattern r0 = com.bytedance.sysoptimizer.HeapGCOptimizer.numPattern     // Catch: java.lang.Throwable -> L5c
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L5c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L5c
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L5c
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
        L55:
            r5.close()     // Catch: java.io.IOException -> L75
            r4.close()     // Catch: java.io.IOException -> L75
            return r2
        L5c:
            r0 = move-exception
            goto L64
        L5e:
            r0 = move-exception
            r4 = r6
            goto L64
        L61:
            r0 = move-exception
            r4 = r6
            r5 = r4
        L64:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L6c
            r5.close()     // Catch: java.io.IOException -> L72
        L6c:
            if (r4 == 0) goto L79
            r4.close()     // Catch: java.io.IOException -> L72
            goto L74
        L72:
            r0 = move-exception
            goto L76
        L74:
            return r2
        L75:
            r0 = move-exception
        L76:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L79:
            return r2
        L7a:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L83
            r5.close()     // Catch: java.io.IOException -> L89
        L83:
            if (r4 == 0) goto L8d
            r4.close()     // Catch: java.io.IOException -> L89
            throw r1
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L8d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sysoptimizer.HeapGCOptimizer.readVssSize():long");
    }

    public static boolean shouldSkipHeapOptimize() {
        return Build.VERSION.SDK_INT > sMaxAPISupport || sGlobalSwitchOff;
    }

    public static void stopVssCheckTimer() {
        Timer timer = sVssCheckTimer;
        if (timer != null) {
            timer.cancel();
            sVssCheckTimer = null;
        }
    }

    public static synchronized void heapOptimizeSwitchOff(boolean z) {
        sGlobalSwitchOff = z;
    }

    public static synchronized void reusePartialTLAB(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                reuse_partial_tlab();
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static synchronized void setHeapOptMaxAPISupport(int i) {
        sMaxAPISupport = i;
    }

    public static synchronized void initOptimizeRegionSpaceVSS(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                try {
                    if (!sShrinkInited && init_4shrink_region_space(i2)) {
                        sShrinkInited = true;
                    }
                    if (sShrinkInited) {
                        init_shrink_region_space_step_size(i);
                    }
                } catch (NoSuchMethodError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static synchronized void optimizeRegionSpaceVSS(Context context, VssConfig vssConfig) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return;
        }
        if (Process.is64Bit()) {
            return;
        }
        sVssConfig = vssConfig;
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                if (!sShrinkInited && init_4shrink_region_space(i)) {
                    sShrinkInited = true;
                }
                if (sShrinkInited) {
                    VssConfig vssConfig2 = sVssConfig;
                    if (vssConfig2.periodOfCheck == -1) {
                        shrink_regionspace_vss(((long) vssConfig2.shrinkStep) * 1048576);
                    } else {
                        currentRegionSpaces = getCurrentRegionSpaceSize() / 1048576;
                        startVssCheckTimer(vssConfig.firstDelay, sVssConfig.periodOfCheck);
                    }
                }
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void startVssCheckTimer(int i, int i2) {
        if (sVssCheckTimer != null) {
            stopVssCheckTimer();
        }
        if (i2 <= 0) {
            return;
        }
        PthreadTimer pthreadTimer = new PthreadTimer("HeapGCOptimizer");
        sVssCheckTimer = pthreadTimer;
        if (i > 0 && i > i2) {
            pthreadTimer.schedule(new VssCheckAndShrinkTask(), i * LSPassThroughRecordSizeConfig.DEFAULT, i2 * LSPassThroughRecordSizeConfig.DEFAULT);
            return;
        }
        VssCheckAndShrinkTask vssCheckAndShrinkTask = new VssCheckAndShrinkTask();
        long j = i2 * LSPassThroughRecordSizeConfig.DEFAULT;
        pthreadTimer.schedule(vssCheckAndShrinkTask, j, j);
    }

    public static synchronized void heapExpand(Context context, int i, boolean z) {
        if (shouldSkipHeapOptimize()) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (!sInited && init(i2)) {
                        sInited = true;
                    }
                    if (sInited) {
                        heap_expand(i, z);
                    }
                } catch (NoSuchMethodError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static synchronized void optimize(Context context, float f, float f2, float f3) {
        if (shouldSkipHeapOptimize()) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                try {
                    int i = Build.VERSION.SDK_INT;
                    if (!sInited && init(i)) {
                        sInited = true;
                    }
                    if (sInited) {
                        optimize(i, f, f2, f3);
                    }
                } catch (NoSuchMethodError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
