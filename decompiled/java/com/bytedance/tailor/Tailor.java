package com.bytedance.tailor;

import android.os.Debug;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes4.dex */
public class Tailor {
    public static native void closeTailor();

    public static native void openTailor(String str, boolean z);

    public static native void tailorHprof(String str, String str2);

    static {
        INVOKESTATIC_com_bytedance_tailor_Tailor_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("tailor");
    }

    public static void INVOKESTATIC_com_bytedance_tailor_Tailor_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static boolean isHprofValid(String str) {
        boolean z = false;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
            try {
                randomAccessFile2.seek(randomAccessFile2.length() - 9);
                if (randomAccessFile2.readByte() == 44) {
                    z = true;
                }
                try {
                    randomAccessFile2.close();
                    return z;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return z;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                            return false;
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            return false;
                        }
                    }
                    return false;
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                            throw th4;
                        } catch (Throwable th5) {
                            TryCatchGuardChecker.doCheck(th5);
                            throw th4;
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public static void dumpHprofData(String str, boolean z) {
        openTailor(str, z);
        Debug.dumpHprofData(str);
        closeTailor();
    }
}
