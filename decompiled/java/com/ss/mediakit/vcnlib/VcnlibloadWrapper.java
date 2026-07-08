package com.ss.mediakit.vcnlib;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class VcnlibloadWrapper {
    public static boolean isVcnload;
    public static boolean isVcnverifyLiteload;
    public static boolean isVcnverifyload;

    public static boolean tryLoadVcnlib() {
        synchronized (VcnlibloadWrapper.class) {
            try {
                boolean z = true;
                if (isVcnload) {
                    return true;
                }
                try {
                    INVOKESTATIC_com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("vcn");
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    z = false;
                }
                isVcnload = z;
                return z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean tryLoadVcnverifyLitelib() {
        synchronized (VcnlibloadWrapper.class) {
            try {
                boolean z = true;
                if (isVcnverifyLiteload) {
                    return true;
                }
                try {
                    INVOKESTATIC_com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("vcnverifylite");
                    CustomVerify._init();
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    z = false;
                }
                isVcnverifyLiteload = z;
                return z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean tryLoadVcnverifylib() {
        boolean z;
        synchronized (VcnlibloadWrapper.class) {
            try {
                boolean z2 = true;
                if (isVcnverifyload) {
                    return true;
                }
                try {
                    INVOKESTATIC_com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("vcnverify");
                    z = true;
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    z = false;
                }
                isVcnverifyload = z;
                if (!z && !tryLoadVcnverifyLitelib()) {
                    z2 = false;
                }
                return z2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void INVOKESTATIC_com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
