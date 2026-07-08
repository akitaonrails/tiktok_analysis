package com.ss.android.ttve.audio;

import X.InterfaceC2218141Brg;

/* JADX INFO: loaded from: classes35.dex */
public class TEDubWriter implements InterfaceC2218141Brg {
    public final long LIZ = nativeCreate();
    public long LIZIZ;

    public native int nativeAddPCMData(long j, byte[] bArr, int i);

    public native int nativeCloseWavFile(long j);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native long nativeGetCurrentTime(long j);

    public native int nativeInitWavFile(long j, String str, int i, int i2, double d, int i3, int i4);

    @Override // X.InterfaceC2218141Brg
    public final int LIZIZ() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeCloseWavFile(j);
    }

    @Override // X.InterfaceC2218141Brg
    public final void destroy() {
        long j = this.LIZ;
        if (j != 0) {
            nativeDestroy(j);
        }
    }

    @Override // X.InterfaceC2218141Brg
    public final long LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2218141Brg
    public final int LIZJ(int i, byte[] bArr) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int iNativeAddPCMData = nativeAddPCMData(j, bArr, i);
        this.LIZIZ = nativeGetCurrentTime(this.LIZ);
        return iNativeAddPCMData;
    }

    @Override // X.InterfaceC2218141Brg
    public final int LIZ(int i, String str, int i2, double d, int i3) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeInitWavFile(j, str, i, 2, d, i2, i3);
    }
}
