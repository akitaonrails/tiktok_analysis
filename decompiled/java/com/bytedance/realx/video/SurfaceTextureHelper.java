package com.bytedance.realx.video;

import X.C1280730jQt;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.SurfaceTextureHelper;
import com.bytedance.realx.video.agfx.RXGPUCacheCtrl;
import com.bytedance.realx.video.memory.NativeRXOpenGLMemory;
import com.bytedance.realx.video.memory.NativeRXVideoFrame;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes21.dex */
public class SurfaceTextureHelper {
    public static float[] TEX_MATRIX = new float[16];
    public boolean capture2DTexture;
    public final EglBase eglBase;
    public boolean enableOutsideControlTextureMemory;
    public boolean enableTextureMemoryReuse;
    public final int frameBufferId;
    public int frameRotation;
    public Object frameSyncObject;
    public final GlRectDrawer glRectDrawer;
    public final Handler handler;
    public boolean hasPendingTexture;
    public boolean isAvaliable;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public long lastBindTimestamp;
    public long lastDeliverTime;
    public VideoSink listener;
    public int maxDeliverTimerInternal;
    public NativeRXOpenGLMemory memory;
    public boolean needTextureScale;
    public int oesTextureId;
    public VideoSink pendingListener;
    public int prevOesTextureId;
    public int prevTextureHeight;
    public int prevTextureWidth;
    public int scaleTextureHeight;
    public int scaleTextureWidth;
    public final Runnable setListenerRunnable;
    public final SurfaceTexture surfaceTexture;
    public int textureHeight;
    public int textureWidth;
    public final Runnable timedDeliverRunnable;
    public final TimestampAligner timestampAligner;
    public final int twoDTextureId;
    public boolean useAgfx;
    public RXVideoFrameHelperInterface videoFrameHelperOpenGL;

    public static SurfaceTextureHelper createWithAGFX(String str, boolean z) {
        return null;
    }

    public static /* synthetic */ void lambda$semisugar$returnTextureFrame$0(SurfaceTextureHelper surfaceTextureHelper) {
        C1C7U.LIZ("SurfaceTextureHelper@5fae.tryDeliverTextureFrame$3L");
        surfaceTextureHelper.returnTextureFrame();
        C1C7U.LIZIZ("SurfaceTextureHelper@5fae.tryDeliverTextureFrame$3L");
    }

    private void bind() {
        if (this.useAgfx) {
            RXGPUCacheCtrl.getInstance().bind();
            this.lastBindTimestamp = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$5() {
        C1C7U.LIZ("SurfaceTextureHelper@5fae.dispose$1L");
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            if (!this.enableTextureMemoryReuse || this.capture2DTexture || this.useAgfx || this.memory == null) {
                release();
            } else {
                Logging.i("SurfaceTextureHelper", "memory.release() in dispose()");
                this.memory.release();
            }
        }
        C1C7U.LIZIZ("SurfaceTextureHelper@5fae.dispose$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$returnTextureFrame$4() {
        C1C7U.LIZ("SurfaceTextureHelper@5fae.returnTextureFrame$1L");
        if (this.useAgfx) {
            this.surfaceTexture.detachFromGLContext();
            this.oesTextureId = 0;
            unbind();
        }
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else if (!this.enableOutsideControlTextureMemory) {
            tryDeliverTextureFrame();
        }
        C1C7U.LIZIZ("SurfaceTextureHelper@5fae.returnTextureFrame$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopListening$1() {
        C1C7U.LIZ("SurfaceTextureHelper@5fae.stopListening$1L");
        this.listener = null;
        this.pendingListener = null;
        C1C7U.LIZIZ("SurfaceTextureHelper@5fae.stopListening$1L");
    }

    private void release() {
        if (this.handler.getLooper().getThread() != C786410Ut5.u3()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        }
        bind();
        int i = this.oesTextureId;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.oesTextureId = 0;
        }
        if (this.capture2DTexture) {
            GLES20.glDeleteTextures(1, new int[]{this.twoDTextureId}, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
            this.glRectDrawer.release();
        }
        this.surfaceTexture.release();
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.release();
        }
        unbind();
        RXVideoFrameHelperInterface rXVideoFrameHelperInterface = this.videoFrameHelperOpenGL;
        if (rXVideoFrameHelperInterface != null) {
            rXVideoFrameHelperInterface.release();
            this.videoFrameHelperOpenGL = null;
        }
        this.handler.getLooper().quit();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestampAligner.dispose();
        }
    }

    private void returnTextureFrame() {
        C786410Ut5.LJJZZIII(this.handler, new Runnable() { // from class: X.0jRH
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$returnTextureFrame$4();
            }
        });
    }

    private void unbind() {
        if (this.useAgfx) {
            RXGPUCacheCtrl.getInstance().unbind();
            if (this.lastBindTimestamp == 0) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.lastBindTimestamp > 1000) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AGFX bind time: ");
                sbLIZ.append(jCurrentTimeMillis - this.lastBindTimestamp);
                Logging.w("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.lastBindTimestamp = 0L;
        }
    }

    public void dispose() {
        Logging.i("SurfaceTextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: X.0jRG
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$dispose$5();
            }
        });
    }

    public float[] getTexMatrix() {
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        return fArr;
    }

    public boolean isAvaliable() {
        boolean z;
        synchronized (this.frameSyncObject) {
            try {
                z = this.isAvaliable;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public void stopListening() {
        Logging.i("SurfaceTextureHelper", "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: X.0jRF
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$stopListening$1();
            }
        });
    }

    public void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() != C786410Ut5.u3()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.isQuitting || !this.hasPendingTexture || this.isTextureInUse || this.listener == null) {
            return;
        }
        if (this.textureWidth == 0 || this.textureHeight == 0) {
            Logging.w("SurfaceTextureHelper", "Texture size has not been set.");
            return;
        }
        if (this.useAgfx) {
            bind();
            int iGenerateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = iGenerateTexture;
            this.surfaceTexture.attachToGLContext(iGenerateTexture);
        }
        this.isTextureInUse = true;
        int i = 0;
        this.hasPendingTexture = false;
        try {
            updateTexImage();
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            long timestamp = this.surfaceTexture.getTimestamp();
            TimestampAligner timestampAligner = this.timestampAligner;
            if (timestampAligner != null) {
                timestamp = timestampAligner.translateTimestamp(timestamp);
            }
            this.lastDeliverTime = System.currentTimeMillis();
            RXVideoScaleFilter rXVideoScaleFilter = RXVideoScaleFilter.kOpenGLOrigin;
            if (this.needTextureScale) {
                rXVideoScaleFilter = RXVideoScaleFilter.kOpenGLBicubic;
            } else {
                this.scaleTextureWidth = this.textureWidth;
                this.scaleTextureHeight = this.textureHeight;
            }
            if (this.capture2DTexture) {
                GLES20.glBindFramebuffer(36160, this.frameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.twoDTextureId, 0);
                if (this.needTextureScale) {
                    GlRectDrawer glRectDrawer = this.glRectDrawer;
                    int i2 = this.oesTextureId;
                    float[] fArr2 = TEX_MATRIX;
                    int i3 = this.textureWidth;
                    int i4 = this.textureHeight;
                    glRectDrawer.drawOes(i2, fArr2, i3, i4, 0, 0, i3, i4, FilterType.Bicubic, this.scaleTextureWidth, this.scaleTextureHeight);
                } else {
                    GlRectDrawer glRectDrawer2 = this.glRectDrawer;
                    int i5 = this.oesTextureId;
                    float[] fArr3 = TEX_MATRIX;
                    int i6 = this.textureWidth;
                    int i7 = this.textureHeight;
                    i = 0;
                    glRectDrawer2.drawOes(i5, fArr3, i6, i7, 0, 0, i6, i7);
                }
                GLES20.glBindFramebuffer(36160, i);
                this.memory = NativeRXOpenGLMemory.createRXOpenGLMemory(this.scaleTextureWidth, this.scaleTextureHeight, this.textureWidth, this.textureHeight, this.twoDTextureId, RXPixelFormat.kTexture2D, fArr, EGL14.eglGetCurrentContext(), rXVideoScaleFilter, RXVideoRotation.fromId(this.frameRotation), new Runnable() { // from class: X.0jRE
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceTextureHelper.lambda$semisugar$returnTextureFrame$0(this.LL);
                    }
                });
            } else if (!this.enableTextureMemoryReuse || this.useAgfx) {
                this.memory = NativeRXOpenGLMemory.createRXOpenGLMemory(this.scaleTextureWidth, this.scaleTextureHeight, this.textureWidth, this.textureHeight, this.oesTextureId, RXPixelFormat.kTextureOES, fArr, EGL14.eglGetCurrentContext(), rXVideoScaleFilter, RXVideoRotation.fromId(this.frameRotation), new Runnable() { // from class: X.0jRE
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceTextureHelper.lambda$semisugar$returnTextureFrame$0(this.LL);
                    }
                });
            } else {
                NativeRXOpenGLMemory nativeRXOpenGLMemory = this.memory;
                if (nativeRXOpenGLMemory == null || this.oesTextureId != this.prevOesTextureId || this.textureWidth != this.prevTextureWidth || this.textureHeight != this.prevTextureHeight) {
                    this.prevOesTextureId = this.oesTextureId;
                    this.prevTextureWidth = this.textureWidth;
                    this.prevTextureHeight = this.textureHeight;
                    if (nativeRXOpenGLMemory != null) {
                        Logging.i("SurfaceTextureHelper", "memory.release() in tryDeliverTextureFrame");
                        this.memory.release();
                    }
                    this.memory = NativeRXOpenGLMemory.createRXOpenGLMemory(this.scaleTextureWidth, this.scaleTextureHeight, this.textureWidth, this.textureHeight, this.oesTextureId, RXPixelFormat.kTextureOES, fArr, EGL14.eglGetCurrentContext(), rXVideoScaleFilter, RXVideoRotation.fromId(this.frameRotation), new Runnable() { // from class: X.0jRE
                        @Override // java.lang.Runnable
                        public final void run() {
                            SurfaceTextureHelper.lambda$semisugar$returnTextureFrame$0(this.LL);
                        }
                    });
                }
            }
            NativeRXVideoFrame nativeRXVideoFrameCreateRXVideoFrame = NativeRXVideoFrame.createRXVideoFrame(this.memory, this.videoFrameHelperOpenGL, timestamp, (ByteBuffer) null, RXColorSpace.kYCbCrBT601LimitedRange);
            this.listener.onFrame(nativeRXVideoFrameCreateRXVideoFrame);
            if (!this.enableTextureMemoryReuse || this.capture2DTexture || this.useAgfx) {
                this.memory.release();
            } else {
                returnTextureFrame();
            }
            nativeRXVideoFrameCreateRXVideoFrame.release();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("SurfaceTextureHelper", " updateTexImage failure", e);
            this.isTextureInUse = false;
            this.hasPendingTexture = true;
        }
    }

    public void updateTexImage() {
        synchronized (EglBase.lock) {
            try {
                this.surfaceTexture.updateTexImage();
            } finally {
            }
        }
        synchronized (this.frameSyncObject) {
            try {
                this.isAvaliable = false;
            } finally {
            }
        }
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public static SurfaceTextureHelper createWithAGFX(String str) {
        return createWithAGFX(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(SurfaceTexture surfaceTexture) {
        if (this.enableOutsideControlTextureMemory) {
            synchronized (this.frameSyncObject) {
                try {
                    this.isAvaliable = true;
                    this.frameSyncObject.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrameRotation$3(int i) {
        C1C7U.LIZ("SurfaceTextureHelper@5fae.setFrameRotation$1L");
        this.frameRotation = i;
        C1C7U.LIZIZ("SurfaceTextureHelper@5fae.setFrameRotation$1L");
    }

    public void setEnableOutsideControlTextureMemory(boolean z) {
        this.enableOutsideControlTextureMemory = z;
    }

    public void setFrameRotation(final int i) {
        C786410Ut5.LJJZZIII(this.handler, new Runnable() { // from class: X.0jRC
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setFrameRotation$3(i);
            }
        });
    }

    public void setMinFps(int i) {
        if (i > 0) {
            this.maxDeliverTimerInternal = (int) (1000.0f / i);
        } else {
            this.maxDeliverTimerInternal = 0;
        }
    }

    public void setTextureMemoryReuse(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableTextureMemReuse is: ");
        sbLIZ.append(z);
        Logging.i("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ));
        this.enableTextureMemoryReuse = z;
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            C786410Ut5.LJJZZIII(this.handler, this.setListenerRunnable);
            if (!this.enableOutsideControlTextureMemory) {
                C786410Ut5.LJJZZIII(this.handler, this.timedDeliverRunnable);
                return;
            }
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public boolean updateTexImageAndWait(int i) {
        synchronized (this.frameSyncObject) {
            while (!this.isAvaliable) {
                try {
                    try {
                        this.frameSyncObject.wait(i);
                        if (!this.isAvaliable) {
                            return false;
                        }
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateTexImage exception: ");
                        sbLIZ.append(e.getMessage());
                        Logging.e("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ));
                        return false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (EglBase.lock) {
                try {
                    this.surfaceTexture.updateTexImage();
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.isAvaliable = false;
            return true;
        }
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTextureSize$2(int i, int i2) {
        C1C7U.LIZ("SurfaceTextureHelper@5fae.setTextureSize$1L");
        this.textureWidth = i;
        this.textureHeight = i2;
        if (this.capture2DTexture) {
            bind();
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.twoDTextureId);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
            unbind();
        }
        C1C7U.LIZIZ("SurfaceTextureHelper@5fae.setTextureSize$1L");
    }

    public void setTextureSize(int i, int i2) {
        setTextureSize(i, i2, false);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, false, false);
    }

    public static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    public void setScaleTextureSize(boolean z, int i, int i2) {
        this.needTextureScale = z;
        this.scaleTextureWidth = i;
        this.scaleTextureHeight = i2;
    }

    public void setTextureSize(final int i, final int i2, boolean z) {
        if (z && i == this.textureWidth && i2 == this.textureHeight) {
            return;
        }
        if (i > 0) {
            if (i2 > 0) {
                this.surfaceTexture.setDefaultBufferSize(i, i2);
                C786410Ut5.LJJZZIII(this.handler, new Runnable() { // from class: X.0jRD
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.LL.lambda$setTextureSize$2(i, i2);
                    }
                });
                return;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Texture height must be positive, but was ");
                sbLIZ.append(i2);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Texture width must be positive, but was ");
        sbLIZ2.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, boolean z2, boolean z3) {
        TimestampAligner timestampAligner;
        this.frameSyncObject = new Object();
        this.isAvaliable = false;
        this.setListenerRunnable = new Runnable() { // from class: com.bytedance.realx.video.SurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("SurfaceTextureHelper@5fae.<field>$1");
                com_bytedance_realx_video_SurfaceTextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("SurfaceTextureHelper@5fae.<field>$1");
            }

            public void com_bytedance_realx_video_SurfaceTextureHelper$2__run$___twin___() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Setting listener to ");
                sbLIZ.append(SurfaceTextureHelper.this.pendingListener);
                Logging.i("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ));
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                surfaceTextureHelper.pendingListener = null;
                if (surfaceTextureHelper.hasPendingTexture) {
                    surfaceTextureHelper.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }

            public static void com_bytedance_realx_video_SurfaceTextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                try {
                    anonymousClass2.com_bytedance_realx_video_SurfaceTextureHelper$2__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.lastDeliverTime = 0L;
        this.maxDeliverTimerInternal = -1;
        this.timedDeliverRunnable = new Runnable() { // from class: com.bytedance.realx.video.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("SurfaceTextureHelper@5fae.<field>$2");
                com_bytedance_realx_video_SurfaceTextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("SurfaceTextureHelper@5fae.<field>$2");
            }

            public void com_bytedance_realx_video_SurfaceTextureHelper$3__run$___twin___() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                if (surfaceTextureHelper.maxDeliverTimerInternal <= 0 || surfaceTextureHelper.handler == null || surfaceTextureHelper.listener == null) {
                    return;
                }
                if (!surfaceTextureHelper.hasPendingTexture) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SurfaceTextureHelper surfaceTextureHelper2 = SurfaceTextureHelper.this;
                    if (jCurrentTimeMillis - surfaceTextureHelper2.lastDeliverTime >= surfaceTextureHelper2.maxDeliverTimerInternal) {
                        surfaceTextureHelper2.hasPendingTexture = true;
                        if (!surfaceTextureHelper2.enableOutsideControlTextureMemory) {
                            surfaceTextureHelper2.tryDeliverTextureFrame();
                        }
                    }
                }
                long j = SurfaceTextureHelper.this.maxDeliverTimerInternal;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                SurfaceTextureHelper surfaceTextureHelper3 = SurfaceTextureHelper.this;
                long j2 = j - (jCurrentTimeMillis2 - surfaceTextureHelper3.lastDeliverTime);
                Handler handler2 = surfaceTextureHelper3.handler;
                if (j2 < 0) {
                    j2 = surfaceTextureHelper3.maxDeliverTimerInternal;
                }
                C786410Ut5.LJLIIL(j2, handler2, this);
            }

            public static void com_bytedance_realx_video_SurfaceTextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                try {
                    anonymousClass3.com_bytedance_realx_video_SurfaceTextureHelper$3__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        if (handler.getLooper().getThread() == C786410Ut5.u3()) {
            if (!z3) {
                this.handler = handler;
                if (z) {
                    timestampAligner = new TimestampAligner();
                } else {
                    timestampAligner = null;
                }
                this.timestampAligner = timestampAligner;
                this.capture2DTexture = z2;
                this.useAgfx = z3;
                EglBase eglBaseLIZJ = C1280730jQt.LIZJ(context, C1280730jQt.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PIXEL_BUFFER));
                this.eglBase = eglBaseLIZJ;
                this.videoFrameHelperOpenGL = RXVideoFrameHelper.createRXVideoFrameHelperOpenGL(eglBaseLIZJ.getEglBaseContext().getEgl14Context());
                try {
                    eglBaseLIZJ.createDummyPbufferSurface();
                    eglBaseLIZJ.makeCurrent();
                    if (z2) {
                        this.glRectDrawer = new GlRectDrawer();
                        int[] iArr = new int[1];
                        GLES20.glGenFramebuffers(1, iArr, 0);
                        this.frameBufferId = iArr[0];
                        Matrix.setIdentityM(TEX_MATRIX, 0);
                        this.twoDTextureId = GlUtil.generateTexture(3553);
                    } else {
                        this.glRectDrawer = null;
                        this.frameBufferId = 0;
                        this.twoDTextureId = 0;
                    }
                    this.oesTextureId = GlUtil.generateTexture(36197);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.oesTextureId);
                    this.surfaceTexture = surfaceTexture;
                    setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: X.0jR4
                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                        public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                            this.LL.lambda$new$0(surfaceTexture2);
                        }
                    }, handler);
                    return;
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.eglBase.release();
                    handler.getLooper().quit();
                    throw e;
                }
            }
            throw new IllegalStateException("non agfx package not support SurfaceTextureHelper with AGFX");
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z, final boolean z2, final boolean z3) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(bPEAHandler, new Callable<SurfaceTextureHelper>() { // from class: com.bytedance.realx.video.SurfaceTextureHelper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, bPEAHandler, z, z2, z3);
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(" create failure");
                    Logging.e("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ), e);
                    return null;
                }
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ SurfaceTextureHelper call() {
                C1C7U.LIZ("SurfaceTextureHelper@5fae.create$1");
                SurfaceTextureHelper surfaceTextureHelperCall = call();
                C1C7U.LIZIZ("SurfaceTextureHelper@5fae.create$1");
                return surfaceTextureHelperCall;
            }
        });
    }
}
