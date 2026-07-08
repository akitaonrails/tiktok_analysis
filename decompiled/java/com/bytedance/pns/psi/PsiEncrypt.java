package com.bytedance.pns.psi;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes31.dex */
public final class PsiEncrypt {
    public static final Companion LIZ = new Companion();

    public static final class Companion {
        public final native byte[] blind(byte[] bArr, byte[] bArr2);

        public final native byte[] blindPsi(byte[] bArr, byte[] bArr2);

        public final native String[] breakdownUrl(String str, String str2, String str3, String str4, String str5);

        public final native byte[] createNewKey();

        public final native byte[] createNewKeyPsi();

        public final native byte[] defaultPrefixOfHash(String str);

        public final native byte[] encrypt(String str, byte[] bArr);

        public final native byte[] encryptPsi(String str, byte[] bArr);

        public final native byte[] getPrefixBytes(String str);

        public final native int handleThisType_int(int[] iArr, String str);

        public final native long handleThisType_long(long[] jArr, String str);

        public final native long murmur3_32(byte[] bArr);

        public final native byte[] prefixOfHash(String str, int i);

        public final native String sha256Hash(String str);

        public final native int tryDecryptAeadPayload_int(byte[] bArr, byte[] bArr2, String str, int[] iArr);

        public final native long tryDecryptAeadPayload_long(byte[] bArr, byte[] bArr2, String str, int[] iArr);

        public final native byte[] unBlind(byte[] bArr, byte[] bArr2);

        public final native byte[] unBlindPsi(byte[] bArr, byte[] bArr2);
    }

    static {
        LoadSoLancet.LIZJ("psiencrypt");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("psiencrypt");
        LoadSoLancet.LJ(jUptimeMillis, "psiencrypt");
        LoadSoLancet.LIZLLL(jUptimeMillis, "psiencrypt");
        LoadSoLancet.LIZIZ("psiencrypt");
    }
}
