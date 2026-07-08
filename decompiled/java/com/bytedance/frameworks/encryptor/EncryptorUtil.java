package com.bytedance.frameworks.encryptor;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class EncryptorUtil {
    public static native byte[] ttEncrypt(byte[] bArr, int i);

    static {
        try {
            LoadSoLancet.LIZJ("Encryptor");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("Encryptor");
            LoadSoLancet.LJ(jUptimeMillis, "Encryptor");
            LoadSoLancet.LIZLLL(jUptimeMillis, "Encryptor");
            LoadSoLancet.LIZIZ("Encryptor");
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
        }
    }

    public static byte[] LIZ(int i, byte[] bArr) {
        if (bArr != null && i > 0) {
            try {
                if (bArr.length == i) {
                    return ttEncrypt(bArr, i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public static byte[] LIZIZ(int i, byte[] bArr) {
        if (bArr != null && i > 0) {
            try {
                return ttEncrypt(bArr, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }
}
