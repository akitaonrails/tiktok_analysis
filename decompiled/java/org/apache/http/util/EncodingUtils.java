package org.apache.http.util;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public final class EncodingUtils {
    public static String getString(byte[] bArr, String str) {
        if (bArr != null) {
            return getString(bArr, 0, bArr.length, str);
        }
        throw new IllegalArgumentException("Parameter may not be null");
    }

    public static String getString(byte[] bArr, int i, int i2, String str) {
        if (bArr != null) {
            if (str != null && str.length() != 0) {
                try {
                    return new String(bArr, i, i2, str);
                } catch (UnsupportedEncodingException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return new String(bArr, i, i2);
                }
            }
            throw new IllegalArgumentException("charset may not be null or empty");
        }
        throw new IllegalArgumentException("Parameter may not be null");
    }
}
