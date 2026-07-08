package com.ss.pusher.core.opengl;

/* JADX INFO: loaded from: classes21.dex */
public class GlRenderDrawer {
    public long LIZ = nativeCreateRender(false);

    private native long nativeCreateRender(boolean z);

    private native boolean nativeDrawOes(long j, int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5);

    private native boolean nativeDrawRectangle(long j, int i, int i2, int i3, int i4);

    private native boolean nativeDrawRgb(long j, int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5);

    private native boolean nativeDrawYuv(long j, int[] iArr, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5);

    private native void nativeRelease(long j);

    public final void LIZJ() {
        long j = this.LIZ;
        if (j != 0) {
            nativeRelease(j);
        }
        this.LIZ = 0L;
    }

    public final void finalize() {
        LIZJ();
    }

    public final void LIZ(int i, float[] fArr, float[] fArr2, int i2, int i3) {
        nativeDrawOes(this.LIZ, i, fArr, fArr2, 0, 0, i2, i3);
    }

    public final void LIZIZ(int i, float[] fArr, float[] fArr2, int i2, int i3) {
        nativeDrawRgb(this.LIZ, i, fArr, fArr2, 0, 0, i2, i3);
    }
}
