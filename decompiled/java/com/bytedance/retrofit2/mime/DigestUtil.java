package com.bytedance.retrofit2.mime;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes14.dex */
public class DigestUtil {
    public static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] encodeHex(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = DIGITS_UPPER;
            cArr[i] = cArr2[(b & 240) >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return cArr;
    }

    public static String md5Hex(InputStream inputStream) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            int i = inputStream.read(bArr, 0, 1024);
            while (i > -1) {
                messageDigest.update(bArr, 0, i);
                i = inputStream.read(bArr, 0, 1024);
            }
            return new String(encodeHex(messageDigest.digest()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String md5Hex(byte[] bArr) {
        try {
            return new String(encodeHex(MessageDigest.getInstance("MD5").digest(bArr)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
