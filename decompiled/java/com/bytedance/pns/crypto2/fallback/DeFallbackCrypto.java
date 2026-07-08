package com.bytedance.pns.crypto2.fallback;

import X.C08GW;
import X.C1191004lI;
import X.C1191104lJ;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.librarian.Librarian;
import com.bytedance.pns.crypto2.DeCrypto;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class DeFallbackCrypto implements C08GW {
    public static final DeFallbackCrypto LIZ = new DeFallbackCrypto();
    public static final AtomicReference<Boolean> LIZIZ = new AtomicReference<>(Boolean.TRUE);
    public static Function0<Pair<String, Integer>> LIZJ = new C1191004lI();
    public static Function0<Pair<String, Integer>> LIZLLL = new C1191104lJ();
    public static byte[] LJ;

    private final native byte[] generateIesRandomKey();

    private final native byte[] rsaEncrypt(byte[] bArr, byte[] bArr2);

    static {
        LoadSoLancet.LIZJ("pns_crypto");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("pns_crypto");
        LoadSoLancet.LJ(jUptimeMillis, "pns_crypto");
        LoadSoLancet.LIZLLL(jUptimeMillis, "pns_crypto");
        LoadSoLancet.LIZIZ("pns_crypto");
    }

    public final byte[] LIZJ() {
        byte[] bArrGenerateIesRandomKey = LJ;
        if (bArrGenerateIesRandomKey == null) {
            synchronized (this) {
                try {
                    bArrGenerateIesRandomKey = LJ;
                    if (bArrGenerateIesRandomKey == null) {
                        bArrGenerateIesRandomKey = LIZ.generateIesRandomKey();
                        LJ = bArrGenerateIesRandomKey;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return bArrGenerateIesRandomKey;
    }

    public final String LIZIZ(boolean z) {
        Pair<String, Integer> pairInvoke;
        byte[] bArrRsaEncrypt;
        Pair<String, Integer> pairInvoke2;
        byte[] bArrLIZJ = LIZJ();
        if (bArrLIZJ != null) {
            try {
                byte[] bArrEncode = Base64.encode(bArrLIZJ, 2);
                if (z) {
                    LIZ.getClass();
                    pairInvoke = LIZLLL.invoke();
                } else {
                    LIZ.getClass();
                    pairInvoke = LIZJ.invoke();
                }
                bArrRsaEncrypt = LIZ.rsaEncrypt(bArrEncode, Base64.decode(pairInvoke.getFirst(), 2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                bArrRsaEncrypt = null;
            }
        } else {
            bArrRsaEncrypt = null;
        }
        if (bArrRsaEncrypt == null) {
            return null;
        }
        String strEncodeToString = Base64.encodeToString(bArrRsaEncrypt, 2);
        if (z) {
            LIZ.getClass();
            pairInvoke2 = LIZLLL.invoke();
        } else {
            LIZ.getClass();
            pairInvoke2 = LIZJ.invoke();
        }
        return "V2:RSA:" + pairInvoke2.getSecond().intValue() + ":" + strEncodeToString.length() + ":" + strEncodeToString;
    }

    @Override // X.C08GW
    public final String decrypt(String str) {
        boolean z;
        String strSubstring;
        byte[] bArrIesAeadDecrypt;
        int iLJJJJ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (iLJJJJ = a0.LJJJJ(str, ':', 0, 6)) > 0 && iLJJJJ != str.length() - 1) {
            strSubstring = str.substring(iLJJJJ + 1);
        } else {
            strSubstring = null;
        }
        if (strSubstring == null) {
            return null;
        }
        try {
            DeCrypto deCrypto = DeCrypto.LIZ;
            byte[] bArrDecode = Base64.decode(strSubstring, 2);
            byte[] bArrLIZJ = LIZJ();
            if (bArrLIZJ != null && (bArrIesAeadDecrypt = deCrypto.iesAeadDecrypt(bArrDecode, bArrLIZJ)) != null) {
                return new String(bArrIesAeadDecrypt, Charsets.UTF_8);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    @Override // X.C08GW
    public final String LIZ(String str, boolean z) {
        boolean z2;
        DeCrypto deCrypto;
        byte[] bytes;
        byte[] bArrLIZJ;
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        try {
            deCrypto = DeCrypto.LIZ;
            bytes = str.getBytes(Charsets.UTF_8);
            bArrLIZJ = LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bArrLIZJ == null) {
            return null;
        }
        String strEncodeToString = Base64.encodeToString(deCrypto.iesAeadEncrypt(bytes, bArrLIZJ), 2);
        Boolean bool = LIZIZ.get();
        if (!z && !bool.booleanValue()) {
            String strLIZIZ = LIZIZ(false);
            if (strLIZIZ != null) {
                return strLIZIZ + ":" + strEncodeToString;
            }
        } else {
            String strLIZIZ2 = LIZIZ(true);
            if (strLIZIZ2 != null) {
                return strLIZIZ2 + ":" + strEncodeToString;
            }
        }
        return null;
    }
}
