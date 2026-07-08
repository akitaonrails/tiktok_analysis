package com.ss.lens.algorithm;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class PictureOCLSR {
    public static boolean isLibLoaded;
    public long mNativePtr;
    public int maxHeight = 1080;
    public int minHeight = 500;
    public int maxWidth = 600;
    public int minWidth = 360;

    private native long nativeInitPictureOclSr(String str, int i, int i2, int i3);

    private native int nativePictureOclSrProcess(long j, Bitmap bitmap, Bitmap bitmap2);

    private native void nativeReleasePictureOclSr(long j);

    public void ReleasePictureOclSr() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleasePictureOclSr(j);
    }

    public static void INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public synchronized boolean InitPictureOclSr(String str) {
        if (!isLibLoaded) {
            try {
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fastcv");
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            try {
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
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
        long jNativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, 4);
        this.mNativePtr = jNativeInitPictureOclSr;
        if (jNativeInitPictureOclSr != 0) {
            return true;
        }
        return false;
    }

    public boolean IsSrSupport(Bitmap bitmap) {
        if (bitmap.getConfig() != Bitmap.Config.RGB_565) {
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width % 2 != 0 || height % 2 != 0 || width < this.minWidth || width > this.maxWidth || height < this.minHeight || height > this.maxHeight) {
            return false;
        }
        return true;
    }

    public synchronized boolean InitPictureOclSr(String str, int i) {
        if (!isLibLoaded) {
            try {
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fastcv");
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            try {
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
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
        long jNativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, i);
        this.mNativePtr = jNativeInitPictureOclSr;
        if (jNativeInitPictureOclSr != 0) {
            return true;
        }
        return false;
    }

    public synchronized int PictureOclSrProcess(Bitmap bitmap, Bitmap bitmap2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width % 2 != 0 || height % 2 != 0) {
            return -1;
        }
        if (width < this.minWidth || width > this.maxWidth || height < this.minHeight || height > this.maxHeight) {
            return -1;
        }
        if (nativePictureOclSrProcess(this.mNativePtr, bitmap, bitmap2) != 0) {
            return -1;
        }
        return 0;
    }

    public synchronized boolean InitPictureOclSr(String str, int i, int i2, int i3, int i4, int i5) {
        if (i2 > i3 || i4 > i5 || i2 <= 0 || i4 <= 0) {
            return false;
        }
        if (!isLibLoaded) {
            try {
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fastcv");
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            try {
                INVOKESTATIC_com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.printStackTrace();
                return false;
            }
        }
        this.maxHeight = i5;
        this.minHeight = i4;
        this.maxWidth = i3;
        this.minWidth = i2;
        if (str.isEmpty()) {
            return false;
        }
        long jNativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, i);
        this.mNativePtr = jNativeInitPictureOclSr;
        if (jNativeInitPictureOclSr == 0) {
            return false;
        }
        return true;
    }
}
