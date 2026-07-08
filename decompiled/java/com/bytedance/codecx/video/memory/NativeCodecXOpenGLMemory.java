package com.bytedance.codecx.video.memory;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import com.bytedance.codecx.video.CodecXMediaCodecTextureBufferHelper;
import com.bytedance.codecx.video.CodecXPixelFormat;
import com.bytedance.codecx.video.CodecXVideoMemoryType;
import com.bytedance.codecx.video.CodecXVideoRotation;
import com.bytedance.codecx.video.CodecXVideoScaleFilter;
import com.bytedance.codecx.video.RendererCommon;

/* JADX INFO: loaded from: classes21.dex */
public class NativeCodecXOpenGLMemory extends CodecXVideoMemory implements CodecXVideoOpenGLMemoryInterface {
    public static native long nativeCreateOpenGLMemory(int i, int i2, int i3, int i4, int i5, CodecXPixelFormat codecXPixelFormat, float[] fArr, EGLContext eGLContext, CodecXVideoScaleFilter codecXVideoScaleFilter, CodecXVideoRotation codecXVideoRotation, Runnable runnable);

    public static native int nativeGetFrameAttribute(long j, int i);

    public static native long nativeGetGLSync(long j);

    public static native EGLContext nativeGetJavaEGLContext(long j);

    public static native long nativeGetNativeEGLContext(long j);

    public static native CodecXPixelFormat nativeGetPixelFormat(long j);

    public static native CodecXVideoRotation nativeGetRotation(long j);

    public static native CodecXVideoScaleFilter nativeGetScaleFilter(long j);

    public static native float[] nativeGetTextureMatrix(long j);

    public static native CodecXVideoMemoryType nativeGetVideoMemoryType(long j);

    public static native void nativeSetRenderHelper(long j, CodecXMediaCodecTextureBufferHelper codecXMediaCodecTextureBufferHelper);

    @Override // com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface
    public int getHeight() {
        return nativeGetFrameAttribute(this.nativeHandle, 1);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface
    public CodecXVideoScaleFilter getScaleFilter() {
        return nativeGetScaleFilter(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface
    public int getUnScaledHeight() {
        return nativeGetFrameAttribute(this.nativeHandle, 3);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface
    public int getUnScaledWidth() {
        return nativeGetFrameAttribute(this.nativeHandle, 2);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface
    public int getWidth() {
        return nativeGetFrameAttribute(this.nativeHandle, 0);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface
    public Matrix getAndroidTextureMatrix() {
        return isNullPointer() ? new Matrix() : RendererCommon.convertMatrixToAndroidGraphicsMatrix(nativeGetTextureMatrix(this.nativeHandle));
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface
    public EGLContext getEGLContext() {
        return isNullPointer() ? EGL14.EGL_NO_CONTEXT : nativeGetJavaEGLContext(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface
    public long getGLSync() {
        if (isNullPointer()) {
            return 0L;
        }
        return nativeGetGLSync(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface
    public CodecXVideoMemoryType getMemoryType() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetVideoMemoryType(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface
    public long getNativeEGLContext() {
        if (isNullPointer()) {
            return 0L;
        }
        return nativeGetNativeEGLContext(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface
    public CodecXPixelFormat getPixelFormat() {
        return isNullPointer() ? CodecXPixelFormat.kUnknown : nativeGetPixelFormat(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface
    public CodecXVideoRotation getRotation() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetRotation(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface
    public int getTextureId() {
        if (isNullPointer()) {
            return 0;
        }
        return nativeGetFrameAttribute(this.nativeHandle, 4);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface
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

    public class OpenglMemoryAttribute {
        public OpenglMemoryAttribute() {
        }
    }

    public NativeCodecXOpenGLMemory(long j) {
        super(j);
    }

    public static void release(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setRenderHelper(CodecXMediaCodecTextureBufferHelper codecXMediaCodecTextureBufferHelper) {
        nativeSetRenderHelper(this.nativeHandle, codecXMediaCodecTextureBufferHelper);
    }

    public static NativeCodecXOpenGLMemory createCodecXOpenGLMemory(int i, int i2, int i3, int i4, int i5, CodecXPixelFormat codecXPixelFormat, float[] fArr, EGLContext eGLContext, CodecXVideoScaleFilter codecXVideoScaleFilter, CodecXVideoRotation codecXVideoRotation, Runnable runnable) {
        return new NativeCodecXOpenGLMemory(nativeCreateOpenGLMemory(i, i2, i3, i4, i5, codecXPixelFormat, fArr, eGLContext, codecXVideoScaleFilter, codecXVideoRotation, runnable));
    }
}
