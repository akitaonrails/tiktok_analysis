package com.ss.lens.algorithm;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class OnekeyRec {
    public static boolean isLibLoaded;
    public long mNativePtr;

    private native int nativeGetOnekeyRecOutput(long j);

    private native long nativeInitOnekeyRec(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2);

    private native int nativeOnekeyRecProcess(long j, int i, int i2, int i3, float[] fArr, boolean z);

    private native void nativeReleaseOnekeyRec(long j);

    public int GetOnekeyRecOutput() {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeGetOnekeyRecOutput(j);
    }

    public void ReleaseOnekeyRec() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseOnekeyRec(j);
    }

    public static void INVOKESTATIC_com_ss_lens_algorithm_OnekeyRec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public int OnekeyRecProcess(int i, int i2, int i3, float[] fArr, boolean z) {
        long j = this.mNativePtr;
        if (j != 0 && i2 > 0 && i3 > 0) {
            return nativeOnekeyRecProcess(j, i, i2, i3, fArr, z);
        }
        return -1;
    }

    public synchronized boolean InitOnekeyRec(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2) {
        if (!isLibLoaded) {
            try {
                INVOKESTATIC_com_ss_lens_algorithm_OnekeyRec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                INVOKESTATIC_com_ss_lens_algorithm_OnekeyRec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                INVOKESTATIC_com_ss_lens_algorithm_OnekeyRec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fastcv");
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            try {
                INVOKESTATIC_com_ss_lens_algorithm_OnekeyRec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
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
        long jNativeInitOnekeyRec = nativeInitOnekeyRec(str, z, z2, z3, z4, z5, z6, i, i2);
        this.mNativePtr = jNativeInitOnekeyRec;
        if (jNativeInitOnekeyRec != 0) {
            return true;
        }
        return false;
    }
}
