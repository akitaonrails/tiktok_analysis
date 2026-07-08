package com.ss.bytertc.base.media;

import X.C1280730jQt;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlClearWorkaround;
import com.bytedance.realx.video.GlTextureFrameBuffer;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.bytertc.base.media.EglRenderer;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class EglRenderer implements VideoSink {
    public static GlClearWorkaround.WORKAROUND_STATUS enableGLWorkaround = GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown;
    public RendererCommon.GlDrawer drawer;
    public EglBase eglBase;
    public int framesDropped;
    public int framesReceived;
    public int framesRendered;
    public float layoutAspectRatio;
    public long minRenderPeriodNs;
    public boolean mirrorHorizontally;
    public boolean mirrorVertically;
    public final String name;
    public long nextFrameTimeNs;
    public VideoFrame pendingFrame;
    public long renderSwapBufferTimeNs;
    public Handler renderThreadHandler;
    public long renderTimeNs;
    public long statisticsStartTimeNs;
    public boolean usePresentationTimeStamp;
    public final GlClearWorkaround glClearWorkaround = new GlClearWorkaround();
    public final Object handlerLock = new Object();
    public final ArrayList<FrameListenerAndParams> frameListeners = new ArrayList<>();
    public final ArrayList<FirstVideoFrameRenderListener> firstVideoFrameListeners = new ArrayList<>();
    public final Object fpsReductionLock = new Object();
    public final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    public final Matrix drawMatrix = new Matrix();
    public final Object frameLock = new Object();
    public final Object firstRenderLock = new Object();
    public final Object layoutLock = new Object();
    public final Object statisticsLock = new Object();
    public final GlTextureFrameBuffer bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
    public volatile RendererCommon.ScalingType renderModel = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
    public final Runnable logStatisticsRunnable = new Runnable() { // from class: com.ss.bytertc.base.media.EglRenderer.1
        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("EglRenderer@422.<field>$2");
            com_ss_bytertc_base_media_EglRenderer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("EglRenderer@422.<field>$2");
        }

        public void com_ss_bytertc_base_media_EglRenderer$1__run$___twin___() {
            EglRenderer.this.logStatistics();
            synchronized (EglRenderer.this.handlerLock) {
                try {
                    EglRenderer eglRenderer = EglRenderer.this;
                    Handler handler = eglRenderer.renderThreadHandler;
                    if (handler != null) {
                        handler.removeCallbacks(eglRenderer.logStatisticsRunnable);
                        EglRenderer eglRenderer2 = EglRenderer.this;
                        C786410Ut5.LJLIIL(TimeUnit.SECONDS.toMillis(4L), eglRenderer2.renderThreadHandler, eglRenderer2.logStatisticsRunnable);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public static void com_ss_bytertc_base_media_EglRenderer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            try {
                anonymousClass1.com_ss_bytertc_base_media_EglRenderer$1__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    };
    public final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();
    public boolean haveRenderFirstVideoFrame = false;

    public interface FirstVideoFrameRenderListener {
        void onFirstVideoFrameRender();
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public static /* synthetic */ void lambda$semisugar$renderFrameOnRenderThread$0(EglRenderer eglRenderer) {
        C1C7U.LIZ("EglRenderer@422.onFrame$1L");
        eglRenderer.renderFrameOnRenderThread();
        C1C7U.LIZIZ("EglRenderer@422.onFrame$1L");
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    /* JADX INFO: renamed from: com.ss.bytertc.base.media.EglRenderer$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[RendererCommon.ScalingType.values().length];
            $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType = iArr;
            try {
                iArr[RendererCommon.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[RendererCommon.ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[RendererCommon.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    private void notifyFristRenderCallback() {
        synchronized (this.firstRenderLock) {
            try {
                Iterator<FirstVideoFrameRenderListener> it2 = this.firstVideoFrameListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().onFirstVideoFrameRender();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void renderFrameOnRenderThread() {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.base.media.EglRenderer.renderFrameOnRenderThread():void");
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long jNanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            try {
                long j = jNanoTime - this.statisticsStartTimeNs;
                if (j <= 0) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Duration: ");
                sbLIZ.append(TimeUnit.NANOSECONDS.toMillis(j));
                sbLIZ.append(" ms. Frames received: ");
                sbLIZ.append(this.framesReceived);
                sbLIZ.append(". Dropped: ");
                sbLIZ.append(this.framesDropped);
                sbLIZ.append(". Rendered: ");
                sbLIZ.append(this.framesRendered);
                sbLIZ.append(". Render fps: ");
                sbLIZ.append(decimalFormat.format((((long) this.framesRendered) * TimeUnit.SECONDS.toNanos(1L)) / j));
                sbLIZ.append(". Average render time: ");
                sbLIZ.append(averageTimeAsString(this.renderTimeNs, this.framesRendered));
                sbLIZ.append(". Average swapBuffer time: ");
                sbLIZ.append(averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered));
                sbLIZ.append(e3.d);
                logD(C2188811AlT.LIZIZ(sbLIZ));
                resetStatistics(jNanoTime);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void printStackTrace() {
        Thread thread;
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null && (thread = handler.getLooper().getThread()) != null) {
                    StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(thread);
                    if (stackTrace.length > 0) {
                        logW("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logW(stackTraceElement.toString());
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void release() {
        logD("Releasing.");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    logD("Already released");
                    return;
                }
                handler.removeCallbacks(this.logStatisticsRunnable);
                C786410Ut5.LJL(this.renderThreadHandler, new Runnable() { // from class: X.0jR5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.LL.lambda$release$1(countDownLatch);
                    }
                });
                final Looper looper = this.renderThreadHandler.getLooper();
                C786410Ut5.LJJZZIII(this.renderThreadHandler, new Runnable() { // from class: X.0jR6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.LL.lambda$release$2(looper);
                    }
                });
                this.renderThreadHandler = null;
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame = this.pendingFrame;
                        if (videoFrame != null) {
                            videoFrame.release();
                            this.pendingFrame = null;
                        }
                    } finally {
                    }
                }
                logD("Releasing done.");
            } finally {
            }
        }
    }

    public class EglSurfaceCreation implements Runnable {
        public Object surface;

        public synchronized void com_ss_bytertc_base_media_EglRenderer$EglSurfaceCreation__run$___twin___() {
            EglBase eglBase;
            if (this.surface != null && (eglBase = EglRenderer.this.eglBase) != null && !eglBase.hasSurface()) {
                Object obj = this.surface;
                if (obj instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) obj);
                } else {
                    if (!(obj instanceof SurfaceTexture)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid surface: ");
                        sbLIZ.append(this.surface);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) obj);
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            C1C7U.LIZ("EglRenderer$EglSurfaceCreation@ea9e.run");
            com_ss_bytertc_base_media_EglRenderer$EglSurfaceCreation_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("EglRenderer$EglSurfaceCreation@ea9e.run");
        }

        public EglSurfaceCreation() {
        }

        public static void com_ss_bytertc_base_media_EglRenderer$EglSurfaceCreation_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(EglSurfaceCreation eglSurfaceCreation) {
            try {
                eglSurfaceCreation.com_ss_bytertc_base_media_EglRenderer$EglSurfaceCreation__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    public static class HandlerWithExceptionCallback extends BPEAHandler {
        public final Runnable exceptionCallback;

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public void dispatchMessage(Message message) throws Exception {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Logging.e("EglRenderer", "Exception on EglRenderer thread", e);
                this.exceptionCallback.run();
                throw e;
            }
        }

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }
    }

    public EglRenderer(String str) {
        this.name = str;
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1(CountDownLatch countDownLatch) {
        C1C7U.LIZ("EglRenderer@422.release$1L");
        this.glClearWorkaround.release();
        GLES20.glUseProgram(0);
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        synchronized (this.firstRenderLock) {
            try {
                this.firstVideoFrameListeners.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        countDownLatch.countDown();
        C1C7U.LIZIZ("EglRenderer@422.release$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(Looper looper) {
        C1C7U.LIZ("EglRenderer@422.release$2L");
        logD("Quitting render thread.");
        looper.quit();
        C1C7U.LIZIZ("EglRenderer@422.release$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseEglSurface$5(Runnable runnable) {
        C1C7U.LIZ("EglRenderer@422.releaseEglSurface$1L");
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
        C1C7U.LIZIZ("EglRenderer@422.releaseEglSurface$1L");
    }

    private void logD(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.name);
        sbLIZ.append(str);
        Logging.i("EglRenderer", C2188811AlT.LIZIZ(sbLIZ));
    }

    private void logW(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.name);
        sbLIZ.append(str);
        Logging.w("EglRenderer", C2188811AlT.LIZIZ(sbLIZ));
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    C786410Ut5.LJJZZIII(handler, runnable);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            try {
                this.statisticsStartTimeNs = j;
                this.framesReceived = 0;
                this.framesDropped = 0;
                this.framesRendered = 0;
                this.renderTimeNs = 0L;
                this.renderSwapBufferTimeNs = 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void addFristFrameListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        synchronized (this.firstRenderLock) {
            try {
                this.firstVideoFrameListeners.add(firstVideoFrameRenderListener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    @Override // com.ss.bytertc.base.media.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        synchronized (this.statisticsLock) {
            try {
                this.framesReceived++;
            } finally {
            }
        }
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Dropping frame - Not initialized or already released.");
                    return;
                }
                synchronized (this.frameLock) {
                    VideoFrame videoFrame2 = this.pendingFrame;
                    if (videoFrame2 != null) {
                        z = true;
                        videoFrame2.release();
                    } else {
                        z = false;
                    }
                    this.pendingFrame = videoFrame;
                    videoFrame.retain();
                    C786410Ut5.LJJZZIII(this.renderThreadHandler, new Runnable() { // from class: X.0jRK
                        @Override // java.lang.Runnable
                        public final void run() {
                            EglRenderer.lambda$semisugar$renderFrameOnRenderThread$0(this.LL);
                        }
                    });
                }
                if (z) {
                    synchronized (this.statisticsLock) {
                        try {
                            this.framesDropped++;
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
    }

    public void releaseEglSurface(final Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                    C786410Ut5.LJL(this.renderThreadHandler, new Runnable() { // from class: X.0jRJ
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.LL.lambda$releaseEglSurface$5(runnable);
                        }
                    });
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void removeFrameListener(final FrameListener frameListener) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    return;
                }
                if (C786410Ut5.u3() != this.renderThreadHandler.getLooper().getThread()) {
                    postToRenderThread(new Runnable() { // from class: X.0jQy
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.LL.lambda$removeFrameListener$4(countDownLatch, frameListener);
                        }
                    });
                    ThreadUtils.awaitUninterruptibly(countDownLatch);
                    return;
                }
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setFpsReduction(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setFpsReduction: ");
        sbLIZ.append(f);
        logD(C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.fpsReductionLock) {
            try {
                long j = this.minRenderPeriodNs;
                if (f <= 0.0f) {
                    this.minRenderPeriodNs = Long.MAX_VALUE;
                } else {
                    this.minRenderPeriodNs = (long) (TimeUnit.SECONDS.toNanos(1L) / f);
                }
                if (this.minRenderPeriodNs != j) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setLayoutAspectRatio(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLayoutAspectRatio: ");
        sbLIZ.append(f);
        logD(C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.layoutLock) {
            try {
                this.layoutAspectRatio = f;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setMirror(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMirrorHorizontally: ");
        sbLIZ.append(z);
        logD(C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.layoutLock) {
            try {
                this.mirrorHorizontally = z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setMirrorVertically(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMirrorVertically: ");
        sbLIZ.append(z);
        logD(C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.layoutLock) {
            try {
                this.mirrorVertically = z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setRenderModel(RendererCommon.ScalingType scalingType) {
        this.renderModel = scalingType;
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(TimeUnit.NANOSECONDS.toMicros(j / ((long) i)));
        sbLIZ.append(" us");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(EglBase.Context context, int[] iArr) {
        C1C7U.LIZ("EglRenderer@422.init$1L");
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = C1280730jQt.LJ(iArr);
        } else {
            logD("EglBase.create shared context");
            this.eglBase = C1280730jQt.LIZJ(context, iArr);
        }
        this.glClearWorkaround.init();
        C1C7U.LIZIZ("EglRenderer@422.init$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeFrameListener$4(CountDownLatch countDownLatch, FrameListener frameListener) {
        C1C7U.LIZ("EglRenderer@422.removeFrameListener$1L");
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it2 = this.frameListeners.iterator();
        while (it2.hasNext()) {
            if (it2.next().listener == frameListener) {
                it2.remove();
            }
        }
        C1C7U.LIZIZ("EglRenderer@422.removeFrameListener$1L");
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        float f;
        float f2;
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        Matrix matrix = this.drawMatrix;
        if (this.mirrorHorizontally) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        if (this.mirrorVertically) {
            f2 = -1.0f;
        } else {
            f2 = 1.0f;
        }
        matrix.preScale(f, f2);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it2 = this.frameListeners.iterator();
        while (it2.hasNext()) {
            FrameListenerAndParams next = it2.next();
            if (z || !next.applyFpsReduction) {
                it2.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                if (rotatedWidth != 0 && rotatedHeight != 0) {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    glClear(rotatedWidth, rotatedHeight, 16384, 0.0f, 0.0f, 0.0f, 0.0f);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, byteBufferAllocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                    next.listener.onFrame(bitmapCreateBitmap);
                } else {
                    next.listener.onFrame(null);
                }
            }
        }
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    private void clearSurfaceOnRenderThread(float f, float f2, float f3, float f4) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            logD("clearSurface");
            glClear(this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), 16384, f, f2, f3, f4);
            this.eglBase.swapBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addFrameListener$3(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        C1C7U.LIZ("EglRenderer@422.addFrameListener$1L");
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
        C1C7U.LIZIZ("EglRenderer@422.addFrameListener$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearImage$6(float f, float f2, float f3, float f4) {
        C1C7U.LIZ("EglRenderer@422.clearImage$1L");
        clearSurfaceOnRenderThread(f, f2, f3, f4);
        C1C7U.LIZIZ("EglRenderer@422.clearImage$1L");
    }

    public void addFrameListener(final FrameListener frameListener, final float f, final RendererCommon.GlDrawer glDrawer, final boolean z) {
        postToRenderThread(new Runnable() { // from class: X.0jQv
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$addFrameListener$3(glDrawer, frameListener, f, z);
            }
        });
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    return;
                }
                C786410Ut5.LJL(handler, new Runnable() { // from class: X.0jR7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.LL.lambda$clearImage$6(f, f2, f3, f4);
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void init(final EglBase.Context context, final int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Initializing EglRenderer");
                    this.drawer = glDrawer;
                    this.usePresentationTimeStamp = z;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.name);
                    sbLIZ.append("EglRenderer");
                    HandlerThread handlerThread = new HandlerThread(C2188811AlT.LIZIZ(sbLIZ));
                    handlerThread.start();
                    HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(C786410Ut5.W2(handlerThread), new Runnable() { // from class: com.ss.bytertc.base.media.EglRenderer.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C1C7U.LIZ("EglRenderer@422.init$1");
                            com_ss_bytertc_base_media_EglRenderer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            C1C7U.LIZIZ("EglRenderer@422.init$1");
                        }

                        public void com_ss_bytertc_base_media_EglRenderer$2__run$___twin___() {
                            synchronized (EglRenderer.this.handlerLock) {
                                try {
                                    EglRenderer.this.renderThreadHandler = null;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }

                        public static void com_ss_bytertc_base_media_EglRenderer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                            try {
                                anonymousClass2.com_ss_bytertc_base_media_EglRenderer$2__run$___twin___();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (!C2179971ATj.LIZ(th)) {
                                    throw th;
                                }
                            }
                        }
                    });
                    this.renderThreadHandler = handlerWithExceptionCallback;
                    ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallback, new Runnable() { // from class: X.0jQz
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.LL.lambda$init$0(context, iArr);
                        }
                    });
                    C786410Ut5.LJJZZIII(this.renderThreadHandler, this.eglSurfaceCreationRunnable);
                    resetStatistics(System.nanoTime());
                    C786410Ut5.LJLIIL(TimeUnit.SECONDS.toMillis(4L), this.renderThreadHandler, this.logStatisticsRunnable);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.name);
                    sbLIZ2.append("Already initialized");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void glClear(int i, int i2, int i3, float f, float f2, float f3, float f4) {
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown) {
            enableGLWorkaround = GlClearWorkaround.isNeedWorkaround();
        }
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusEnable) {
            this.glClearWorkaround.clear(i, i2, i3, f, f2, f3, f4, 1.0f, 8);
        } else {
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(16384);
        }
    }
}
