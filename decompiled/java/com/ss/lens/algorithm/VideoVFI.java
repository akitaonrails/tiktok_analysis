package com.ss.lens.algorithm;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class VideoVFI {
    public static boolean isLibLoaded;
    public long mNativePtr;

    private native int nativeGetVideoVFIOutput(long j);

    private native long nativeInitVideoVFI(String str, int i, int i2, int i3, boolean z);

    private native void nativeReleaseVideoVFI(long j);

    private native int nativeVideoVFIOesProcess(long j, int i, int i2, int i3, int i4, int i5, float f, float[] fArr, boolean z);

    private native int nativeVideoVFIProcess(long j, int i, int i2, int i3, int i4, int i5, float f, boolean z);

    public int GetVideoVFIOutput() {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeGetVideoVFIOutput(j);
    }

    public void ReleaseVideoVFI() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseVideoVFI(j);
    }

    public static void INVOKESTATIC_com_ss_lens_algorithm_VideoVFI_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public synchronized boolean InitVideoVFI(String str, int i, int i2, int i3, boolean z) {
        if (!isLibLoaded) {
            try {
                INVOKESTATIC_com_ss_lens_algorithm_VideoVFI_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                INVOKESTATIC_com_ss_lens_algorithm_VideoVFI_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                INVOKESTATIC_com_ss_lens_algorithm_VideoVFI_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fastcv");
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            try {
                INVOKESTATIC_com_ss_lens_algorithm_VideoVFI_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.printStackTrace();
                return false;
            }
        }
        if (str.isEmpty()) {
            return false;
        }
        long jNativeInitVideoVFI = nativeInitVideoVFI(str, i, i2, i3, z);
        this.mNativePtr = jNativeInitVideoVFI;
        if (jNativeInitVideoVFI != 0) {
            return true;
        }
        return false;
    }

    public int VideoVFIProcess(int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        long j = this.mNativePtr;
        if (j != 0 && i3 > 0 && i4 > 0) {
            return nativeVideoVFIProcess(j, i, i2, i3, i4, i5, f, z);
        }
        return -1;
    }

    public int VideoVFIOesProcess(int i, int i2, int i3, int i4, int i5, float f, float[] fArr, boolean z) {
        long j = this.mNativePtr;
        if (j != 0 && i3 > 0 && i4 > 0) {
            return nativeVideoVFIOesProcess(j, i, i2, i3, i4, i5, f, fArr, z);
        }
        return -1;
    }
}
