package com.ss.lens.algorithm;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class VideoNNSR {
    public long mNativePtr;

    private native int nativeGetVideoNNSrOutput(long j);

    private native long nativeInitVideoNNSr(int i, int i2, String str, String str2, String str3, boolean z);

    private native void nativeReleaseVideoNNSr(long j);

    private native int nativeVideoNNSrOesProcess(long j, int i, float[] fArr, boolean z);

    private native int nativeVideoNNSrProcess(long j, int i, boolean z);

    static {
        try {
            INVOKESTATIC_com_ss_lens_algorithm_VideoNNSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
            INVOKESTATIC_com_ss_lens_algorithm_VideoNNSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fastcv");
            INVOKESTATIC_com_ss_lens_algorithm_VideoNNSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
        }
        try {
            INVOKESTATIC_com_ss_lens_algorithm_VideoNNSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
            e2.printStackTrace();
        }
    }

    public int GetVideoNNSrOutput() {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeGetVideoNNSrOutput(j);
    }

    public void ReleaseVideoNNSr() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseVideoNNSr(j);
    }

    public static void INVOKESTATIC_com_ss_lens_algorithm_VideoNNSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public int VideoNNSrProcess(int i, boolean z) {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeVideoNNSrProcess(j, i, z);
    }

    public int VideoNNSrOesProcess(int i, float[] fArr, boolean z) {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeVideoNNSrOesProcess(j, i, fArr, z);
    }

    public boolean InitVideoNNSr(int i, int i2, String str, String str2, String str3, boolean z) {
        if (i <= 0 || i2 <= 0 || str.isEmpty() || str2.isEmpty() || str3.isEmpty()) {
            return false;
        }
        long jNativeInitVideoNNSr = nativeInitVideoNNSr(i, i2, str, str2, str3, z);
        this.mNativePtr = jNativeInitVideoNNSr;
        if (jNativeInitVideoNNSr == 0) {
            return false;
        }
        return true;
    }
}
