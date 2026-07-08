package com.ss.lyrax.video;

import android.opengl.EGLContext;
import com.ss.lyrax.video.LyraxVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoNativeBufferFrame extends LyraxVideoFrame {
    public LyraxVideoFrame.OnFrameDestroyedListener frameDestroyedListener;
    public long nativeHandle;

    public static native void nativeFreeVideoFrame(long j);

    public static native LyraxVideoColorSpace nativeGetColorSpace(long j);

    public static native EGLContext nativeGetEglContext(long j);

    public static native long nativeGetEnterDecoderTimestampMs(long j);

    public static native LyraxVideoExtraData[] nativeGetExtraDataArray(long j);

    public static native ByteBuffer nativeGetExtraDataInfo(long j);

    public static native long nativeGetGLSync(long j);

    public static native int nativeGetHeight(long j);

    public static native long nativeGetLeaveDecoderTimestampMs(long j);

    public static native int nativeGetNumberOfPlanes(long j);

    public static native long nativeGetOriginalCaptureTimestampMs(long j);

    public static native long nativeGetOriginalEffectTimestampMs(long j);

    public static native LyraxVideoPixelFormat nativeGetPixelFormat(long j);

    public static native ByteBuffer nativeGetPlaneData(long j, int i);

    public static native int nativeGetPlaneStride(long j, int i);

    public static native LyraxVideoRotation nativeGetRotation(long j);

    public static native ByteBuffer nativeGetSupplementaryInfo(long j);

    public static native int nativeGetTextureID(long j);

    public static native float[] nativeGetTextureMatrix(long j);

    public static native long nativeGetTimeStampUs(long j);

    public static native LyraxVideoFrameType nativeGetVideoFrameType(long j);

    public static native int nativeGetWidth(long j);

    public static native boolean nativeIsBlackFrame(long j);

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setColorSpace(LyraxVideoColorSpace lyraxVideoColorSpace) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setEGLContext(EGLContext eGLContext) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setExtraDataArray(LyraxVideoExtraData[] lyraxVideoExtraDataArr) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setExtraDataInfo(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setGLSync(long j) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setOriginalCaptureTimestampMs(long j) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setOriginalEffectTimestampMs(long j) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setRotation(LyraxVideoRotation lyraxVideoRotation) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setSupplementaryInfo(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTextureID(int i) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTextureMatrix(float[] fArr) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTimeStampUs(long j) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public void freeVideoFrame() {
        LyraxVideoFrame.OnFrameDestroyedListener onFrameDestroyedListener = this.frameDestroyedListener;
        if (onFrameDestroyedListener != null) {
            onFrameDestroyedListener.OnFrameDestroyed(null, 0, 0L);
        }
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoColorSpace getColorSpace() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetColorSpace(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public EGLContext getEGLContext() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetEglContext(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getEnterDecoderTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetEnterDecoderTimestampMs(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoExtraData[] getExtraDataArray() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetExtraDataArray(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getExtraDataInfo() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetExtraDataInfo(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoFrameType getFrameType() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetVideoFrameType(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getGLSync() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetGLSync(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getHeight() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetHeight(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getLeaveDecoderTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetLeaveDecoderTimestampMs(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getNumberOfPlanes() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetNumberOfPlanes(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getOriginalCaptureTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetOriginalCaptureTimestampMs(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getOriginalEffectTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetOriginalEffectTimestampMs(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoPixelFormat getPixelFormat() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetPixelFormat(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoRotation getRotation() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetRotation(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getSupplementaryInfo() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetSupplementaryInfo(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getTextureID() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetTextureID(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public float[] getTextureMatrix() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetTextureMatrix(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getTimeStampUs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetTimeStampUs(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getWidth() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetWidth(j);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean isBlackFrame() {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        return nativeIsBlackFrame(j);
    }

    public LyraxVideoNativeBufferFrame(long j) {
        this.nativeHandle = j;
        setFrameDestroyedListener(new LyraxVideoFrame.OnFrameDestroyedListener() { // from class: X.0jNH
            @Override // com.ss.lyrax.video.LyraxVideoFrame.OnFrameDestroyedListener
            public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j2) {
                this.LIZ.lambda$new$0(eGLContext, i, j2);
            }
        });
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getPlaneData(int i) {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetPlaneData(j, i);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getPlaneStride(int i) {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetPlaneStride(j, i);
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public void setFrameDestroyedListener(LyraxVideoFrame.OnFrameDestroyedListener onFrameDestroyedListener) {
        this.frameDestroyedListener = onFrameDestroyedListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(EGLContext eGLContext, int i, long j) {
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeFreeVideoFrame(j2);
            this.nativeHandle = 0L;
        }
    }
}
