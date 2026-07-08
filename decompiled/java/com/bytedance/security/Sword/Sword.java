package com.bytedance.security.Sword;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class Sword {
    public static native byte[] GenKeySeed();

    public static native int GetCryptoMethod();

    public static native int IsSupportedMethod(int i);

    public static native byte[] WBCKGenKeySeed();

    public static native int WBCKGetCryptoMethod();

    public static native byte[] WBCKPacked(byte[] bArr, int i, byte[] bArr2, int i2);

    public static native byte[] WBCKPackedNaked(byte[] bArr, int i, byte[] bArr2, int i2);

    public static native byte[] WBCKUnpacked(byte[] bArr, int i, byte[] bArr2);

    public static native byte[] clientPacked(byte[] bArr, int i);

    public static native String clientPackedBase64(byte[] bArr, int i);

    public static native byte[] clientPackedNaked(byte[] bArr, int i, int i2, byte[] bArr2);

    public static native String clientPackedNakedBase64(byte[] bArr, int i, int i2, byte[] bArr2);

    public static native byte[] clientUnpacked(byte[] bArr, int i);

    public static native byte[] clientUnpackedBase64(String str);

    public static native byte[] clientUnpackedNaked(byte[] bArr, int i, int i2, byte[] bArr2);

    public static native byte[] clientUnpackedNakedBase64(String str, int i, String str2);

    static {
        try {
            INVOKESTATIC_com_bytedance_security_Sword_Sword_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bdsword");
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
        }
    }

    public static void INVOKESTATIC_com_bytedance_security_Sword_Sword_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
