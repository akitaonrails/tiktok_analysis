package com.bytedance.pitaya.cep_auth;

import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes14.dex */
public final class Authenticator implements CepKeeper {
    public static final Authenticator INSTANCE = new Authenticator();

    public static final String bytesToHex(byte[] bArr) {
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = charArray[i2 >>> 4];
            cArr[i3 + 1] = charArray[i2 & 15];
        }
        return new String(cArr);
    }

    public static final String hmacSha256(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        Charset charset = Charsets.UTF_8;
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(charset), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return bytesToHex(mac.doFinal(str.getBytes(charset)));
    }

    public static final boolean check(String str, String str2, String str3) {
        return Intrinsics.LJFF(hmacSha256(str2, str), str3);
    }
}
