package com.heytap.mcssdk.utils;

import X.C2188811AlT;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.msp.push.encrypt.AESEncrypt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static String a = null;
    public static String c = "";

    public static String a() {
        if (TextUtils.isEmpty(c)) {
            c = new String(Base64.decode("Y29tLm5lYXJtZS5tY3M=", 0));
        }
        byte[] bArrA = a(c);
        a(bArrA);
        return bArrA != null ? new String(bArrA, Charset.forName("UTF-8")) : "";
    }

    public static byte[] a(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            return new byte[0];
        }
    }

    public static byte[] a(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    public static String b(String str) {
        boolean z;
        String strDecrypt = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                strDecrypt = c.a(str, a());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sdkDecrypt desDecrypt des data ");
                sbLIZ.append(strDecrypt);
                e.b(C2188811AlT.LIZIZ(sbLIZ));
                z = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sdkDecrypt DES exception ");
                sbLIZ2.append(e.toString());
                e.b(C2188811AlT.LIZIZ(sbLIZ2));
                z = false;
            }
            if (!(TextUtils.isEmpty(strDecrypt) ? false : z)) {
                try {
                    strDecrypt = AESEncrypt.decrypt("isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=", str);
                    a = "AES";
                    g.f().a(a);
                    e.b("sdkDecrypt desDecrypt aes data " + strDecrypt);
                    return strDecrypt;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("sdkDecrypt AES exception ");
                    sbLIZ3.append(e2.toString());
                    e.b(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        return strDecrypt;
    }

    public static String c(String str) {
        boolean z;
        String strA = "";
        if (!TextUtils.isEmpty(str)) {
            boolean z2 = false;
            try {
                strA = AESEncrypt.decrypt("isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=", str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sdkDecrypt aesDecrypt aes data ");
                sbLIZ.append(strA);
                e.b(C2188811AlT.LIZIZ(sbLIZ));
                z = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sdkDecrypt AES exception ");
                sbLIZ2.append(e.toString());
                e.b(C2188811AlT.LIZIZ(sbLIZ2));
                z = false;
            }
            if (TextUtils.isEmpty(strA)) {
                e.b("sdkDecrypt AES empty");
            } else {
                z2 = z;
            }
            if (!z2) {
                try {
                    strA = c.a(str, a());
                    a = "DES";
                    g.f().a(a);
                    e.b("sdkDecrypt aesDecrypt des data " + strA);
                    return strA;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("sdkDecrypt DES excepiton ");
                    sbLIZ3.append(e2.toString());
                    e.b(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        return strA;
    }

    public static String d(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sdkDecrypt start data ");
        sbLIZ.append(str);
        e.b(C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(a)) {
            a = g.f().b();
        }
        if ("DES".equals(a)) {
            e.b("sdkDecrypt start DES");
            return b(str);
        }
        e.b("sdkDecrypt start AES");
        return c(str);
    }
}
