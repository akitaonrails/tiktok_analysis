package com.ss.bytertc.engine.ui;

import X.C1280730jQt;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.base.media.EglRenderer;
import com.ss.bytertc.engine.adapter.VideoFrameConverter;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.mediaio.CountDownLatchI420Buffer;
import com.ss.bytertc.engine.mediaio.SurfaceEglRender;
import com.ss.bytertc.engine.mediaio.TextureEglRenderer;
import com.ss.bytertc.engine.ui.VideoFrameRender;
import com.ss.bytertc.engine.utils.ByteBufferUtils;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.converter.WebRTCConverter;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.lyrax.video.LyraxVideoFrameType;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrameRender implements View.OnLayoutChangeListener, RendererCommon.RendererEvents, EglRenderer.FirstVideoFrameRenderListener {
    public boolean enableFixedSize;
    public volatile EglRenderer mEglRenderer;
    public boolean mHasReceivedFirstFrame;
    public long mReceiveFirstTimeStampMs;
    public final String mRenderName;
    public volatile Surface mSurface;
    public volatile SurfaceView mSurfaceView;
    public Looper mTextureProcessLooper;
    public volatile TextureView mTextureView;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;
    public int surfaceHeight;
    public int surfaceWidth;
    public final AtomicBoolean mHasInitAtomic = new AtomicBoolean(false);
    public final AtomicBoolean mHasRenderViewAtomic = new AtomicBoolean(false);
    public final AtomicBoolean mEglSurfaceCreatedAtomic = new AtomicBoolean(false);
    public final Object mRenderLock = new Object();
    public final Object mTextureProcessLock = new Object();
    public final Object mFirstFrameListenerLock = new Object();
    public final ArrayList<FirstVideoFrameRenderListener> mFirstVideoFrameListeners = new ArrayList<>();
    public final VideoFrameConverter frameConverter = new VideoFrameConverter(true);
    public final SurfaceLifecycleCallback mSurfaceLifecycleCallbackCallback = new SurfaceLifecycleCallback() { // from class: com.ss.bytertc.engine.ui.VideoFrameRender.1
        @Override // com.ss.bytertc.engine.ui.VideoFrameRender.SurfaceLifecycleCallback
        public void onCreated() {
            if (VideoFrameRender.this.mEglSurfaceCreatedAtomic.compareAndSet(false, true)) {
                return;
            }
            LogUtil.e("VideoFrameRender", "Already has an another surface created.");
        }

        @Override // com.ss.bytertc.engine.ui.VideoFrameRender.SurfaceLifecycleCallback
        public void onDestroy() {
            if (!VideoFrameRender.this.mHasInitAtomic.get()) {
                VideoFrameRender.this.mEglSurfaceCreatedAtomic.set(false);
            } else {
                if (VideoFrameRender.this.mEglSurfaceCreatedAtomic.compareAndSet(true, false)) {
                    return;
                }
                LogUtil.e("VideoFrameRender", "Already has an another surface destroyed.");
            }
        }
    };

    public interface FirstVideoFrameRenderListener {
        void onFirstVideoFrameRender(int i);
    }

    public interface SurfaceLifecycleCallback {
        void onCreated();

        void onDestroy();
    }

    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
    }

    private void initSurfaceView() {
        if (this.mSurfaceView == null || !this.mHasInitAtomic.get()) {
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer instanceof SurfaceEglRender) {
                    ((SurfaceEglRender) this.mEglRenderer).bind(this.mSurfaceView);
                    this.mSurfaceView.addOnLayoutChangeListener(this);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void initTextureView() {
        if (this.mTextureView == null || this.mEglRenderer == null || !this.mHasInitAtomic.get()) {
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer instanceof TextureEglRenderer) {
                    TextureEglRenderer textureEglRenderer = (TextureEglRenderer) this.mEglRenderer;
                    textureEglRenderer.bind(this.mTextureView, this.mSurfaceLifecycleCallbackCallback);
                    if (this.mTextureView.isShown()) {
                        textureEglRenderer.setLayoutAspectRatio(this.mTextureView.getMeasuredWidth() / this.mTextureView.getMeasuredHeight());
                    }
                    this.mTextureView.addOnLayoutChangeListener(this);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static /* synthetic */ void lambda$renderTextureFrame$2() {
        C1C7U.LIZ("VideoFrameRender@e12c.renderTextureFrame$1L");
        C1C7U.LIZIZ("VideoFrameRender@e12c.renderTextureFrame$1L");
    }

    private void notifyFristRenderCallback() {
        synchronized (this.mFirstFrameListenerLock) {
            try {
                if (this.mFirstVideoFrameListeners.isEmpty()) {
                    return;
                }
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.mReceiveFirstTimeStampMs);
                Iterator<FirstVideoFrameRenderListener> it2 = this.mFirstVideoFrameListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().onFirstVideoFrameRender(iCurrentTimeMillis);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void disableFpsReduction() {
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.disableFpsReduction();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void onDispose() {
        if (!this.mHasInitAtomic.compareAndSet(true, false)) {
            throw new IllegalStateException("Try to dispose an not initialized VideoFrameRender");
        }
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.release();
                    this.mEglRenderer.createEglSurface((Surface) null);
                }
                if (this.mSurfaceView != null) {
                    this.mSurfaceView.removeOnLayoutChangeListener(this);
                } else if (this.mTextureView != null) {
                    this.mTextureView.setSurfaceTextureListener(null);
                    this.mTextureView.removeOnLayoutChangeListener(this);
                }
                this.mEglSurfaceCreatedAtomic.set(false);
            } finally {
            }
        }
        synchronized (this.mFirstFrameListenerLock) {
            try {
                this.mFirstVideoFrameListeners.clear();
            } finally {
            }
        }
    }

    public void onStart() {
        if (this.mHasRenderViewAtomic.get() && this.mHasInitAtomic.get()) {
            if (this.mTextureView != null) {
                initTextureView();
            } else if (this.mSurfaceView != null) {
                initSurfaceView();
            }
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || this.mSurfaceView.getWidth() == 0 || this.mSurfaceView.getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            this.mSurfaceView.getHolder().setSizeFromLayout();
            return;
        }
        float width = this.mSurfaceView.getWidth() / this.mSurfaceView.getHeight();
        int i = this.rotatedFrameWidth;
        int i2 = this.rotatedFrameHeight;
        if (i / i2 > width) {
            i = (int) (i2 * width);
        } else {
            i2 = (int) (i / width);
        }
        int iMin = Math.min(this.mSurfaceView.getWidth(), i);
        int iMin2 = Math.min(this.mSurfaceView.getHeight(), i2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSurfaceSize. Layout size: ");
        sbLIZ.append(this.mSurfaceView.getWidth());
        sbLIZ.append("x");
        sbLIZ.append(this.mSurfaceView.getHeight());
        sbLIZ.append(", frame size: ");
        sbLIZ.append(this.rotatedFrameWidth);
        sbLIZ.append("x");
        sbLIZ.append(this.rotatedFrameHeight);
        sbLIZ.append(", requested surface size: ");
        sbLIZ.append(iMin);
        sbLIZ.append("x");
        sbLIZ.append(iMin2);
        sbLIZ.append(", old surface size: ");
        sbLIZ.append(this.surfaceWidth);
        sbLIZ.append("x");
        sbLIZ.append(this.surfaceHeight);
        LogUtil.d("VideoFrameRender", C2188811AlT.LIZIZ(sbLIZ));
        if (iMin == this.surfaceWidth && iMin2 == this.surfaceHeight) {
            return;
        }
        this.surfaceWidth = iMin;
        this.surfaceHeight = iMin2;
        this.mSurfaceView.getHolder().setFixedSize(iMin, iMin2);
    }

    @Override // com.ss.bytertc.base.media.EglRenderer.FirstVideoFrameRenderListener
    public void onFirstVideoFrameRender() {
        notifyFristRenderCallback();
    }

    public void release() {
        onDispose();
    }

    public VideoFrameRender(String str) {
        this.mRenderName = str;
    }

    private void onVideoFrame(VideoFrame videoFrame) {
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglSurfaceCreatedAtomic.get() && this.mEglRenderer != null) {
                    if (!this.mHasReceivedFirstFrame) {
                        this.mReceiveFirstTimeStampMs = System.currentTimeMillis();
                        this.mHasReceivedFirstFrame = true;
                    }
                    this.mEglRenderer.onFrame(videoFrame);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void postOrRun(Runnable runnable) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            runnable.run();
        }
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), runnable);
        }
    }

    public void consumeVideoFrame(com.ss.bytertc.engine.video.VideoFrame videoFrame) {
        VideoFrame videoFrameConvertByteRGBAFrame2WebrtcI420Frame;
        if (videoFrame.getFrameType() == VideoFrameType.GL_TEXTURE) {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteTexFrame2WebrtcTexFrame(videoFrame, this.mTextureProcessLooper);
        } else if (videoFrame.getPixelFormat() == VideoPixelFormat.I420) {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteI420Frame2WebrtcI420Frame(videoFrame);
        } else if (videoFrame.getPixelFormat() != VideoPixelFormat.RGBA) {
            return;
        } else {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteRGBAFrame2WebrtcI420Frame(videoFrame);
        }
        if (videoFrameConvertByteRGBAFrame2WebrtcI420Frame != null) {
            onVideoFrame(videoFrameConvertByteRGBAFrame2WebrtcI420Frame);
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame.release();
        }
    }

    public void init(final EglBase.Context context) {
        if (this.mHasInitAtomic.compareAndSet(false, true)) {
            synchronized (this.mRenderLock) {
                try {
                    if (this.mSurfaceView == null && this.mSurface == null && this.mTextureView == null && this.mEglRenderer == null) {
                        return;
                    }
                    this.rotatedFrameWidth = 0;
                    this.rotatedFrameHeight = 0;
                    final int[] iArrLJIIJ = C1280730jQt.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PLAIN);
                    if (this.mEglRenderer instanceof SurfaceEglRender) {
                        ThreadUtils.invokeAtFrontUninterruptibly(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0jQ4
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.LL.lambda$init$0(context, iArrLJIIJ);
                            }
                        });
                    } else {
                        this.mEglRenderer.init(context, iArrLJIIJ, new GlRectDrawer());
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        throw new IllegalStateException("Already initialized");
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        if (this.mSurfaceView != null) {
            updateSurfaceSize();
        }
    }

    public void setFpsReduction(float f) {
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setFpsReduction(f);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setFristVideoFrameRenderListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        synchronized (this.mFirstFrameListenerLock) {
            try {
                this.mFirstVideoFrameListeners.add(firstVideoFrameRenderListener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setMirror(boolean z) {
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setMirror(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setProcessTextureLopper(Looper looper) {
        synchronized (this.mTextureProcessLock) {
            try {
                this.mTextureProcessLooper = looper;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setRenderView(Surface surface) {
        if (!this.mEglSurfaceCreatedAtomic.get() && surface != null && this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            synchronized (this.mRenderLock) {
                try {
                    this.mSurface = surface;
                    new EglRenderer(this.mRenderName).createEglSurface(surface);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.mEglSurfaceCreatedAtomic.compareAndSet(false, true);
        }
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setRenderModel(scalingType);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void consumeVideoFrame(LyraxVideoFrame lyraxVideoFrame) {
        VideoFrame videoFrameConvertByteRGBAFrame2WebrtcI420Frame;
        if (lyraxVideoFrame.getFrameType() == LyraxVideoFrameType.GL_TEXTURE) {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteTexFrame2WebrtcTexFrame(lyraxVideoFrame, this.mTextureProcessLooper);
        } else if (lyraxVideoFrame.getPixelFormat() == LyraxVideoPixelFormat.I420) {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteI420Frame2WebrtcI420Frame(lyraxVideoFrame);
        } else if (lyraxVideoFrame.getPixelFormat() != LyraxVideoPixelFormat.RGBA) {
            return;
        } else {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteRGBAFrame2WebrtcI420Frame(lyraxVideoFrame);
        }
        if (videoFrameConvertByteRGBAFrame2WebrtcI420Frame != null) {
            onVideoFrame(videoFrameConvertByteRGBAFrame2WebrtcI420Frame);
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(EglBase.Context context, int[] iArr) {
        C1C7U.LIZ("VideoFrameRender@e12c.init$1L");
        if (this.mEglRenderer != null) {
            this.mEglRenderer.init(context, iArr, new GlRectDrawer());
        }
        C1C7U.LIZIZ("VideoFrameRender@e12c.init$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrameResolutionChanged$1(int i, int i2) {
        C1C7U.LIZ("VideoFrameRender@e12c.onFrameResolutionChanged$1L");
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
        C1C7U.LIZIZ("VideoFrameRender@e12c.onFrameResolutionChanged$1L");
    }

    public void setRenderView(SurfaceView surfaceView, SurfaceHolder.Callback callback) {
        if (!this.mEglSurfaceCreatedAtomic.get() && surfaceView != null && this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            this.mSurfaceView = surfaceView;
            synchronized (this.mRenderLock) {
                try {
                    SurfaceEglRender surfaceEglRender = new SurfaceEglRender(this.mRenderName);
                    surfaceEglRender.setSurfaceHolderCallback(callback);
                    surfaceEglRender.setSurfaceLifecycleLisenter(this.mSurfaceLifecycleCallbackCallback);
                    this.mEglRenderer = surfaceEglRender;
                    this.mEglRenderer.addFristFrameListener(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public void setRenderView(TextureView textureView, TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (!this.mEglSurfaceCreatedAtomic.get() && textureView != null && this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            synchronized (this.mRenderLock) {
                try {
                    this.mTextureView = textureView;
                    TextureEglRenderer textureEglRenderer = new TextureEglRenderer(this.mRenderName);
                    textureEglRenderer.setSurfaceTextureListener(surfaceTextureListener);
                    this.mEglRenderer = textureEglRenderer;
                    this.mEglRenderer.addFristFrameListener(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    private VideoFrame.Buffer createYUV(byte[] bArr, int i, int i2) {
        if (bArr != null && bArr.length != 0) {
            int i3 = (i + 1) / 2;
            int i4 = i * i2;
            int i5 = ((i2 + 1) / 2) * i3;
            final ByteBuffer byteBufferNativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer(i4);
            final ByteBuffer byteBufferNativeAllocateBuffer2 = ByteBufferUtils.nativeAllocateBuffer(i5);
            final ByteBuffer byteBufferNativeAllocateBuffer3 = ByteBufferUtils.nativeAllocateBuffer(i5);
            if (byteBufferNativeAllocateBuffer != null) {
                if (byteBufferNativeAllocateBuffer2 != null && byteBufferNativeAllocateBuffer3 != null) {
                    byteBufferNativeAllocateBuffer.put(bArr, 0, i4);
                    byteBufferNativeAllocateBuffer2.put(bArr, i4, i5);
                    byteBufferNativeAllocateBuffer3.put(bArr, i4 + i5, i5);
                    byteBufferNativeAllocateBuffer.position(0);
                    byteBufferNativeAllocateBuffer2.position(0);
                    byteBufferNativeAllocateBuffer3.position(0);
                    if (this.mEglRenderer instanceof TextureEglRenderer) {
                        return CountDownLatchI420Buffer.wrap(i, i2, byteBufferNativeAllocateBuffer, i, byteBufferNativeAllocateBuffer2, i3, byteBufferNativeAllocateBuffer3, i3, new Runnable() { // from class: X.0jQ5
                            @Override // java.lang.Runnable
                            public final void run() {
                                VideoFrameRender.lambda$createYUV$3(byteBufferNativeAllocateBuffer, byteBufferNativeAllocateBuffer2, byteBufferNativeAllocateBuffer3);
                            }
                        });
                    }
                    return JavaI420Buffer.wrap(i, i2, byteBufferNativeAllocateBuffer, i, byteBufferNativeAllocateBuffer2, i3, byteBufferNativeAllocateBuffer3, i3, new Runnable() { // from class: X.0jQ6
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoFrameRender.lambda$createYUV$4(byteBufferNativeAllocateBuffer, byteBufferNativeAllocateBuffer2, byteBufferNativeAllocateBuffer3);
                        }
                    });
                }
                ByteBufferUtils.nativeReleaseBuffer(byteBufferNativeAllocateBuffer);
            }
            if (byteBufferNativeAllocateBuffer2 != null) {
                ByteBufferUtils.nativeReleaseBuffer(byteBufferNativeAllocateBuffer2);
            }
            if (byteBufferNativeAllocateBuffer3 != null) {
                ByteBufferUtils.nativeReleaseBuffer(byteBufferNativeAllocateBuffer3);
            }
        }
        return null;
    }

    public static /* synthetic */ void lambda$createYUV$3(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        C1C7U.LIZ("VideoFrameRender@e12c.createYUV$1L");
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
        C1C7U.LIZIZ("VideoFrameRender@e12c.createYUV$1L");
    }

    public static /* synthetic */ void lambda$createYUV$4(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        C1C7U.LIZ("VideoFrameRender@e12c.createYUV$2L");
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
        C1C7U.LIZIZ("VideoFrameRender@e12c.createYUV$2L");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0009 A[PHI: r1
      0x0009: PHI (r1v2 int) = (r1v0 int), (r1v3 int) binds: [B:11:0x0014, B:6:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFrameResolutionChanged(final int r3, int r4, int r5) {
        /*
            r2 = this;
            r0 = 180(0xb4, float:2.52E-43)
            if (r5 == 0) goto L13
            if (r5 == r0) goto L13
            r1 = r4
        L7:
            if (r5 != r0) goto La
        L9:
            r3 = r4
        La:
            X.0jQ8 r0 = new X.0jQ8
            r0.<init>()
            r2.postOrRun(r0)
            return
        L13:
            r1 = r3
            if (r5 == 0) goto L9
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.ui.VideoFrameRender.onFrameResolutionChanged(int, int, int):void");
    }

    private void renderI420Frame(byte[] bArr, int i, int i2, int i3, long j) {
        VideoFrameConverter videoFrameConverter;
        VideoFrame.I420Buffer i420BufferConvertToJavaI420Buffer;
        if (bArr != null && bArr.length > 0 && (videoFrameConverter = this.frameConverter) != null) {
            if (this.mEglRenderer instanceof TextureEglRenderer) {
                i420BufferConvertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(bArr, i, i2, true);
            } else {
                i420BufferConvertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(bArr, i, i2, false);
            }
            if (i420BufferConvertToJavaI420Buffer != null) {
                VideoFrame videoFrame = new VideoFrame(i420BufferConvertToJavaI420Buffer, i3, j);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    private void renderI420Frame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        VideoFrameConverter videoFrameConverter;
        VideoFrame.I420Buffer i420BufferConvertToJavaI420Buffer;
        if (byteBuffer != null && (videoFrameConverter = this.frameConverter) != null) {
            if (this.mEglRenderer instanceof TextureEglRenderer) {
                i420BufferConvertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i, i2, true);
            } else {
                i420BufferConvertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i, i2, false);
            }
            if (i420BufferConvertToJavaI420Buffer != null) {
                VideoFrame videoFrame = new VideoFrame(i420BufferConvertToJavaI420Buffer, i3, j);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    public void consumeByteArrayFrame(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (i != VideoPixelFormat.I420.value()) {
            return;
        }
        renderI420Frame(bArr, i2, i3, i4, j);
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, long j) {
        if (i != VideoPixelFormat.I420.value()) {
            return;
        }
        renderI420Frame(byteBuffer, i2, i3, i4, j);
    }

    private void renderTextureFrame(int i, VideoFrame.TextureBuffer.Type type, int i2, int i3, int i4, long j, float[] fArr, Looper looper) {
        VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(i2, i3, type, i, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), new BPEAHandler(looper), new YuvConverter(), new Runnable() { // from class: X.0jQ7
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameRender.lambda$renderTextureFrame$2();
            }
        }), i4, j);
        onVideoFrame(videoFrame);
        videoFrame.release();
    }

    public void consumeTextureFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        if (i2 != VideoPixelFormat.I420.value()) {
            return;
        }
        synchronized (this.mTextureProcessLock) {
            try {
                if (this.mTextureProcessLooper == null) {
                    this.mTextureProcessLooper = Looper.getMainLooper();
                }
                renderTextureFrame(i, VideoFrame.TextureBuffer.Type.RGB, i3, i4, i5, j, fArr, this.mTextureProcessLooper);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setLayoutAspectRatio((i3 - i) / (i4 - i2));
                }
                if (this.mSurfaceView != null) {
                    updateSurfaceSize();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j, ByteBuffer byteBuffer) {
        renderI420Frame(this.frameConverter.convertRawYUV2ByteArray(bArr, bArr2, bArr3, i, i2, i3, i4, i5), i4, i5, i6, j);
    }
}
