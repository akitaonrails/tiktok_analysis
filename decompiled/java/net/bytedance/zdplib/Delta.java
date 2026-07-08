package net.bytedance.zdplib;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class Delta {
    public static native int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native int encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native void free(long j);

    public static native int generateAesKey(byte[] bArr, long j, long j2);

    public static native int generatePrivateKey(byte[] bArr);

    public static native int getDecryptedLen(int i);

    public static native int getEncryptedLen(int i);

    public static native int getPublicKey(byte[] bArr, long j);

    public static native long initPrivateKey(byte[] bArr);

    public static native long initPubKey(byte[] bArr);

    static {
        LoadSoLancet.LIZJ("delta");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("delta");
        LoadSoLancet.LJ(jUptimeMillis, "delta");
        LoadSoLancet.LIZLLL(jUptimeMillis, "delta");
        LoadSoLancet.LIZIZ("delta");
    }

    public static String LIZ(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr2[i3] = cArr[i2 >>> 4];
            cArr2[i3 + 1] = cArr[i2 & 15];
        }
        return new String(cArr2);
    }

    public static byte[] LIZIZ(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
