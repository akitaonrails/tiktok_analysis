package com.ss.android.ttve.algorithm;

import X.EnumC2074108Ap;
import X.EnumC2074208Aq;

/* JADX INFO: loaded from: classes21.dex */
public class VideoSmartCodec {
    public long LIZ;

    private native VideoSmartCodecResult nativeVideoSmartCodecGetOutput(long j, VideoSmartCodecResult videoSmartCodecResult);

    private native long nativeVideoSmartCodecInit(int i, int i2, int i3, int i4, float f, int i5, int i6, int i7, String str, String str2, String str3, boolean z);

    private native int nativeVideoSmartCodecProcess(long j, int i, int i2, int i3, float[] fArr, float f, float f2, int i4);

    private native int nativeVideoSmartCodecRelease(long j);

    public final void LIZLLL() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeVideoSmartCodecRelease(j);
        this.LIZ = 0L;
    }

    public final VideoSmartCodecResult LIZ(VideoSmartCodecResult videoSmartCodecResult) {
        return nativeVideoSmartCodecGetOutput(this.LIZ, videoSmartCodecResult);
    }

    public final int LIZJ(int i, int i2, int i3, float[] fArr, float f, float f2, int i4) {
        long j = this.LIZ;
        if (j != 0 && i2 > 0 && i3 > 0) {
            return nativeVideoSmartCodecProcess(j, i, i2, i3, fArr, f, f2, i4);
        }
        return -1;
    }

    public final boolean LIZIZ(int i, int i2, int i3, int i4, float f, int i5, EnumC2074208Aq enumC2074208Aq, EnumC2074108Ap enumC2074108Ap, String str, String str2, boolean z, String str3) {
        long jNativeVideoSmartCodecInit = nativeVideoSmartCodecInit(i2, i, i4, i3, f, i5, enumC2074208Aq.ordinal(), enumC2074108Ap.ordinal(), str, str2, str3, z);
        this.LIZ = jNativeVideoSmartCodecInit;
        if (jNativeVideoSmartCodecInit == 0) {
            return false;
        }
        return true;
    }
}
