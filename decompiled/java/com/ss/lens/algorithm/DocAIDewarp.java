package com.ss.lens.algorithm;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class DocAIDewarp {
    public static boolean isLibLoaded;
    public static LibLoaderListener mLoaderListener;
    public static long mNativePtr;

    public interface LibLoaderListener {
        boolean onLoader(String str);
    }

    public static native Bitmap nativeDocAIDewarp(long j, Bitmap bitmap);

    public static native long nativeDocAIInitDewarp(String str, String str2);

    public static native void nativeDocAIReleaseDewarp(long j);

    public static void DocAIReleaseDewarp() {
        long j = mNativePtr;
        if (j == 0) {
            return;
        }
        nativeDocAIReleaseDewarp(j);
    }

    public static Bitmap DocAIDewarp(Bitmap bitmap) {
        long j = mNativePtr;
        if (j == 0) {
            return null;
        }
        return nativeDocAIDewarp(j, bitmap);
    }

    public static void INVOKESTATIC_com_ss_lens_algorithm_DocAIDewarp_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
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

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0026 -> B:33:0x002c). Please report as a decompilation issue!!! */
    public static synchronized boolean DocAIInitDewarp(String str, String str2) {
        if (!isLibLoaded) {
            try {
                LibLoaderListener libLoaderListener = mLoaderListener;
                if (libLoaderListener != null) {
                    libLoaderListener.onLoader("c++_shared");
                    mLoaderListener.onLoader("bytenn");
                } else {
                    INVOKESTATIC_com_ss_lens_algorithm_DocAIDewarp_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                    INVOKESTATIC_com_ss_lens_algorithm_DocAIDewarp_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
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
                    INVOKESTATIC_com_ss_lens_algorithm_DocAIDewarp_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                }
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.printStackTrace();
                return false;
            }
        }
        long jNativeDocAIInitDewarp = nativeDocAIInitDewarp(str, str2);
        mNativePtr = jNativeDocAIInitDewarp;
        if (jNativeDocAIInitDewarp != 0) {
            return true;
        }
        return false;
    }
}
