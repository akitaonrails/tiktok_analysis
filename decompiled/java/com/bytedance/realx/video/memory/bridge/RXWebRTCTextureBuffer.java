package com.bytedance.realx.video.memory.bridge;

import X.C1280200jQ2;
import X.C1280210jQ3;
import X.C1C7U;
import android.graphics.Matrix;
import android.opengl.EGLContext;
import com.bytedance.realx.base.RefCountDelegate;
import com.bytedance.realx.video.FilterType;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoScaleFilter;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.memory.bridge.RXWebRTCTextureBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class RXWebRTCTextureBuffer implements VideoFrame.TextureBuffer {
    public boolean isAgfxTexture;
    public final long nativeRXVideoFrame;
    public final RefCountDelegate refCountDelegate;

    public static native long nativeCreateTextureRXVideoFrame(long j, float[] fArr, int i, int i2, int i3, int i4, RXVideoScaleFilter rXVideoScaleFilter);

    public static native EGLContext nativeGetAndroidEGLContext(long j);

    public static native EGLContext nativeGetEGLContext(long j);

    public static native float[] nativeGetFloatTextureMatrix(long j);

    public static native int nativeGetHeight(long j);

    public static native RXPixelFormat nativeGetPixelFormat(long j);

    public static native RXVideoScaleFilter nativeGetRXVideoScaleFilter(long j);

    public static native int nativeGetTextureId(long j);

    public static native int nativeGetUnscaledHeight(long j);

    public static native int nativeGetUnscaledWidth(long j);

    public static native int nativeGetWidth(long j);

    public static native void nativeReleaseRXVideoFrame(long j);

    public static native VideoFrame.I420Buffer nativeToI420(long j);

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return C1280200jQ2.LIZ(this);
    }

    public EGLContext getEGLContext() {
        return nativeGetAndroidEGLContext(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public EGLContext getEglContext() {
        return nativeGetEGLContext(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return nativeGetHeight(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return FilterType.fromValue(nativeGetRXVideoScaleFilter(this.nativeRXVideoFrame).value());
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTextureId() {
        return nativeGetTextureId(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return RendererCommon.convertMatrixToAndroidGraphicsMatrix(nativeGetFloatTextureMatrix(this.nativeRXVideoFrame));
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        RXPixelFormat rXPixelFormatNativeGetPixelFormat = nativeGetPixelFormat(this.nativeRXVideoFrame);
        if (rXPixelFormatNativeGetPixelFormat == RXPixelFormat.kTexture2D) {
            return VideoFrame.TextureBuffer.Type.RGB;
        }
        if (rXPixelFormatNativeGetPixelFormat == RXPixelFormat.kTextureOES) {
            return VideoFrame.TextureBuffer.Type.OES;
        }
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        return nativeGetUnscaledHeight(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return nativeGetUnscaledWidth(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return nativeGetWidth(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public float[] nativeGetTransFormMatrix() {
        return nativeGetFloatTextureMatrix(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return nativeToI420(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer
    public int getBufferType() {
        return C1280210jQ3.LIZ(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public long getNativeEglContext() {
        EGLContext eGLContext = getEGLContext();
        if (eGLContext == null) {
            return 0L;
        }
        return eGLContext.getNativeHandle();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTypeGlTarget() {
        return getType().getGlTarget();
    }

    public static /* synthetic */ void lambda$new$0(long j) {
        C1C7U.LIZ("RXWebRTCTextureBuffer@138c.<init>$1L");
        nativeReleaseRXVideoFrame(j);
        C1C7U.LIZIZ("RXWebRTCTextureBuffer@138c.<init>$1L");
    }

    public RXWebRTCTextureBuffer(final long j, boolean z) {
        this.nativeRXVideoFrame = j;
        this.isAgfxTexture = z;
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: X.0jQS
            @Override // java.lang.Runnable
            public final void run() {
                RXWebRTCTextureBuffer.lambda$new$0(j);
            }
        });
    }

    public VideoFrame.TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2) {
        return applyTransformMatrix(matrix, i, i2, i, i2, FilterType.Origin);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        if (this.isAgfxTexture) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(Math.min(i, (getWidth() * i2) / getHeight()) / getWidth(), Math.min(i2, (getHeight() * i) / getWidth()) / getHeight());
        matrix.preTranslate(i3 / i, (i2 - (i4 + r3)) / i2);
        return applyTransformMatrix(matrix, i, i2);
    }

    private VideoFrame.TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2, int i3, int i4, FilterType filterType) {
        if (this.isAgfxTexture) {
            return null;
        }
        Matrix matrix2 = new Matrix(getTransformMatrix());
        matrix2.preConcat(matrix);
        retain();
        RXVideoScaleFilter rXVideoScaleFilterFromId = RXVideoScaleFilter.fromId(filterType.toInt());
        return new RXWebRTCTextureBuffer(nativeCreateTextureRXVideoFrame(this.nativeRXVideoFrame, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2), i, i2, i3, i4, rXVideoScaleFilterFromId), false);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.isAgfxTexture) {
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        int unscaledWidth = getUnscaledWidth();
        int unscaledHeight = getUnscaledHeight();
        Matrix matrix = new Matrix();
        float f = width;
        float f2 = height - (i2 + i4);
        float f3 = height;
        matrix.preTranslate(i / f, f2 / f3);
        matrix.preScale(i3 / f, i4 / f3);
        return applyTransformMatrix(matrix, Math.round((unscaledWidth * i3) / f), Math.round((unscaledHeight * i4) / f3), i5, i6, FilterType.Origin);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.isAgfxTexture) {
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        int unscaledWidth = getUnscaledWidth();
        int unscaledHeight = getUnscaledHeight();
        Matrix matrix = new Matrix();
        float f = width;
        float f2 = height - (i2 + i4);
        float f3 = height;
        matrix.preTranslate(i / f, f2 / f3);
        matrix.preScale(i3 / f, i4 / f3);
        return applyTransformMatrix(matrix, Math.round((unscaledWidth * i3) / f), Math.round((unscaledHeight * i4) / f3), i5, i6, FilterType.fromValue(i7));
    }
}
