package com.bytedance.ropa.encrypt;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes14.dex */
public class RopaEncrypt {
    public static native String decryptData(String str, String str2, String str3, String str4, String str5, String str6);

    public static native String encryptData(String str, String str2, String str3, String str4, String str5, String str6);

    public static native String generateKey(long j);

    public static native EncryptResult getDecryptSeq(String str);

    public static native EncryptResult getEncryptSeq(String str, boolean z);

    public static native EncryptResult getEncryptSeqV2(String str, int i, String str2);

    public static native long getHash(String str);

    public static native long getRandom();

    static {
        try {
            LoadSoLancet.LIZJ("ropaencrypt");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("ropaencrypt");
            LoadSoLancet.LJ(jUptimeMillis, "ropaencrypt");
            LoadSoLancet.LIZLLL(jUptimeMillis, "ropaencrypt");
            LoadSoLancet.LIZIZ("ropaencrypt");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
