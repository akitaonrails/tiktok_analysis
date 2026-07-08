package com.ss.bytertc.engine.utils;

import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.utils.VideoFrameConverter;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.builder.GLTextureVideoFrameBuilder;
import java.util.Objects;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrameConverter {
    public long gl420ConverterNativeHandle;
    public long glNativeHandle;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public TextureHelper mI420TextureConverter;
    public boolean mIsStart;
    public TextureHelper mTextureHelper;

    public static /* synthetic */ void lambda$semisugar$release$0(VideoFrame videoFrame) {
        C1C7U.LIZ("VideoFrameConverter@6893.convert2WebrtcTextureFrame$3L");
        videoFrame.release();
        C1C7U.LIZIZ("VideoFrameConverter@6893.convert2WebrtcTextureFrame$3L");
    }

    public synchronized void dispose() {
        TextureHelper textureHelper = this.mTextureHelper;
        if (textureHelper != null) {
            textureHelper.dispose();
        }
        TextureHelper textureHelper2 = this.mI420TextureConverter;
        if (textureHelper2 != null) {
            textureHelper2.dispose();
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.mIsStart = false;
    }

    public long getNativeEglContext(EGLContext eGLContext) {
        return 0L;
    }

    /* JADX INFO: renamed from: com.ss.bytertc.engine.utils.VideoFrameConverter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat;

        static {
            int[] iArr = new int[VideoPixelFormat.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat = iArr;
            try {
                iArr[VideoPixelFormat.TEXTURE_2D.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_OES.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public VideoFrameConverter() {
        HandlerThread handlerThread = new HandlerThread("video-frame-converter");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new BPEAHandler(C786410Ut5.W2(this.mHandlerThread));
        this.mIsStart = true;
    }

    public TextureHelper getTextureHelper() {
        return this.mTextureHelper;
    }

    private long getNativeEglContext(android.opengl.EGLContext eGLContext) {
        return eGLContext.getNativeHandle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert2WebrtcTextureFrame$0(int i) {
        C1C7U.LIZ("VideoFrameConverter@6893.convert2WebrtcTextureFrame$2L");
        this.mTextureHelper.queueTexture(i);
        C1C7U.LIZIZ("VideoFrameConverter@6893.convert2WebrtcTextureFrame$2L");
    }

    public synchronized com.bytedance.realx.video.VideoFrame convert2WebrtcI420Frame(VideoFrame videoFrame) {
        com.bytedance.realx.video.VideoFrame videoFrameAllocateVideoFrame;
        if (videoFrame == null) {
            LogUtil.w("VideoFrameConverter", "convert2WebrtcI420Frame frame is null");
            return null;
        }
        if (videoFrame.getFrameType() != VideoFrameType.GL_TEXTURE) {
            LogUtil.w("VideoFrameConverter", "convert2WebrtcI420Frame: pushExternalVideoFrame VideoFrame type is not available");
            return null;
        }
        if (videoFrame.getEGLContext() != null && updateInnerI420Converter(videoFrame.getEGLContext(), videoFrame.getWidth(), videoFrame.getHeight())) {
            TextureHelper textureHelper = this.mI420TextureConverter;
            if (textureHelper == null || (videoFrameAllocateVideoFrame = allocateVideoFrame(videoFrame, textureHelper, null)) == null) {
                return null;
            }
            com.bytedance.realx.video.VideoFrame videoFrame2 = new com.bytedance.realx.video.VideoFrame(videoFrameAllocateVideoFrame.getBuffer().toI420(), videoFrameAllocateVideoFrame.getRotation(), videoFrameAllocateVideoFrame.getTimestampNs());
            videoFrameAllocateVideoFrame.release();
            return videoFrame2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video frame  error frame eglContext14:");
        sbLIZ.append(videoFrame.getEGLContext());
        sbLIZ.append(" isStart:");
        sbLIZ.append(this.mIsStart);
        LogUtil.e("VideoFrameConverter", C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public synchronized com.bytedance.realx.video.VideoFrame convert2WebrtcTextureFrame(final VideoFrame videoFrame) {
        int i;
        com.bytedance.realx.video.VideoFrame videoFrameAllocateVideoFrame = null;
        if (videoFrame == null) {
            LogUtil.w("VideoFrameConverter", "convert2VideoFrame frame is null");
            return null;
        }
        if (videoFrame.getFrameType() != VideoFrameType.GL_TEXTURE) {
            LogUtil.w("VideoFrameConverter", "pushExternalVideoFrame VideoFrame type is not available");
            return null;
        }
        if (videoFrame.getEGLContext() != null) {
            updateEglContext(videoFrame.getEGLContext(), videoFrame.getWidth(), videoFrame.getHeight());
        }
        if (this.mTextureHelper != null) {
            if (videoFrame.hasReleaseCallback()) {
                videoFrameAllocateVideoFrame = allocateVideoFrame(videoFrame, this.mTextureHelper, new Runnable() { // from class: X.0jLZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoFrameConverter.lambda$semisugar$release$0(videoFrame);
                    }
                });
            } else {
                final int iDequeueTexture = this.mTextureHelper.dequeueTexture();
                if (iDequeueTexture == 0) {
                    return null;
                }
                VideoPixelFormat pixelFormat = videoFrame.getPixelFormat();
                VideoPixelFormat videoPixelFormat = VideoPixelFormat.TEXTURE_2D;
                if (pixelFormat == videoPixelFormat) {
                    i = 10;
                } else {
                    if (videoFrame.getPixelFormat() != VideoPixelFormat.TEXTURE_OES) {
                        return null;
                    }
                    i = 11;
                }
                this.mTextureHelper.drawTexture(i, videoFrame.getTextureID(), iDequeueTexture);
                GLTextureVideoFrameBuilder gLTextureVideoFrameBuilder = new GLTextureVideoFrameBuilder(videoPixelFormat);
                gLTextureVideoFrameBuilder.setColorSpace(videoFrame.getColorSpace());
                gLTextureVideoFrameBuilder.setTextureID(iDequeueTexture);
                gLTextureVideoFrameBuilder.setEGLContext(videoFrame.getEGLContext());
                gLTextureVideoFrameBuilder.setTextureMatrix(videoFrame.getTextureMatrix());
                gLTextureVideoFrameBuilder.setWidth(videoFrame.getWidth());
                gLTextureVideoFrameBuilder.setHeight(videoFrame.getHeight());
                gLTextureVideoFrameBuilder.setRotation(videoFrame.getRotation());
                gLTextureVideoFrameBuilder.setTimeStampUs(videoFrame.getTimeStampUs());
                gLTextureVideoFrameBuilder.setReleaseCallback(new Runnable() { // from class: X.0jLd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.LL.lambda$convert2WebrtcTextureFrame$0(iDequeueTexture);
                    }
                });
                final VideoFrame videoFrameBuild = gLTextureVideoFrameBuilder.build();
                TextureHelper textureHelper = this.mTextureHelper;
                Objects.requireNonNull(videoFrameBuild);
                videoFrameAllocateVideoFrame = allocateVideoFrame(videoFrameBuild, textureHelper, new Runnable() { // from class: X.0jLZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoFrameConverter.lambda$semisugar$release$0(videoFrameBuild);
                    }
                });
            }
        }
        return videoFrameAllocateVideoFrame;
    }

    public synchronized void post(Runnable runnable) {
        if (!this.mIsStart) {
            return;
        }
        TextureHelper textureHelper = this.mTextureHelper;
        if (textureHelper != null) {
            textureHelper.post(runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    private void updateEglContext(android.opengl.EGLContext eGLContext, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGL14TextureHelper", eGLContext, i, i2);
            this.glNativeHandle = getNativeEglContext(eGLContext);
            LogUtil.i("VideoFrameConverter", "create  egl14 texture helper");
            return;
        }
        if (this.glNativeHandle == getNativeEglContext(eGLContext) && this.mTextureHelper.getWidth() == i && this.mTextureHelper.getHeight() == i2) {
            return;
        }
        this.glNativeHandle = getNativeEglContext(eGLContext);
        this.mTextureHelper.dispose();
        this.mTextureHelper = TextureHelper.create("EGL14TextureHelper", eGLContext, i, i2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update egl14Context nativeHandle:");
        sbLIZ.append(this.glNativeHandle);
        sbLIZ.append(" ,eglContext:");
        sbLIZ.append(eGLContext);
        sbLIZ.append("frame size width:");
        sbLIZ.append(i);
        sbLIZ.append("height :");
        sbLIZ.append(i2);
        LogUtil.i("VideoFrameConverter", C2188811AlT.LIZIZ(sbLIZ));
    }

    private boolean updateInnerI420Converter(android.opengl.EGLContext eGLContext, int i, int i2) {
        if (this.mI420TextureConverter == null) {
            this.mI420TextureConverter = TextureHelper.create("EGLBaseTextureHelper", eGLContext, i, i2);
            this.gl420ConverterNativeHandle = getNativeEglContext(eGLContext);
            LogUtil.i("VideoFrameConverter", "create EglBase 420 texture converter");
            return true;
        }
        if (this.gl420ConverterNativeHandle == getNativeEglContext(eGLContext)) {
            return true;
        }
        this.gl420ConverterNativeHandle = getNativeEglContext(eGLContext);
        this.mI420TextureConverter.dispose();
        this.mI420TextureConverter = TextureHelper.create("EGL14TextureConverter", eGLContext, i, i2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update egl14texture converter nativeHandle:");
        sbLIZ.append(this.glNativeHandle);
        sbLIZ.append(" ,eglContext:");
        sbLIZ.append(eGLContext);
        LogUtil.i("VideoFrameConverter", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    public com.bytedance.realx.video.VideoFrame allocateVideoFrame(VideoFrame videoFrame, TextureHelper textureHelper, Runnable runnable) {
        VideoFrame.TextureBuffer.Type type;
        if (videoFrame.getFrameType() == VideoFrameType.RAW_MEMORY) {
            LogUtil.w("VideoFrameConverter", "allocateVideoFrame only glTexture format is avaliable");
            return null;
        }
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[videoFrame.getPixelFormat().ordinal()];
        if (i != 1) {
            if (i != 2) {
                LogUtil.w("VideoFrameConverter", "texture format is not support");
                return null;
            }
            type = VideoFrame.TextureBuffer.Type.OES;
        } else {
            type = VideoFrame.TextureBuffer.Type.RGB;
        }
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(videoFrame.getWidth(), videoFrame.getHeight(), type, videoFrame.getTextureID(), RendererCommon.convertMatrixToAndroidGraphicsMatrix(videoFrame.getTextureMatrix()), textureHelper, runnable);
        textureBufferImpl.setEglBaseContext(textureHelper.getEglBaseContext());
        return new com.bytedance.realx.video.VideoFrame(textureBufferImpl, videoFrame.getRotation().value(), videoFrame.getTimeStampUs() * 1000);
    }
}
