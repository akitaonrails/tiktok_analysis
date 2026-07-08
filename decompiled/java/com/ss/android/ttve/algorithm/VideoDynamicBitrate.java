package com.ss.android.ttve.algorithm;

/* JADX INFO: loaded from: classes21.dex */
public class VideoDynamicBitrate {
    public long LIZ;

    private native VideoDynamicBitrateResult nativeDynamicBitrateGetOutput(long j, VideoDynamicBitrateResult videoDynamicBitrateResult);

    private native long nativeDynamicBitrateInit(boolean z, int i, String str, int i2, int i3, String str2);

    private native int nativeDynamicBitrateProcess(long j, byte[] bArr);

    private native int nativeDynamicBitrateRelease(long j);

    public final void LIZLLL() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeDynamicBitrateRelease(j);
        this.LIZ = 0L;
    }

    public final VideoDynamicBitrateResult LIZ(VideoDynamicBitrateResult videoDynamicBitrateResult) {
        return nativeDynamicBitrateGetOutput(this.LIZ, videoDynamicBitrateResult);
    }

    public final void LIZJ(byte[] bArr) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeDynamicBitrateProcess(j, bArr);
    }

    public final boolean LIZIZ(String str, int i, boolean z, int i2, int i3) {
        long jNativeDynamicBitrateInit = nativeDynamicBitrateInit(z, i, str, i2, i3, "");
        this.LIZ = jNativeDynamicBitrateInit;
        if (jNativeDynamicBitrateInit == 0) {
            return false;
        }
        return true;
    }
}
