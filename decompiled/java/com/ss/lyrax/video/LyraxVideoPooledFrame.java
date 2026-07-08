package com.ss.lyrax.video;

import android.opengl.EGLContext;
import com.bytedance.realx.video.RXEnumConfig;
import com.ss.lyrax.video.LyraxVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoPooledFrame extends LyraxVideoFrame {
    public EGLContext eglContext;
    public LyraxVideoFrameType frameType;
    public long glSync;
    public int height;
    public final boolean isBlackFrame;
    public long nativeHandle;
    public LyraxVideoPixelFormat pixelFormat;
    public int textureID;
    public float[] textureMatrix;
    public int width;

    public static native void nativeFreeVideoFrame(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native LyraxVideoColorSpace nativeGetColorSpace(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native LyraxVideoContentType nativeGetContentType(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native EGLContext nativeGetEglContext(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native long nativeGetEnterDecoderTimestampMs(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native LyraxVideoExtraData[] nativeGetExtraDataArray(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native ByteBuffer nativeGetExtraDataInfo(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native long nativeGetGLSync(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native int nativeGetHeight(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native long nativeGetLeaveDecoderTimestampMs(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native int nativeGetNumberOfPlanes(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native long nativeGetOriginalCaptureTimestampMs(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native long nativeGetOriginalEffectTimestampMs(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native LyraxVideoPixelFormat nativeGetPixelFormat(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native ByteBuffer nativeGetPlaneData(long j, LyraxVideoFrameType lyraxVideoFrameType, int i);

    public static native LyraxVideoRotation nativeGetRotation(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native ByteBuffer nativeGetSupplementaryInfo(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native int nativeGetTextureID(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native float[] nativeGetTextureMatrix(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native long nativeGetTimeStampUs(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native int nativeGetWidth(long j, LyraxVideoFrameType lyraxVideoFrameType);

    public static native boolean nativeSetColorSpace(long j, LyraxVideoFrameType lyraxVideoFrameType, LyraxVideoColorSpace lyraxVideoColorSpace);

    public static native boolean nativeSetEGLContext(long j, LyraxVideoFrameType lyraxVideoFrameType, EGLContext eGLContext, long j2);

    public static native boolean nativeSetExtraDataArray(long j, LyraxVideoFrameType lyraxVideoFrameType, LyraxVideoExtraData[] lyraxVideoExtraDataArr);

    public static native boolean nativeSetExtraDataInfo(long j, LyraxVideoFrameType lyraxVideoFrameType, ByteBuffer byteBuffer);

    public static native boolean nativeSetGLSync(long j, LyraxVideoFrameType lyraxVideoFrameType, long j2);

    public static native boolean nativeSetOriginalCaptureTimestampMs(long j, LyraxVideoFrameType lyraxVideoFrameType, long j2);

    public static native boolean nativeSetOriginalEffectTimestampMs(long j, LyraxVideoFrameType lyraxVideoFrameType, long j2);

    public static native boolean nativeSetReleaseCallback(long j, LyraxVideoFrameType lyraxVideoFrameType, LyraxVideoFrame.OnFrameDestroyedListener onFrameDestroyedListener);

    public static native boolean nativeSetRotation(long j, LyraxVideoFrameType lyraxVideoFrameType, LyraxVideoRotation lyraxVideoRotation);

    public static native boolean nativeSetSupplementaryInfo(long j, LyraxVideoFrameType lyraxVideoFrameType, ByteBuffer byteBuffer);

    public static native boolean nativeSetTextureID(long j, LyraxVideoFrameType lyraxVideoFrameType, int i);

    public static native boolean nativeSetTextureMatrix(long j, LyraxVideoFrameType lyraxVideoFrameType, float[] fArr);

    public static native boolean nativeSetTimestampUs(long j, LyraxVideoFrameType lyraxVideoFrameType, long j2);

    public static native int nativegetPlaneStride(long j, LyraxVideoFrameType lyraxVideoFrameType, int i);

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean isBlackFrame() {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
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

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoColorSpace getColorSpace() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetColorSpace(j, this.frameType);
    }

    public LyraxVideoContentType getContentType() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetContentType(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public EGLContext getEGLContext() {
        LyraxVideoFrameType lyraxVideoFrameType;
        long j = this.nativeHandle;
        if (j == 0 || (lyraxVideoFrameType = this.frameType) != LyraxVideoFrameType.GL_TEXTURE) {
            return null;
        }
        EGLContext eGLContext = this.eglContext;
        return eGLContext != null ? eGLContext : nativeGetEglContext(j, lyraxVideoFrameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getEnterDecoderTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetEnterDecoderTimestampMs(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoExtraData[] getExtraDataArray() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetExtraDataArray(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getExtraDataInfo() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetExtraDataInfo(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getGLSync() {
        LyraxVideoFrameType lyraxVideoFrameType;
        long j = this.nativeHandle;
        if (j == 0 || (lyraxVideoFrameType = this.frameType) != LyraxVideoFrameType.GL_TEXTURE) {
            return 0L;
        }
        long j2 = this.glSync;
        return j2 != 0 ? j2 : nativeGetGLSync(j, lyraxVideoFrameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getHeight() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        int i = this.height;
        return i > 0 ? i : nativeGetHeight(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getLeaveDecoderTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetLeaveDecoderTimestampMs(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getNumberOfPlanes() {
        LyraxVideoFrameType lyraxVideoFrameType;
        long j = this.nativeHandle;
        if (j == 0 || (lyraxVideoFrameType = this.frameType) != LyraxVideoFrameType.RAW_MEMORY) {
            return 0;
        }
        return nativeGetNumberOfPlanes(j, lyraxVideoFrameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getOriginalCaptureTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetOriginalCaptureTimestampMs(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getOriginalEffectTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetOriginalEffectTimestampMs(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoPixelFormat getPixelFormat() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        LyraxVideoPixelFormat lyraxVideoPixelFormat = this.pixelFormat;
        return lyraxVideoPixelFormat != null ? lyraxVideoPixelFormat : nativeGetPixelFormat(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoRotation getRotation() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetRotation(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getSupplementaryInfo() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetSupplementaryInfo(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getTextureID() {
        LyraxVideoFrameType lyraxVideoFrameType;
        long j = this.nativeHandle;
        if (j == 0 || (lyraxVideoFrameType = this.frameType) != LyraxVideoFrameType.GL_TEXTURE) {
            return 0;
        }
        int i = this.textureID;
        return i > 0 ? i : nativeGetTextureID(j, lyraxVideoFrameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public float[] getTextureMatrix() {
        LyraxVideoFrameType lyraxVideoFrameType;
        long j = this.nativeHandle;
        if (j == 0 || (lyraxVideoFrameType = this.frameType) != LyraxVideoFrameType.GL_TEXTURE) {
            return null;
        }
        float[] fArr = this.textureMatrix;
        return fArr != null ? fArr : nativeGetTextureMatrix(j, lyraxVideoFrameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getTimeStampUs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetTimeStampUs(j, this.frameType);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
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

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoFrameType getFrameType() {
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

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getPlaneData(int i) {
        LyraxVideoFrameType lyraxVideoFrameType;
        long j = this.nativeHandle;
        if (j != 0 && (lyraxVideoFrameType = this.frameType) == LyraxVideoFrameType.RAW_MEMORY) {
            return nativeGetPlaneData(j, lyraxVideoFrameType, i);
        }
        return null;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getPlaneStride(int i) {
        LyraxVideoFrameType lyraxVideoFrameType;
        long j = this.nativeHandle;
        if (j != 0 && (lyraxVideoFrameType = this.frameType) == LyraxVideoFrameType.RAW_MEMORY) {
            return nativegetPlaneStride(j, lyraxVideoFrameType, i);
        }
        return 0;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setColorSpace(LyraxVideoColorSpace lyraxVideoColorSpace) {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        nativeSetColorSpace(j, this.frameType, lyraxVideoColorSpace);
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setEGLContext(EGLContext eGLContext) {
        LyraxVideoFrameType lyraxVideoFrameType;
        long j = this.nativeHandle;
        if (j != 0 && (lyraxVideoFrameType = this.frameType) == LyraxVideoFrameType.GL_TEXTURE) {
            nativeSetEGLContext(j, lyraxVideoFrameType, eGLContext, eGLContext.getNativeHandle());
            return true;
        }
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setExtraDataArray(LyraxVideoExtraData[] lyraxVideoExtraDataArr) {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        nativeSetExtraDataArray(j, this.frameType, lyraxVideoExtraDataArr);
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setExtraDataInfo(ByteBuffer byteBuffer) {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        nativeSetExtraDataInfo(j, this.frameType, convert2DirectBuffer(byteBuffer));
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public void setFrameDestroyedListener(LyraxVideoFrame.OnFrameDestroyedListener onFrameDestroyedListener) {
        long j = this.nativeHandle;
        if (j == 0) {
            return;
        }
        nativeSetReleaseCallback(j, this.frameType, onFrameDestroyedListener);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setGLSync(long j) {
        LyraxVideoFrameType lyraxVideoFrameType;
        long j2 = this.nativeHandle;
        if (j2 != 0 && (lyraxVideoFrameType = this.frameType) == LyraxVideoFrameType.GL_TEXTURE) {
            this.glSync = j;
            nativeSetGLSync(j2, lyraxVideoFrameType, j);
            return true;
        }
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setOriginalCaptureTimestampMs(long j) {
        long j2 = this.nativeHandle;
        if (j2 == 0) {
            return false;
        }
        nativeSetOriginalCaptureTimestampMs(j2, this.frameType, j);
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setOriginalEffectTimestampMs(long j) {
        long j2 = this.nativeHandle;
        if (j2 == 0) {
            return false;
        }
        nativeSetOriginalEffectTimestampMs(j2, this.frameType, j);
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setRotation(LyraxVideoRotation lyraxVideoRotation) {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        nativeSetRotation(j, this.frameType, lyraxVideoRotation);
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setSupplementaryInfo(ByteBuffer byteBuffer) {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        nativeSetSupplementaryInfo(j, this.frameType, convert2DirectBuffer(byteBuffer));
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTextureID(int i) {
        LyraxVideoFrameType lyraxVideoFrameType;
        long j = this.nativeHandle;
        if (j != 0 && (lyraxVideoFrameType = this.frameType) == LyraxVideoFrameType.GL_TEXTURE) {
            this.textureID = i;
            nativeSetTextureID(j, lyraxVideoFrameType, i);
            return true;
        }
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTextureMatrix(float[] fArr) {
        if (this.nativeHandle != 0 && this.frameType == LyraxVideoFrameType.GL_TEXTURE) {
            this.textureMatrix = (float[]) fArr.clone();
            nativeSetTextureMatrix(this.nativeHandle, this.frameType, fArr);
            return true;
        }
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTimeStampUs(long j) {
        long j2 = this.nativeHandle;
        if (j2 == 0) {
            return false;
        }
        nativeSetTimestampUs(j2, this.frameType, j);
        return true;
    }

    public static void callCustomDeleter(LyraxVideoFrame.OnFrameDestroyedListener onFrameDestroyedListener, EGLContext eGLContext, int i, long j) {
        onFrameDestroyedListener.OnFrameDestroyed(eGLContext, i, j);
    }

    public LyraxVideoPooledFrame(long j, LyraxVideoFrameType lyraxVideoFrameType, LyraxVideoPixelFormat lyraxVideoPixelFormat, int i, int i2, EGLContext eGLContext) {
        this.nativeHandle = j;
        this.frameType = lyraxVideoFrameType;
        this.pixelFormat = lyraxVideoPixelFormat;
        this.width = i;
        this.height = i2;
        this.eglContext = eGLContext;
    }
}
