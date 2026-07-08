package com.ss.bytertc.engine.video.impl;

import android.opengl.EGLContext;
import com.bytedance.realx.video.RXEnumConfig;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoContentType;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.bytertc.engine.video.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoFrame extends VideoFrame {
    public EGLContext eglContext;
    public VideoFrameType frameType;
    public long glSync;
    public int height;
    public long nativeHandle;
    public VideoPixelFormat pixelFormat;
    public int textureID;
    public float[] textureMatrix;
    public int width;

    public static native void nativeFreeVideoFrame(long j, VideoFrameType videoFrameType);

    public static native ColorSpace nativeGetColorSpace(long j, VideoFrameType videoFrameType);

    public static native VideoContentType nativeGetContentType(long j, VideoFrameType videoFrameType);

    public static native EGLContext nativeGetEglContext(long j, VideoFrameType videoFrameType);

    public static native VideoExternalData[] nativeGetExternalDataArray(long j, VideoFrameType videoFrameType);

    public static native ByteBuffer nativeGetExternalDataInfo(long j, VideoFrameType videoFrameType);

    public static native long nativeGetGLSync(long j, VideoFrameType videoFrameType);

    public static native int nativeGetHeight(long j, VideoFrameType videoFrameType);

    public static native int nativeGetNumberOfPlanes(long j, VideoFrameType videoFrameType);

    public static native long nativeGetOriginalCaptureTimestampMs(long j, VideoFrameType videoFrameType);

    public static native long nativeGetOriginalEffectTimestampMs(long j, VideoFrameType videoFrameType);

    public static native VideoPixelFormat nativeGetPixelFormat(long j, VideoFrameType videoFrameType);

    public static native ByteBuffer nativeGetPlaneData(long j, VideoFrameType videoFrameType, int i);

    public static native VideoRotation nativeGetRotation(long j, VideoFrameType videoFrameType);

    public static native ByteBuffer nativeGetSupplementaryInfo(long j, VideoFrameType videoFrameType);

    public static native int nativeGetTextureID(long j, VideoFrameType videoFrameType);

    public static native float[] nativeGetTextureMatrix(long j, VideoFrameType videoFrameType);

    public static native long nativeGetTimeStampUs(long j, VideoFrameType videoFrameType);

    public static native int nativeGetWidth(long j, VideoFrameType videoFrameType);

    public static native boolean nativeSetColorSpace(long j, VideoFrameType videoFrameType, ColorSpace colorSpace);

    public static native boolean nativeSetEGLContext(long j, VideoFrameType videoFrameType, EGLContext eGLContext, long j2);

    public static native boolean nativeSetExternalDataArray(long j, VideoFrameType videoFrameType, VideoExternalData[] videoExternalDataArr);

    public static native boolean nativeSetExternalDataInfo(long j, VideoFrameType videoFrameType, ByteBuffer byteBuffer);

    public static native boolean nativeSetGLSync(long j, VideoFrameType videoFrameType, long j2);

    public static native boolean nativeSetOriginalCaptureTimestampMs(long j, VideoFrameType videoFrameType, long j2);

    public static native boolean nativeSetOriginalEffectTimestampMs(long j, VideoFrameType videoFrameType, long j2);

    public static native boolean nativeSetReleaseCallback(long j, VideoFrameType videoFrameType, VideoFrame.OnFrameDestroyedListener onFrameDestroyedListener);

    public static native boolean nativeSetRotation(long j, VideoFrameType videoFrameType, VideoRotation videoRotation);

    public static native boolean nativeSetSupplementaryInfo(long j, VideoFrameType videoFrameType, ByteBuffer byteBuffer);

    public static native boolean nativeSetTextureID(long j, VideoFrameType videoFrameType, int i);

    public static native boolean nativeSetTextureMatrix(long j, VideoFrameType videoFrameType, float[] fArr);

    public static native boolean nativeSetTimestampUs(long j, VideoFrameType videoFrameType, long j2);

    public static native int nativegetPlaneStride(long j, VideoFrameType videoFrameType, int i);

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void freeVideoFrame() {
        long j = this.nativeHandle;
        if (j != 0) {
            this.textureMatrix = null;
            this.textureID = 0;
            this.glSync = 0L;
            this.eglContext = null;
            this.nativeHandle = 0L;
            nativeFreeVideoFrame(j, this.frameType);
        }
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ColorSpace getColorSpace() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetColorSpace(j, this.frameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoContentType getContentType() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetContentType(j, this.frameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public EGLContext getEGLContext() {
        VideoFrameType videoFrameType;
        long j = this.nativeHandle;
        if (j == 0 || (videoFrameType = this.frameType) != VideoFrameType.GL_TEXTURE) {
            return null;
        }
        EGLContext eGLContext = this.eglContext;
        return eGLContext != null ? eGLContext : nativeGetEglContext(j, videoFrameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoExternalData[] getExternalDataArray() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetExternalDataArray(j, this.frameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getExternalDataInfo() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetExternalDataInfo(j, this.frameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getGLSync() {
        VideoFrameType videoFrameType;
        long j = this.nativeHandle;
        if (j == 0 || (videoFrameType = this.frameType) != VideoFrameType.GL_TEXTURE) {
            return 0L;
        }
        long j2 = this.glSync;
        return j2 != 0 ? j2 : nativeGetGLSync(j, videoFrameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getHeight() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        int i = this.height;
        return i > 0 ? i : nativeGetHeight(j, this.frameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getNumberOfPlanes() {
        VideoFrameType videoFrameType;
        long j = this.nativeHandle;
        if (j == 0 || (videoFrameType = this.frameType) != VideoFrameType.RAW_MEMORY) {
            return 0;
        }
        return nativeGetNumberOfPlanes(j, videoFrameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getOriginalCaptureTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetOriginalCaptureTimestampMs(j, this.frameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getOriginalEffectTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetOriginalEffectTimestampMs(j, this.frameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoPixelFormat getPixelFormat() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        VideoPixelFormat videoPixelFormat = this.pixelFormat;
        return videoPixelFormat != null ? videoPixelFormat : nativeGetPixelFormat(j, this.frameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoRotation getRotation() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetRotation(j, this.frameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getSupplementaryInfo() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetSupplementaryInfo(j, this.frameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getTextureID() {
        VideoFrameType videoFrameType;
        long j = this.nativeHandle;
        if (j == 0 || (videoFrameType = this.frameType) != VideoFrameType.GL_TEXTURE) {
            return 0;
        }
        int i = this.textureID;
        return i > 0 ? i : nativeGetTextureID(j, videoFrameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public float[] getTextureMatrix() {
        VideoFrameType videoFrameType;
        long j = this.nativeHandle;
        if (j == 0 || (videoFrameType = this.frameType) != VideoFrameType.GL_TEXTURE) {
            return null;
        }
        float[] fArr = this.textureMatrix;
        return fArr != null ? fArr : nativeGetTextureMatrix(j, videoFrameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getTimeStampUs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetTimeStampUs(j, this.frameType);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getWidth() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        int i = this.width;
        return i > 0 ? i : nativeGetWidth(j, this.frameType);
    }

    private long getNativeHandle() {
        return this.nativeHandle;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoFrameType getFrameType() {
        return this.frameType;
    }

    private ByteBuffer convert2DirectBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer != null && byteBuffer.remaining() != 0) {
            if (byteBuffer.isDirect()) {
                return byteBuffer;
            }
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            byteBufferAllocateDirect.position(0);
            byteBufferAllocateDirect.put(byteBuffer);
            byteBufferAllocateDirect.rewind();
            return byteBufferAllocateDirect;
        }
        return null;
    }

    public static void enableEnumOptimizationStrategy(boolean z) {
        RXEnumConfig.setEnableEnumOptimizationStrategy(z);
    }

    private void reuseVideoFrame(long j) {
        resetRefCount();
        this.nativeHandle = j;
        setFrameDestroyedListener(null);
    }

    private boolean updateEglContext(EGLContext eGLContext) {
        if (this.nativeHandle == 0) {
            return false;
        }
        this.eglContext = eGLContext;
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getPlaneData(int i) {
        VideoFrameType videoFrameType;
        long j = this.nativeHandle;
        if (j != 0 && (videoFrameType = this.frameType) == VideoFrameType.RAW_MEMORY) {
            return nativeGetPlaneData(j, videoFrameType, i);
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getPlaneStride(int i) {
        VideoFrameType videoFrameType;
        long j = this.nativeHandle;
        if (j != 0 && (videoFrameType = this.frameType) == VideoFrameType.RAW_MEMORY) {
            return nativegetPlaneStride(j, videoFrameType, i);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setColorSpace(ColorSpace colorSpace) {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        nativeSetColorSpace(j, this.frameType, colorSpace);
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setEGLContext(EGLContext eGLContext) {
        VideoFrameType videoFrameType;
        long j = this.nativeHandle;
        if (j != 0 && (videoFrameType = this.frameType) == VideoFrameType.GL_TEXTURE) {
            nativeSetEGLContext(j, videoFrameType, eGLContext, eGLContext.getNativeHandle());
            return true;
        }
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setExternalDataArray(VideoExternalData[] videoExternalDataArr) {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        nativeSetExternalDataArray(j, this.frameType, videoExternalDataArr);
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setExternalDataInfo(ByteBuffer byteBuffer) {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        nativeSetExternalDataInfo(j, this.frameType, convert2DirectBuffer(byteBuffer));
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void setFrameDestroyedListener(VideoFrame.OnFrameDestroyedListener onFrameDestroyedListener) {
        long j = this.nativeHandle;
        if (j == 0) {
            return;
        }
        nativeSetReleaseCallback(j, this.frameType, onFrameDestroyedListener);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setGLSync(long j) {
        VideoFrameType videoFrameType;
        long j2 = this.nativeHandle;
        if (j2 != 0 && (videoFrameType = this.frameType) == VideoFrameType.GL_TEXTURE) {
            this.glSync = j;
            nativeSetGLSync(j2, videoFrameType, j);
            return true;
        }
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setOriginalCaptureTimestampMs(long j) {
        long j2 = this.nativeHandle;
        if (j2 == 0) {
            return false;
        }
        nativeSetOriginalCaptureTimestampMs(j2, this.frameType, j);
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setOriginalEffectTimestampMs(long j) {
        long j2 = this.nativeHandle;
        if (j2 == 0) {
            return false;
        }
        nativeSetOriginalEffectTimestampMs(j2, this.frameType, j);
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setRotation(VideoRotation videoRotation) {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        nativeSetRotation(j, this.frameType, videoRotation);
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setSupplementaryInfo(ByteBuffer byteBuffer) {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        nativeSetSupplementaryInfo(j, this.frameType, convert2DirectBuffer(byteBuffer));
        return true;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTextureID(int i) {
        VideoFrameType videoFrameType;
        long j = this.nativeHandle;
        if (j != 0 && (videoFrameType = this.frameType) == VideoFrameType.GL_TEXTURE) {
            this.textureID = i;
            nativeSetTextureID(j, videoFrameType, i);
            return true;
        }
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTextureMatrix(float[] fArr) {
        if (this.nativeHandle != 0 && this.frameType == VideoFrameType.GL_TEXTURE) {
            this.textureMatrix = (float[]) fArr.clone();
            nativeSetTextureMatrix(this.nativeHandle, this.frameType, fArr);
            return true;
        }
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTimeStampUs(long j) {
        long j2 = this.nativeHandle;
        if (j2 == 0) {
            return false;
        }
        nativeSetTimestampUs(j2, this.frameType, j);
        return true;
    }

    public static void callCustomDeleter(VideoFrame.OnFrameDestroyedListener onFrameDestroyedListener, EGLContext eGLContext, int i, long j) {
        onFrameDestroyedListener.OnFrameDestroyed(eGLContext, i, j);
    }

    public LyraxVideoFrame(long j, VideoFrameType videoFrameType, VideoPixelFormat videoPixelFormat, int i, int i2, EGLContext eGLContext) {
        this.nativeHandle = j;
        this.frameType = videoFrameType;
        this.pixelFormat = videoPixelFormat;
        this.width = i;
        this.height = i2;
        this.eglContext = eGLContext;
    }
}
