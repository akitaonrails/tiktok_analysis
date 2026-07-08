package com.bytedance.common.graphics;

import X.C0V7R;
import X.C0VVJ;
import X.C786410Ut5;
import X.C791560V3i;
import X.C792190V5t;
import X.C792590V7h;
import X.InterfaceC792690V7r;
import Y.ARunnableS92S0000000_13;
import com.bytedance.common.graphics.GraphicsMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class GraphicsMonitor {
    public static ScheduledFuture<?> gpuFuture;
    public static ScheduledExecutorService gpuScheduleService;
    public static C0V7R lifecycleService;
    public static long sCollectInterval;
    public static long sCollectWindow;
    public static CopyOnWriteArrayList<C0VVJ> graphicsUpdateListeners = new CopyOnWriteArrayList<>();
    public static int startTime = 0;
    public static boolean isInit = false;
    public static volatile boolean isPause = false;
    public static boolean isInitGraphicsLoad = false;
    public static double gpuLoadDataOnce = -1.0d;

    public static native void closeStatistical();

    public static native double getStatisticOnceData();

    public static void initGraphicsLoad() {
        isInitGraphicsLoad = true;
        try {
            C791560V3i.LJFF(C792190V5t.LIZIZ);
            startHook();
            gpuScheduleService = C786410Ut5.f4(0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            isInitGraphicsLoad = false;
        }
    }

    public static native void openStatistical();

    public static native boolean startHook();

    public static synchronized double getByteGpu() {
        return gpuLoadDataOnce;
    }

    public static synchronized void init() {
        if (isInit) {
            return;
        }
        sCollectInterval = 15000L;
        sCollectWindow = 100L;
        C0V7R c0v7r = (C0V7R) C792590V7h.LIZ(C0V7R.class);
        lifecycleService = c0v7r;
        if (c0v7r == null) {
            return;
        }
        c0v7r.LIZ(new InterfaceC792690V7r() { // from class: X.0VVG
            @Override // X.InterfaceC792690V7r
            public final void LIZ() {
            }

            @Override // X.InterfaceC792690V7r
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC792690V7r
            public final void LIZJ() {
            }

            @Override // X.InterfaceC792690V7r
            public final void LIZLLL() {
                GraphicsMonitor.isPause = false;
            }

            @Override // X.InterfaceC792690V7r
            public final void LJ() {
            }

            @Override // X.InterfaceC792690V7r
            public final void onBackground() {
                GraphicsMonitor.isPause = true;
            }
        });
        if (lifecycleService.isForeground()) {
            isPause = false;
        }
        isInit = true;
    }

    public static synchronized boolean isStart() {
        return startTime > 0;
    }

    public static boolean isStartNoLock() {
        return startTime > 0;
    }

    public static synchronized void start() {
        if (isInit) {
            if (!isInitGraphicsLoad) {
                initGraphicsLoad();
            }
            ScheduledExecutorService scheduledExecutorService = gpuScheduleService;
            if (scheduledExecutorService == null) {
                return;
            }
            int i = startTime + 1;
            startTime = i;
            if (i > 1) {
                return;
            }
            ARunnableS92S0000000_13 aRunnableS92S0000000_13 = new ARunnableS92S0000000_13(11);
            long j = sCollectInterval;
            gpuFuture = scheduledExecutorService.scheduleWithFixedDelay(aRunnableS92S0000000_13, j, j, TimeUnit.MILLISECONDS);
        }
    }

    public static synchronized void stop() {
        if (isInit && isStart()) {
            int i = startTime - 1;
            startTime = i;
            if (i > 0) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = gpuFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            gpuLoadDataOnce = -1.0d;
        }
    }

    public static void stopNoLock() {
        if (isInit && isStartNoLock()) {
            int i = startTime - 1;
            startTime = i;
            if (i > 0) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = gpuFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            gpuLoadDataOnce = -1.0d;
        }
    }

    public static double getByteGpuNoLock() {
        return gpuLoadDataOnce;
    }

    public static void registerGraphicsUpdateListener(C0VVJ c0vvj) {
        if (c0vvj != null && !graphicsUpdateListeners.contains(c0vvj)) {
            graphicsUpdateListeners.add(c0vvj);
        }
    }

    public static void unRegisterGraphicsUpdateListener(C0VVJ c0vvj) {
        graphicsUpdateListeners.remove(c0vvj);
    }
}
