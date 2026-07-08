package com.bytedance.realx.video.memory;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.realx.video.RXVideoRotation;
import com.bytedance.realx.video.RXVideoScaleFilter;
import com.bytedance.realx.video.RendererCommon;

/* JADX INFO: loaded from: classes21.dex */
public class NativeRXOpenGLMemory extends RXVideoMemory implements RXVideoOpenGLMemoryInterface {
    public static native long nativeCreateOpenGLMemory(int i, int i2, int i3, int i4, int i5, RXPixelFormat rXPixelFormat, float[] fArr, EGLContext eGLContext, RXVideoScaleFilter rXVideoScaleFilter, RXVideoRotation rXVideoRotation, Runnable runnable);

    public static native long nativeGetGLSync(long j);

    public static native int nativeGetHeight(long j);

    public static native EGLContext nativeGetJavaEGLContext(long j);

    public static native long nativeGetNativeEGLContext(long j);

    public static native RXVideoRotation nativeGetRotation(long j);

    public static native RXVideoScaleFilter nativeGetScaleFilter(long j);

    public static native int nativeGetTextureId(long j);

    public static native float[] nativeGetTextureMatrix(long j);

    public static native RXPixelFormat nativeGetTextureTarget(long j);

    public static native int nativeGetUnscaledHeight(long j);

    public static native int nativeGetUnscaledWidth(long j);

    public static native RXVideoMemoryType nativeGetVideoMemoryType(long j);

    public static native int nativeGetWidth(long j);

    public static native void nativeReleaseTextureVideoMemory(long j);

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public int getHeight() {
        return nativeGetHeight(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public RXVideoScaleFilter getScaleFilter() {
        return nativeGetScaleFilter(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public int getUnScaledHeight() {
        return nativeGetUnscaledHeight(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public int getUnScaledWidth() {
        return nativeGetUnscaledWidth(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public int getWidth() {
        return nativeGetWidth(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public Matrix getAndroidTextureMatrix() {
        return isNullPointer() ? new Matrix() : RendererCommon.convertMatrixToAndroidGraphicsMatrix(nativeGetTextureMatrix(this.nativeHandle));
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public EGLContext getEGLContext() {
        return isNullPointer() ? EGL14.EGL_NO_CONTEXT : nativeGetJavaEGLContext(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public long getGLSync() {
        if (isNullPointer()) {
            return 0L;
        }
        return nativeGetGLSync(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public RXVideoMemoryType getMemoryType() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetVideoMemoryType(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public long getNativeEGLContext() {
        if (isNullPointer()) {
            return 0L;
        }
        return nativeGetNativeEGLContext(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public RXPixelFormat getPixelFormat() {
        return getTextureTarget();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public RXVideoRotation getRotation() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetRotation(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public int getTextureId() {
        if (isNullPointer()) {
            return 0;
        }
        return nativeGetTextureId(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public float[] getTextureMatrix() {
        if (!isNullPointer()) {
            return nativeGetTextureMatrix(this.nativeHandle);
        }
        float[] fArr = new float[16];
        fArr[0] = 1.0f;
        fArr[5] = 1.0f;
        fArr[10] = 1.0f;
        fArr[15] = 1.0f;
        return fArr;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public RXPixelFormat getTextureTarget() {
        return isNullPointer() ? RXPixelFormat.kUnknown : nativeGetTextureTarget(this.nativeHandle);
    }

    public NativeRXOpenGLMemory(long j) {
        super(j);
    }

    public static void release(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static NativeRXOpenGLMemory createRXOpenGLMemory(int i, int i2, int i3, int i4, int i5, RXPixelFormat rXPixelFormat, float[] fArr, EGLContext eGLContext, RXVideoScaleFilter rXVideoScaleFilter, RXVideoRotation rXVideoRotation, Runnable runnable) {
        return new NativeRXOpenGLMemory(nativeCreateOpenGLMemory(i, i2, i3, i4, i5, rXPixelFormat, fArr, eGLContext, rXVideoScaleFilter, rXVideoRotation, runnable));
    }
}
