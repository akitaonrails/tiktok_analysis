package com.lynx.tasm.behavior.ui.list.container;

/* JADX INFO: loaded from: classes21.dex */
public class ListContainerProxy {
    public long LIZ;

    private native long nativeCreate(long j);

    private native void nativeDestroy(long j);

    private native void nativeScrollByListContainer(long j, int i, float f, float f2, float f3, float f4);

    private native void nativeScrollStopped(long j, int i);

    private native void nativeScrollToPosition(long j, int i, int i2, float f, int i3, boolean z);

    public final void LIZ() {
        long j = this.LIZ;
        if (j != 0) {
            nativeDestroy(j);
            this.LIZ = 0L;
        }
    }

    public ListContainerProxy() {
    }

    public ListContainerProxy(long j) {
        this.LIZ = nativeCreate(j);
    }

    public final void LIZJ(int i) {
        long j = this.LIZ;
        if (j != 0) {
            nativeScrollStopped(j, i);
        }
    }

    public final void LIZIZ(float f, float f2, float f3, float f4, int i) {
        long j = this.LIZ;
        if (j != 0) {
            nativeScrollByListContainer(j, i, f, f2, f3, f4);
        }
    }

    public final void LIZLLL(boolean z, float f, int i, int i2, int i3) {
        long j = this.LIZ;
        if (j != 0) {
            nativeScrollToPosition(j, i, i2, f, i3, z);
        }
    }
}
