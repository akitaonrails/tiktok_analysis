package com.bytedance.pns.crypto;

import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Ecies {
    public static final Map<String, Ecies> LIZJ;
    public final long LIZ;
    public final String LIZIZ;

    public static native long nativeCreate();

    public static native byte[] nativeDecrypt(long j, byte[] bArr);

    public static native void nativeDestroy(long j);

    public static native byte[] nativeEncrypt(long j, byte[] bArr, byte[] bArr2);

    public static native byte[] nativeGetPublicKey(long j);

    public static native byte[] nativeSign(long j, byte[] bArr);

    public static native boolean nativeVerify(byte[] bArr, byte[] bArr2);

    static {
        try {
            LoadSoLancet.LIZJ("pns_crypto");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("pns_crypto");
            LoadSoLancet.LJ(jUptimeMillis, "pns_crypto");
            LoadSoLancet.LIZLLL(jUptimeMillis, "pns_crypto");
            LoadSoLancet.LIZIZ("pns_crypto");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZJ = new HashMap();
    }

    public static Ecies LIZIZ() {
        Map<String, Ecies> map = LIZJ;
        Ecies ecies = (Ecies) ((HashMap) map).get("iab_autofill");
        if (ecies != null) {
            return ecies;
        }
        synchronized (Ecies.class) {
            try {
                Ecies ecies2 = (Ecies) ((HashMap) map).get("iab_autofill");
                if (ecies2 != null) {
                    return ecies2;
                }
                Ecies ecies3 = new Ecies();
                ((HashMap) map).put("iab_autofill", ecies3);
                return ecies3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public Ecies() {
        while (true) {
            long jNativeCreate = nativeCreate();
            byte[] bArrNativeGetPublicKey = nativeGetPublicKey(jNativeCreate);
            if (bArrNativeGetPublicKey != null) {
                this.LIZ = Long.valueOf(jNativeCreate).longValue();
                this.LIZIZ = Base64.encodeToString(bArrNativeGetPublicKey, 2);
                return;
            }
            nativeDestroy(jNativeCreate);
        }
    }

    public final String LIZ(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrNativeDecrypt = nativeDecrypt(this.LIZ, Base64.decode(str, 2));
            if (bArrNativeDecrypt == null) {
                return null;
            }
            return new String(bArrNativeDecrypt);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String LIZJ(String str) {
        if (str != null) {
            return Base64.encodeToString(nativeSign(this.LIZ, str.getBytes()), 2);
        }
        return null;
    }

    public static void LIZLLL(String str, String str2) {
        if (str != null && str2 != null) {
            nativeVerify(str.getBytes(), Base64.decode(str2, 2));
        }
    }
}
