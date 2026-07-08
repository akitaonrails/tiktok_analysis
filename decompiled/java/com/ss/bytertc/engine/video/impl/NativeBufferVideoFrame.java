package com.ss.bytertc.engine.video.impl;

import android.opengl.EGLContext;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoContentType;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.bytertc.engine.video.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NativeBufferVideoFrame extends VideoFrame {
    public VideoFrame.OnFrameDestroyedListener frameDestroyedListener;
    public long nativeHandle;

    public static native void nativeFreeVideoFrame(long j);

    public static native CameraId nativeGetCameraId(long j);

    public static native ColorSpace nativeGetColorSpace(long j);

    public static native VideoContentType nativeGetContentType(long j);

    public static native EGLContext nativeGetEglContext(long j);

    public static native VideoExternalData[] nativeGetExternalDataArray(long j);

    public static native ByteBuffer nativeGetExternalDataInfo(long j);

    public static native long nativeGetGLSync(long j);

    public static native int nativeGetHeight(long j);

    public static native int nativeGetNumberOfPlanes(long j);

    public static native long nativeGetOriginalCaptureTimestampMs(long j);

    public static native long nativeGetOriginalEffectTimestampMs(long j);

    public static native VideoPixelFormat nativeGetPixelFormat(long j);

    public static native ByteBuffer nativeGetPlaneData(long j, int i);

    public static native VideoRotation nativeGetRotation(long j);

    public static native ByteBuffer nativeGetSupplementaryInfo(long j);

    public static native int nativeGetTextureID(long j);

    public static native float[] nativeGetTextureMatrix(long j);

    public static native long nativeGetTimeStampUs(long j);

    public static native VideoFrameType nativeGetVideoFrameType(long j);

    public static native int nativeGetWidth(long j);

    public static native int nativegetPlaneStride(long j, int i);

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setColorSpace(ColorSpace colorSpace) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setEGLContext(EGLContext eGLContext) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setExternalDataArray(VideoExternalData[] videoExternalDataArr) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setExternalDataInfo(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setGLSync(long j) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setOriginalCaptureTimestampMs(long j) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setOriginalEffectTimestampMs(long j) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setRotation(VideoRotation videoRotation) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setSupplementaryInfo(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTextureID(int i) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTextureMatrix(float[] fArr) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTimeStampUs(long j) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void freeVideoFrame() {
        VideoFrame.OnFrameDestroyedListener onFrameDestroyedListener = this.frameDestroyedListener;
        if (onFrameDestroyedListener != null) {
            onFrameDestroyedListener.OnFrameDestroyed(null, 0, 0L);
        }
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ColorSpace getColorSpace() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetColorSpace(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoContentType getContentType() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetContentType(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public EGLContext getEGLContext() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetEglContext(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoExternalData[] getExternalDataArray() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetExternalDataArray(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getExternalDataInfo() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetExternalDataInfo(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoFrameType getFrameType() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetVideoFrameType(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getGLSync() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetGLSync(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getHeight() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetHeight(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getNumberOfPlanes() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetNumberOfPlanes(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getOriginalCaptureTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetOriginalCaptureTimestampMs(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getOriginalEffectTimestampMs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetOriginalEffectTimestampMs(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoPixelFormat getPixelFormat() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetPixelFormat(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoRotation getRotation() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetRotation(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getSupplementaryInfo() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetSupplementaryInfo(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getTextureID() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetTextureID(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public float[] getTextureMatrix() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetTextureMatrix(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getTimeStampUs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetTimeStampUs(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getWidth() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetWidth(j);
    }

    public NativeBufferVideoFrame(long j) {
        this.nativeHandle = j;
        setFrameDestroyedListener(new VideoFrame.OnFrameDestroyedListener() { // from class: X.0jNF
            @Override // com.ss.bytertc.engine.video.VideoFrame.OnFrameDestroyedListener
            public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j2) {
                this.LIZ.lambda$new$0(eGLContext, i, j2);
            }
        });
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getPlaneData(int i) {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetPlaneData(j, i);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getPlaneStride(int i) {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativegetPlaneStride(j, i);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void setFrameDestroyedListener(VideoFrame.OnFrameDestroyedListener onFrameDestroyedListener) {
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
