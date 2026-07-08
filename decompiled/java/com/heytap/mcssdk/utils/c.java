package com.heytap.mcssdk.utils;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c {
    public static String a(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(2, a(str2));
        return new String(cipher.doFinal(Base64.decode(str, 0)), Charset.defaultCharset()).trim();
    }

    public static Key a(String str) {
        return SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(Base64.decode(str, 0)));
    }
}
