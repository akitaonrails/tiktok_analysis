package com.ss.ttlivestreamer.core.opengl;

/* JADX INFO: loaded from: classes21.dex */
public class GlRenderDrawer {
    public long mNativeObj;

    public GlRenderDrawer() {
        this(false);
    }

    private native long nativeCreateRender(boolean z);

    private native boolean nativeDrawOes(long j, int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5);

    private native boolean nativeDrawRectangle(long j, int i, int i2, int i3, int i4);

    private native boolean nativeDrawRgb(long j, int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5);

    private native boolean nativeDrawYuv(long j, int[] iArr, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5);

    private native void nativeRelease(long j);

    private native boolean nativeSetCornerRadius(long j, float f);

    private native void nativeSetEnableRoundedCorner(long j, boolean z);

    private native void nativeSetVideoRangeDefault(long j, boolean z);

    public void release() {
        long j = this.mNativeObj;
        if (j != 0) {
            nativeRelease(j);
        }
        this.mNativeObj = 0L;
    }

    public void finalize() {
        release();
    }

    public GlRenderDrawer(boolean z) {
        this.mNativeObj = nativeCreateRender(z);
    }

    public boolean setCornerRadius(float f) {
        return nativeSetCornerRadius(this.mNativeObj, f);
    }

    public void setEnableRoundedCorner(boolean z) {
        nativeSetEnableRoundedCorner(this.mNativeObj, z);
    }

    public void setUseVideoRangeDefault(boolean z) {
        nativeSetVideoRangeDefault(this.mNativeObj, z);
    }

    public boolean drawRectangle(int i, int i2, int i3, int i4) {
        return nativeDrawRectangle(this.mNativeObj, i, i2, i3, i4);
    }

    public boolean drawOes(int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5) {
        return nativeDrawOes(this.mNativeObj, i, fArr, fArr2, i2, i3, i4, i5);
    }

    public boolean drawRgb(int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5) {
        return nativeDrawRgb(this.mNativeObj, i, fArr, fArr2, i2, i3, i4, i5);
    }

    public boolean drawYuv(int[] iArr, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5) {
        return nativeDrawYuv(this.mNativeObj, iArr, fArr, fArr2, i, i2, i3, i4, i5);
    }
}
