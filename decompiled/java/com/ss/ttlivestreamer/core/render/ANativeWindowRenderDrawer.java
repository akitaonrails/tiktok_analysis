package com.ss.ttlivestreamer.core.render;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class ANativeWindowRenderDrawer {
    public long nativeObj = nativeCreateANativeWindowRenderDrawer();

    private native void nativeBindANativeWindowWrapper(long j, long j2);

    private native long nativeCreateANativeWindowRenderDrawer();

    private native boolean nativeDrawRawYuv(long j, int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5);

    private native boolean nativeDrawRgb(long j, int i, int i2, ByteBuffer byteBuffer);

    private native void nativeRelease(long j);

    private native void nativeSetRoundCornerToWidthRadius(long j, float f);

    public void release() {
        nativeRelease(this.nativeObj);
        this.nativeObj = 0L;
    }

    public void bindANativeWindow(ANativeWindowWrapper aNativeWindowWrapper) {
        if (aNativeWindowWrapper != null) {
            nativeBindANativeWindowWrapper(this.nativeObj, aNativeWindowWrapper.nativeObj());
        }
    }

    public void setRoundCornerToWidthRadius(float f) {
        nativeSetRoundCornerToWidthRadius(this.nativeObj, f);
    }

    public boolean drawRgb(int i, int i2, ByteBuffer byteBuffer) {
        return nativeDrawRgb(this.nativeObj, i, i2, byteBuffer);
    }

    public boolean drawRawYuv(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5) {
        return nativeDrawRawYuv(this.nativeObj, i, i2, byteBuffer, byteBuffer2, byteBuffer3, i3, i4, i5);
    }
}
