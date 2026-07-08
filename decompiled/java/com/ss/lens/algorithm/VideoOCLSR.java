package com.ss.lens.algorithm;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class VideoOCLSR {
    public static boolean isLibLoaded;
    public static LibLoaderListener mLoaderListener;
    public long mNativePtr;

    public interface LibLoaderListener {
        boolean onLoader(String str);
    }

    private native int nativeGetVideoOclSrOutput(long j);

    private native long nativeInitVideoOclSr(String str, int i, boolean z, boolean z2, int i2, int i3);

    private native void nativeReleaseVideoOclSr(long j);

    private native int nativeVideoOclSrOesProcess(long j, int i, int i2, int i3, float[] fArr, boolean z);

    private native int nativeVideoOclSrProcess(long j, int i, int i2, int i3, boolean z);

    public int GetVideoOclSrOutput() {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeGetVideoOclSrOutput(j);
    }

    public void ReleaseVideoOclSr() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseVideoOclSr(j);
    }

    public static void INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static synchronized void setOutLoader(LibLoaderListener libLoaderListener) {
        mLoaderListener = libLoaderListener;
    }

    public synchronized boolean InitVideoOclSr(String str, int i, boolean z) {
        if (!isLibLoaded) {
            try {
                LibLoaderListener libLoaderListener = mLoaderListener;
                if (libLoaderListener != null) {
                    libLoaderListener.onLoader("c++_shared");
                    mLoaderListener.onLoader("fastcv");
                    mLoaderListener.onLoader("bytenn");
                } else {
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fastcv");
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            try {
                LibLoaderListener libLoaderListener2 = mLoaderListener;
                if (libLoaderListener2 != null) {
                    if (!libLoaderListener2.onLoader("lens")) {
                        return false;
                    }
                } else {
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                }
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
        long jNativeInitVideoOclSr = nativeInitVideoOclSr(str, i, z, true, 720, 1440);
        this.mNativePtr = jNativeInitVideoOclSr;
        if (jNativeInitVideoOclSr != 0) {
            return true;
        }
        return false;
    }

    public int VideoOclSrProcess(int i, int i2, int i3, boolean z) {
        long j = this.mNativePtr;
        if (j != 0 && i2 > 0 && i3 > 0) {
            return nativeVideoOclSrProcess(j, i, i2, i3, z);
        }
        return -1;
    }

    public synchronized boolean InitVideoOclSr(String str, int i, boolean z, int i2, int i3) {
        if (!isLibLoaded) {
            try {
                LibLoaderListener libLoaderListener = mLoaderListener;
                if (libLoaderListener != null) {
                    libLoaderListener.onLoader("c++_shared");
                    mLoaderListener.onLoader("fastcv");
                    mLoaderListener.onLoader("bytenn");
                } else {
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fastcv");
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            try {
                LibLoaderListener libLoaderListener2 = mLoaderListener;
                if (libLoaderListener2 != null) {
                    if (!libLoaderListener2.onLoader("lens")) {
                        return false;
                    }
                } else {
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                }
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
        long jNativeInitVideoOclSr = nativeInitVideoOclSr(str, i, z, true, i2, i3);
        this.mNativePtr = jNativeInitVideoOclSr;
        if (jNativeInitVideoOclSr != 0) {
            return true;
        }
        return false;
    }

    public int VideoOclSrOesProcess(int i, int i2, int i3, float[] fArr, boolean z) {
        long j = this.mNativePtr;
        if (j != 0 && i2 > 0 && i3 > 0) {
            return nativeVideoOclSrOesProcess(j, i, i2, i3, fArr, z);
        }
        return -1;
    }

    public synchronized boolean InitVideoOclSr(String str, int i, boolean z, boolean z2, int i2, int i3) {
        if (!isLibLoaded) {
            try {
                LibLoaderListener libLoaderListener = mLoaderListener;
                if (libLoaderListener != null) {
                    libLoaderListener.onLoader("c++_shared");
                    mLoaderListener.onLoader("fastcv");
                    mLoaderListener.onLoader("bytenn");
                } else {
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fastcv");
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            try {
                LibLoaderListener libLoaderListener2 = mLoaderListener;
                if (libLoaderListener2 != null) {
                    if (!libLoaderListener2.onLoader("lens")) {
                        return false;
                    }
                } else {
                    INVOKESTATIC_com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                }
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
        long jNativeInitVideoOclSr = nativeInitVideoOclSr(str, i, z, z2, i2, i3);
        this.mNativePtr = jNativeInitVideoOclSr;
        if (jNativeInitVideoOclSr != 0) {
            return true;
        }
        return false;
    }
}
