package com.ss.bytertc.base.media;

import X.C1280730jQt;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.TimestampAligner;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.base.media.SurfaceTextureHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes21.dex */
public class SurfaceTextureHelper {
    public static float[] TEX_MATRIX = new float[16];
    public boolean capture2DTexture;
    public final EglBase eglBase;
    public final int frameBufferId;
    public int frameRotation;
    public final GlRectDrawer glRectDrawer;
    public final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public long lastDeliverTime;
    public VideoSink listener;
    public int maxDeliverTimerInternal;
    public final int oesTextureId;
    public VideoSink pendingListener;
    public final Runnable setListenerRunnable;
    public final SurfaceTexture surfaceTexture;
    public int textureHeight;
    public int textureWidth;
    public final Runnable timedDeliverRunnable;
    public final TimestampAligner timestampAligner;
    public final int twoDTextureId;
    public final YuvConverter yuvConverter;

    public static /* synthetic */ void lambda$semisugar$returnTextureFrame$0(SurfaceTextureHelper surfaceTextureHelper) {
        C1C7U.LIZ("SurfaceTextureHelper@d251.tryDeliverTextureFrame$2L");
        surfaceTextureHelper.returnTextureFrame();
        C1C7U.LIZIZ("SurfaceTextureHelper@d251.tryDeliverTextureFrame$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$5() {
        C1C7U.LIZ("SurfaceTextureHelper@d251.dispose$1L");
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            release();
        }
        C1C7U.LIZIZ("SurfaceTextureHelper@d251.dispose$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$returnTextureFrame$4() {
        C1C7U.LIZ("SurfaceTextureHelper@d251.returnTextureFrame$1L");
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
        C1C7U.LIZIZ("SurfaceTextureHelper@d251.returnTextureFrame$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopListening$1() {
        C1C7U.LIZ("SurfaceTextureHelper@d251.stopListening$1L");
        this.listener = null;
        this.pendingListener = null;
        C1C7U.LIZIZ("SurfaceTextureHelper@d251.stopListening$1L");
    }

    private void release() {
        if (this.handler.getLooper().getThread() != C786410Ut5.u3()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        }
        this.yuvConverter.release();
        GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
        if (this.capture2DTexture) {
            GLES20.glDeleteTextures(1, new int[]{this.twoDTextureId}, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
            this.glRectDrawer.release();
        }
        this.surfaceTexture.release();
        this.eglBase.release();
        this.handler.getLooper().quit();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestampAligner.dispose();
        }
    }

    private void returnTextureFrame() {
        C786410Ut5.LJJZZIII(this.handler, new Runnable() { // from class: X.0jQl
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$returnTextureFrame$4();
            }
        });
    }

    public void dispose() {
        Logging.i("SurfaceTextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: X.0jQk
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$dispose$5();
            }
        });
    }

    public void stopListening() {
        Logging.i("SurfaceTextureHelper", "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: X.0jQj
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$stopListening$1();
            }
        });
    }

    public void tryDeliverTextureFrame() {
        TextureBufferImpl textureBufferImpl;
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
        this.isTextureInUse = true;
        this.hasPendingTexture = false;
        updateTexImage();
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        long timestamp = this.surfaceTexture.getTimestamp();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestamp = timestampAligner.translateTimestamp(timestamp);
        }
        this.lastDeliverTime = System.currentTimeMillis();
        if (this.capture2DTexture) {
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.twoDTextureId, 0);
            GlRectDrawer glRectDrawer = this.glRectDrawer;
            int i = this.oesTextureId;
            float[] fArr2 = TEX_MATRIX;
            int i2 = this.textureWidth;
            int i3 = this.textureHeight;
            glRectDrawer.drawOes(i, fArr2, i2, i3, 0, 0, i2, i3);
            GLES20.glBindFramebuffer(36160, 0);
            textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.RGB, this.twoDTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: X.0jQh
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceTextureHelper.lambda$semisugar$returnTextureFrame$0(this.LL);
                }
            });
        } else {
            textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: X.0jQh
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceTextureHelper.lambda$semisugar$returnTextureFrame$0(this.LL);
                }
            });
        }
        VideoFrame videoFrame = new VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
        this.listener.onFrame(videoFrame);
        videoFrame.release();
    }

    public void updateTexImage() {
        synchronized (EglBase.lock) {
            try {
                this.surfaceTexture.updateTexImage();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(SurfaceTexture surfaceTexture) {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrameRotation$3(int i) {
        C1C7U.LIZ("SurfaceTextureHelper@d251.setFrameRotation$1L");
        this.frameRotation = i;
        C1C7U.LIZIZ("SurfaceTextureHelper@d251.setFrameRotation$1L");
    }

    public void setFrameRotation(final int i) {
        C786410Ut5.LJJZZIII(this.handler, new Runnable() { // from class: X.0jQg
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

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            C786410Ut5.LJJZZIII(this.handler, this.setListenerRunnable);
            C786410Ut5.LJJZZIII(this.handler, this.timedDeliverRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTextureSize$2(int i, int i2) {
        C1C7U.LIZ("SurfaceTextureHelper@d251.setTextureSize$1L");
        this.textureWidth = i;
        this.textureHeight = i2;
        if (this.capture2DTexture) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.twoDTextureId);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
        }
        C1C7U.LIZIZ("SurfaceTextureHelper@d251.setTextureSize$1L");
    }

    public void setTextureSize(final int i, final int i2) {
        if (i > 0) {
            if (i2 > 0) {
                this.surfaceTexture.setDefaultBufferSize(i, i2);
                C786410Ut5.LJJZZIII(this.handler, new Runnable() { // from class: X.0jQi
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

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, false);
    }

    public static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    public SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, boolean z2) {
        TimestampAligner timestampAligner;
        this.yuvConverter = new YuvConverter();
        this.capture2DTexture = false;
        this.setListenerRunnable = new Runnable() { // from class: com.ss.bytertc.base.media.SurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("SurfaceTextureHelper@d251.<field>$1");
                com_ss_bytertc_base_media_SurfaceTextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("SurfaceTextureHelper@d251.<field>$1");
            }

            public void com_ss_bytertc_base_media_SurfaceTextureHelper$2__run$___twin___() {
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

            public static void com_ss_bytertc_base_media_SurfaceTextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                try {
                    anonymousClass2.com_ss_bytertc_base_media_SurfaceTextureHelper$2__run$___twin___();
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
        this.timedDeliverRunnable = new Runnable() { // from class: com.ss.bytertc.base.media.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("SurfaceTextureHelper@d251.<field>$2");
                com_ss_bytertc_base_media_SurfaceTextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("SurfaceTextureHelper@d251.<field>$2");
            }

            public void com_ss_bytertc_base_media_SurfaceTextureHelper$3__run$___twin___() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                if (surfaceTextureHelper.maxDeliverTimerInternal <= 0 || surfaceTextureHelper.handler == null || surfaceTextureHelper.listener == null) {
                    return;
                }
                if (!surfaceTextureHelper.hasPendingTexture) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SurfaceTextureHelper surfaceTextureHelper2 = SurfaceTextureHelper.this;
                    if (jCurrentTimeMillis - surfaceTextureHelper2.lastDeliverTime >= surfaceTextureHelper2.maxDeliverTimerInternal) {
                        surfaceTextureHelper2.hasPendingTexture = true;
                        surfaceTextureHelper2.tryDeliverTextureFrame();
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

            public static void com_ss_bytertc_base_media_SurfaceTextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                try {
                    anonymousClass3.com_ss_bytertc_base_media_SurfaceTextureHelper$3__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        if (handler.getLooper().getThread() == C786410Ut5.u3()) {
            this.handler = handler;
            if (z) {
                timestampAligner = new TimestampAligner();
            } else {
                timestampAligner = null;
            }
            this.timestampAligner = timestampAligner;
            this.capture2DTexture = z2;
            EglBase eglBaseLIZJ = C1280730jQt.LIZJ(context, C1280730jQt.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PIXEL_BUFFER));
            this.eglBase = eglBaseLIZJ;
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
                int iGenerateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = iGenerateTexture;
                SurfaceTexture surfaceTexture = new SurfaceTexture(iGenerateTexture);
                this.surfaceTexture = surfaceTexture;
                setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: X.0jQf
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
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z, final boolean z2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(bPEAHandler, new Callable<SurfaceTextureHelper>() { // from class: com.ss.bytertc.base.media.SurfaceTextureHelper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, bPEAHandler, z, z2);
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
                C1C7U.LIZ("SurfaceTextureHelper@d251.create$1");
                SurfaceTextureHelper surfaceTextureHelperCall = call();
                C1C7U.LIZIZ("SurfaceTextureHelper@d251.create$1");
                return surfaceTextureHelperCall;
            }
        });
    }
}
