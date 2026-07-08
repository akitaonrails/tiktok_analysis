package com.lynx.tasm.behavior;

/* JADX INFO: loaded from: classes21.dex */
public class LayoutNodeManager {
    public long LIZ;

    private native void nativeAlignNativeNode(long j, int i, float f, float f2);

    private native int nativeGetFlexDirection(long j, int i);

    private native float nativeGetHeight(long j, int i);

    private native int[] nativeGetMargin(long j, int i);

    private native float nativeGetMaxHeight(long j, int i);

    private native float nativeGetMaxWidth(long j, int i);

    private native float nativeGetMinHeight(long j, int i);

    private native float nativeGetMinWidth(long j, int i);

    private native int[] nativeGetPadding(long j, int i);

    private native float nativeGetWidth(long j, int i);

    private native boolean nativeIsDirty(long j, int i);

    private native void nativeMarkDirty(long j, int i);

    private native long nativeMeasureNativeNode(long j, int i, float f, int i2, float f2, int i3, boolean z);

    private native int[] nativeMeasureNativeNodeReturnWithBaseline(long j, int i, float f, int i2, float f2, int i3, boolean z);

    private native void nativeSetMeasureFunc(long j, int i, Object obj);

    private native void nativeSetNeedsLayoutForce(long j, int i);

    public final float LIZIZ(int i) {
        return nativeGetHeight(this.LIZ, i);
    }

    public final int[] LIZJ(int i) {
        return nativeGetMargin(this.LIZ, i);
    }

    public final float LIZLLL(int i) {
        return nativeGetWidth(this.LIZ, i);
    }

    public final boolean LJ(int i) {
        return nativeIsDirty(this.LIZ, i);
    }

    public final void LJFF(int i) {
        nativeMarkDirty(this.LIZ, i);
    }

    public final void LJIIIZ(int i) {
        nativeSetNeedsLayoutForce(this.LIZ, i);
    }

    public final void LJIIIIZZ(int i, Object obj) {
        nativeSetMeasureFunc(this.LIZ, i, obj);
    }

    public final void LIZ(float f, float f2, int i) {
        nativeAlignNativeNode(this.LIZ, i, f, f2);
    }

    public final long LJI(boolean z, int i, int i2, int i3, float f, float f2) {
        return nativeMeasureNativeNode(this.LIZ, i, f, i2, f2, i3, z);
    }

    public final int[] LJII(boolean z, int i, int i2, int i3, float f, float f2) {
        return nativeMeasureNativeNodeReturnWithBaseline(this.LIZ, i, f, i2, f2, i3, z);
    }
}
