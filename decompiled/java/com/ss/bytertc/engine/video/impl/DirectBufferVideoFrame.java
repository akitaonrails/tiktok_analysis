package com.ss.bytertc.engine.video.impl;

import X.C1C7U;
import android.opengl.EGLContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoContentType;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.DirectBufferVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class DirectBufferVideoFrame extends VideoFrame {
    public ByteBuffer[] dataOfPlanes;
    public EGLContext eglContext;
    public VideoExternalData[] externalDataArray;
    public ByteBuffer externalDataInfo;
    public VideoFrameType frameType;
    public long glSync;
    public int height;
    public VideoFrame.OnFrameDestroyedListener onDestroyedListener;
    public long originalCaptureTimestampMs;
    public long originalEffectTimestampMs;
    public VideoPixelFormat pixelFormat;
    public int[] strideOfPlanes;
    public ByteBuffer supplementaryInfo;
    public int textureID;
    public float[] textureMatrix;
    public long timestampUs;
    public int width;
    public ColorSpace colorSpace = ColorSpace.BT601_LIMITED_RANGE;
    public VideoRotation rotation = VideoRotation.VIDEO_ROTATION_0;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.video.impl.DirectBufferVideoFrame$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat;

        static {
            int[] iArr = new int[VideoPixelFormat.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat = iArr;
            try {
                iArr[VideoPixelFormat.I420.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.NV12.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.NV21.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.RGBA.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_2D.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_OES.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
        }
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void freeVideoFrame() {
        VideoFrame.OnFrameDestroyedListener onFrameDestroyedListener = this.onDestroyedListener;
        if (onFrameDestroyedListener != null) {
            onFrameDestroyedListener.OnFrameDestroyed(this.eglContext, this.textureID, this.glSync);
        }
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getNumberOfPlanes() {
        return this.dataOfPlanes.length;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoContentType getContentType() {
        return VideoContentType.NORMAL_FRAME;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public EGLContext getEGLContext() {
        return this.eglContext;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoExternalData[] getExternalDataArray() {
        return this.externalDataArray;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getExternalDataInfo() {
        return this.externalDataInfo;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoFrameType getFrameType() {
        return this.frameType;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getGLSync() {
        return this.glSync;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getHeight() {
        return this.height;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getOriginalCaptureTimestampMs() {
        return this.originalCaptureTimestampMs;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getOriginalEffectTimestampMs() {
        return this.originalEffectTimestampMs;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoPixelFormat getPixelFormat() {
        return this.pixelFormat;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoRotation getRotation() {
        return this.rotation;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getSupplementaryInfo() {
        return this.supplementaryInfo;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getTextureID() {
        return this.textureID;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public float[] getTextureMatrix() {
        return this.textureMatrix;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getTimeStampUs() {
        return this.timestampUs;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getWidth() {
        return this.width;
    }

    public DirectBufferVideoFrame(VideoPixelFormat videoPixelFormat) {
        this.pixelFormat = videoPixelFormat;
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[videoPixelFormat.ordinal()];
        int i2 = 3;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    this.frameType = VideoFrameType.GL_TEXTURE;
                    i2 = 0;
                } else {
                    this.frameType = VideoFrameType.RAW_MEMORY;
                    i2 = 1;
                }
            } else {
                this.frameType = VideoFrameType.RAW_MEMORY;
                i2 = 2;
            }
        } else {
            this.frameType = VideoFrameType.RAW_MEMORY;
        }
        this.dataOfPlanes = new ByteBuffer[i2];
        this.strideOfPlanes = new int[i2];
    }

    private ByteBuffer convert2DirectBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getPlaneData(int i) {
        return this.dataOfPlanes[i];
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getPlaneStride(int i) {
        return this.strideOfPlanes[i];
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setColorSpace(ColorSpace colorSpace) {
        this.colorSpace = colorSpace;
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setEGLContext(EGLContext eGLContext) {
        this.eglContext = eGLContext;
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setExternalDataArray(VideoExternalData[] videoExternalDataArr) {
        this.externalDataArray = videoExternalDataArr;
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setExternalDataInfo(ByteBuffer byteBuffer) {
        this.externalDataInfo = convert2DirectBuffer(byteBuffer);
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void setFrameDestroyedListener(VideoFrame.OnFrameDestroyedListener onFrameDestroyedListener) {
        this.onDestroyedListener = onFrameDestroyedListener;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setGLSync(long j) {
        if (this.frameType == VideoFrameType.RAW_MEMORY) {
            return false;
        }
        this.glSync = j;
        return true;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setOriginalCaptureTimestampMs(long j) {
        this.originalCaptureTimestampMs = j;
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setOriginalEffectTimestampMs(long j) {
        this.originalEffectTimestampMs = j;
        return true;
    }

    public void setReleaseCallback(final Runnable runnable) {
        if (runnable == null) {
            setFrameDestroyedListener(null);
        } else {
            setFrameDestroyedListener(new VideoFrame.OnFrameDestroyedListener() { // from class: X.0jJJ
                @Override // com.ss.bytertc.engine.video.VideoFrame.OnFrameDestroyedListener
                public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j) {
                    DirectBufferVideoFrame.lambda$setReleaseCallback$0(runnable, eGLContext, i, j);
                }
            });
        }
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setRotation(VideoRotation videoRotation) {
        this.rotation = videoRotation;
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setSupplementaryInfo(ByteBuffer byteBuffer) {
        this.supplementaryInfo = convert2DirectBuffer(byteBuffer);
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTextureID(int i) {
        if (this.frameType == VideoFrameType.RAW_MEMORY) {
            return false;
        }
        this.textureID = i;
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTextureMatrix(float[] fArr) {
        this.textureMatrix = fArr;
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTimeStampUs(long j) {
        this.timestampUs = j;
        return true;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setPlaneData(int i, ByteBuffer byteBuffer) {
        if (this.frameType == VideoFrameType.GL_TEXTURE || i >= this.dataOfPlanes.length) {
            return;
        }
        this.dataOfPlanes[i] = convert2DirectBuffer(byteBuffer);
    }

    public void setPlaneStride(int i, int i2) {
        if (this.frameType == VideoFrameType.GL_TEXTURE || i >= this.dataOfPlanes.length) {
            return;
        }
        this.strideOfPlanes[i] = i2;
    }

    public static /* synthetic */ void lambda$setReleaseCallback$0(Runnable runnable, EGLContext eGLContext, int i, long j) {
        C1C7U.LIZ("DirectBufferVideoFrame@5ce1.setReleaseCallback$1L");
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("DirectBufferVideoFrame@5ce1.setReleaseCallback$1L");
    }
}
