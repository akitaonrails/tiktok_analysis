package com.ss.ttlivestreamer.core.render;

import X.C1272910jEH;
import android.view.Surface;

/* JADX INFO: loaded from: classes21.dex */
public class ANativeWindowWrapper {
    public boolean inited;
    public boolean isSupport;
    public boolean setDataSpaceSuccess;
    public boolean needForceResetDataSpace = true;
    public final C1272910jEH sizeInfoCache = new C1272910jEH();
    public long nativeObj = nativeCreateANativeWindowWrapper();

    private native void nativeBindToNativeWindow(long j, Surface surface);

    private native long nativeCreateANativeWindowWrapper();

    private native int nativeIsSupport(long j);

    private native void nativeRelease(long j);

    private native int nativeResetDataSpace(long j, int i, int i2, int i3, int i4, int i5);

    private native void nativeUnBindNativeWindow(long j);

    public boolean isSupport() {
        if (!this.inited) {
            int iNativeIsSupport = nativeIsSupport(this.nativeObj);
            this.inited = true;
            this.isSupport = iNativeIsSupport == 0;
        }
        return this.isSupport;
    }

    public void release() {
        nativeRelease(this.nativeObj);
        this.nativeObj = 0L;
    }

    public void unBindNativeWindow() {
        nativeUnBindNativeWindow(this.nativeObj);
        this.needForceResetDataSpace = false;
    }

    public long nativeObj() {
        return this.nativeObj;
    }

    public void bindToNativeWindow(Surface surface) {
        nativeBindToNativeWindow(this.nativeObj, surface);
        this.needForceResetDataSpace = true;
    }

    public boolean resetGeometryAndDataSpace(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z = false;
        if (i4 == 0 || i5 == 0) {
            return false;
        }
        C1272910jEH c1272910jEH = this.sizeInfoCache;
        if (c1272910jEH.LIZ == i && c1272910jEH.LIZIZ == i2 && c1272910jEH.LIZJ == i3 && c1272910jEH.LIZLLL == i4 && c1272910jEH.LJ == i5 && c1272910jEH.LJFF == i6 && c1272910jEH.LJI == i7) {
            if (this.needForceResetDataSpace) {
            }
            return this.setDataSpaceSuccess;
        }
        c1272910jEH.LIZ = i;
        c1272910jEH.LIZIZ = i2;
        c1272910jEH.LIZJ = i3;
        c1272910jEH.LIZLLL = i4;
        c1272910jEH.LJ = i5;
        c1272910jEH.LJFF = i6;
        c1272910jEH.LJI = i7;
        float f = i6;
        float f2 = i4;
        float f3 = (f * 1.0f) / f2;
        float f4 = i7;
        float f5 = i5;
        float f6 = (f2 * 1.0f) / f5;
        if (f3 < (f4 * 1.0f) / f5) {
            c1272910jEH.LJII = i6;
            c1272910jEH.LJIIIIZZ = (int) (f / f6);
        } else {
            c1272910jEH.LJIIIIZZ = i7;
            c1272910jEH.LJII = (int) (f4 * f6);
        }
        int i8 = c1272910jEH.LJII;
        if ((i8 & 1) == 1) {
            c1272910jEH.LJII = i8 - 1;
        }
        int i9 = c1272910jEH.LJIIIIZZ;
        if ((i9 & 1) == 1) {
            c1272910jEH.LJIIIIZZ = i9 - 1;
        }
        this.needForceResetDataSpace = false;
        if (nativeResetDataSpace(this.nativeObj, i, i2, i3, c1272910jEH.LJII, c1272910jEH.LJIIIIZZ) == 0) {
            z = true;
        }
        this.setDataSpaceSuccess = z;
        return this.setDataSpaceSuccess;
    }
}
