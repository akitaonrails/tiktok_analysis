package com.heytap.msp.push.encrypt;

import X.C2188811AlT;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.utils.e;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes14.dex */
public class AESEncrypt {
    public static String decrypt(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String[] strArrSplit = str2.split("%IV1%");
        byte[] bArrDecode = Base64.decode(strArrSplit[0], 0);
        byte[] bArrDecode2 = Base64.decode(strArrSplit[1], 0);
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str, 0), "AES");
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArrDecode2));
        return new String(cipher.doFinal(bArrDecode));
    }

    public static String encrypt(String str) {
        try {
            return encrypt("isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=", str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.b(e.getLocalizedMessage());
            return "";
        }
    }

    public static String encrypt(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str, 0), "AES");
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(1, secretKeySpec);
        String strEncodeToString = Base64.encodeToString(cipher.getIV(), 2);
        String strEncodeToString2 = Base64.encodeToString(cipher.doFinal(str2.getBytes()), 2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strEncodeToString2);
        sbLIZ.append("%IV1%");
        sbLIZ.append(strEncodeToString);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String genKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        return Base64.encodeToString(keyGenerator.generateKey().getEncoded(), 2);
    }
}
