package com.bytedance.common.jato;

import X.C07TK;
import X.C081I;
import X.C081K;
import X.C0X39;
import X.C0X3F;
import X.C1701980uOK;
import X.C1C7U;
import X.C2104908Ml;
import X.C788180Uvw;
import X.C800660Vay;
import X.C800710Vb3;
import X.InterfaceC800630Vav;
import Y.ARunnableS0S0001000_3;
import Y.ARunnableS100S0000000_26;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS14S0101000_3;
import Y.ARunnableS1S0002000_26;
import Y.ARunnableS24S0100100_26;
import Y.ARunnableS2S0011000_26;
import Y.ARunnableS3S0010000_26;
import Y.ARunnableS45S0300000_12;
import Y.ARunnableS82S0200000_13;
import Y.ARunnableS83S0000000_3;
import Y.ARunnableS8S0001000_26;
import Y.ARunnableS8S1000000_13;
import Y.ARunnableS92S0000000_13;
import Y.ARunnableS9S1100000_3;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.View;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.adrenalin.Adrenalin;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.common.jato.boost.DexCacheExpandOpt;
import com.bytedance.common.jato.boost.handler.SimpleHandler;
import com.bytedance.common.jato.boost.sched.ProcTidFetcher;
import com.bytedance.common.jato.boost.sched.ThreadAttrFixer;
import com.bytedance.common.jato.boost.sched.ThreadPrioProtector;
import com.bytedance.common.jato.fastnative.FastNative;
import com.bytedance.common.jato.gfx.GLESInitBoost;
import com.bytedance.common.jato.gfx.HwuiBoost;
import com.bytedance.common.jato.gfx.TextureViewUtil;
import com.bytedance.common.jato.interpreter.InterpreterBridge;
import com.bytedance.common.jato.jit.JitBlock;
import com.bytedance.common.jato.jit.JitOptions;
import com.bytedance.common.jato.logcut.LogcutV2;
import com.bytedance.common.jato.memory.YoungGcOpt;
import com.bytedance.common.jato.soload.SoLoad;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes27.dex */
public class JatoXL {
    public static volatile boolean isInited = false;
    public static Adrenalin sAdrenalin = null;
    public static JatoXLConfig sConfig = null;
    public static volatile boolean sDisableGcBlocker = false;
    public static boolean sEnableVerifyApexArt = true;

    public static void disableClassVerify() {
        disableClassVerify(null);
    }

    public static void enableGpuResourceCleanup() {
        ExecutorService executorService;
        int i = Build.VERSION.SDK_INT;
        if (i > 30 || i < 28 || !isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS83S0000000_3(3));
    }

    public static synchronized JatoXLConfig getConfig() {
        return sConfig;
    }

    public static void initInternal() {
        int i;
        JatoXLConfig jatoXLConfig = sConfig;
        if (jatoXLConfig.isEnabledCpuSetFeature) {
            jatoXLConfig.mExecuteService.execute(new Runnable() { // from class: X.08MF
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.initInternal$1");
                    try {
                        CpusetManager.init();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.initInternal$1");
                }
            });
        }
        JatoXLConfig jatoXLConfig2 = sConfig;
        if (jatoXLConfig2.mUseJitBlock) {
            C07TK c07tk = jatoXLConfig2.mMonitor;
            if (c07tk != null) {
                JitBlock.LIZLLL = c07tk;
            }
            JitBlock.LIZIZ(jatoXLConfig2.mIsAddref);
            long j = sConfig.mBlockInterval;
            if (j > 0) {
                JitBlock.LIZJ(j);
            }
            int i2 = sConfig.mPriority;
            if (i2 != -1) {
                JitBlock.LIZLLL(i2);
            }
            JitBlock.lightJitBlockStart();
        }
        JatoXLConfig jatoXLConfig3 = sConfig;
        if (jatoXLConfig3.mUseLogCut && (i = jatoXLConfig3.mLogCutType) > 0 && i <= 3) {
            LogcutV2.LIZ = i;
            LogcutV2.LIZ();
        }
        JatoXLConfig jatoXLConfig4 = sConfig;
        if (jatoXLConfig4.mUseSoLoad) {
            C07TK c07tk2 = jatoXLConfig4.mMonitor;
            if (c07tk2 != null) {
                SoLoad.LIZJ = c07tk2;
            }
            SoLoad.LIZJ();
        }
        JatoXLConfig jatoXLConfig5 = sConfig;
        if (jatoXLConfig5.mUseInterpreterBridge) {
            jatoXLConfig5.mExecuteService.execute(new Runnable() { // from class: X.07x4
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.initInternal$2");
                    try {
                        InterpreterBridge.LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.initInternal$2");
                }
            });
        }
        JatoXLConfig jatoXLConfig6 = sConfig;
        int i3 = jatoXLConfig6.mPrioVersion;
        if (C800710Vb3.LIZ == 0) {
            C800710Vb3.LIZ = i3;
        }
        jatoXLConfig6.mExecuteService.execute(new Runnable() { // from class: X.07x5
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("JatoXL@558d.initInternal$3");
                C1C7U.LIZIZ("JatoXL@558d.initInternal$3");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean isInited() {
        /*
            java.lang.Class<com.bytedance.common.jato.JatoXL> r1 = com.bytedance.common.jato.JatoXL.class
            monitor-enter(r1)
            boolean r0 = com.bytedance.common.jato.JatoXL.isInited     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lc
            com.bytedance.common.jato.JatoXLConfig r0 = com.bytedance.common.jato.JatoXL.sConfig     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r1)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.JatoXL.isInited():boolean");
    }

    public static void resetPriority() {
        if (C800710Vb3.LIZ == 1) {
            try {
                Map<Integer, Integer> map = C788180Uvw.LIZIZ;
                if (((ConcurrentHashMap) map).get(-1) != null) {
                    Process.setThreadPriority(0, ((Integer) ((ConcurrentHashMap) map).get(-1)).intValue());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void shrinkVM() {
        shrinkVM(512, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
    }

    public static void disableJitCodeCacheGc() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(14));
    }

    public static void enableClassVerify() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS92S0000000_13(13));
    }

    public static void enableJitCodeCacheGc() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(13));
    }

    public static void initInterpreterBridge() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS83S0000000_3(5));
    }

    public static void keepBuffers() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(6));
    }

    public static void lightJitBlockStart() {
        if (isInited()) {
            JitBlock.lightJitBlockStart();
        }
    }

    public static void lightJitBlockStop() {
        if (isInited()) {
            JitBlock.lightJitBlockStop();
        }
    }

    public static void logCutStop() {
        if (isInited() && getConfig().mUseLogCut) {
            LogcutV2.LIZ().stopLogcut();
        }
    }

    public static void munlockCodeItemV3() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(9));
    }

    public static void munlockCodeOdexV4() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(11));
    }

    public static void munlockInBackground() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(3));
    }

    public static void munlockInBackgroundV3() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(8));
    }

    public static void munlockInBackgroundV4() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(10));
    }

    public static void optTextureBufferQueue() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS83S0000000_3(4));
    }

    public static void pinImagesOpt() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(1));
    }

    public static void releaseBoost() {
        C081I c081iLIZJ;
        if (!isInited() || sConfig.mExecuteService == null || (c081iLIZJ = C081I.LIZJ()) == null) {
            return;
        }
        synchronized (c081iLIZJ) {
            C081K c081k = c081iLIZJ.LIZIZ;
            if (c081k != null) {
                c081k.release();
            }
        }
    }

    public static void releaseBuffers() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(7));
    }

    public static void replaceMadviseDontNeedToFree() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(12));
    }

    public static void resetRenderThread() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new Runnable() { // from class: X.0Vb1
            public static void LIZ() {
                if (C800710Vb3.LIZ == 1) {
                    synchronized (C788180Uvw.class) {
                        Integer numValueOf = Integer.valueOf(ProcTidFetcher.LIZIZ);
                        if (C788180Uvw.LIZ && numValueOf != null) {
                            CpusetManager.resetCoreBind(numValueOf.intValue());
                            JatoXL.resetPriority(numValueOf.intValue());
                            C788180Uvw.LIZ = false;
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("JatoXL@558d.resetRenderThread$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("JatoXL@558d.resetRenderThread$1");
            }
        });
    }

    public static void shrinkWebviewNative() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(5));
    }

    public static void soLoadStart() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS83S0000000_3(6));
    }

    public static void soLoadStop() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS83S0000000_3(7));
    }

    public static void trimDexMap() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(4));
    }

    public static void unboostWaitForGC() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(2));
    }

    public static void weakRefUnblock() {
        ExecutorService executorService;
        if (!isInited() || (executorService = sConfig.mExecuteService) == null) {
            return;
        }
        executorService.execute(new ARunnableS100S0000000_26(0));
    }

    public static void bindBigCore() {
        CpusetManager.bindBigCore();
    }

    public static void bindLittleCore() {
        CpusetManager.bindLittleCore();
    }

    public static Adrenalin getAdrenalin() {
        return sAdrenalin;
    }

    public static void resetCoreBind() {
        CpusetManager.resetCoreBind();
    }

    public static void bindBigCore(int i) {
        CpusetManager.bindBigCore(i);
    }

    public static void bindLittleCore(int i) {
        CpusetManager.bindLittleCore(i);
    }

    public static void boostGLESInit(final boolean z) {
        if (!isInited() || sConfig.mExecuteService == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        sConfig.mExecuteService.execute(new Runnable() { // from class: X.0Vlu
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("JatoXL@558d.boostGLESInit$1");
                try {
                    GLESInitBoost.LIZ(z);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("JatoXL@558d.boostGLESInit$1");
            }
        });
    }

    public static void boostWaitForGC(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0001000_26(i, 5));
        }
    }

    public static void dexCacheExpand(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS0S0001000_3(i, 1));
        }
    }

    public static void disableClassVerify(C0X39 c0x39) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS92S0000000_13(12));
        }
    }

    public static void doYoungGcOpt(final double d) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new Runnable() { // from class: X.0uOM
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.doYoungGcOpt$1");
                    try {
                        YoungGcOpt.doYoungGcOpt(d);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.doYoungGcOpt$1");
                }
            });
        }
    }

    public static void exclusiveLockSpinOpt(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0001000_26(i, 3));
        }
    }

    public static void fetchRenderThreadTid(final Application application) {
        if (isInited() && sConfig.mExecuteService != null) {
            application.registerActivityLifecycleCallbacks(new C800660Vay() { // from class: X.0Vax
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    JatoXL.sConfig.mExecuteService.execute(new Runnable() { // from class: X.0Vaw
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("JatoXL@558d.fetchRenderThreadTid$1$onActivityCreated$1");
                            try {
                                if (ProcTidFetcher.LIZIZ < 0) {
                                    ProcTidFetcher.LIZ();
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("JatoXL@558d.fetchRenderThreadTid$1$onActivityCreated$1");
                        }
                    });
                    application.unregisterActivityLifecycleCallbacks(this);
                }
            });
        }
    }

    public static synchronized boolean init(JatoXLConfig jatoXLConfig) {
        if (isInited) {
            return true;
        }
        if (jatoXLConfig == null) {
            return false;
        }
        if (!C2104908Ml.LIZIZ()) {
            return false;
        }
        sConfig = jatoXLConfig;
        isInited = true;
        initInternal();
        return true;
    }

    public static void initAdrenalin(Application application) {
        ExecutorService executorService;
        if (sAdrenalin == null && isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS126S0100000_26(application, 8));
        }
    }

    public static void initBoostFramework(Context context) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS126S0100000_26(context, 7));
        }
    }

    public static void initScheduler(final int i) {
        JatoXLConfig jatoXLConfig;
        ExecutorService executorService;
        if (isInited() && (executorService = (jatoXLConfig = sConfig).mExecuteService) != null && jatoXLConfig.mContext != null) {
            executorService.execute(new Runnable() { // from class: X.0Vlx
                public final void LIZ() {
                    C807460Vlw c807460Vlw;
                    synchronized (C807460Vlw.class) {
                        if (C807460Vlw.LIZIZ == null) {
                            C807460Vlw.LIZIZ = new C807460Vlw();
                        }
                        c807460Vlw = C807460Vlw.LIZIZ;
                    }
                    c807460Vlw.LIZ(i, JatoXL.sConfig.mContext);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.initScheduler$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.initScheduler$1");
                }
            });
        }
    }

    public static /* synthetic */ void lambda$setEnabledThreadAttrFix$0(boolean z) {
        C1C7U.LIZ("JatoXL@558d.setEnabledThreadAttrFix$1L");
        ThreadAttrFixer.nativeFixThreadAttrInherited(z);
        C1C7U.LIZIZ("JatoXL@558d.setEnabledThreadAttrFix$1L");
    }

    public static void logCutStart(int i) {
        if (isInited() && getConfig().mUseLogCut) {
            LogcutV2.LIZ().startLogcut(i);
        }
    }

    public static void mlockCodeItem(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0001000_26(i, 6));
        }
    }

    public static void mlockCodeItemV3(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0001000_26(i, 8));
        }
    }

    public static void reclaimCodeItem(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0001000_26(i, 4));
        }
    }

    public static void reclaimCodeItemV3(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0001000_26(i, 7));
        }
    }

    public static void reclaimCodeOdexV4(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0001000_26(i, 9));
        }
    }

    public static void requestBlockGc(final long j) {
        if (isInited() && sConfig.mExecuteService != null && !sDisableGcBlocker) {
            sConfig.mExecuteService.execute(new Runnable() { // from class: X.0X3H
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.requestBlockGc$1");
                    try {
                        C0X3F.LIZ().LIZ(j);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.requestBlockGc$1");
                }
            });
        }
    }

    public static void resetCoreBind(int i) {
        CpusetManager.resetCoreBind(i);
    }

    public static void resetPriority(int i) {
        if (C800710Vb3.LIZ == 1) {
            try {
                Map<Integer, Integer> map = C788180Uvw.LIZIZ;
                if (((ConcurrentHashMap) map).get(Integer.valueOf(i)) != null) {
                    Process.setThreadPriority(i, ((Integer) ((ConcurrentHashMap) map).get(Integer.valueOf(i))).intValue());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void resourceCacheOpt(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0001000_26(i, 0));
        }
    }

    public static void setDisableGcBlocker(boolean z) {
        sDisableGcBlocker = z;
    }

    public static void setEnableVerifyApexArt(boolean z) {
        sEnableVerifyApexArt = z;
    }

    public static void setEnabledThreadAttrFix(boolean z) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS3S0010000_26(z, 0));
        }
    }

    public static void setEnabledThreadPrioProtect(boolean z) {
        ThreadPrioProtector.setPrioProtectEnabled(z);
    }

    public static void setLockMaxSpinsAsync(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0001000_26(i, 10));
        }
    }

    public static void setMaxGcBlockDuration(int i) {
        if (isInited()) {
            C0X3F.LIZ().LIZJ(i);
        }
    }

    public static void setMaxHeapLimit(int i) {
        if (isInited()) {
            C0X3F.LIZ().LIZIZ(i, getConfig().isLargeHeapApp());
        }
    }

    public static void setPriority(int i) {
        if (C800710Vb3.LIZ == 1) {
            C788180Uvw.LIZ(-1, i);
        }
    }

    public static void setThreadSuspendTimeoutInSeconds(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0001000_26(i, 2));
        }
    }

    public static void startBlockGc(final String str) {
        if (isInited() && sConfig.mExecuteService != null && !sDisableGcBlocker) {
            sConfig.mExecuteService.execute(new Runnable() { // from class: X.0X3J
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.startBlockGc$1");
                    try {
                        C0X3F.LIZ().LIZLLL(str);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.startBlockGc$1");
                }
            });
        }
    }

    public static void stopBlockGc(String str) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S1000000_13(str, 3));
        }
    }

    public static void tryCpuBoost(final long j) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new Runnable() { // from class: X.081L
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.tryCpuBoost$1");
                    try {
                        C081I c081iLIZJ = C081I.LIZJ();
                        if (c081iLIZJ != null) {
                            long j2 = j;
                            synchronized (c081iLIZJ) {
                                C081K c081k = c081iLIZJ.LIZIZ;
                                if (c081k != null) {
                                    c081k.LIZIZ(j2);
                                }
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.tryCpuBoost$1");
                }
            });
        }
    }

    public static void tryGpuBoost(final long j) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new Runnable() { // from class: X.081M
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.tryGpuBoost$1");
                    try {
                        C081I c081iLIZJ = C081I.LIZJ();
                        if (c081iLIZJ != null) {
                            long j2 = j;
                            synchronized (c081iLIZJ) {
                                C081K c081k = c081iLIZJ.LIZIZ;
                                if (c081k != null) {
                                    c081k.LIZ(j2);
                                }
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.tryGpuBoost$1");
                }
            });
        }
    }

    public static void unblockRenderThreadTask(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0001000_26(i, 1));
        }
    }

    public static void boostRenderThread(final Application application, final int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null && application != null) {
            executorService.execute(new Runnable(application, i) { // from class: X.0Vb2
                public final /* synthetic */ int LL;

                public final void LIZ() {
                    int i2 = this.LL;
                    if (C800710Vb3.LIZ == 1) {
                        synchronized (C788180Uvw.class) {
                            Integer numValueOf = Integer.valueOf(ProcTidFetcher.LIZIZ);
                            if (!C788180Uvw.LIZ && numValueOf != null) {
                                C788180Uvw.LIZ = true;
                                CpusetManager.bindBigCore(numValueOf.intValue());
                                C788180Uvw.LIZ(numValueOf.intValue(), i2);
                            }
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.boostRenderThread$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.boostRenderThread$1");
                }

                {
                    this.LL = i;
                }
            });
        }
    }

    public static void createProfileForMethods(ArrayList<C1701980uOK> arrayList, long j) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS24S0100100_26(arrayList, j, 0));
        }
    }

    public static void dlopen(Context context, String str) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS9S1100000_3(context, str, 2));
        }
    }

    public static void gcStwThreadBoost(int i, boolean z) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS2S0011000_26(i, z, 0));
        }
    }

    public static void initSimpleToStringHandlerOpt(final Application application, final int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new Runnable() { // from class: X.085k
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.initSimpleToStringHandlerOpt$1");
                    try {
                        int i2 = i;
                        if (C20605085j.LIZ < 0) {
                            C20605085j.LIZ = i2;
                            try {
                                C20605085j.LIZ();
                                C20605085j.LIZIZ = true;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        Application application2 = application;
                        if (C20605085j.LIZIZ && (C20605085j.LIZ & 7) != 0 && application2 != null) {
                            application2.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.085i
                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public final void onActivityDestroyed(Activity activity) {
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public final void onActivityPaused(Activity activity) {
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public final void onActivityStopped(Activity activity) {
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public final void onActivityResumed(final Activity activity) {
                                    View decorView = activity.getWindow().getDecorView();
                                    if (decorView != null && (C20605085j.LIZ & 2) == 2) {
                                        decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.085h
                                            @Override // android.view.View.OnAttachStateChangeListener
                                            public final void onViewDetachedFromWindow(View view) {
                                            }

                                            @Override // android.view.View.OnAttachStateChangeListener
                                            public final void onViewAttachedToWindow(View view) throws Throwable {
                                                View decorView2 = activity.getWindow().getDecorView();
                                                Method method = C20607085l.LIZ;
                                                if (method != null && C20607085l.LIZIZ != null && C20607085l.LIZJ != null) {
                                                    try {
                                                        Object objA0 = C2204961BRm.a0(method, decorView2, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObyvHpvXx0w7z1mNERCxSVzAqhXbfNobe0Y7MQBuFu/6GlQ==", null));
                                                        if (objA0 != null) {
                                                            try {
                                                                Handler handler = (Handler) C20607085l.LIZJ.get(objA0);
                                                                if (handler != null) {
                                                                    SimpleHandler simpleHandler = new SimpleHandler(handler.getLooper());
                                                                    long jLIZJ = C1960507m7.LIZJ(C20607085l.LIZJ);
                                                                    simpleHandler.LJ("VRI_H_", handler);
                                                                    C1960507m7.LIZLLL(jLIZJ, objA0, simpleHandler);
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                TryCatchGuardChecker.doCheck(e);
                                                            }
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                    }
                                                }
                                            }
                                        });
                                    }
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public final void onActivityStarted(Activity activity) {
                                    if ((C20605085j.LIZ & 4) == 4) {
                                        Choreographer choreographerV2 = C786410Ut5.v2();
                                        if (C20608085m.LIZ != null && choreographerV2 != null && C20608085m.LIZIZ == null) {
                                            try {
                                                Handler handler = (Handler) C20608085m.LIZ.get(choreographerV2);
                                                if (handler != null) {
                                                    C20608085m.LIZIZ = new SimpleHandler(handler.getLooper());
                                                    long jLIZJ = C1960507m7.LIZJ(C20608085m.LIZ);
                                                    C20608085m.LIZIZ.LJ("CH_H_", handler);
                                                    C1960507m7.LIZLLL(jLIZJ, choreographerV2, C20608085m.LIZIZ);
                                                }
                                            } catch (IllegalAccessException e2) {
                                                TryCatchGuardChecker.doCheck(e2);
                                            }
                                        }
                                    }
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public final void onActivityCreated(Activity activity, Bundle bundle) {
                                    Field field;
                                    if ((C20605085j.LIZ & 1) == 1 && C20609085n.LIZ != null && (field = C20609085n.LIZIZ) != null) {
                                        try {
                                            Handler handler = (Handler) field.get(activity);
                                            if (handler != null) {
                                                SimpleHandler simpleHandler = new SimpleHandler(handler.getLooper());
                                                long jLIZJ = C1960507m7.LIZJ(C20609085n.LIZIZ);
                                                simpleHandler.LJ("ACT_H_", handler);
                                                C1960507m7.LIZLLL(jLIZJ, activity, simpleHandler);
                                            }
                                        } catch (Exception e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                        }
                                    }
                                }
                            });
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.initSimpleToStringHandlerOpt$1");
                }
            });
        }
    }

    public static void mlockCodeOdexV4(int i, int i2) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS1S0002000_26(i, i2, 5));
        }
    }

    public static void optXmlCache(Resources resources, int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS14S0101000_3(i, resources, 3));
        }
    }

    public static void optimizeSurfaceHandler(TextureView textureView, boolean z) {
        SurfaceTexture surfaceTexture;
        if (textureView != null) {
            Field field = TextureViewUtil.LIZIZ;
            if (field != null) {
                Class cls = TextureViewUtil.LIZ;
                if ((cls != null && cls.isInstance(textureView)) || (surfaceTexture = textureView.getSurfaceTexture()) == null) {
                    return;
                }
                try {
                    Handler handler = (Handler) field.get(surfaceTexture);
                    if (handler == null || (handler instanceof TextureViewUtil.SurfaceHandler)) {
                        return;
                    }
                    field.set(surfaceTexture, new TextureViewUtil.SurfaceHandler(handler, z));
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        Class cls2 = TextureViewUtil.LIZ;
    }

    public static void prePageFault(int i, int i2) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS1S0002000_26(i, i2, 1));
        }
    }

    public static void prePageFaultV3(int i, int i2) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS1S0002000_26(i, i2, 3));
        }
    }

    public static void prePageFaultV4(int i, int i2) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS1S0002000_26(i, i2, 4));
        }
    }

    public static void setGCThreadPriorityWhenBlockGC(int i, int i2) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS1S0002000_26(i, i2, 2));
        }
    }

    public static void setPriority(int i, int i2) {
        if (C800710Vb3.LIZ == 1) {
            C788180Uvw.LIZ(i, i2);
        }
    }

    public static void shrinkVM(int i, int i2) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS1S0002000_26(i, i2, 0));
        }
    }

    public static void addThreadPrioProtect(final int i, final int i2, final int i3) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new Runnable() { // from class: X.0uOm
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.addThreadPrioProtect$1");
                    try {
                        ThreadPrioProtector.nativeInit();
                        ThreadPrioProtector.addThreadPrioProtect(i, i2, i3);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.addThreadPrioProtect$1");
                }
            });
        }
    }

    public static void boostHwui(final boolean z, final boolean z2, final boolean z3) {
        if (!isInited() || sConfig.mExecuteService == null || Build.VERSION.SDK_INT < 28) {
            return;
        }
        sConfig.mExecuteService.execute(new Runnable() { // from class: X.0Vlv
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("JatoXL@558d.boostHwui$1");
                try {
                    HwuiBoost.LIZ(z, z2, z3);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("JatoXL@558d.boostHwui$1");
            }
        });
    }

    public static void fetchTidList(Application application, ArrayList<String> arrayList, InterfaceC800630Vav interfaceC800630Vav) {
        if (isInited() && sConfig.mExecuteService != null) {
            getConfig().mExecuteService.execute(new ARunnableS82S0200000_13(interfaceC800630Vav, arrayList, 19));
        }
    }

    public static void setJitCompilerOptions(final int i, final boolean z, final boolean z2) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new Runnable() { // from class: X.07x2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.setJitCompilerOptions$1");
                    try {
                        if (z2) {
                            JitOptions.compilerOptionsSupport14();
                        }
                        JitOptions.LIZ(i, z);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.setJitCompilerOptions$1");
                }
            });
        }
    }

    public static void dexCacheExpand(final int i, final int i2, final int i3, final int i4) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new Runnable() { // from class: X.086Z
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.dexCacheExpand$2");
                    try {
                        DexCacheExpandOpt.LIZIZ(i, i2, i3, i4);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.dexCacheExpand$2");
                }
            });
        }
    }

    public static void setFastNative(String[] strArr, String[] strArr2, String[] strArr3, boolean z) {
        if (!isInited()) {
            return;
        }
        if (z) {
            ExecutorService executorService = sConfig.mExecuteService;
            if (executorService != null) {
                executorService.execute(new ARunnableS45S0300000_12(strArr, strArr2, strArr3, 11));
                return;
            }
            return;
        }
        FastNative.LIZIZ(strArr, strArr2, strArr3);
    }

    public static void setJitOptions(final int i, final int i2, final int i3, final int i4, final int i5) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new Runnable() { // from class: X.07x3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JatoXL@558d.setJitOptions$1");
                    try {
                        JitOptions.setCompileThreshold(i, i2, i3, i4, i5);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JatoXL@558d.setJitOptions$1");
                }
            });
        }
    }
}
