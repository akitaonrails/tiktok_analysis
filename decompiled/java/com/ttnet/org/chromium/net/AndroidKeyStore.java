package com.ttnet.org.chromium.net;

import X.C08VH;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes14.dex */
public class AndroidKeyStore {
    public static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    public static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (NoSuchPaddingException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception while checking support for ");
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(e4);
            C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
            return false;
        }
    }

    public static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception while checking support for ");
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(e3);
            C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
            return false;
        }
    }

    public static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance(str);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(bArr);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception while encrypting input with ");
                sbLIZ.append(str);
                sbLIZ.append(" and ");
                sbLIZ.append(privateKey.getAlgorithm());
                sbLIZ.append(" private key (");
                sbLIZ.append(privateKey.getClass().getName());
                sbLIZ.append("): ");
                sbLIZ.append(e);
                C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Cipher ");
            sbLIZ2.append(str);
            sbLIZ2.append(" not supported: ");
            sbLIZ2.append(e2);
            C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ2), new Object[0]);
            return null;
        }
    }

    public static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature signature = Signature.getInstance(str);
            try {
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception while signing message with ");
                sbLIZ.append(str);
                sbLIZ.append(" and ");
                sbLIZ.append(privateKey.getAlgorithm());
                sbLIZ.append(" private key (");
                sbLIZ.append(privateKey.getClass().getName());
                sbLIZ.append("): ");
                sbLIZ.append(e);
                C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Signature algorithm ");
            sbLIZ2.append(str);
            sbLIZ2.append(" not supported: ");
            sbLIZ2.append(e2);
            C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ2), new Object[0]);
            return null;
        }
    }
}
