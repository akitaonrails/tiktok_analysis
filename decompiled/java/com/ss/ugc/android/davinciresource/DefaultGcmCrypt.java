package com.ss.ugc.android.davinciresource;

import X.C2188811AlT;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.davinciresource.jni.DAVGcmCryptFunc;
import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerListener;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes31.dex */
public final class DefaultGcmCrypt extends DAVGcmCryptFunc {
    public static final DefaultGcmCrypt INSTANCE = new DefaultGcmCrypt();

    @Override // com.ss.ugc.android.davinciresource.jni.DAVGcmCryptFunc
    public String decrypt(String str, String str2) {
        byte[] bytes;
        try {
            byte[] bArr = new byte[12];
            if (str != null) {
                bytes = str.getBytes(Charsets.UTF_8);
            } else {
                bytes = null;
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, new SecretKeySpec(bytes, "AES"), new GCMParameterSpec(128, bArr));
            return new String(cipher.doFinal(Base64.decode(str2, 0)), Charsets.UTF_8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            DAVLoggerListener logger = DavinciResource.INSTANCE.getLogger();
            if (logger != null) {
                DAVLogLevel dAVLogLevel = DAVLogLevel.LEVEL_ERROR;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DefaultGcmCrypt: Error while decrypting ");
                sbLIZ.append(str2);
                sbLIZ.append(", exception: ");
                sbLIZ.append(e);
                logger.onLog(dAVLogLevel, C2188811AlT.LIZIZ(sbLIZ));
                return "";
            }
            return "";
        }
    }
}
