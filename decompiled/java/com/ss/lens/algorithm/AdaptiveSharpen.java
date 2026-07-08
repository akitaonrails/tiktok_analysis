package com.ss.lens.algorithm;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class AdaptiveSharpen {
    public static boolean isLibLoaded;
    public long mNativePtr;

    private native int nativeAdaptiveSharpenProcess(long j, int i, int i2, int i3, float[] fArr, boolean z, int i4, float f, float f2, float f3, int i5);

    private native int nativeGetAdaptiveSharpenOutput(long j);

    private native long nativeInitAdaptiveSharpen(boolean z, int i, int i2, int i3);

    private native void nativeReleaseAdaptiveSharpen(long j);

    public int GetAdaptiveSharpenOutput() {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeGetAdaptiveSharpenOutput(j);
    }

    public void ReleaseAdaptiveSharpen() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseAdaptiveSharpen(j);
    }

    public static void INVOKESTATIC_com_ss_lens_algorithm_AdaptiveSharpen_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public synchronized boolean InitAdaptiveSharpen(boolean z, int i, int i2, int i3) {
        if (!isLibLoaded) {
            try {
                INVOKESTATIC_com_ss_lens_algorithm_AdaptiveSharpen_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                INVOKESTATIC_com_ss_lens_algorithm_AdaptiveSharpen_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                INVOKESTATIC_com_ss_lens_algorithm_AdaptiveSharpen_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fastcv");
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            try {
                INVOKESTATIC_com_ss_lens_algorithm_AdaptiveSharpen_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.printStackTrace();
                return false;
            }
        }
        long jNativeInitAdaptiveSharpen = nativeInitAdaptiveSharpen(z, i, i2, i3);
        this.mNativePtr = jNativeInitAdaptiveSharpen;
        if (jNativeInitAdaptiveSharpen == 0) {
            return false;
        }
        return true;
    }

    public int AdaptiveSharpenProcess(int i, int i2, int i3, boolean z, int i4, float f, float f2, float f3, int i5) {
        long j = this.mNativePtr;
        if (j != 0 && i2 > 0 && i3 > 0) {
            return nativeAdaptiveSharpenProcess(j, i, i2, i3, null, z, i4, f, f2, f3, i5);
        }
        return -1;
    }

    public int AdaptiveSharpenOesProcess(int i, int i2, int i3, float[] fArr, boolean z, int i4, float f, float f2, float f3, int i5) {
        long j = this.mNativePtr;
        if (j != 0 && i2 > 0 && i3 > 0) {
            return nativeAdaptiveSharpenProcess(j, i, i2, i3, fArr, z, i4, f, f2, f3, i5);
        }
        return -1;
    }
}
