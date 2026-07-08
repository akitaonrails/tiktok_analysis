package com.ss.android.ugc.aweme.memory.profiler.util;

import X.C1C7U;
import X.C2179971ATj;
import X.C2187701Ajg;
import X.C786410Ut5;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public final class ProfilerFpsMonitor {
    public static int drawCount;
    public static Window.OnFrameMetricsAvailableListener metricsListener;
    public static Function2<? super Integer, ? super Integer, Unit> onChanged;
    public static volatile boolean running;
    public static int vsyncCount;
    public static boolean vsyncStarted;
    public static ViewTreeObserver vto;
    public static Window windowRef;
    public static final ProfilerFpsMonitor INSTANCE = new ProfilerFpsMonitor();
    public static boolean listenDraw = true;
    public static boolean listenVsync = true;
    public static long intervalMs = 1000;
    public static final Handler mainHandler = new BPEAHandler(Looper.getMainLooper());
    public static final ProfilerFpsMonitor$reportRunnable$1 reportRunnable = new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.util.ProfilerFpsMonitor$reportRunnable$1
        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("ProfilerFpsMonitor@4bd0.reportRunnable$1");
            com_ss_android_ugc_aweme_memory_profiler_util_ProfilerFpsMonitor$reportRunnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("ProfilerFpsMonitor@4bd0.reportRunnable$1");
        }

        public void com_ss_android_ugc_aweme_memory_profiler_util_ProfilerFpsMonitor$reportRunnable$1__run$___twin___() {
            if (ProfilerFpsMonitor.running) {
                Integer numValueOf = ProfilerFpsMonitor.listenVsync ? Integer.valueOf(ProfilerFpsMonitor.vsyncCount) : null;
                Integer numValueOf2 = ProfilerFpsMonitor.listenDraw ? Integer.valueOf(ProfilerFpsMonitor.drawCount) : null;
                try {
                    Function2<? super Integer, ? super Integer, Unit> function2 = ProfilerFpsMonitor.onChanged;
                    if (function2 != null) {
                        function2.invoke(numValueOf, numValueOf2);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                ProfilerFpsMonitor.vsyncCount = 0;
                ProfilerFpsMonitor.drawCount = 0;
                Handler handler = ProfilerFpsMonitor.mainHandler;
                long j = ProfilerFpsMonitor.intervalMs;
                if (j < 1000) {
                    j = 1000;
                }
                C786410Ut5.LJLIIL(j, handler, this);
            }
        }

        public static void com_ss_android_ugc_aweme_memory_profiler_util_ProfilerFpsMonitor$reportRunnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ProfilerFpsMonitor$reportRunnable$1 profilerFpsMonitor$reportRunnable$1) {
            try {
                profilerFpsMonitor$reportRunnable$1.com_ss_android_ugc_aweme_memory_profiler_util_ProfilerFpsMonitor$reportRunnable$1__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    };
    public static final ViewTreeObserver.OnDrawListener drawListener = new ViewTreeObserver.OnDrawListener() { // from class: com.ss.android.ugc.aweme.memory.profiler.util.ProfilerFpsMonitor$drawListener$1
        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            ProfilerFpsMonitor.drawCount++;
        }
    };
    public static final Choreographer.FrameCallback vsyncCallback = new Choreographer.FrameCallback() { // from class: com.ss.android.ugc.aweme.memory.profiler.util.ProfilerFpsMonitor$vsyncCallback$1
        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            Choreographer choreographerV2 = C786410Ut5.v2();
            choreographerV2.removeFrameCallback(this);
            choreographerV2.postFrameCallback(this);
            ProfilerFpsMonitor.vsyncCount++;
        }
    };
    public static final int $stable = 8;

    public final void stop() {
        try {
            ViewTreeObserver viewTreeObserver = vto;
            if (viewTreeObserver != null) {
                ViewTreeObserver.OnDrawListener onDrawListener = drawListener;
                viewTreeObserver.removeOnDrawListener(onDrawListener);
                C2187701Ajg.LIZIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            Window window = windowRef;
            if (metricsListener != null && window != null && Build.VERSION.SDK_INT >= 24) {
                window.removeOnFrameMetricsAvailableListener(metricsListener);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        vto = null;
        windowRef = null;
        metricsListener = null;
        onChanged = null;
        drawCount = 0;
        vsyncCount = 0;
        listenDraw = true;
        listenVsync = true;
        vsyncStarted = false;
        try {
            C786410Ut5.v2().removeFrameCallback(vsyncCallback);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        running = false;
        mainHandler.removeCallbacks(reportRunnable);
    }

    private final void startFrameMetrics(Window window) {
        if (window != null) {
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            AnonymousClass1 anonymousClass1 = new Window.OnFrameMetricsAvailableListener() { // from class: com.ss.android.ugc.aweme.memory.profiler.util.ProfilerFpsMonitor.startFrameMetrics.1
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                    ProfilerFpsMonitor.drawCount++;
                }
            };
            metricsListener = anonymousClass1;
            if (anonymousClass1 != null) {
                window.addOnFrameMetricsAvailableListener(anonymousClass1, bPEAHandler);
                return;
            }
            return;
        }
        throw new IllegalStateException("window null");
    }

    public final void start(Activity activity, Function2<? super Integer, ? super Integer, Unit> function2, boolean z, boolean z2, long j) {
        View decorView;
        onChanged = function2;
        listenVsync = z;
        listenDraw = z2;
        intervalMs = j;
        windowRef = activity.getWindow();
        if (z2) {
            if (Build.VERSION.SDK_INT >= 24) {
                startFrameMetrics(windowRef);
            } else {
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = null;
                if (window != null && (decorView = window.getDecorView()) != null) {
                    viewTreeObserver = decorView.getViewTreeObserver();
                }
                vto = viewTreeObserver;
                ViewTreeObserver viewTreeObserver2 = vto;
                if (viewTreeObserver2 != null) {
                    ViewTreeObserver.OnDrawListener onDrawListener = drawListener;
                    viewTreeObserver2.addOnDrawListener(onDrawListener);
                    C2187701Ajg.LIZ(viewTreeObserver2, onDrawListener, ViewTreeObserver.OnDrawListener.class);
                }
            }
        }
        if (z && !vsyncStarted) {
            vsyncStarted = true;
            C786410Ut5.v2().postFrameCallback(vsyncCallback);
        }
        running = true;
        Handler handler = mainHandler;
        ProfilerFpsMonitor$reportRunnable$1 profilerFpsMonitor$reportRunnable$1 = reportRunnable;
        if (j < 1000) {
            j = 1000;
        }
        C786410Ut5.LJLIIL(j, handler, profilerFpsMonitor$reportRunnable$1);
    }
}
