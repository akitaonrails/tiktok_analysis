package com.bytedance.pns.crypto2;

import X.C08GW;
import X.C08VJ;
import X.C08VK;
import X.C08VP;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class DeCrypto implements C08GW {
    public static final DeCrypto LIZ = new DeCrypto();

    public final native byte[] iesAeadDecrypt(byte[] bArr, byte[] bArr2);

    public final native byte[] iesAeadEncrypt(byte[] bArr, byte[] bArr2);

    static {
        LoadSoLancet.LIZJ("pns_crypto");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("pns_crypto");
        LoadSoLancet.LJ(jUptimeMillis, "pns_crypto");
        LoadSoLancet.LIZLLL(jUptimeMillis, "pns_crypto");
        LoadSoLancet.LIZIZ("pns_crypto");
    }

    public static String LIZIZ(boolean z) {
        Pair pair;
        String strEncodeToString;
        C08VJ c08vjLIZIZ = C08VP.LIZ.LIZIZ(z);
        if (c08vjLIZIZ != null) {
            synchronized (c08vjLIZIZ) {
                try {
                    C08VK c08vk = c08vjLIZIZ.LIZIZ;
                    String str = c08vk.LIZ;
                    String str2 = c08vk.LIZIZ;
                    if (!C08VK.LIZ(str, str2)) {
                        pair = null;
                    } else {
                        pair = new Pair(str, str2);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        String str3 = (String) pair.getSecond();
        DeCrypto deCrypto = LIZ;
        byte[] bytes = "Hello TikTok!!".getBytes(Charsets.UTF_8);
        deCrypto.getClass();
        byte[] bArrIesAeadEncrypt = deCrypto.iesAeadEncrypt(bytes, Base64.decode(str3, 2));
        if (bArrIesAeadEncrypt != null) {
            strEncodeToString = Base64.encodeToString(bArrIesAeadEncrypt, 2);
        } else {
            strEncodeToString = null;
        }
        if (strEncodeToString == null) {
            return null;
        }
        return pair.getFirst() + ":" + strEncodeToString;
    }

    @Override // X.C08GW
    public final String decrypt(String str) {
        int iLJJJJ;
        String strLIZ;
        if (str == null || 1 > (iLJJJJ = a0.LJJJJ(str, ':', 0, 6)) || iLJJJJ > str.length() - 2) {
            return null;
        }
        Pair pair = new Pair(str.substring(0, iLJJJJ), str.substring(iLJJJJ + 1));
        String str2 = (String) pair.getFirst();
        String str3 = (String) pair.getSecond();
        List listLJJLIIIJ = a0.LJJLIIIJ(str2, new char[]{':'}, false, 0, 6);
        if (listLJJLIIIJ.size() > 2 && Intrinsics.LJFF(ListProtector.get(listLJJLIIIJ, 1), "GAPPKEY")) {
            C08VJ c08vj = C08VP.LIZLLL;
            if (c08vj == null) {
                return null;
            }
            strLIZ = c08vj.LIZ(str2);
        } else {
            C08VJ c08vj2 = C08VP.LIZJ;
            if (c08vj2 == null) {
                return null;
            }
            strLIZ = c08vj2.LIZ(str2);
        }
        if (strLIZ == null) {
            return null;
        }
        DeCrypto deCrypto = LIZ;
        deCrypto.getClass();
        byte[] bArrIesAeadDecrypt = deCrypto.iesAeadDecrypt(Base64.decode(str3, 2), Base64.decode(strLIZ, 2));
        if (bArrIesAeadDecrypt == null) {
            return null;
        }
        return new String(bArrIesAeadDecrypt, Charsets.UTF_8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // X.C08GW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            X.08VP r0 = X.C08VP.LIZ
            X.08VJ r3 = r0.LIZIZ(r9)
            r6 = 0
            if (r3 == 0) goto L39
            monitor-enter(r3)
            X.08VK r1 = r3.LIZIZ     // Catch: java.lang.Throwable -> L33
            boolean r0 = r1.LJ     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L21
            java.lang.String r2 = r1.LIZ     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r1.LIZIZ     // Catch: java.lang.Throwable -> L33
            boolean r0 = X.C08VK.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L31
            kotlin.Pair r5 = new kotlin.Pair     // Catch: java.lang.Throwable -> L33
            r5.<init>(r2, r1)     // Catch: java.lang.Throwable -> L33
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            goto L3a
        L21:
            java.lang.String r2 = r1.LIZJ     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r1.LIZLLL     // Catch: java.lang.Throwable -> L33
            boolean r0 = X.C08VK.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L31
            kotlin.Pair r5 = new kotlin.Pair     // Catch: java.lang.Throwable -> L33
            r5.<init>(r2, r1)     // Catch: java.lang.Throwable -> L33
            goto L1f
        L31:
            r5 = r6
            goto L1f
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r0
        L39:
            r5 = r6
        L3a:
            if (r5 != 0) goto L3d
            return r6
        L3d:
            java.lang.Object r4 = r5.getSecond()
            java.lang.String r4 = (java.lang.String) r4
            com.bytedance.pns.crypto2.DeCrypto r3 = com.bytedance.pns.crypto2.DeCrypto.LIZ
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            byte[] r2 = r8.getBytes(r0)
            r3.getClass()
            r1 = 2
            byte[] r0 = android.util.Base64.decode(r4, r1)
            byte[] r0 = r3.iesAeadEncrypt(r2, r0)
            if (r0 == 0) goto L60
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r1)
        L5d:
            if (r2 != 0) goto L62
            return r6
        L60:
            r2 = r6
            goto L5d
        L62:
            java.lang.Object r0 = r5.getFirst()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pns.crypto2.DeCrypto.LIZ(java.lang.String, boolean):java.lang.String");
    }
}
